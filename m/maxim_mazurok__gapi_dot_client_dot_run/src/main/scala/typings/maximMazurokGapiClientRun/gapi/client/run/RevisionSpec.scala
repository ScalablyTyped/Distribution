package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionSpec extends js.Object {
  
  /**
    * (Optional) ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to
    * 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
    */
  var containerConcurrency: js.UndefOr[Double] = js.native
  
  /**
    * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container,
    * including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var containers: js.UndefOr[js.Array[Container]] = js.native
  
  /**
    * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what
    * permissions the revision has. If not provided, the revision will use the project's default service account.
    */
  var serviceAccountName: js.UndefOr[String] = js.native
  
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 900
    * seconds (15 minutes). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
  
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
}
object RevisionSpec {
  
  @scala.inline
  def apply(): RevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionSpec]
  }
  
  @scala.inline
  implicit class RevisionSpecOps[Self <: RevisionSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerConcurrency(value: Double): Self = this.set("containerConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerConcurrency: Self = this.set("containerConcurrency", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: Container*): Self = this.set("containers", js.Array(value :_*))
    
    @scala.inline
    def setContainers(value: js.Array[Container]): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setServiceAccountName(value: String): Self = this.set("serviceAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountName: Self = this.set("serviceAccountName", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
}

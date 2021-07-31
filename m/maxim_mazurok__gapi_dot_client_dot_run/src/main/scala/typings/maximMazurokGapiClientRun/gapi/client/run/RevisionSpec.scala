package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionSpec extends StObject {
  
  /**
    * (Optional) ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to
    * 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
    */
  var containerConcurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container,
    * including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var containers: js.UndefOr[js.Array[Container]] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what
    * permissions the revision has. If not provided, the revision will use the project's default service account.
    */
  var serviceAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 900
    * seconds (15 minutes). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
  
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
}
object RevisionSpec {
  
  @scala.inline
  def apply(): RevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionSpec]
  }
  
  @scala.inline
  implicit class RevisionSpecMutableBuilder[Self <: RevisionSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerConcurrency(value: Double): Self = StObject.set(x, "containerConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerConcurrencyUndefined: Self = StObject.set(x, "containerConcurrency", js.undefined)
    
    @scala.inline
    def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Probe extends js.Object {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported One and only one of the following should be specified. Exec specifies the action to take. A field
    * inlined from the Handler message.
    */
  var exec: js.UndefOr[ExecAction] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults
    * to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported HTTPGet specifies the http request to perform. A field inlined from the Handler message. */
  var httpGet: js.UndefOr[HTTPGetAction] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number of seconds after the container has started before liveness probes are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  var periodSeconds: js.UndefOr[Double] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Minimum consecutive successes for the probe to be considered successful after having failed.
    * Defaults to 1. Must be 1 for liveness. Minimum value is 1.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined
    * from the Handler message.
    */
  var tcpSocket: js.UndefOr[TCPSocketAction] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More
    * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}
object Probe {
  
  @scala.inline
  def apply(): Probe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Probe]
  }
  
  @scala.inline
  implicit class ProbeOps[Self <: Probe] (val x: Self) extends AnyVal {
    
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
    def setExec(value: ExecAction): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    
    @scala.inline
    def setHttpGet(value: HTTPGetAction): Self = this.set("httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpGet: Self = this.set("httpGet", js.undefined)
    
    @scala.inline
    def setInitialDelaySeconds(value: Double): Self = this.set("initialDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDelaySeconds: Self = this.set("initialDelaySeconds", js.undefined)
    
    @scala.inline
    def setPeriodSeconds(value: Double): Self = this.set("periodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodSeconds: Self = this.set("periodSeconds", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = this.set("successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessThreshold: Self = this.set("successThreshold", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: TCPSocketAction): Self = this.set("tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpSocket: Self = this.set("tcpSocket", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
}

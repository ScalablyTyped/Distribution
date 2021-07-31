package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Probe extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported One and only one of the following should be specified. Exec specifies the action to take. A field
    * inlined from the Handler message.
    */
  var exec: js.UndefOr[ExecAction] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults
    * to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported HTTPGet specifies the http request to perform. A field inlined from the Handler message. */
  var httpGet: js.UndefOr[HTTPGetAction] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number of seconds after the container has started before liveness probes are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  var periodSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Minimum consecutive successes for the probe to be considered successful after having failed.
    * Defaults to 1. Must be 1 for liveness. Minimum value is 1.
    */
  var successThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined
    * from the Handler message.
    */
  var tcpSocket: js.UndefOr[TCPSocketAction] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More
    * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object Probe {
  
  @scala.inline
  def apply(): Probe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Probe]
  }
  
  @scala.inline
  implicit class ProbeMutableBuilder[Self <: Probe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: ExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    @scala.inline
    def setHttpGet(value: HTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    @scala.inline
    def setInitialDelaySeconds(value: Double): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelaySecondsUndefined: Self = StObject.set(x, "initialDelaySeconds", js.undefined)
    
    @scala.inline
    def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSecondsUndefined: Self = StObject.set(x, "periodSeconds", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: TCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}

package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1CompleteTrialRequest extends StObject {
  
  /** Optional. If provided, it will be used as the completed trial's final_measurement; Otherwise, the service will auto-select a previously reported measurement as the final-measurement */
  var finalMeasurement: js.UndefOr[GoogleCloudMlV1Measurement] = js.native
  
  /** Optional. A human readable reason why the trial was infeasible. This should only be provided if `trial_infeasible` is true. */
  var infeasibleReason: js.UndefOr[String] = js.native
  
  /** Optional. True if the trial cannot be run with the given Parameter, and final_measurement will be ignored. */
  var trialInfeasible: js.UndefOr[Boolean] = js.native
}
object GoogleCloudMlV1CompleteTrialRequest {
  
  @scala.inline
  def apply(): GoogleCloudMlV1CompleteTrialRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CompleteTrialRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CompleteTrialRequestMutableBuilder[Self <: GoogleCloudMlV1CompleteTrialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalMeasurement(value: GoogleCloudMlV1Measurement): Self = StObject.set(x, "finalMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalMeasurementUndefined: Self = StObject.set(x, "finalMeasurement", js.undefined)
    
    @scala.inline
    def setInfeasibleReason(value: String): Self = StObject.set(x, "infeasibleReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfeasibleReasonUndefined: Self = StObject.set(x, "infeasibleReason", js.undefined)
    
    @scala.inline
    def setTrialInfeasible(value: Boolean): Self = StObject.set(x, "trialInfeasible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialInfeasibleUndefined: Self = StObject.set(x, "trialInfeasible", js.undefined)
  }
}

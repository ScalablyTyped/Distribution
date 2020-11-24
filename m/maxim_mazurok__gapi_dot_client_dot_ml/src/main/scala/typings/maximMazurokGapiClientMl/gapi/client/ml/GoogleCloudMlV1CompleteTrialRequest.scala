package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1CompleteTrialRequest extends js.Object {
  
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
  implicit class GoogleCloudMlV1CompleteTrialRequestOps[Self <: GoogleCloudMlV1CompleteTrialRequest] (val x: Self) extends AnyVal {
    
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
    def setFinalMeasurement(value: GoogleCloudMlV1Measurement): Self = this.set("finalMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalMeasurement: Self = this.set("finalMeasurement", js.undefined)
    
    @scala.inline
    def setInfeasibleReason(value: String): Self = this.set("infeasibleReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfeasibleReason: Self = this.set("infeasibleReason", js.undefined)
    
    @scala.inline
    def setTrialInfeasible(value: Boolean): Self = this.set("trialInfeasible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialInfeasible: Self = this.set("trialInfeasible", js.undefined)
  }
}

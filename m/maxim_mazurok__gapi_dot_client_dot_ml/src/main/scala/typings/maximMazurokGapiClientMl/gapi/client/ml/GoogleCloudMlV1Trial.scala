package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Trial extends js.Object {
  
  /** Output only. The identifier of the client that originally requested this trial. */
  var clientId: js.UndefOr[String] = js.native
  
  /** Output only. Time at which the trial's status changed to COMPLETED. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The final measurement containing the objective value. */
  var finalMeasurement: js.UndefOr[GoogleCloudMlV1Measurement] = js.native
  
  /** Output only. A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true. */
  var infeasibleReason: js.UndefOr[String] = js.native
  
  /** A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations. */
  var measurements: js.UndefOr[js.Array[GoogleCloudMlV1Measurement]] = js.native
  
  /** Output only. Name of the trial assigned by the service. */
  var name: js.UndefOr[String] = js.native
  
  /** The parameters of the trial. */
  var parameters: js.UndefOr[js.Array[GoogleCloudMlV1TrialParameter]] = js.native
  
  /** Output only. Time at which the trial was started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The detailed state of a trial. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. If true, the parameters in this trial are not attempted again. */
  var trialInfeasible: js.UndefOr[Boolean] = js.native
}
object GoogleCloudMlV1Trial {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Trial]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1TrialOps[Self <: GoogleCloudMlV1Trial] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFinalMeasurement(value: GoogleCloudMlV1Measurement): Self = this.set("finalMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalMeasurement: Self = this.set("finalMeasurement", js.undefined)
    
    @scala.inline
    def setInfeasibleReason(value: String): Self = this.set("infeasibleReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfeasibleReason: Self = this.set("infeasibleReason", js.undefined)
    
    @scala.inline
    def setMeasurementsVarargs(value: GoogleCloudMlV1Measurement*): Self = this.set("measurements", js.Array(value :_*))
    
    @scala.inline
    def setMeasurements(value: js.Array[GoogleCloudMlV1Measurement]): Self = this.set("measurements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurements: Self = this.set("measurements", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudMlV1TrialParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudMlV1TrialParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrialInfeasible(value: Boolean): Self = this.set("trialInfeasible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialInfeasible: Self = this.set("trialInfeasible", js.undefined)
  }
}

package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Trial extends StObject {
  
  /** Output only. The identifier of the client that originally requested this trial. */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** Output only. Time at which the trial's status changed to COMPLETED. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The final measurement containing the objective value. */
  var finalMeasurement: js.UndefOr[GoogleCloudMlV1Measurement] = js.undefined
  
  /** Output only. A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true. */
  var infeasibleReason: js.UndefOr[String] = js.undefined
  
  /** A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations. */
  var measurements: js.UndefOr[js.Array[GoogleCloudMlV1Measurement]] = js.undefined
  
  /** Output only. Name of the trial assigned by the service. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The parameters of the trial. */
  var parameters: js.UndefOr[js.Array[GoogleCloudMlV1TrialParameter]] = js.undefined
  
  /** Output only. Time at which the trial was started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The detailed state of a trial. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. If true, the parameters in this trial are not attempted again. */
  var trialInfeasible: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudMlV1Trial {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Trial]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1TrialMutableBuilder[Self <: GoogleCloudMlV1Trial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setFinalMeasurement(value: GoogleCloudMlV1Measurement): Self = StObject.set(x, "finalMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalMeasurementUndefined: Self = StObject.set(x, "finalMeasurement", js.undefined)
    
    @scala.inline
    def setInfeasibleReason(value: String): Self = StObject.set(x, "infeasibleReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfeasibleReasonUndefined: Self = StObject.set(x, "infeasibleReason", js.undefined)
    
    @scala.inline
    def setMeasurements(value: js.Array[GoogleCloudMlV1Measurement]): Self = StObject.set(x, "measurements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementsUndefined: Self = StObject.set(x, "measurements", js.undefined)
    
    @scala.inline
    def setMeasurementsVarargs(value: GoogleCloudMlV1Measurement*): Self = StObject.set(x, "measurements", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudMlV1TrialParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudMlV1TrialParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTrialInfeasible(value: Boolean): Self = StObject.set(x, "trialInfeasible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialInfeasibleUndefined: Self = StObject.set(x, "trialInfeasible", js.undefined)
  }
}

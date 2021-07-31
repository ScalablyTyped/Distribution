package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig extends StObject {
  
  /** If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis. */
  var useElapsedTime: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfigMutableBuilder[Self <: GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseElapsedTime(value: Boolean): Self = StObject.set(x, "useElapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseElapsedTimeUndefined: Self = StObject.set(x, "useElapsedTime", js.undefined)
  }
}

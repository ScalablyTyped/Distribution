package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig extends StObject {
  
  /** If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis. */
  var useElapsedTime: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig {
  
  inline def apply(): GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig]
  }
  
  extension [Self <: GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig](x: Self) {
    
    inline def setUseElapsedTime(value: Boolean): Self = StObject.set(x, "useElapsedTime", value.asInstanceOf[js.Any])
    
    inline def setUseElapsedTimeUndefined: Self = StObject.set(x, "useElapsedTime", js.undefined)
  }
}

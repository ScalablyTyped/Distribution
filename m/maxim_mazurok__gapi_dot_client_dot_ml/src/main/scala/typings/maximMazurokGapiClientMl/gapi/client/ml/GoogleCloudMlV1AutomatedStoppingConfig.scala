package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1AutomatedStoppingConfig extends StObject {
  
  var decayCurveStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig] = js.undefined
  
  var medianAutomatedStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig] = js.undefined
}
object GoogleCloudMlV1AutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigMutableBuilder[Self <: GoogleCloudMlV1AutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecayCurveStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig): Self = StObject.set(x, "decayCurveStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayCurveStoppingConfigUndefined: Self = StObject.set(x, "decayCurveStoppingConfig", js.undefined)
    
    @scala.inline
    def setMedianAutomatedStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig): Self = StObject.set(x, "medianAutomatedStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianAutomatedStoppingConfigUndefined: Self = StObject.set(x, "medianAutomatedStoppingConfig", js.undefined)
  }
}

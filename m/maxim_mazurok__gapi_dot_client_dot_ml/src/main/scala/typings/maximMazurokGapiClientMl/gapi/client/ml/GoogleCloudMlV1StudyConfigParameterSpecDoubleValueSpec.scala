package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec extends StObject {
  
  /** Must be specified if type is `DOUBLE`. Maximum value of the parameter. */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** Must be specified if type is `DOUBLE`. Minimum value of the parameter. */
  var minValue: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec {
  
  inline def apply(): GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec](x: Self) {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}

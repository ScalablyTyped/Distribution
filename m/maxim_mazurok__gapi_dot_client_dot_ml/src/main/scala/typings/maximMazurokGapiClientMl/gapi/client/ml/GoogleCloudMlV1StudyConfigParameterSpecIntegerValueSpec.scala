package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec extends StObject {
  
  /** Must be specified if type is `INTEGER`. Maximum value of the parameter. */
  var maxValue: js.UndefOr[String] = js.undefined
  
  /** Must be specified if type is `INTEGER`. Minimum value of the parameter. */
  var minValue: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec {
  
  inline def apply(): GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec](x: Self) {
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}

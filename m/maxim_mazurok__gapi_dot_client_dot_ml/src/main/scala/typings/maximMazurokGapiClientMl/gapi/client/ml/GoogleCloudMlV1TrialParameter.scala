package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1TrialParameter extends StObject {
  
  /** Must be set if ParameterType is DOUBLE or DISCRETE. */
  var floatValue: js.UndefOr[Double] = js.undefined
  
  /** Must be set if ParameterType is INTEGER */
  var intValue: js.UndefOr[String] = js.undefined
  
  /** The name of the parameter. */
  var parameter: js.UndefOr[String] = js.undefined
  
  /** Must be set if ParameterTypeis CATEGORICAL */
  var stringValue: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1TrialParameter {
  
  inline def apply(): GoogleCloudMlV1TrialParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrialParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1TrialParameter] (val x: Self) extends AnyVal {
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}

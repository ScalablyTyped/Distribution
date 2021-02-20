package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1TrialParameter extends StObject {
  
  /** Must be set if ParameterType is DOUBLE or DISCRETE. */
  var floatValue: js.UndefOr[Double] = js.native
  
  /** Must be set if ParameterType is INTEGER */
  var intValue: js.UndefOr[String] = js.native
  
  /** The name of the parameter. */
  var parameter: js.UndefOr[String] = js.native
  
  /** Must be set if ParameterTypeis CATEGORICAL */
  var stringValue: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1TrialParameter {
  
  @scala.inline
  def apply(): GoogleCloudMlV1TrialParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrialParameter]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1TrialParameterMutableBuilder[Self <: GoogleCloudMlV1TrialParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}

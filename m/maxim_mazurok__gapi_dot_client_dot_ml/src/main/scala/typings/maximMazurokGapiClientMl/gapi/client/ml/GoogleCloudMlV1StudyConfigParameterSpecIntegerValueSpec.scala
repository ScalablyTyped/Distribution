package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec extends StObject {
  
  /** Must be specified if type is `INTEGER`. Maximum value of the parameter. */
  var maxValue: js.UndefOr[String] = js.native
  
  /** Must be specified if type is `INTEGER`. Minimum value of the parameter. */
  var minValue: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}

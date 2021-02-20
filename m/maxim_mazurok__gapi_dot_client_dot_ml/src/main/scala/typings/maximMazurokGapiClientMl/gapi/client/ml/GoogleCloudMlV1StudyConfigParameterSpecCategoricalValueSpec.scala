package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec extends StObject {
  
  /** Must be specified if type is `CATEGORICAL`. The list of possible categories. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

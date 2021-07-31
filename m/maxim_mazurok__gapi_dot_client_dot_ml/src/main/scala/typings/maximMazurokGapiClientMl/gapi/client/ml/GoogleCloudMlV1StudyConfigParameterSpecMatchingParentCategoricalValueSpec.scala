package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec extends StObject {
  
  /** Matches values of the parent parameter with type 'CATEGORICAL'. All values must exist in `categorical_value_spec` of parent parameter. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

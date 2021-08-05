package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec extends StObject {
  
  /** Matches values of the parent parameter with type 'CATEGORICAL'. All values must exist in `categorical_value_spec` of parent parameter. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec {
  
  inline def apply(): GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

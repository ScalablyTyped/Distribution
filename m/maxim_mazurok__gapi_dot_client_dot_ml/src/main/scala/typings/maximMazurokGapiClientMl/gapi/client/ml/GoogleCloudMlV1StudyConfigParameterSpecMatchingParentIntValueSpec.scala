package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec extends StObject {
  
  /** Matches values of the parent parameter with type 'INTEGER'. All values must lie in `integer_value_spec` of parent parameter. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

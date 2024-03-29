package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var requestBody: ContentApplicationjsonLabelsArray
  
  var responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber404Content41`
}
object ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray {
  
  inline def apply(
    parameters: PathOwnerRepoRunnerid,
    requestBody: ContentApplicationjsonLabelsArray,
    responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber404Content41`
  ): ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArrayTotalcountNumber404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

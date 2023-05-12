package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `200ContentApplicationjsonLabelsArray404Content36`
}
object ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabels {
  
  inline def apply(
    parameters: PathOwnerRepoRunnerid,
    requestBody: ContentApplicationjsonLabels,
    responses: `200ContentApplicationjsonLabelsArray404Content36`
  ): ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArray404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

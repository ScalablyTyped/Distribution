package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: PathOwnerRepo
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `404422`
}
object ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels {
  
  inline def apply(parameters: PathOwnerRepo, requestBody: ContentApplicationjsonLabels, responses: `404422`): ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

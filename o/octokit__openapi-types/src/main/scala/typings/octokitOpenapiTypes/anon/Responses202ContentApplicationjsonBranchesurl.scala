package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonBranchesurl extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonNewowner
  
  var responses: `202ContentApplicationjsonBranchesurl`
}
object Responses202ContentApplicationjsonBranchesurl {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonNewowner,
    responses: `202ContentApplicationjsonBranchesurl`
  ): Responses202ContentApplicationjsonBranchesurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonBranchesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202ContentApplicationjsonBranchesurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewowner): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202ContentApplicationjsonBranchesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

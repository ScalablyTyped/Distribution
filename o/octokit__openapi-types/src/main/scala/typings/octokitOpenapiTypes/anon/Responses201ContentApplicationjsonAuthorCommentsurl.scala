package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAuthorCommentsurl extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonBase
  
  var responses: `201ContentApplicationjsonAuthorCommentsurl`
}
object Responses201ContentApplicationjsonAuthorCommentsurl {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonBase,
    responses: `201ContentApplicationjsonAuthorCommentsurl`
  ): Responses201ContentApplicationjsonAuthorCommentsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAuthorCommentsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonAuthorCommentsurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBase): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAuthorCommentsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

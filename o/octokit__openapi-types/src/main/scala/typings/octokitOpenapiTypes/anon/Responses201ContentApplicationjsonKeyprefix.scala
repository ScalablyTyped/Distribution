package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonKeyprefix extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonIsalphanumeric
  
  var responses: `201ContentApplicationjsonKeyprefix`
}
object Responses201ContentApplicationjsonKeyprefix {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonIsalphanumeric,
    responses: `201ContentApplicationjsonKeyprefix`
  ): Responses201ContentApplicationjsonKeyprefix = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonKeyprefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonKeyprefix] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonKeyprefix`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

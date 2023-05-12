package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses410 extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `410`
}
object Responses410 {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonBodyName, responses: `410`): Responses410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

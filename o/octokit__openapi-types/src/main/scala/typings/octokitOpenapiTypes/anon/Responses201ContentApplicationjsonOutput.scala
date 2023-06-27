package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonOutput extends StObject {
  
  var parameters: `639`
  
  var requestBody: Content216
  
  var responses: `201ContentApplicationjsonOutput`
}
object Responses201ContentApplicationjsonOutput {
  
  inline def apply(parameters: `639`, requestBody: Content216, responses: `201ContentApplicationjsonOutput`): Responses201ContentApplicationjsonOutput = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonOutput] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content216): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonOutput`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

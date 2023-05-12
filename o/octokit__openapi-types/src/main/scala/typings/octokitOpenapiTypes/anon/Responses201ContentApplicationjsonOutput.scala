package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonOutput extends StObject {
  
  var parameters: `540`
  
  var requestBody: Content182
  
  var responses: `201ContentApplicationjsonOutput`
}
object Responses201ContentApplicationjsonOutput {
  
  inline def apply(parameters: `540`, requestBody: Content182, responses: `201ContentApplicationjsonOutput`): Responses201ContentApplicationjsonOutput = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonOutput] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content182): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonOutput`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

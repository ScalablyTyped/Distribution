package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNodeidObject422Content414 extends StObject {
  
  var parameters: `699`
  
  var requestBody: ContentApplicationjsonForce
  
  var responses: `200ContentApplicationjsonNodeidObject422Content414`
}
object Responses200ContentApplicationjsonNodeidObject422Content414 {
  
  inline def apply(
    parameters: `699`,
    requestBody: ContentApplicationjsonForce,
    responses: `200ContentApplicationjsonNodeidObject422Content414`
  ): Responses200ContentApplicationjsonNodeidObject422Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNodeidObject422Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonNodeidObject422Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `699`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonForce): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidObject422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

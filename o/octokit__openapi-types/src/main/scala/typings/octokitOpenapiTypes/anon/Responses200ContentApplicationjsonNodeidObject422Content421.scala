package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNodeidObject422Content421 extends StObject {
  
  var parameters: `535`
  
  var requestBody: ContentApplicationjsonForce
  
  var responses: `200ContentApplicationjsonNodeidObject422Content421`
}
object Responses200ContentApplicationjsonNodeidObject422Content421 {
  
  inline def apply(
    parameters: `535`,
    requestBody: ContentApplicationjsonForce,
    responses: `200ContentApplicationjsonNodeidObject422Content421`
  ): Responses200ContentApplicationjsonNodeidObject422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNodeidObject422Content421]
  }
  
  extension [Self <: Responses200ContentApplicationjsonNodeidObject422Content421](x: Self) {
    
    inline def setParameters(value: `535`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonForce): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidObject422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

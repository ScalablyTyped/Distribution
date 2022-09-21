package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNodeidObject extends StObject {
  
  var parameters: `535`
  
  var responses: `200ContentApplicationjsonNodeidObject`
}
object Responses200ContentApplicationjsonNodeidObject {
  
  inline def apply(parameters: `535`, responses: `200ContentApplicationjsonNodeidObject`): Responses200ContentApplicationjsonNodeidObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNodeidObject]
  }
  
  extension [Self <: Responses200ContentApplicationjsonNodeidObject](x: Self) {
    
    inline def setParameters(value: `535`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidObject`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

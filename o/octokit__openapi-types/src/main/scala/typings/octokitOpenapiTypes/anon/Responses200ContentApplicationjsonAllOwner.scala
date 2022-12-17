package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllOwner extends StObject {
  
  var parameters: `472`
  
  var responses: `200ContentApplicationjsonAllOwner`
}
object Responses200ContentApplicationjsonAllOwner {
  
  inline def apply(parameters: `472`, responses: `200ContentApplicationjsonAllOwner`): Responses200ContentApplicationjsonAllOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllOwner]
  }
  
  extension [Self <: Responses200ContentApplicationjsonAllOwner](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllOwner`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

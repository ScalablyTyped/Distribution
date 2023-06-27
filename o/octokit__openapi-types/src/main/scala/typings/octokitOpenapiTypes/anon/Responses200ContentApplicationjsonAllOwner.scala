package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllOwner extends StObject {
  
  var parameters: `639`
  
  var responses: `200ContentApplicationjsonAllOwner`
}
object Responses200ContentApplicationjsonAllOwner {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonAllOwner`): Responses200ContentApplicationjsonAllOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAllOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllOwner`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCountUniques extends StObject {
  
  var parameters: `771`
  
  var responses: `200ContentApplicationjsonCountUniques`
}
object Responses200ContentApplicationjsonCountUniques {
  
  inline def apply(parameters: `771`, responses: `200ContentApplicationjsonCountUniques`): Responses200ContentApplicationjsonCountUniques = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCountUniques]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCountUniques] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `771`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCountUniques`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

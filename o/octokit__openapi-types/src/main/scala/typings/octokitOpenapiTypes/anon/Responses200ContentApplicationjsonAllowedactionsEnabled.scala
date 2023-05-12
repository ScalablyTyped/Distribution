package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllowedactionsEnabled extends StObject {
  
  var parameters: `540`
  
  var responses: `200ContentApplicationjsonAllowedactionsEnabled`
}
object Responses200ContentApplicationjsonAllowedactionsEnabled {
  
  inline def apply(parameters: `540`, responses: `200ContentApplicationjsonAllowedactionsEnabled`): Responses200ContentApplicationjsonAllowedactionsEnabled = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllowedactionsEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAllowedactionsEnabled] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowedactionsEnabled`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

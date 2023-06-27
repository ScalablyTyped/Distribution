package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllowedactionsEnabledrepositories extends StObject {
  
  var parameters: `582`
  
  var responses: `200ContentApplicationjsonAllowedactionsEnabledrepositories`
}
object Responses200ContentApplicationjsonAllowedactionsEnabledrepositories {
  
  inline def apply(parameters: `582`, responses: `200ContentApplicationjsonAllowedactionsEnabledrepositories`): Responses200ContentApplicationjsonAllowedactionsEnabledrepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllowedactionsEnabledrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAllowedactionsEnabledrepositories] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowedactionsEnabledrepositories`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

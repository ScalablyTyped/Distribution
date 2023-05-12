package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRules extends StObject {
  
  var parameters: PathOrgRulesetid
  
  /** @description Request body */
  var requestBody: js.UndefOr[ContentApplicationjsonConditionsEnforcement] = js.undefined
  
  var responses: `200ContentApplicationjsonRules`
}
object Responses200ContentApplicationjsonRules {
  
  inline def apply(parameters: PathOrgRulesetid, responses: `200ContentApplicationjsonRules`): Responses200ContentApplicationjsonRules = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRules] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConditionsEnforcement): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

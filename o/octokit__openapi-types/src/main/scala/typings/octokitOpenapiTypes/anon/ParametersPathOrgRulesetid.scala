package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRulesetid extends StObject {
  
  var parameters: PathOrgRulesetid
  
  var responses: `200ContentApplicationjsonRules`
}
object ParametersPathOrgRulesetid {
  
  inline def apply(parameters: PathOrgRulesetid, responses: `200ContentApplicationjsonRules`): ParametersPathOrgRulesetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRulesetid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

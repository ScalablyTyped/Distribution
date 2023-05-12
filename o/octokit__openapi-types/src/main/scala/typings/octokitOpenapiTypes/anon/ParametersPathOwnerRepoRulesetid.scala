package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRulesetid extends StObject {
  
  var parameters: PathOwnerRepoRulesetid
  
  var responses: `200ContentApplicationjsonRules`
}
object ParametersPathOwnerRepoRulesetid {
  
  inline def apply(parameters: PathOwnerRepoRulesetid, responses: `200ContentApplicationjsonRules`): ParametersPathOwnerRepoRulesetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

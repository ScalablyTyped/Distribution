package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRulesetid extends StObject {
  
  var parameters: PathRepoRulesetid
  
  var responses: `200Content107`
}
object ParametersPathRepoRulesetid {
  
  inline def apply(parameters: PathRepoRulesetid, responses: `200Content107`): ParametersPathRepoRulesetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content107`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRulesetid extends StObject {
  
  var parameters: PathRulesetid
  
  var responses: `200Content107`
}
object ParametersPathRulesetid {
  
  inline def apply(parameters: PathRulesetid, responses: `200Content107`): ParametersPathRulesetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRulesetid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content107`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

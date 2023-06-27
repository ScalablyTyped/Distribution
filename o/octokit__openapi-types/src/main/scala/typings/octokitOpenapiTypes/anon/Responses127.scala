package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses127 extends StObject {
  
  var parameters: PathRulesetid
  
  var responses: `127`
}
object Responses127 {
  
  inline def apply(parameters: PathRulesetid, responses: `127`): Responses127 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses127]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses127] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `127`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

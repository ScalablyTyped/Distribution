package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content104 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `200Content104`
}
object Responses200Content104 {
  
  inline def apply(parameters: PathUsername, responses: `200Content104`): Responses200Content104 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content104]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content104] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content104`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

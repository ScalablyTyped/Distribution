package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses102 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `102`
}
object Responses102 {
  
  inline def apply(parameters: PathUsername, responses: `102`): Responses102 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses102]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses102] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

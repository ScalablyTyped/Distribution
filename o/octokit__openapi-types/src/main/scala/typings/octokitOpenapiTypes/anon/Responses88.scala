package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses88 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `88`
}
object Responses88 {
  
  inline def apply(parameters: PathUsername, responses: `88`): Responses88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses88]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses88] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `88`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

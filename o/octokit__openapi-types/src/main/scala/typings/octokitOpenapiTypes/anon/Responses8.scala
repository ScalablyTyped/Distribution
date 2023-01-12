package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses8 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `8`
}
object Responses8 {
  
  inline def apply(parameters: PathUsername, responses: `8`): Responses8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses8]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses8] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

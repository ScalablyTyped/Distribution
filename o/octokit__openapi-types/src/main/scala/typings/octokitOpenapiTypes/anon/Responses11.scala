package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses11 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `11`
}
object Responses11 {
  
  inline def apply(parameters: PathUsername, responses: `11`): Responses11 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses11]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses11] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `11`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

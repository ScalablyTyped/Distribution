package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses106 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `106`
}
object Responses106 {
  
  inline def apply(parameters: PathUsername, responses: `106`): Responses106 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses106]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses106] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `106`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

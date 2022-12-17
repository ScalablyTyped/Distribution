package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses84 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `84`
}
object Responses84 {
  
  inline def apply(parameters: PathUsername, responses: `84`): Responses84 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses84]
  }
  
  extension [Self <: Responses84](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `84`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

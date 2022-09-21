package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses96 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `96`
}
object Responses96 {
  
  inline def apply(parameters: PathUsername, responses: `96`): Responses96 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses96]
  }
  
  extension [Self <: Responses96](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `96`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

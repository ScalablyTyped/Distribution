package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses92 extends StObject {
  
  var parameters: PathUsername
  
  var responses: `92`
}
object Responses92 {
  
  inline def apply(parameters: PathUsername, responses: `92`): Responses92 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses92]
  }
  
  extension [Self <: Responses92](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `92`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

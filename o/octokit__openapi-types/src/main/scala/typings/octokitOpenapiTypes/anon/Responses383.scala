package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses383 extends StObject {
  
  var parameters: Path364Query250
  
  var responses: `383`
}
object Responses383 {
  
  inline def apply(parameters: Path364Query250, responses: `383`): Responses383 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses383]
  }
  
  extension [Self <: Responses383](x: Self) {
    
    inline def setParameters(value: Path364Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `383`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses657 extends StObject {
  
  var parameters: Path615Query250
  
  var responses: `657`
}
object Responses657 {
  
  inline def apply(parameters: Path615Query250, responses: `657`): Responses657 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses657]
  }
  
  extension [Self <: Responses657](x: Self) {
    
    inline def setParameters(value: Path615Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `657`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

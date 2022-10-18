package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses654 extends StObject {
  
  var parameters: Path615Query250
  
  var responses: `654`
}
object Responses654 {
  
  inline def apply(parameters: Path615Query250, responses: `654`): Responses654 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses654]
  }
  
  extension [Self <: Responses654](x: Self) {
    
    inline def setParameters(value: Path615Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `654`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

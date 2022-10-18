package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401402 extends StObject {
  
  var parameters: Path622
  
  var responses: `401402`
}
object Responses401402 {
  
  inline def apply(parameters: Path622, responses: `401402`): Responses401402 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401402]
  }
  
  extension [Self <: Responses401402](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401402`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

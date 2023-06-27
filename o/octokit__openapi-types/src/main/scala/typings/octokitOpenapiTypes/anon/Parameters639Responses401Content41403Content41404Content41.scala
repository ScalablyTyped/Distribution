package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639Responses401Content41403Content41404Content41 extends StObject {
  
  var parameters: `639`
  
  var responses: `401Content41403Content41404Content41`
}
object Parameters639Responses401Content41403Content41404Content41 {
  
  inline def apply(parameters: `639`, responses: `401Content41403Content41404Content41`): Parameters639Responses401Content41403Content41404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639Responses401Content41403Content41404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639Responses401Content41403Content41404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

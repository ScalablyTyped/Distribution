package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content41 extends StObject {
  
  var parameters: `562`
  
  var responses: `401Content41`
}
object Responses401Content41 {
  
  inline def apply(parameters: `562`, responses: `401Content41`): Responses401Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `562`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

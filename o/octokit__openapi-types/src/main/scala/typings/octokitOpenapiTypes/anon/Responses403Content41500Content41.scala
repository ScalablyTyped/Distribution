package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content41500Content41 extends StObject {
  
  var parameters: `645`
  
  var responses: `403Content41500Content41`
}
object Responses403Content41500Content41 {
  
  inline def apply(parameters: `645`, responses: `403Content41500Content41`): Responses403Content41500Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content41500Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content41500Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content41500Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

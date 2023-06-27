package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters801 extends StObject {
  
  var parameters: `801`
  
  var responses: `304401Content41`
}
object Parameters801 {
  
  inline def apply(parameters: `801`, responses: `304401Content41`): Parameters801 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters801]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters801] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `801`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

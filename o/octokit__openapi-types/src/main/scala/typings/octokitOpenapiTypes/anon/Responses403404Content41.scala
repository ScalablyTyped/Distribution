package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404Content41 extends StObject {
  
  var parameters: `165`
  
  var responses: `403404Content41`
}
object Responses403404Content41 {
  
  inline def apply(parameters: `165`, responses: `403404Content41`): Responses403404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses293 extends StObject {
  
  var parameters: `141`
  
  var responses: `293`
}
object Responses293 {
  
  inline def apply(parameters: `141`, responses: `293`): Responses293 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses293]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses293] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `293`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

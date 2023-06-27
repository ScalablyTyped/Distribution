package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content646 extends StObject {
  
  var parameters: `645`
  
  var responses: `200Content646`
}
object Responses200Content646 {
  
  inline def apply(parameters: `645`, responses: `200Content646`): Responses200Content646 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content646]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content646] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content646`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

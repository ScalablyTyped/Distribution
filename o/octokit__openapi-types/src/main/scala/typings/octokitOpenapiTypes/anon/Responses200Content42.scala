package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content42 extends StObject {
  
  var parameters: `4`
  
  var responses: `200Content42`
}
object Responses200Content42 {
  
  inline def apply(parameters: `4`, responses: `200Content42`): Responses200Content42 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content42]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content42] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `4`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content42`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

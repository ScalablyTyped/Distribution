package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content151 extends StObject {
  
  var parameters: `147`
  
  var responses: `200Content151`
}
object Responses200Content151 {
  
  inline def apply(parameters: `147`, responses: `200Content151`): Responses200Content151 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content151]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content151] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content151`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

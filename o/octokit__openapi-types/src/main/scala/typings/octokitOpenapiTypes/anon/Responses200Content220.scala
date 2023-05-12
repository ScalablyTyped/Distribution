package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content220 extends StObject {
  
  var parameters: `141`
  
  var responses: `200Content220`
}
object Responses200Content220 {
  
  inline def apply(parameters: `141`, responses: `200Content220`): Responses200Content220 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content220]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content220] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content220`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

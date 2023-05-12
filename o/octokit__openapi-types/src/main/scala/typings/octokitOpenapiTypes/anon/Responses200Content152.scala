package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content152 extends StObject {
  
  var parameters: `141`
  
  var responses: `200Content152`
}
object Responses200Content152 {
  
  inline def apply(parameters: `141`, responses: `200Content152`): Responses200Content152 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content152]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content152] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content152`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content147 extends StObject {
  
  var parameters: `142`
  
  var responses: `200Content147`
}
object Responses200Content147 {
  
  inline def apply(parameters: `142`, responses: `200Content147`): Responses200Content147 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content147]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content147] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `142`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content147`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

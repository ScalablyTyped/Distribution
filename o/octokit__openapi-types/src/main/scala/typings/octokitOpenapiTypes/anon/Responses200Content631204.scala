package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content631204 extends StObject {
  
  var parameters: `540`
  
  var responses: `200Content631204`
}
object Responses200Content631204 {
  
  inline def apply(parameters: `540`, responses: `200Content631204`): Responses200Content631204 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content631204]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content631204] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content631204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content182 extends StObject {
  
  var parameters: `181`
  
  var responses: `200Content182`
}
object Responses200Content182 {
  
  inline def apply(parameters: `181`, responses: `200Content182`): Responses200Content182 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content182]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content182] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `181`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content182`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

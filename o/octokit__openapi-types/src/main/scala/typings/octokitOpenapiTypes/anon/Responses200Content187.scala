package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content187 extends StObject {
  
  var parameters: `181`
  
  var responses: `200Content187`
}
object Responses200Content187 {
  
  inline def apply(parameters: `181`, responses: `200Content187`): Responses200Content187 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content187]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content187] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `181`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content187`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

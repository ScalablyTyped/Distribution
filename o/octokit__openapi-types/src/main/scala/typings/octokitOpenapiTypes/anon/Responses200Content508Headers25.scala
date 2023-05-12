package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content508Headers25 extends StObject {
  
  var parameters: Query493
  
  var responses: `200Content508Headers25`
}
object Responses200Content508Headers25 {
  
  inline def apply(parameters: Query493, responses: `200Content508Headers25`): Responses200Content508Headers25 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content508Headers25]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content508Headers25] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query493): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content508Headers25`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content433 extends StObject {
  
  var parameters: `429`
  
  var responses: `200Content433`
}
object Responses200Content433 {
  
  inline def apply(parameters: `429`, responses: `200Content433`): Responses200Content433 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content433]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content433] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `429`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content433`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

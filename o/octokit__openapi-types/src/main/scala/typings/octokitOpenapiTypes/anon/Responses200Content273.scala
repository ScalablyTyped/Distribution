package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content273 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content273`
}
object Responses200Content273 {
  
  inline def apply(parameters: PathOwner, responses: `200Content273`): Responses200Content273 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content273]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content273] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content273`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

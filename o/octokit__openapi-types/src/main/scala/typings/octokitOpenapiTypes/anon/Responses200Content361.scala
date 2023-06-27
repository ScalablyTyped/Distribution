package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content361 extends StObject {
  
  var parameters: `165`
  
  var responses: `200Content361`
}
object Responses200Content361 {
  
  inline def apply(parameters: `165`, responses: `200Content361`): Responses200Content361 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content361]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content361] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content361`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

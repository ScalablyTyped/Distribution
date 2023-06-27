package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content315 extends StObject {
  
  var parameters: `165`
  
  var responses: `200Content315`
}
object Responses200Content315 {
  
  inline def apply(parameters: `165`, responses: `200Content315`): Responses200Content315 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content315]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content315] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content315`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

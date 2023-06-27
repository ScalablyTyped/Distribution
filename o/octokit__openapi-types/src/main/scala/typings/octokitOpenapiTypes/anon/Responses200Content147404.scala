package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content147404 extends StObject {
  
  var parameters: `439`
  
  var responses: `200Content147404`
}
object Responses200Content147404 {
  
  inline def apply(parameters: `439`, responses: `200Content147404`): Responses200Content147404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content147404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content147404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `439`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content147404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content592Headers28 extends StObject {
  
  var parameters: `579`
  
  var responses: `200Content592Headers28`
}
object Responses200Content592Headers28 {
  
  inline def apply(parameters: `579`, responses: `200Content592Headers28`): Responses200Content592Headers28 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content592Headers28]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content592Headers28] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `579`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592Headers28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

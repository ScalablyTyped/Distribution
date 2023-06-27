package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters355 extends StObject {
  
  var parameters: `355`
  
  var responses: `200Content46`
}
object Parameters355 {
  
  inline def apply(parameters: `355`, responses: `200Content46`): Parameters355 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters355]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters355] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `355`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content46`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

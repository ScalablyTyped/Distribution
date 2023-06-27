package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters562 extends StObject {
  
  var parameters: `562`
  
  var responses: `200Content563`
}
object Parameters562 {
  
  inline def apply(parameters: `562`, responses: `200Content563`): Parameters562 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters562]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters562] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `562`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content563`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters160 extends StObject {
  
  var parameters: `160`
  
  var responses: `200Content161`
}
object Parameters160 {
  
  inline def apply(parameters: `160`, responses: `200Content161`): Parameters160 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters160]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters160] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `160`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content161`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters582 extends StObject {
  
  var parameters: `582`
  
  var responses: `200Content583`
}
object Parameters582 {
  
  inline def apply(parameters: `582`, responses: `200Content583`): Parameters582 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters582]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters582] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content583`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

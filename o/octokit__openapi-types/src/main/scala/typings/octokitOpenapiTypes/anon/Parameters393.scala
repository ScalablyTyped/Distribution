package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters393 extends StObject {
  
  var parameters: `393`
  
  var responses: `200404500`
}
object Parameters393 {
  
  inline def apply(parameters: `393`, responses: `200404500`): Parameters393 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters393]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters393] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `393`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

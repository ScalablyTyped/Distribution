package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters6 extends StObject {
  
  var parameters: `6`
  
  var responses: `200Headers`
}
object Parameters6 {
  
  inline def apply(parameters: `6`, responses: `200Headers`): Parameters6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters6] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `6`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

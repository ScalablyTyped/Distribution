package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters555 extends StObject {
  
  var parameters: `555`
  
  var responses: `200Content556`
}
object Parameters555 {
  
  inline def apply(parameters: `555`, responses: `200Content556`): Parameters555 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters555]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters555] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `555`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content556`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

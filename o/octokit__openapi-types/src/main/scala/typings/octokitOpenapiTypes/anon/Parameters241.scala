package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters241 extends StObject {
  
  var parameters: `241`
  
  var responses: `200Content242`
}
object Parameters241 {
  
  inline def apply(parameters: `241`, responses: `200Content242`): Parameters241 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters241]
  }
  
  extension [Self <: Parameters241](x: Self) {
    
    inline def setParameters(value: `241`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content242`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters127 extends StObject {
  
  var parameters: `127`
  
  var responses: `200Content128`
}
object Parameters127 {
  
  inline def apply(parameters: `127`, responses: `200Content128`): Parameters127 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters127]
  }
  
  extension [Self <: Parameters127](x: Self) {
    
    inline def setParameters(value: `127`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content128`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

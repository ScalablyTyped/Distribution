package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395 extends StObject {
  
  var parameters: `395`
  
  var responses: `200301403`
}
object Parameters395 {
  
  inline def apply(parameters: `395`, responses: `200301403`): Parameters395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395]
  }
  
  extension [Self <: Parameters395](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

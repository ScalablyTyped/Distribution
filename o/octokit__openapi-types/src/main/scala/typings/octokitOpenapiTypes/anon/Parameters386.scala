package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters386 extends StObject {
  
  var parameters: `386`
  
  var responses: `200Content103`
}
object Parameters386 {
  
  inline def apply(parameters: `386`, responses: `200Content103`): Parameters386 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters386]
  }
  
  extension [Self <: Parameters386](x: Self) {
    
    inline def setParameters(value: `386`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content103`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

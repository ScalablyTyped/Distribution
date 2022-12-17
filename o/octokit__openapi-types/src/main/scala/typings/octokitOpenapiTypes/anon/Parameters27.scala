package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters27 extends StObject {
  
  var parameters: `27`
  
  var responses: `304403`
}
object Parameters27 {
  
  inline def apply(parameters: `27`, responses: `304403`): Parameters27 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters27]
  }
  
  extension [Self <: Parameters27](x: Self) {
    
    inline def setParameters(value: `27`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

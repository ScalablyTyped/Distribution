package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters343 extends StObject {
  
  var parameters: `343`
  
  var responses: `200Content67`
}
object Parameters343 {
  
  inline def apply(parameters: `343`, responses: `200Content67`): Parameters343 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters343]
  }
  
  extension [Self <: Parameters343](x: Self) {
    
    inline def setParameters(value: `343`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content67`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

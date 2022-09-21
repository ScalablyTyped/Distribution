package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters455 extends StObject {
  
  var parameters: `455`
  
  var responses: `304401403404500`
}
object Parameters455 {
  
  inline def apply(parameters: `455`, responses: `304401403404500`): Parameters455 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters455]
  }
  
  extension [Self <: Parameters455](x: Self) {
    
    inline def setParameters(value: `455`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

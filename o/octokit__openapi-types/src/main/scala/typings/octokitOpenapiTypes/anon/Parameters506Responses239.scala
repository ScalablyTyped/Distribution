package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters506Responses239 extends StObject {
  
  var parameters: `506`
  
  var responses: `239`
}
object Parameters506Responses239 {
  
  inline def apply(parameters: `506`, responses: `239`): Parameters506Responses239 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters506Responses239]
  }
  
  extension [Self <: Parameters506Responses239](x: Self) {
    
    inline def setParameters(value: `506`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `239`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

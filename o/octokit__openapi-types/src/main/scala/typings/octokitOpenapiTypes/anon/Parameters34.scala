package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters34 extends StObject {
  
  var parameters: `34`
  
  var responses: `304403`
}
object Parameters34 {
  
  inline def apply(parameters: `34`, responses: `304403`): Parameters34 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters34]
  }
  
  extension [Self <: Parameters34](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

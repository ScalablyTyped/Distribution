package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters348 extends StObject {
  
  var parameters: `348`
  
  var responses: `236`
}
object Parameters348 {
  
  inline def apply(parameters: `348`, responses: `236`): Parameters348 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters348]
  }
  
  extension [Self <: Parameters348](x: Self) {
    
    inline def setParameters(value: `348`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

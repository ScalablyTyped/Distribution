package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters92 extends StObject {
  
  var parameters: `92`
  
  var responses: `6`
}
object Parameters92 {
  
  inline def apply(parameters: `92`, responses: `6`): Parameters92 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters92]
  }
  
  extension [Self <: Parameters92](x: Self) {
    
    inline def setParameters(value: `92`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

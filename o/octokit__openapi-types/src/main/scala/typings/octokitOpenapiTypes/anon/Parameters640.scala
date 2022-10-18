package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters640 extends StObject {
  
  var parameters: `640`
  
  var responses: `641`
}
object Parameters640 {
  
  inline def apply(parameters: `640`, responses: `641`): Parameters640 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters640]
  }
  
  extension [Self <: Parameters640](x: Self) {
    
    inline def setParameters(value: `640`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `641`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

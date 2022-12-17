package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters373 extends StObject {
  
  var parameters: `373`
  
  var responses: `55`
}
object Parameters373 {
  
  inline def apply(parameters: `373`, responses: `55`): Parameters373 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters373]
  }
  
  extension [Self <: Parameters373](x: Self) {
    
    inline def setParameters(value: `373`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

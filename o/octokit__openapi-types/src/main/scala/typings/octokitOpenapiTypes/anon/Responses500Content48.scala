package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses500Content48 extends StObject {
  
  var parameters: `475`
  
  var responses: `500Content48`
}
object Responses500Content48 {
  
  inline def apply(parameters: `475`, responses: `500Content48`): Responses500Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses500Content48]
  }
  
  extension [Self <: Responses500Content48](x: Self) {
    
    inline def setParameters(value: `475`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

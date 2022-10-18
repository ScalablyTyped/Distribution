package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200177 extends StObject {
  
  var parameters: `76`
  
  var responses: `200177`
}
object Responses200177 {
  
  inline def apply(parameters: `76`, responses: `200177`): Responses200177 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200177]
  }
  
  extension [Self <: Responses200177](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200177`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

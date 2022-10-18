package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content4 extends StObject {
  
  var parameters: `76`
  
  var responses: `202Content4`
}
object Responses202Content4 {
  
  inline def apply(parameters: `76`, responses: `202Content4`): Responses202Content4 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content4]
  }
  
  extension [Self <: Responses202Content4](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

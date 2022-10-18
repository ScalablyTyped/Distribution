package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409Content6 extends StObject {
  
  var parameters: `76`
  
  var responses: `409Content6`
}
object Responses409Content6 {
  
  inline def apply(parameters: `76`, responses: `409Content6`): Responses409Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409Content6]
  }
  
  extension [Self <: Responses409Content6](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

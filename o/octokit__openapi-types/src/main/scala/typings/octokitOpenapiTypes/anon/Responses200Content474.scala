package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content474 extends StObject {
  
  var parameters: `395`
  
  var responses: `200Content474`
}
object Responses200Content474 {
  
  inline def apply(parameters: `395`, responses: `200Content474`): Responses200Content474 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content474]
  }
  
  extension [Self <: Responses200Content474](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content474`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

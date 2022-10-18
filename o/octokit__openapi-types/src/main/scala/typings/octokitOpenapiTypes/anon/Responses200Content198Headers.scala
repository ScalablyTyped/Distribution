package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content198Headers extends StObject {
  
  var parameters: `17`
  
  var responses: `200Content198Headers`
}
object Responses200Content198Headers {
  
  inline def apply(parameters: `17`, responses: `200Content198Headers`): Responses200Content198Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content198Headers]
  }
  
  extension [Self <: Responses200Content198Headers](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content198Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

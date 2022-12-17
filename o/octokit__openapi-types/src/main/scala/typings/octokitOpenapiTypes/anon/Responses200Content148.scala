package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content148 extends StObject {
  
  var parameters: `147`
  
  var responses: `200Content148`
}
object Responses200Content148 {
  
  inline def apply(parameters: `147`, responses: `200Content148`): Responses200Content148 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content148]
  }
  
  extension [Self <: Responses200Content148](x: Self) {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content148`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

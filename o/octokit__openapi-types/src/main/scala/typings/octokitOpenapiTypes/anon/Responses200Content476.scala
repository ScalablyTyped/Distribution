package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content476 extends StObject {
  
  var parameters: `475`
  
  var responses: `200Content476`
}
object Responses200Content476 {
  
  inline def apply(parameters: `475`, responses: `200Content476`): Responses200Content476 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content476]
  }
  
  extension [Self <: Responses200Content476](x: Self) {
    
    inline def setParameters(value: `475`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content476`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

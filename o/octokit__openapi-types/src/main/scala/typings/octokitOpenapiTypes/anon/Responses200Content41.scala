package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content41 extends StObject {
  
  var parameters: `37`
  
  var responses: `200Content41`
}
object Responses200Content41 {
  
  inline def apply(parameters: `37`, responses: `200Content41`): Responses200Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content41]
  }
  
  extension [Self <: Responses200Content41](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

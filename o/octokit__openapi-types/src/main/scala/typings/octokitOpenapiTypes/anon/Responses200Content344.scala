package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content344 extends StObject {
  
  var parameters: Path325
  
  var responses: `200Content344`
}
object Responses200Content344 {
  
  inline def apply(parameters: Path325, responses: `200Content344`): Responses200Content344 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content344]
  }
  
  extension [Self <: Responses200Content344](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content344`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

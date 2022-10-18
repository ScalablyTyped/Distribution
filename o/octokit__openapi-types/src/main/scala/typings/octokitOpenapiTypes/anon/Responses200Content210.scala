package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content210 extends StObject {
  
  var parameters: `17`
  
  var responses: `200Content210`
}
object Responses200Content210 {
  
  inline def apply(parameters: `17`, responses: `200Content210`): Responses200Content210 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content210]
  }
  
  extension [Self <: Responses200Content210](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content210`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

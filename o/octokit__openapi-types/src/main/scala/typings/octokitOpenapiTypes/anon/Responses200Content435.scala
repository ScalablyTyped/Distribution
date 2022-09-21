package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content435 extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `200Content435`
}
object Responses200Content435 {
  
  inline def apply(parameters: PathOrgStringQuery426, responses: `200Content435`): Responses200Content435 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content435]
  }
  
  extension [Self <: Responses200Content435](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content435`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

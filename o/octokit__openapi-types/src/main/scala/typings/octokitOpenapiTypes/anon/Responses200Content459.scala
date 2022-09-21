package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content459 extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `200Content459`
}
object Responses200Content459 {
  
  inline def apply(parameters: PathOrgStringQuery426, responses: `200Content459`): Responses200Content459 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content459]
  }
  
  extension [Self <: Responses200Content459](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content459`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

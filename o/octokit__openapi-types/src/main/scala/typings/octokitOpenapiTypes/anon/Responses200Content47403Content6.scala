package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content47403Content6 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200Content47403Content6`
}
object Responses200Content47403Content6 {
  
  inline def apply(parameters: PathOrgString, responses: `200Content47403Content6`): Responses200Content47403Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content47403Content6]
  }
  
  extension [Self <: Responses200Content47403Content6](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content47403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

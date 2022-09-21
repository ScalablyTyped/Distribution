package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content81 extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200Content81`
}
object Responses200Content81 {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200Content81`): Responses200Content81 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content81]
  }
  
  extension [Self <: Responses200Content81](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content81`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

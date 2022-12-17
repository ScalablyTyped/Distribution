package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content83403 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content83403`
}
object Responses200Content83403 {
  
  inline def apply(parameters: PathOrg, responses: `200Content83403`): Responses200Content83403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content83403]
  }
  
  extension [Self <: Responses200Content83403](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content83403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content442 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `200Content442`
}
object Responses200Content442 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `200Content442`): Responses200Content442 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content442]
  }
  
  extension [Self <: Responses200Content442](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content442`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

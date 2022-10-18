package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content444 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `200Content444`
}
object Responses200Content444 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `200Content444`): Responses200Content444 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content444]
  }
  
  extension [Self <: Responses200Content444](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content444`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

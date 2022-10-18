package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDismissalrestrictions extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonDismissalrestrictions`
}
object Responses200ContentApplicationjsonDismissalrestrictions {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonDismissalrestrictions`): Responses200ContentApplicationjsonDismissalrestrictions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDismissalrestrictions]
  }
  
  extension [Self <: Responses200ContentApplicationjsonDismissalrestrictions](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDismissalrestrictions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

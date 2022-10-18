package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAllowforcepushes extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonAllowforcepushes`
}
object Responses200ContentApplicationjsonAllowforcepushes {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonAllowforcepushes`): Responses200ContentApplicationjsonAllowforcepushes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAllowforcepushes]
  }
  
  extension [Self <: Responses200ContentApplicationjsonAllowforcepushes](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowforcepushes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

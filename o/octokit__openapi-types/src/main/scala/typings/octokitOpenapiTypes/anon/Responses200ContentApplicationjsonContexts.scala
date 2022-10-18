package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonContexts extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonContexts`
}
object Responses200ContentApplicationjsonContexts {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonContexts`): Responses200ContentApplicationjsonContexts = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonContexts]
  }
  
  extension [Self <: Responses200ContentApplicationjsonContexts](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContexts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

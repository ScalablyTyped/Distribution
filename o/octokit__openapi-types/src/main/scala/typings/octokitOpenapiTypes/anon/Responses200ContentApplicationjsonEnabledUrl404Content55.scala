package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnabledUrl404Content55 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonEnabledUrl404Content55`
}
object Responses200ContentApplicationjsonEnabledUrl404Content55 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonEnabledUrl404Content55`): Responses200ContentApplicationjsonEnabledUrl404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnabledUrl404Content55]
  }
  
  extension [Self <: Responses200ContentApplicationjsonEnabledUrl404Content55](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnabledUrl404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

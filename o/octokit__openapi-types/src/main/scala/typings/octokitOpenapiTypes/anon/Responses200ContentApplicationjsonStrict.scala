package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonStrict extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonStrict`
}
object Responses200ContentApplicationjsonStrict {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonStrict`): Responses200ContentApplicationjsonStrict = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonStrict]
  }
  
  extension [Self <: Responses200ContentApplicationjsonStrict](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonStrict`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

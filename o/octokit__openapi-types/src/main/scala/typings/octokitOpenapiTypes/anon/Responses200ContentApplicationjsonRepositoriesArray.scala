package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArray extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200ContentApplicationjsonRepositoriesArray`
}
object Responses200ContentApplicationjsonRepositoriesArray {
  
  inline def apply(parameters: PathOrg, responses: `200ContentApplicationjsonRepositoriesArray`): Responses200ContentApplicationjsonRepositoriesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArray]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoriesArray](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

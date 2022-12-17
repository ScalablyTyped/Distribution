package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositorycacheusages extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200ContentApplicationjsonRepositorycacheusages`
}
object Responses200ContentApplicationjsonRepositorycacheusages {
  
  inline def apply(parameters: PathOrg, responses: `200ContentApplicationjsonRepositorycacheusages`): Responses200ContentApplicationjsonRepositorycacheusages = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositorycacheusages]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositorycacheusages](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusages`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

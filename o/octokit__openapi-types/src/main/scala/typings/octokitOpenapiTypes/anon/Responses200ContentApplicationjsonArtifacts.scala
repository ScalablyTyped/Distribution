package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonArtifacts extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200ContentApplicationjsonArtifacts`
}
object Responses200ContentApplicationjsonArtifacts {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200ContentApplicationjsonArtifacts`): Responses200ContentApplicationjsonArtifacts = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonArtifacts]
  }
  
  extension [Self <: Responses200ContentApplicationjsonArtifacts](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifacts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

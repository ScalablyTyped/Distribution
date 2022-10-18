package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200445422 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var requestBody: ContentApplicationjson97
  
  var responses: `200445422`
}
object Responses200445422 {
  
  inline def apply(parameters: PathBranchOwnerRepo, requestBody: ContentApplicationjson97, responses: `200445422`): Responses200445422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200445422]
  }
  
  extension [Self <: Responses200445422](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson97): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200445422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

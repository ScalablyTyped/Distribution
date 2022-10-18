package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content437 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var requestBody: ContentApplicationjsonNewname
  
  var responses: `201Content437`
}
object Responses201Content437 {
  
  inline def apply(
    parameters: PathBranchOwnerRepo,
    requestBody: ContentApplicationjsonNewname,
    responses: `201Content437`
  ): Responses201Content437 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content437]
  }
  
  extension [Self <: Responses201Content437](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content437`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

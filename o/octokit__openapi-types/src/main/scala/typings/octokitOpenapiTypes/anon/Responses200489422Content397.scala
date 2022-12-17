package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200489422Content397 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonTeamsArray
  
  var responses: `200489422Content397`
}
object Responses200489422Content397 {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonTeamsArray,
    responses: `200489422Content397`
  ): Responses200489422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200489422Content397]
  }
  
  extension [Self <: Responses200489422Content397](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTeamsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200489422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

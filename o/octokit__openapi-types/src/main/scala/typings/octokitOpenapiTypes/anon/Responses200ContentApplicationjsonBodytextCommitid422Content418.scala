package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytextCommitid422Content418 extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200ContentApplicationjsonBodytextCommitid422Content418`
}
object Responses200ContentApplicationjsonBodytextCommitid422Content418 {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonBody,
    responses: `200ContentApplicationjsonBodytextCommitid422Content418`
  ): Responses200ContentApplicationjsonBodytextCommitid422Content418 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytextCommitid422Content418]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBodytextCommitid422Content418](x: Self) {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid422Content418`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonMergecommitsha extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonReviewers
  
  var responses: `201ContentApplicationjsonMergecommitsha`
}
object Responses201ContentApplicationjsonMergecommitsha {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonReviewers,
    responses: `201ContentApplicationjsonMergecommitsha`
  ): Responses201ContentApplicationjsonMergecommitsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonMergecommitsha]
  }
  
  extension [Self <: Responses201ContentApplicationjsonMergecommitsha](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMergecommitsha`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

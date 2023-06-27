package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytextCommitid403Content41 extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonBodyEvent
  
  var responses: `200ContentApplicationjsonBodytextCommitid403Content41`
}
object Responses200ContentApplicationjsonBodytextCommitid403Content41 {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonBodyEvent,
    responses: `200ContentApplicationjsonBodytextCommitid403Content41`
  ): Responses200ContentApplicationjsonBodytextCommitid403Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytextCommitid403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodytextCommitid403Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

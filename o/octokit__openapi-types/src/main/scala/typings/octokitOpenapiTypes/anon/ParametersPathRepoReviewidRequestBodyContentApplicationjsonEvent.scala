package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonEvent
  
  var responses: `200ContentApplicationjsonBodytextCommitid404Content41422Content549`
}
object ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonEvent,
    responses: `200ContentApplicationjsonBodytextCommitid404Content41422Content549`
  ): ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid404Content41422Content549`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content568403 extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonBodyEvent
  
  var responses: `200Content568403`
}
object Responses200Content568403 {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonBodyEvent,
    responses: `200Content568403`
  ): Responses200Content568403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content568403]
  }
  
  extension [Self <: Responses200Content568403](x: Self) {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content568403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

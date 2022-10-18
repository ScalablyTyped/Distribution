package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content568422 extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200Content568422`
}
object Responses200Content568422 {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200Content568422`
  ): Responses200Content568422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content568422]
  }
  
  extension [Self <: Responses200Content568422](x: Self) {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content568422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytextCommitid extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonComments
  
  var responses: `200ContentApplicationjsonBodytextCommitid`
}
object Responses200ContentApplicationjsonBodytextCommitid {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonComments,
    responses: `200ContentApplicationjsonBodytextCommitid`
  ): Responses200ContentApplicationjsonBodytextCommitid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytextCommitid]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBodytextCommitid](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

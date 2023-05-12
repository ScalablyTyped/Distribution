package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytextCommitid extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[ContentApplicationjsonComments] = js.undefined
  
  var responses: `200ContentApplicationjsonBodytextCommitid`
}
object Responses200ContentApplicationjsonBodytextCommitid {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `200ContentApplicationjsonBodytextCommitid`): Responses200ContentApplicationjsonBodytextCommitid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytextCommitid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodytextCommitid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

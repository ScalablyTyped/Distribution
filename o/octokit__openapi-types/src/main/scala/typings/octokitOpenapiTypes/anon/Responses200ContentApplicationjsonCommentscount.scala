package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCommentscount extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: js.UndefOr[ContentApplicationjsonTitle] = js.undefined
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object Responses200ContentApplicationjsonCommentscount {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslug, responses: `200ContentApplicationjsonCommentscount`): Responses200ContentApplicationjsonCommentscount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCommentscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCommentscount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content145 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var requestBody: js.UndefOr[ContentApplicationjson146] = js.undefined
  
  var responses: `200Content145`
}
object Responses200Content145 {
  
  inline def apply(parameters: PathOrgTeamslug, responses: `200Content145`): Responses200Content145 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content145]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content145] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson146): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content145`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

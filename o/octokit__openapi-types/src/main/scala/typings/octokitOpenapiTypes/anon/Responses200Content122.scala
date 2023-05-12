package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content122 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var requestBody: js.UndefOr[ContentApplicationjson123] = js.undefined
  
  var responses: `200Content122`
}
object Responses200Content122 {
  
  inline def apply(parameters: PathOrgTeamslug, responses: `200Content122`): Responses200Content122 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content122]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content122] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content122`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

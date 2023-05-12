package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses367 extends StObject {
  
  var parameters: PathRepoTeamid
  
  var requestBody: js.UndefOr[ContentApplicationjson366] = js.undefined
  
  var responses: `367`
}
object Responses367 {
  
  inline def apply(parameters: PathRepoTeamid, responses: `367`): Responses367 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses367]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses367] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson366): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `367`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

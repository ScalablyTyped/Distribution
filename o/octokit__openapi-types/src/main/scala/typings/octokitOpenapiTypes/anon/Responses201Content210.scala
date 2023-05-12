package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content210 extends StObject {
  
  var parameters: PathRepoUsername
  
  var requestBody: js.UndefOr[ContentApplicationjson128] = js.undefined
  
  var responses: `201Content210`
}
object Responses201Content210 {
  
  inline def apply(parameters: PathRepoUsername, responses: `201Content210`): Responses201Content210 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content210]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content210] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson128): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content210`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonIdletimeoutnotice401Content41 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var requestBody: js.UndefOr[ContentApplicationjsonRecentfolders] = js.undefined
  
  var responses: `200ContentApplicationjsonIdletimeoutnotice401Content41`
}
object Responses200ContentApplicationjsonIdletimeoutnotice401Content41 {
  
  inline def apply(
    parameters: PathCodespacenameString,
    responses: `200ContentApplicationjsonIdletimeoutnotice401Content41`
  ): Responses200ContentApplicationjsonIdletimeoutnotice401Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonIdletimeoutnotice401Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonIdletimeoutnotice401Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonIdletimeoutnotice401Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

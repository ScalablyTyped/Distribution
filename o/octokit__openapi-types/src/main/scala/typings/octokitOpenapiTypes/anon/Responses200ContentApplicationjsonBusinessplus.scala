package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBusinessplus extends StObject {
  
  var requestBody: js.UndefOr[ContentApplicationjsonBio] = js.undefined
  
  var responses: `200ContentApplicationjsonBusinessplus`
}
object Responses200ContentApplicationjsonBusinessplus {
  
  inline def apply(responses: `200ContentApplicationjsonBusinessplus`): Responses200ContentApplicationjsonBusinessplus = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBusinessplus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBusinessplus] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonBio): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonBusinessplus`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

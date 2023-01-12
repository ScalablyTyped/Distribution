package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonIdKey extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201ContentApplicationjsonIdKey`
}
object Responses201ContentApplicationjsonIdKey {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201ContentApplicationjsonIdKey`): Responses201ContentApplicationjsonIdKey = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonIdKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonIdKey] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonIdKey`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

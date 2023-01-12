package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCreatedatIdKey extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201ContentApplicationjsonCreatedatIdKey`
}
object Responses201ContentApplicationjsonCreatedatIdKey {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201ContentApplicationjsonCreatedatIdKey`): Responses201ContentApplicationjsonCreatedatIdKey = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCreatedatIdKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonCreatedatIdKey] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedatIdKey`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

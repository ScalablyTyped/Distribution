package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonBodyColumnsurl extends StObject {
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `201ContentApplicationjsonBodyColumnsurl`
}
object Responses201ContentApplicationjsonBodyColumnsurl {
  
  inline def apply(
    requestBody: ContentApplicationjsonBodyNameString,
    responses: `201ContentApplicationjsonBodyColumnsurl`
  ): Responses201ContentApplicationjsonBodyColumnsurl = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonBodyColumnsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonBodyColumnsurl] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonBodyColumnsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

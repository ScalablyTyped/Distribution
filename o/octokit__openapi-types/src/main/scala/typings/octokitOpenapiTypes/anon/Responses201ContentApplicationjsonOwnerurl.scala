package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonOwnerurl extends StObject {
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `201ContentApplicationjsonOwnerurl`
}
object Responses201ContentApplicationjsonOwnerurl {
  
  inline def apply(requestBody: ContentApplicationjsonBodyNameString, responses: `201ContentApplicationjsonOwnerurl`): Responses201ContentApplicationjsonOwnerurl = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonOwnerurl]
  }
  
  extension [Self <: Responses201ContentApplicationjsonOwnerurl](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonOwnerurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

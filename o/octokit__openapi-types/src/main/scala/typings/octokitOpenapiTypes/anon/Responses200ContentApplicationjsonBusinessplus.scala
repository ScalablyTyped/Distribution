package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBusinessplus extends StObject {
  
  var requestBody: ContentApplicationjsonBio
  
  var responses: `200ContentApplicationjsonBusinessplus`
}
object Responses200ContentApplicationjsonBusinessplus {
  
  inline def apply(requestBody: ContentApplicationjsonBio, responses: `200ContentApplicationjsonBusinessplus`): Responses200ContentApplicationjsonBusinessplus = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBusinessplus]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBusinessplus](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonBio): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBusinessplus`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

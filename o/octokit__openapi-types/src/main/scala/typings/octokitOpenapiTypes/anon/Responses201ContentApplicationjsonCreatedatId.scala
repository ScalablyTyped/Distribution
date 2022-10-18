package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCreatedatId extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201ContentApplicationjsonCreatedatId`
}
object Responses201ContentApplicationjsonCreatedatId {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201ContentApplicationjsonCreatedatId`): Responses201ContentApplicationjsonCreatedatId = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCreatedatId]
  }
  
  extension [Self <: Responses201ContentApplicationjsonCreatedatId](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

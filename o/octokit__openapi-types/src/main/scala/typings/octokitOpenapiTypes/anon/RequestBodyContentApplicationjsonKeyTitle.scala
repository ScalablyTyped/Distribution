package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyTitle extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201Content366`
}
object RequestBodyContentApplicationjsonKeyTitle {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201Content366`): RequestBodyContentApplicationjsonKeyTitle = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyTitle]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonKeyTitle](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content366`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

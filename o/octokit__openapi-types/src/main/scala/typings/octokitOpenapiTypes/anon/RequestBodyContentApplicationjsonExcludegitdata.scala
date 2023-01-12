package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExcludegitdata extends StObject {
  
  var requestBody: ContentApplicationjsonExcludegitdata
  
  var responses: `201304401403422`
}
object RequestBodyContentApplicationjsonExcludegitdata {
  
  inline def apply(requestBody: ContentApplicationjsonExcludegitdata, responses: `201304401403422`): RequestBodyContentApplicationjsonExcludegitdata = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExcludegitdata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonExcludegitdata] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonExcludegitdata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

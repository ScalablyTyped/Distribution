package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContenttypeInsecuressl extends StObject {
  
  var requestBody: ContentApplicationjsonContenttypeInsecuressl
  
  var responses: `200ContentApplicationjsonContenttype`
}
object RequestBodyContentApplicationjsonContenttypeInsecuressl {
  
  inline def apply(
    requestBody: ContentApplicationjsonContenttypeInsecuressl,
    responses: `200ContentApplicationjsonContenttype`
  ): RequestBodyContentApplicationjsonContenttypeInsecuressl = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContenttypeInsecuressl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonContenttypeInsecuressl] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

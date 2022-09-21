package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentTextplain extends StObject {
  
  var requestBody: ContentTextplain
  
  var responses: `200ContentTexthtmlHeaders`
}
object RequestBodyContentTextplain {
  
  inline def apply(requestBody: ContentTextplain, responses: `200ContentTexthtmlHeaders`): RequestBodyContentTextplain = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentTextplain]
  }
  
  extension [Self <: RequestBodyContentTextplain](x: Self) {
    
    inline def setRequestBody(value: ContentTextplain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtmlHeaders`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

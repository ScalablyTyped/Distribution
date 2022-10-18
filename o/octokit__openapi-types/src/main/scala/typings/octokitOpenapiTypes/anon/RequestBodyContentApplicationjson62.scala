package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson62 extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjson62
  
  var responses: `200ContentApplicationjsonNodeidUser`
}
object RequestBodyContentApplicationjson62 {
  
  inline def apply(
    parameters: PathCommentnumber,
    requestBody: ContentApplicationjson62,
    responses: `200ContentApplicationjsonNodeidUser`
  ): RequestBodyContentApplicationjson62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson62]
  }
  
  extension [Self <: RequestBodyContentApplicationjson62](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

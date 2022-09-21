package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDiscussioncategoryname extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201Content320`
}
object RequestBodyContentApplicationjsonDiscussioncategoryname {
  
  inline def apply(
    parameters: `144`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201Content320`
  ): RequestBodyContentApplicationjsonDiscussioncategoryname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDiscussioncategoryname]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDiscussioncategoryname](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content320`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

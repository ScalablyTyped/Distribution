package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDiscussioncategoryname extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201Content385`
}
object RequestBodyContentApplicationjsonDiscussioncategoryname {
  
  inline def apply(
    parameters: `165`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201Content385`
  ): RequestBodyContentApplicationjsonDiscussioncategoryname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDiscussioncategoryname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDiscussioncategoryname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content385`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

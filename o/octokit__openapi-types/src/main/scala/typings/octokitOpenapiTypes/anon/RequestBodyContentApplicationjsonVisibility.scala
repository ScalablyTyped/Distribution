package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonVisibility extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonVisibility
  
  var responses: `201Content60`
}
object RequestBodyContentApplicationjsonVisibility {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonVisibility,
    responses: `201Content60`
  ): RequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonVisibility] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

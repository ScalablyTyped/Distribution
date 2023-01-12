package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowspublicrepositories extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonAllowspublicrepositories
  
  var responses: `201Content19`
}
object RequestBodyContentApplicationjsonAllowspublicrepositories {
  
  inline def apply(
    parameters: PathEnterprise,
    requestBody: ContentApplicationjsonAllowspublicrepositories,
    responses: `201Content19`
  ): RequestBodyContentApplicationjsonAllowspublicrepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowspublicrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowspublicrepositories] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowspublicrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content19`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

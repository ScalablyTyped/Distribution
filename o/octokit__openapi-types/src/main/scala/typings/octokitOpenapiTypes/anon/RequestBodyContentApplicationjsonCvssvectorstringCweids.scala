package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonCvssvectorstringCweids extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonCvssvectorstringCweids
  
  var responses: `201ContentApplicationjsonCreditsdetailed`
}
object RequestBodyContentApplicationjsonCvssvectorstringCweids {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonCvssvectorstringCweids,
    responses: `201ContentApplicationjsonCreditsdetailed`
  ): RequestBodyContentApplicationjsonCvssvectorstringCweids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonCvssvectorstringCweids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonCvssvectorstringCweids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCvssvectorstringCweids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreditsdetailed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

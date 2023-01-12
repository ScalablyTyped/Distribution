package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonResolutioncomment extends StObject {
  
  var parameters: PathAlertnumber
  
  var requestBody: ContentApplicationjsonResolutioncomment
  
  var responses: `400404422`
}
object RequestBodyContentApplicationjsonResolutioncomment {
  
  inline def apply(
    parameters: PathAlertnumber,
    requestBody: ContentApplicationjsonResolutioncomment,
    responses: `400404422`
  ): RequestBodyContentApplicationjsonResolutioncomment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonResolutioncomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonResolutioncomment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonResolutioncomment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

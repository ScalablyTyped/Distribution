package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedrepositoryidsResponses404Content41 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `404Content41`
}
object RequestBodyContentApplicationjsonSelectedrepositoryidsResponses404Content41 {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `404Content41`
  ): RequestBodyContentApplicationjsonSelectedrepositoryidsResponses404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedrepositoryidsResponses404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonSelectedrepositoryidsResponses404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

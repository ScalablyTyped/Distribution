package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9 extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `9`
}
object RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9 {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `9`
  ): RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

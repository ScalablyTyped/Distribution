package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonArtifacturl extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonArtifacturl
  
  var responses: `200400404`
}
object RequestBodyContentApplicationjsonArtifacturl {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonArtifacturl, responses: `200400404`): RequestBodyContentApplicationjsonArtifacturl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonArtifacturl]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonArtifacturl](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArtifacturl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

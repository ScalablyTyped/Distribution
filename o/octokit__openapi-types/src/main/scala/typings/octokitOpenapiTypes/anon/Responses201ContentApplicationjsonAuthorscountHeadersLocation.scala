package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAuthorscountHeadersLocation extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonTfvcproject
  
  var responses: `201ContentApplicationjsonAuthorscountHeadersLocation`
}
object Responses201ContentApplicationjsonAuthorscountHeadersLocation {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonTfvcproject,
    responses: `201ContentApplicationjsonAuthorscountHeadersLocation`
  ): Responses201ContentApplicationjsonAuthorscountHeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAuthorscountHeadersLocation]
  }
  
  extension [Self <: Responses201ContentApplicationjsonAuthorscountHeadersLocation](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTfvcproject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAuthorscountHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

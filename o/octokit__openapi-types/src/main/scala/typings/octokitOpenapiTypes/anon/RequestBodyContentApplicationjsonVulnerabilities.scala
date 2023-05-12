package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonVulnerabilities extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonVulnerabilities
  
  var responses: `201ContentApplicationjsonCreditsdetailed`
}
object RequestBodyContentApplicationjsonVulnerabilities {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonVulnerabilities,
    responses: `201ContentApplicationjsonCreditsdetailed`
  ): RequestBodyContentApplicationjsonVulnerabilities = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonVulnerabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonVulnerabilities] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonVulnerabilities): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreditsdetailed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonNodeidObjectHeadersLocation extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonRefSha
  
  var responses: `201ContentApplicationjsonNodeidObjectHeadersLocation`
}
object Responses201ContentApplicationjsonNodeidObjectHeadersLocation {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonRefSha,
    responses: `201ContentApplicationjsonNodeidObjectHeadersLocation`
  ): Responses201ContentApplicationjsonNodeidObjectHeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonNodeidObjectHeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonNodeidObjectHeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRefSha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidObjectHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

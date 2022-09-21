package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurl extends StObject {
  
  var parameters: PathOrgProjectid
  
  var requestBody: Content129
  
  var responses: `403ContentApplicationjsonDocumentationurl`
}
object Responses403ContentApplicationjsonDocumentationurl {
  
  inline def apply(
    parameters: PathOrgProjectid,
    requestBody: Content129,
    responses: `403ContentApplicationjsonDocumentationurl`
  ): Responses403ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurl]
  }
  
  extension [Self <: Responses403ContentApplicationjsonDocumentationurl](x: Self) {
    
    inline def setParameters(value: PathOrgProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content129): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

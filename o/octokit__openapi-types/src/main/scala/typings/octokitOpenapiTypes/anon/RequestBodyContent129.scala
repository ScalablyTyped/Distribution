package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent129 extends StObject {
  
  var parameters: PathProjectid
  
  var requestBody: Content129
  
  var responses: `403ContentApplicationjsonDocumentationurl`
}
object RequestBodyContent129 {
  
  inline def apply(
    parameters: PathProjectid,
    requestBody: Content129,
    responses: `403ContentApplicationjsonDocumentationurl`
  ): RequestBodyContent129 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent129]
  }
  
  extension [Self <: RequestBodyContent129](x: Self) {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content129): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

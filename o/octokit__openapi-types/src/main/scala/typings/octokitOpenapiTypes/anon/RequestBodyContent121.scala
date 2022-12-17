package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent121 extends StObject {
  
  var parameters: PathProjectid
  
  var requestBody: Content121
  
  var responses: `403ContentApplicationjsonDocumentationurl`
}
object RequestBodyContent121 {
  
  inline def apply(
    parameters: PathProjectid,
    requestBody: Content121,
    responses: `403ContentApplicationjsonDocumentationurl`
  ): RequestBodyContent121 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent121]
  }
  
  extension [Self <: RequestBodyContent121](x: Self) {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

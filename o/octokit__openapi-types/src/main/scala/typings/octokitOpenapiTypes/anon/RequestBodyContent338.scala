package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent338 extends StObject {
  
  var parameters: `303`
  
  var requestBody: Content338
  
  var responses: `200Content337`
}
object RequestBodyContent338 {
  
  inline def apply(parameters: `303`, requestBody: Content338, responses: `200Content337`): RequestBodyContent338 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent338]
  }
  
  extension [Self <: RequestBodyContent338](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content338): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content337`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

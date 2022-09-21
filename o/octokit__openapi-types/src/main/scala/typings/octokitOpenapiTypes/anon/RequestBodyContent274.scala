package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent274 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content274
  
  var responses: `200410422`
}
object RequestBodyContent274 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content274, responses: `200410422`): RequestBodyContent274 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent274]
  }
  
  extension [Self <: RequestBodyContent274](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content274): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

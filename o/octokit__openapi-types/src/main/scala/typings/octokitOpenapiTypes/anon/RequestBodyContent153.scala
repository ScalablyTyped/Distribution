package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent153 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content153
  
  var responses: `403404410422`
}
object RequestBodyContent153 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content153, responses: `403404410422`): RequestBodyContent153 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent153]
  }
  
  extension [Self <: RequestBodyContent153](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content153): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

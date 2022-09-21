package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent275 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content275
  
  var responses: `403404410422`
}
object RequestBodyContent275 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content275, responses: `403404410422`): RequestBodyContent275 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent275]
  }
  
  extension [Self <: RequestBodyContent275](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content275): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

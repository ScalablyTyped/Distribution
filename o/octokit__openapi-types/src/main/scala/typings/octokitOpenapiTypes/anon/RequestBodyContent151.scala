package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent151 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: Content151
  
  var responses: `200301404410`
}
object RequestBodyContent151 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: Content151, responses: `200301404410`): RequestBodyContent151 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent151]
  }
  
  extension [Self <: RequestBodyContent151](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content151): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

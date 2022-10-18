package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent175 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content175
  
  var responses: `202403422`
}
object RequestBodyContent175 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content175, responses: `202403422`): RequestBodyContent175 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent175]
  }
  
  extension [Self <: RequestBodyContent175](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content175): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

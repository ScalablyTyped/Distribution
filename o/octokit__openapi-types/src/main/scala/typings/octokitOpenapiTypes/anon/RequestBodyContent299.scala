package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent299 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content299
  
  var responses: `202401`
}
object RequestBodyContent299 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content299, responses: `202401`): RequestBodyContent299 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent299]
  }
  
  extension [Self <: RequestBodyContent299](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content299): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent129 extends StObject {
  
  var parameters: Path126
  
  var requestBody: Content129
  
  var responses: `201304401`
}
object RequestBodyContent129 {
  
  inline def apply(parameters: Path126, requestBody: Content129, responses: `201304401`): RequestBodyContent129 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent129]
  }
  
  extension [Self <: RequestBodyContent129](x: Self) {
    
    inline def setParameters(value: Path126): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content129): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

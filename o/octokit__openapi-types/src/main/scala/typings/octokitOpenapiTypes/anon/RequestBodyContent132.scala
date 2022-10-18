package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent132 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content132
  
  var responses: `201ContentApplicationjsonDeliveriesurl`
}
object RequestBodyContent132 {
  
  inline def apply(parameters: `76`, requestBody: Content132, responses: `201ContentApplicationjsonDeliveriesurl`): RequestBodyContent132 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent132]
  }
  
  extension [Self <: RequestBodyContent132](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content132): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDeliveriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

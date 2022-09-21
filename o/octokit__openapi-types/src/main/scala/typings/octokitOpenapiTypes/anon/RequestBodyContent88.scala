package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent88 extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: Content88
  
  var responses: `200Content87`
}
object RequestBodyContent88 {
  
  inline def apply(parameters: PathOrg, requestBody: Content88, responses: `200Content87`): RequestBodyContent88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent88]
  }
  
  extension [Self <: RequestBodyContent88](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content88): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content87`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

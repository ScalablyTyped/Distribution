package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent66 extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: Content66
  
  var responses: `201403`
}
object RequestBodyContent66 {
  
  inline def apply(parameters: PathOrg, requestBody: Content66, responses: `201403`): RequestBodyContent66 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent66]
  }
  
  extension [Self <: RequestBodyContent66](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content66): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

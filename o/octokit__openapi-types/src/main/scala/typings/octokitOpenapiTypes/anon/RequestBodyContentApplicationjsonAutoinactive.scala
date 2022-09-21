package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAutoinactive extends StObject {
  
  var parameters: PathDeploymentid
  
  var requestBody: ContentApplicationjsonAutoinactive
  
  var responses: `201Content229`
}
object RequestBodyContentApplicationjsonAutoinactive {
  
  inline def apply(
    parameters: PathDeploymentid,
    requestBody: ContentApplicationjsonAutoinactive,
    responses: `201Content229`
  ): RequestBodyContentApplicationjsonAutoinactive = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAutoinactive]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAutoinactive](x: Self) {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutoinactive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

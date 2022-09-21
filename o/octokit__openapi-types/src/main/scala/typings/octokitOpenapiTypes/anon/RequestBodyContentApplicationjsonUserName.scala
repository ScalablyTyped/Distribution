package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUserName extends StObject {
  
  var parameters: PathOrgScimuserid
  
  var requestBody: ContentApplicationjsonUserName
  
  var responses: `200Content355`
}
object RequestBodyContentApplicationjsonUserName {
  
  inline def apply(
    parameters: PathOrgScimuserid,
    requestBody: ContentApplicationjsonUserName,
    responses: `200Content355`
  ): RequestBodyContentApplicationjsonUserName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUserName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUserName](x: Self) {
    
    inline def setParameters(value: PathOrgScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUserName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content355`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

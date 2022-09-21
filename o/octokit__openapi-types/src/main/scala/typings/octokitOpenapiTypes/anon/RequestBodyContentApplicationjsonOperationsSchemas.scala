package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonOperationsSchemas extends StObject {
  
  var parameters: PathOrgScimuserid
  
  var requestBody: ContentApplicationjsonOperationsSchemas
  
  var responses: `404429`
}
object RequestBodyContentApplicationjsonOperationsSchemas {
  
  inline def apply(
    parameters: PathOrgScimuserid,
    requestBody: ContentApplicationjsonOperationsSchemas,
    responses: `404429`
  ): RequestBodyContentApplicationjsonOperationsSchemas = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonOperationsSchemas]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonOperationsSchemas](x: Self) {
    
    inline def setParameters(value: PathOrgScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOperationsSchemas): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404429`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

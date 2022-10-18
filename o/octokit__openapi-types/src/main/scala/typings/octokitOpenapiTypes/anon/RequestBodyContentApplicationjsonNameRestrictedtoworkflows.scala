package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameRestrictedtoworkflows extends StObject {
  
  var parameters: PathOrgRunnergroupid
  
  var requestBody: ContentApplicationjsonNameRestrictedtoworkflows
  
  var responses: `200ContentApplicationjsonDefault`
}
object RequestBodyContentApplicationjsonNameRestrictedtoworkflows {
  
  inline def apply(
    parameters: PathOrgRunnergroupid,
    requestBody: ContentApplicationjsonNameRestrictedtoworkflows,
    responses: `200ContentApplicationjsonDefault`
  ): RequestBodyContentApplicationjsonNameRestrictedtoworkflows = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameRestrictedtoworkflows]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNameRestrictedtoworkflows](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameRestrictedtoworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

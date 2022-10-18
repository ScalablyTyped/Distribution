package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson217 extends StObject {
  
  var requestBody: ContentApplicationjson217
  
  var responses: `201ContentApplicationjsonOrganizationpermission`
}
object RequestBodyContentApplicationjson217 {
  
  inline def apply(
    requestBody: ContentApplicationjson217,
    responses: `201ContentApplicationjsonOrganizationpermission`
  ): RequestBodyContentApplicationjson217 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson217]
  }
  
  extension [Self <: RequestBodyContentApplicationjson217](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjson217): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonOrganizationpermission`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson450 extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjson450
}
object RequestBodyContentApplicationjson450 {
  
  inline def apply(parameters: PathOrgString, requestBody: ContentApplicationjson450): RequestBodyContentApplicationjson450 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson450]
  }
  
  extension [Self <: RequestBodyContentApplicationjson450](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson450): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

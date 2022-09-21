package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object RequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(parameters: PathEnterprise, requestBody: ContentApplicationjsonSelectedorganizationids): RequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSelectedorganizationids](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

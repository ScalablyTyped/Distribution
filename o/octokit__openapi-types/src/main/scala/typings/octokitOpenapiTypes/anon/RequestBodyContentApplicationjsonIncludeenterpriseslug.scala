package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIncludeenterpriseslug extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjsonIncludeenterpriseslug
}
object RequestBodyContentApplicationjsonIncludeenterpriseslug {
  
  inline def apply(parameters: PathEnterpriseString, requestBody: ContentApplicationjsonIncludeenterpriseslug): RequestBodyContentApplicationjsonIncludeenterpriseslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIncludeenterpriseslug]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonIncludeenterpriseslug](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeenterpriseslug): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

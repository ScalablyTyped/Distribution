package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson408 extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjson408
}
object RequestBodyContentApplicationjson408 {
  
  inline def apply(parameters: PathEnterpriseString, requestBody: ContentApplicationjson408): RequestBodyContentApplicationjson408 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson408]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson408] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson408): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

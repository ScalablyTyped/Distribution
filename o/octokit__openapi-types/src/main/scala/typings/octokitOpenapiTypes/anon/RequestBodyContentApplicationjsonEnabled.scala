package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEnabled extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonEnabled
}
object RequestBodyContentApplicationjsonEnabled {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonEnabled): RequestBodyContentApplicationjsonEnabled = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEnabled]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEnabled](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEnabled): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

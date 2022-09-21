package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson131 extends StObject {
  
  var parameters: PathRepo
  
  var requestBody: ContentApplicationjson131
}
object RequestBodyContentApplicationjson131 {
  
  inline def apply(parameters: PathRepo, requestBody: ContentApplicationjson131): RequestBodyContentApplicationjson131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson131]
  }
  
  extension [Self <: RequestBodyContentApplicationjson131](x: Self) {
    
    inline def setParameters(value: PathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson131): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

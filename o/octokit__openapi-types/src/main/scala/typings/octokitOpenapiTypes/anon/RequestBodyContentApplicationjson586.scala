package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson586 extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjson586
}
object RequestBodyContentApplicationjson586 {
  
  inline def apply(parameters: `582`, requestBody: ContentApplicationjson586): RequestBodyContentApplicationjson586 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson586]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson586] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson586): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

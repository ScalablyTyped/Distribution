package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEnabled extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonEnabled
}
object RequestBodyContentApplicationjsonEnabled {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonEnabled): RequestBodyContentApplicationjsonEnabled = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEnabled] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEnabled): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

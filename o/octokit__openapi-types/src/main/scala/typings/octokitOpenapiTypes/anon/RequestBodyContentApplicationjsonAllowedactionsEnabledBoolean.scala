package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonAllowedactionsEnabledBoolean
}
object RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonAllowedactionsEnabledBoolean): RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowedactionsEnabledBoolean): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}

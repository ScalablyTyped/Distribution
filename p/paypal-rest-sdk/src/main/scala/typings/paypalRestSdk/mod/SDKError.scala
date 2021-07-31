package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDKError extends StObject {
  
  var httpStatusCode: Double
  
  var message: String
  
  var response: PayPalError
  
  var response_stringified: js.UndefOr[String] = js.undefined
  
  var stack: String
}
object SDKError {
  
  @scala.inline
  def apply(httpStatusCode: Double, message: String, response: PayPalError, stack: String): SDKError = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKError]
  }
  
  @scala.inline
  implicit class SDKErrorMutableBuilder[Self <: SDKError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: PayPalError): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_stringified(value: String): Self = StObject.set(x, "response_stringified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_stringifiedUndefined: Self = StObject.set(x, "response_stringified", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}

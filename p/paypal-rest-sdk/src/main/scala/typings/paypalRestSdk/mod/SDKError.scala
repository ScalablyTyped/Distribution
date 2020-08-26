package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SDKError extends js.Object {
  var httpStatusCode: Double = js.native
  var message: String = js.native
  var response: PayPalError = js.native
  var response_stringified: js.UndefOr[String] = js.native
  var stack: String = js.native
}

object SDKError {
  @scala.inline
  def apply(httpStatusCode: Double, message: String, response: PayPalError, stack: String): SDKError = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKError]
  }
  @scala.inline
  implicit class SDKErrorOps[Self <: SDKError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: PayPalError): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse_stringified(value: String): Self = this.set("response_stringified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_stringified: Self = this.set("response_stringified", js.undefined)
  }
  
}


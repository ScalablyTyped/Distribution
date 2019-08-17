package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKError extends js.Object {
  var httpStatusCode: Double
  var message: String
  var response: PayPalError
  var response_stringified: js.UndefOr[String] = js.undefined
  var stack: String
}

object SDKError {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    message: String,
    response: PayPalError,
    stack: String,
    response_stringified: String = null
  ): SDKError = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, message = message, response = response, stack = stack)
    if (response_stringified != null) __obj.updateDynamic("response_stringified")(response_stringified)
    __obj.asInstanceOf[SDKError]
  }
}


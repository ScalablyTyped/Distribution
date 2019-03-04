package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKError extends js.Object {
  var httpStatusCode: scala.Double
  var message: java.lang.String
  var response: PayPalError
  var response_stringified: js.UndefOr[java.lang.String] = js.undefined
  var stack: java.lang.String
}

object SDKError {
  @scala.inline
  def apply(
    httpStatusCode: scala.Double,
    message: java.lang.String,
    response: PayPalError,
    stack: java.lang.String,
    response_stringified: java.lang.String = null
  ): SDKError = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, message = message, response = response, stack = stack)
    if (response_stringified != null) __obj.updateDynamic("response_stringified")(response_stringified)
    __obj.asInstanceOf[SDKError]
  }
}


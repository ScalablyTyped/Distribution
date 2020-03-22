package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkErrorInfo extends ErrorInfo {
  var networkErrorCode: Double
}

object NetworkErrorInfo {
  @scala.inline
  def apply(message: String, networkErrorCode: Double, stack: String): NetworkErrorInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], networkErrorCode = networkErrorCode.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkErrorInfo]
  }
}


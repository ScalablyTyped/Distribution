package typings
package naverDashWhaleLib.whaleNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmError extends js.Object {
  /** Additional details related to the error, when available. */
  var detail: js.Object
  /** The error message describing the problem. */
  var errorMessage: java.lang.String
  /** Optional. The ID of the message with this error, if error is related to a specific message. */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
}

object GcmError {
  @scala.inline
  def apply(detail: js.Object, errorMessage: java.lang.String, messageId: java.lang.String = null): GcmError = {
    val __obj = js.Dynamic.literal(detail = detail, errorMessage = errorMessage)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    __obj.asInstanceOf[GcmError]
  }
}


package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendStatus extends js.Object {
  var ErrorCode: scala.Double
  var Message: java.lang.String
  var MessageID: java.lang.String
  var SubmittedAt: java.lang.String
  var To: java.lang.String
}

object SendStatus {
  @scala.inline
  def apply(
    ErrorCode: scala.Double,
    Message: java.lang.String,
    MessageID: java.lang.String,
    SubmittedAt: java.lang.String,
    To: java.lang.String
  ): SendStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ErrorCode")(ErrorCode)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("SubmittedAt")(SubmittedAt)
    __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[SendStatus]
  }
}


package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Results
trait GenericResult extends js.Object {
  var ErrorCode: js.UndefOr[Double] = js.undefined
  var Message: String
}

object GenericResult {
  @scala.inline
  def apply(Message: String, ErrorCode: Int | Double = null): GenericResult = {
    val __obj = js.Dynamic.literal(Message = Message)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericResult]
  }
}


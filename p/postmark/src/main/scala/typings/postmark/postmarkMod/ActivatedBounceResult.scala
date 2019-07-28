package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatedBounceResult extends GenericResult {
  var Bounce: typings.postmark.postmarkMod.Bounce
}

object ActivatedBounceResult {
  @scala.inline
  def apply(Bounce: Bounce, Message: String, ErrorCode: Int | Double = null): ActivatedBounceResult = {
    val __obj = js.Dynamic.literal(Bounce = Bounce, Message = Message)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatedBounceResult]
  }
}


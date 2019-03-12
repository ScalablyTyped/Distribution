package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatedBounceResult extends GenericResult {
  var Bounce: postmarkLib.postmarkMod.PostmarkNs.Bounce
}

object ActivatedBounceResult {
  @scala.inline
  def apply(Bounce: Bounce, Message: java.lang.String, ErrorCode: scala.Int | scala.Double = null): ActivatedBounceResult = {
    val __obj = js.Dynamic.literal(Bounce = Bounce, Message = Message)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatedBounceResult]
  }
}


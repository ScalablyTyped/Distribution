package typings.onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.undefined
  var reject: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAccept {
  @scala.inline
  def apply(accept: js.Array[String] = null, reject: js.Array[String] = null): AnonAccept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccept]
  }
}


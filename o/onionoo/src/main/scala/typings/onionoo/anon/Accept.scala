package typings.onionoo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.undefined
  var reject: js.UndefOr[js.Array[String]] = js.undefined
}

object Accept {
  @scala.inline
  def apply(accept: js.Array[String] = null, reject: js.Array[String] = null): Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}


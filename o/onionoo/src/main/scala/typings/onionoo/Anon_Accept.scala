package typings.onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.undefined
  var reject: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(accept: js.Array[String] = null, reject: js.Array[String] = null): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accept]
  }
}


package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpires extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
}

object AnonExpires {
  @scala.inline
  def apply(expires: Int | Double = null): AnonExpires = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpires]
  }
}


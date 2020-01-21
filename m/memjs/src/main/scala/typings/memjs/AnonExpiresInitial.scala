package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiresInitial extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
}

object AnonExpiresInitial {
  @scala.inline
  def apply(expires: Int | Double = null, initial: Int | Double = null): AnonExpiresInitial = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpiresInitial]
  }
}


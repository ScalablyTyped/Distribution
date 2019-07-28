package typings.notyf.notyfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alertIcon: js.UndefOr[String] = js.undefined
  var confirmIcon: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(alertIcon: String = null, confirmIcon: String = null, delay: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (alertIcon != null) __obj.updateDynamic("alertIcon")(alertIcon)
    if (confirmIcon != null) __obj.updateDynamic("confirmIcon")(confirmIcon)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


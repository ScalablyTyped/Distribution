package typings
package notyfLib.notyfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alertIcon: js.UndefOr[java.lang.String] = js.undefined
  var confirmIcon: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alertIcon: java.lang.String = null,
    confirmIcon: java.lang.String = null,
    delay: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alertIcon != null) __obj.updateDynamic("alertIcon")(alertIcon)
    if (confirmIcon != null) __obj.updateDynamic("confirmIcon")(confirmIcon)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


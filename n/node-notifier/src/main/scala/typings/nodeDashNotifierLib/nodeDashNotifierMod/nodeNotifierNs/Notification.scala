package typings
package nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Absolute path (not balloons) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Only Notification Center or Windows Toasters */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Wait with callback until user action is taken on notification */
  @JSName("wait")
  var wait_FNotification: js.UndefOr[scala.Boolean] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    icon: java.lang.String = null,
    message: java.lang.String = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Notification]
  }
}


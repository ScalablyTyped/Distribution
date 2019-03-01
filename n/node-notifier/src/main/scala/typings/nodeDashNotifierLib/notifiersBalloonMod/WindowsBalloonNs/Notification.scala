package typings
package nodeDashNotifierLib.notifiersBalloonMod.WindowsBalloonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Only Notification Center or Windows Toasters */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /** How long to show balloons in ms */
  var time: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Wait with callback until user action is taken on notification */
  @JSName("wait")
  var wait_FNotification: js.UndefOr[scala.Boolean] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    message: java.lang.String = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    time: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Notification]
  }
}


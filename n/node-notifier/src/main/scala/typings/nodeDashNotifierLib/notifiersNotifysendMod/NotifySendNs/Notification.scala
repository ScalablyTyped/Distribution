package typings
package nodeDashNotifierLib.notifiersNotifysendMod.NotifySendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Specifies the notification category */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies basic extra data to pass. Valid types are int, double, string and byte. */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies  the  timeout  in  milliseconds at which to expire the notification */
  var time: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the urgency level  (low,  normal,  critical). */
  var urgency: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    hint: java.lang.String = null,
    icon: java.lang.String = null,
    message: java.lang.String = null,
    time: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    urgency: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (urgency != null) __obj.updateDynamic("urgency")(urgency)
    __obj.asInstanceOf[Notification]
  }
}


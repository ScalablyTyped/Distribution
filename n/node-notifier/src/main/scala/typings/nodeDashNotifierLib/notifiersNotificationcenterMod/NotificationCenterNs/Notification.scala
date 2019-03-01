package typings
package nodeDashNotifierLib.notifiersNotificationcenterMod.NotificationCenterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification
  extends nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.Notification {
  /** Attach image? (Absolute path) */
  var contentImage: js.UndefOr[java.lang.String] = js.undefined
  /** URL to open on click */
  var open: js.UndefOr[java.lang.String] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    contentImage: java.lang.String = null,
    icon: java.lang.String = null,
    message: java.lang.String = null,
    open: java.lang.String = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    subtitle: java.lang.String = null,
    title: java.lang.String = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (contentImage != null) __obj.updateDynamic("contentImage")(contentImage)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (open != null) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Notification]
  }
}


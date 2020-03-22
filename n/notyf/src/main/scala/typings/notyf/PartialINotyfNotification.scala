package typings.notyf

import typings.notyf.notyfBooleans.`false`
import typings.notyf.notyfOptionsMod.INotyfIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfNotificationOptions> */
trait PartialINotyfNotification extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[INotyfIcon | `false`] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var ripple: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PartialINotyfNotification {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    className: String = null,
    duration: Int | Double = null,
    icon: INotyfIcon | `false` = null,
    message: String = null,
    ripple: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): PartialINotyfNotification = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialINotyfNotification]
  }
}


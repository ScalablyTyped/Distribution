package typings.notyf.anon

import typings.notyf.notyfBooleans.`false`
import typings.notyf.notyfOptionsMod.INotyfIcon
import typings.notyf.notyfOptionsMod.INotyfPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfNotificationOptions> */
trait PartialINotyfNotification extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[INotyfIcon | `false`] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[INotyfPosition] = js.undefined
  var ripple: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PartialINotyfNotification {
  @scala.inline
  def apply(
    background: String = null,
    backgroundColor: String = null,
    className: String = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    icon: INotyfIcon | `false` = null,
    message: String = null,
    position: INotyfPosition = null,
    ripple: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): PartialINotyfNotification = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialINotyfNotification]
  }
}


package typings.notyf

import typings.notyf.notyfBooleans.`false`
import typings.notyf.notyfOptionsMod.DeepPartial
import typings.notyf.notyfOptionsMod.INotyfIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined notyf.notyf/notyf.options.DeepPartial<notyf.notyf/notyf.options.INotyfNotificationOptions> */
trait DeepPartialINotyfNotifica extends js.Object {
  var backgroundColor: js.UndefOr[DeepPartial[String]] = js.undefined
  var className: js.UndefOr[DeepPartial[String]] = js.undefined
  var duration: js.UndefOr[DeepPartial[Double]] = js.undefined
  var icon: js.UndefOr[DeepPartial[INotyfIcon | `false`]] = js.undefined
  var message: js.UndefOr[DeepPartial[String]] = js.undefined
  var ripple: js.UndefOr[DeepPartial[Boolean]] = js.undefined
  var `type`: js.UndefOr[DeepPartial[String]] = js.undefined
}

object DeepPartialINotyfNotifica {
  @scala.inline
  def apply(
    backgroundColor: DeepPartial[String] = null,
    className: DeepPartial[String] = null,
    duration: DeepPartial[Double] = null,
    icon: DeepPartial[INotyfIcon | `false`] = null,
    message: DeepPartial[String] = null,
    ripple: DeepPartial[Boolean] = null,
    `type`: DeepPartial[String] = null
  ): DeepPartialINotyfNotifica = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPartialINotyfNotifica]
  }
}


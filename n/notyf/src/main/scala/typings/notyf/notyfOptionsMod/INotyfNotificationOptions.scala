package typings.notyf.notyfOptionsMod

import typings.notyf.notyfBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfNotificationOptions extends js.Object {
  var background: String
  /**
    * @deprecated Use `background` instead. Removal target: v4.0.0.
    */
  var backgroundColor: String
  var className: String
  var dismissible: Boolean
  var duration: Double
  var icon: INotyfIcon | `false`
  var message: String
  var position: INotyfPosition
  var ripple: Boolean
  var `type`: String
}

object INotyfNotificationOptions {
  @scala.inline
  def apply(
    background: String,
    backgroundColor: String,
    className: String,
    dismissible: Boolean,
    duration: Double,
    icon: INotyfIcon | `false`,
    message: String,
    position: INotyfPosition,
    ripple: Boolean,
    `type`: String
  ): INotyfNotificationOptions = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfNotificationOptions]
  }
}


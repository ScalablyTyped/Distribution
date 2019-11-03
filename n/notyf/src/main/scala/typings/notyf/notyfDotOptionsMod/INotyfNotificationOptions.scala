package typings.notyf.notyfDotOptionsMod

import typings.notyf.notyfNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfNotificationOptions extends js.Object {
  var backgroundColor: String
  var className: String
  var duration: Double
  var icon: INotyfIcon | `false`
  var message: String
  var ripple: Boolean
  var `type`: String
}

object INotyfNotificationOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    className: String,
    duration: Double,
    icon: INotyfIcon | `false`,
    message: String,
    ripple: Boolean,
    `type`: String
  ): INotyfNotificationOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, className = className, duration = duration, icon = icon.asInstanceOf[js.Any], message = message, ripple = ripple)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[INotyfNotificationOptions]
  }
}


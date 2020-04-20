package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSActionButton extends js.Object {
  var icon: String
  var id: String
  var text: String
}

object OSActionButton {
  @scala.inline
  def apply(icon: String, id: String, text: String): OSActionButton = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSActionButton]
  }
}


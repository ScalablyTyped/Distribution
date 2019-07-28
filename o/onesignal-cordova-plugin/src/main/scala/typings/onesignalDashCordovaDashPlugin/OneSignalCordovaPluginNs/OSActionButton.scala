package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

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
    val __obj = js.Dynamic.literal(icon = icon, id = id, text = text)
  
    __obj.asInstanceOf[OSActionButton]
  }
}


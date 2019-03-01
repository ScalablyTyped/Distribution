package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSActionButton extends js.Object {
  var icon: java.lang.String
  var id: java.lang.String
  var text: java.lang.String
}

object OSActionButton {
  @scala.inline
  def apply(icon: java.lang.String, id: java.lang.String, text: java.lang.String): OSActionButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OSActionButton]
  }
}


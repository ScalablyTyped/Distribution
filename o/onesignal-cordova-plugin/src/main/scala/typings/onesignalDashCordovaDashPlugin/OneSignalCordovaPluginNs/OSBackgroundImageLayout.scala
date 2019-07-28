package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSBackgroundImageLayout extends js.Object {
  var bodyTextColor: String
  var image: String
  var titleTextColor: String
}

object OSBackgroundImageLayout {
  @scala.inline
  def apply(bodyTextColor: String, image: String, titleTextColor: String): OSBackgroundImageLayout = {
    val __obj = js.Dynamic.literal(bodyTextColor = bodyTextColor, image = image, titleTextColor = titleTextColor)
  
    __obj.asInstanceOf[OSBackgroundImageLayout]
  }
}


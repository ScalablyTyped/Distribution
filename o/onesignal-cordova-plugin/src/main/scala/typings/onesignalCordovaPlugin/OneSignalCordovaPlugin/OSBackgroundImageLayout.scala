package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

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
    val __obj = js.Dynamic.literal(bodyTextColor = bodyTextColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], titleTextColor = titleTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSBackgroundImageLayout]
  }
}


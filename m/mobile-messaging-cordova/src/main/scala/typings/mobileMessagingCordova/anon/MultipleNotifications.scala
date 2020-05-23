package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleNotifications extends js.Object {
   // a resource name for a status bar icon (without extension), located in '/platforms/android/app/src/main/res/mipmap'
  var multipleNotifications: Boolean
  var notificationAccentColor: String
  var notificationIcon: String
}

object MultipleNotifications {
  @scala.inline
  def apply(multipleNotifications: Boolean, notificationAccentColor: String, notificationIcon: String): MultipleNotifications = {
    val __obj = js.Dynamic.literal(multipleNotifications = multipleNotifications.asInstanceOf[js.Any], notificationAccentColor = notificationAccentColor.asInstanceOf[js.Any], notificationIcon = notificationIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleNotifications]
  }
}


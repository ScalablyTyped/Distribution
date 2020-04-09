package typings.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultipleNotifications extends js.Object {
   // a resource name for a status bar icon (without extension), located in '/platforms/android/app/src/main/res/mipmap'
  var multipleNotifications: Boolean
  var notificationAccentColor: String
  var notificationIcon: String
}

object AnonMultipleNotifications {
  @scala.inline
  def apply(multipleNotifications: Boolean, notificationAccentColor: String, notificationIcon: String): AnonMultipleNotifications = {
    val __obj = js.Dynamic.literal(multipleNotifications = multipleNotifications.asInstanceOf[js.Any], notificationAccentColor = notificationAccentColor.asInstanceOf[js.Any], notificationIcon = notificationIcon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMultipleNotifications]
  }
}


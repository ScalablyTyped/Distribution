package typings
package ngDashNotifyLib.ngNotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Simply and lightweight notification service for AngularJS
     */
@js.native
trait INotifyService extends js.Object {
  /**
           * Allows to create a whole new set of styles for each notification type.
           * @param themeName The name used when setting the theme in the config object.
           * @param className The class used to target this theme in the stylesheet.
           */
  def addTheme(themeName: java.lang.String, className: java.lang.String): scala.Unit = js.native
  /**
           * Allows to create a new type of notification to use in their app.
           * @param typeName The name used to trigger this notification type in the set method.
           * @param className The class used to target this type in the stylesheet.
           */
  def addType(typeName: java.lang.String, className: java.lang.String): scala.Unit = js.native
  /**
           * Sets default settings for all notifications to take into account when displaying.
           * @param userOptions Notification configuration object
           */
  def config(userOptions: IUserOptions): scala.Unit = js.native
  /**
           * Manually dismisses any sticky notifications that may still be set.
           */
  def dismiss(): scala.Unit = js.native
  /**
           * Displays a notification message.
           * @param message A message text to display.
           */
  def set(message: java.lang.String): scala.Unit = js.native
  /**
           * Displays a notification message and sets the type for this one notification.
           * @param message A message text to display.
           * @param type The type of the notification.
           */
  def set(message: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
           * displays a notification message and sets the formatting/behavioral options for this one notification.
           * @param message A message text to display.
           * @param userOptions Notification configuration object.
           */
  def set(message: java.lang.String, userOptions: IUserOptions): scala.Unit = js.native
}


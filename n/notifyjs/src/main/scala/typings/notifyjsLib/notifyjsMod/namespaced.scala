package typings
package notifyjsLib.notifyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notifyjs", JSImport.Namespace)
@js.native
class namespaced protected () extends Notify {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, options: INotifyOption) = this()
  /**
    * Close the notification.
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    * Remove all event listener.
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def handleEvent(e: stdLib.Event): scala.Unit = js.native
  /* CompleteClass */
  override def onClickNotification(): scala.Unit = js.native
  /* CompleteClass */
  override def onCloseNotification(): scala.Unit = js.native
  /* CompleteClass */
  override def onErrorNotification(): scala.Unit = js.native
  /* CompleteClass */
  override def onShowNotification(e: stdLib.Event): scala.Unit = js.native
  /**
    * Show the notification.
    */
  /* CompleteClass */
  override def show(): scala.Unit = js.native
}

@JSImport("notifyjs", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Check is permission is needed for the user to receive notifications.
    * @return true : needs permission, false : does not need
    */
  var needsPermission: scala.Boolean = js.native
  /**
    * shows the user's current permission level (granted, denied or default), returns null if notifications are not supported.
    * @return 'granted' : permission has been given, 'denied' : permission has been denied, 'default' : permission has not yet been set, null : notifications are not supported
    */
  var permissionLevel: java.lang.String = js.native
  /**
    * return true if the browser supports HTML5 Notification
    * @param true : the browser supports HTML5 Notification, false ; the browser does not supports HTML5 Notification.
    */
  def isSupported(): scala.Boolean = js.native
  /**
    * Asks the user for permission to display notifications
    * @param onPermissionGrantedCallback A callback for permission is granted.
    * @param onPermissionDeniedCallback  A callback for permission is denied.
    */
  def requestPermission(): scala.Unit = js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_]): scala.Unit = js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_], onPermissionDeniedCallback: js.Function0[_]): scala.Unit = js.native
}


package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notification
  * Notification represents a window on OpenFin Runtime which is shown briefly to the user on the bottom-right corner of the primary monitor.
  * A notification is typically used to alert the user of some important event which requires their attention.
  * Notifications are a child or your application that are controlled by the runtime.
  */
@js.native
trait OpenFinNotification extends js.Object {
  
  /**
    * Closes the notification.
    */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sends a message to the notification.
    */
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sends a message from the notification to the application that created the notification. The message is handled by the notification's onMessage callback.
    */
  def sendMessageToApplication(message: js.Any): Unit = js.native
  def sendMessageToApplication(message: js.Any, callback: js.Function0[Unit]): Unit = js.native
}

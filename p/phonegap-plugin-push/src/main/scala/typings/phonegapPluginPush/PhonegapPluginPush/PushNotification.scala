package typings.phonegapPluginPush.PhonegapPluginPush

import typings.phonegapPluginPush.phonegapPluginPushStrings.error
import typings.phonegapPluginPush.phonegapPluginPushStrings.notification
import typings.phonegapPluginPush.phonegapPluginPushStrings.registration
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotification extends js.Object {
  /**
  		 * Tells the OS to clear all notifications from the Notification Center
  		 * @param successHandler Is called when the api successfully clears the notifications.
  		 * @param errorHandler Is called when the api encounters an error when attempting to clears the notifications.
  		 */
  def clearAllNotifications(successHandler: js.Function0[_], errorHandler: js.Function0[_]): Unit = js.native
  /**
  		 * iOS only
  		 * Tells the OS that you are done processing a background push notification.
  		 * successHandler gets called when background push processing is successfully completed.
  		 * @param successHandler
  		 * @param errorHandler
  		 * @param id
  		 */
  def finish(): Unit = js.native
  def finish(successHandler: js.UndefOr[scala.Nothing], errorHandler: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def finish(successHandler: js.UndefOr[scala.Nothing], errorHandler: js.Function0[_]): Unit = js.native
  def finish(successHandler: js.UndefOr[scala.Nothing], errorHandler: js.Function0[_], id: String): Unit = js.native
  def finish(successHandler: js.Function0[_]): Unit = js.native
  def finish(successHandler: js.Function0[_], errorHandler: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def finish(successHandler: js.Function0[_], errorHandler: js.Function0[_]): Unit = js.native
  def finish(successHandler: js.Function0[_], errorHandler: js.Function0[_], id: String): Unit = js.native
  /**
  		 * Get the current badge count visible when the app is not running
  		 * successHandler gets called with an integer which is the current badge count
  		 * @param successHandler
  		 * @param errorHandler
  		 */
  def getApplicationIconBadgeNumber(successHandler: js.Function1[/* count */ Double, _], errorHandler: js.Function0[_]): Unit = js.native
  /**
  		 * As stated in the example, you will have to store your event handler if you are planning to remove it.
  		 * @param event Name of the event type. The possible event names are the same as for the push.on function.
  		 * @param callback handle to the function to get removed.
  		 * @param event
  		 * @param callback
  		 */
  def off(event: String, callback: js.Function1[/* response */ EventResponse, _]): Unit = js.native
  @JSName("off")
  def off_error(event: error, callback: js.Function1[/* response */ Error, _]): Unit = js.native
  @JSName("off")
  def off_notification(event: notification, callback: js.Function1[/* response */ NotificationEventResponse, _]): Unit = js.native
  @JSName("off")
  def off_registration(event: registration, callback: js.Function1[/* response */ RegistrationEventResponse, _]): Unit = js.native
  /**
  		 *
  		 * @param event Name of the event to listen to. See below(above) for all the event names.
  		 * @param callback is called when the event is triggered.
  		 * @param event
  		 * @param callback
  		 */
  def on(event: String, callback: js.Function1[/* response */ EventResponse, _]): Unit = js.native
  /**
  		 * The event error will trigger when an internal error occurs and the cache is aborted.
  		 * @param event
  		 * @param callback
  		 */
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* response */ Error, _]): Unit = js.native
  /**
  		 * The event notification will be triggered each time a push notification is received by a 3rd party push service on the device.
  		 * @param event
  		 * @param callback
  		 */
  @JSName("on")
  def on_notification(event: notification, callback: js.Function1[/* response */ NotificationEventResponse, _]): Unit = js.native
  /**
  		 * The event registration will be triggered on each successful registration with the 3rd party push service.
  		 * @param event
  		 * @param callback
  		 */
  @JSName("on")
  def on_registration(event: registration, callback: js.Function1[/* response */ RegistrationEventResponse, _]): Unit = js.native
  /*TODO according to js source code, "errorHandler" is optional, but is "count" also optional? I can't read objetive-C code (can anyone at all? I wonder...)*/
  /**
  		 * Set the badge count visible when the app is not running
  		 *
  		 * The count is an integer indicating what number should show up in the badge.
  		 * Passing 0 will clear the badge.
  		 * Each notification event contains a data.count value which can be used to set the badge to correct number.
  		 * @param successHandler
  		 * @param errorHandler
  		 * @param count
  		 */
  def setApplicationIconBadgeNumber(successHandler: js.Function0[_], errorHandler: js.Function0[_], count: Double): Unit = js.native
  /**
  		 * The subscribe method is used when the application wants to subscribe a new topic to receive push notifications.
  		 * @param topic Topic to subscribe to.
  		 * @param successHandler Is called when the api successfully unregisters.
  		 * @param errorHandler Is called when the api encounters an error while unregistering.
  		 */
  def subscribe(topic: String, successHandler: js.Function0[_], errorHandler: js.Function0[_]): Unit = js.native
  /**
  		 * The unregister method is used when the application no longer wants to receive push notifications.
  		 * Beware that this cleans up all event handlers previously registered,
  		 * so you will need to re-register them if you want them to function again without an application reload.
  		 * @param successHandler
  		 * @param errorHandler
  		 * @param topics
  		 */
  def unregister(successHandler: js.Function0[_]): Unit = js.native
  def unregister(successHandler: js.Function0[_], errorHandler: js.UndefOr[scala.Nothing], topics: js.Array[String]): Unit = js.native
  def unregister(successHandler: js.Function0[_], errorHandler: js.Function0[_]): Unit = js.native
  def unregister(successHandler: js.Function0[_], errorHandler: js.Function0[_], topics: js.Array[String]): Unit = js.native
  /**
  		 * The unsubscribe method is used when the application no longer wants to receive push notifications
  		 * from a specific topic but continue to receive other push messages.
  		 * @param topic Topic to unsubscribe from.
  		 * @param successHandler Is called when the api successfully unregisters.
  		 * @param errorHandler Is called when the api encounters an error while unregistering.
  		 */
  def unsubscribe(topic: String, successHandler: js.Function0[_], errorHandler: js.Function0[_]): Unit = js.native
}


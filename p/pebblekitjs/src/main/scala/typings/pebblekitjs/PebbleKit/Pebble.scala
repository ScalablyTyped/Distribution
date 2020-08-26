package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pebble extends js.Object {
  /**
    * Adds a listener for Pebble JS events, such as when an AppMessage is received or the configuration view is opened or closed.
    * @param type      The type of the event, from the three described above.
    * @param callback  A developer-defined function to receive any events of the type specified that occur.
    */
  def addEventListener(`type`: String, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  /**
    * Triggers a reload of the app glance which first clears any existing slices and then adds the provided slices.
    * @param appGlanceSlices
    * @param onSuccess
    * @param onFailure
    */
  def appGlanceReload(
    appGlanceSlices: js.Array[AppGlanceSlice],
    onSuccess: js.Function1[/* appGlanceSlices */ js.Array[AppGlanceSlice], Unit],
    onFailure: js.Function1[/* appGlanceSlices */ js.Array[AppGlanceSlice], Unit]
  ): Unit = js.native
  /**
    * Returns a unique account token that is associated with the Pebble account of the current user.
    * @return string
    */
  def getAccountToken(): String = js.native
  /**
    * Returns a unique account token that is associated with the Pebble account of the current user.
    * @return WatchInfo
    */
  def getActiveWatchInfo(): WatchInfo = js.native
  /**
    * Get the user's timeline token for this app. This is a string and is unique per user per app.
    * Note: In order for timeline tokens to be available, the app must be submitted to the Pebble appstore,
    * but does not need to be public. Read more in the timeline guides
    * @param successCallback
    * @param failureCallback
    */
  def getTimelineToken(
    successCallback: js.Function1[/* token */ String, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  /**
    * Returns a a unique token that can be used to identify a Pebble device.
    * @return string
    */
  def getWatchToken(): String = js.native
  /**
    * Remove an existing event handler from the specified events. Synonymous with removeEventListener.
    * Only applicable to Rocky.js applications.
    * @param type      The type of the event listener to be removed.
    *                  See Pebble.addEventListener() for a list of available types.
    * @param callback  The existing developer-defined function that was previously registered.
    * @see addEventListener
    */
  def off(`type`: String): Unit = js.native
  def off(`type`: String, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  /**
    * Attaches an event handler to the specified events. Synonymous with addEventListener.
    * Only applicable to Rocky.js applications.
    * @param type      The type of the event, from the three described above.
    * @param callback  A developer-defined function to receive any events of the type specified that occur.
    */
  def on(`type`: String, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  /**
    * to start displaying this webview
    * @param url
    */
  def openURL(url: String): Unit = js.native
  /**
    * Remove an existing event listener previously registered with Pebble.addEventListener().
    * @param type      The type of the event listener to be removed.
    *                  See Pebble.addEventListener() for a list of available types.
    * @param callback  The existing developer-defined function that was previously registered.
    * @see addEventListener
    */
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  /**
    * Send an AppMessage to the app running on the watch.
    * Messages should be in the form of JSON objects containing key-value pairs.
    * @param jsonAppMessage        A JSON object containing key-value pairs to send to the watch.
    *                              Values in arrays that are greater then 255 will be mod 255 before sending.
    * @param callbackForAck        The developer-defined function to run if the watch acknowledges (ACK) this message.
    * @param callbackForNack       The developer-defined function to run if the watch does not acknowledge (NACK) this message.
    * @return string
    */
  def sendAppMessage(jsonAppMessage: js.Object): String = js.native
  def sendAppMessage(
    jsonAppMessage: js.Object,
    callbackForAck: js.UndefOr[scala.Nothing],
    callbackForNack: js.Function1[/* e */ AppMessageEvent, Unit]
  ): String = js.native
  def sendAppMessage(jsonAppMessage: js.Object, callbackForAck: js.Function1[/* e */ AppMessageEvent, Unit]): String = js.native
  def sendAppMessage(
    jsonAppMessage: js.Object,
    callbackForAck: js.Function1[/* e */ AppMessageEvent, Unit],
    callbackForNack: js.Function1[/* e */ AppMessageEvent, Unit]
  ): String = js.native
  /**
    * Show a simple modal notification on the connected watch.
    * @param title     The title of the notificati
    *
    * @param body      The main content of the notification.
    */
  def showSimpleNotificationOnPebble(title: String, body: String): Unit = js.native
  /**
    * Subscribe the user to a timeline topic for your app.
    * This can be used to filter the different pins a user could receive according to their preferences,
    * as well as maintain groups of users.
    * @param topic         The desired topic to be subscribed to. Users will receive all pins pushed to this topic.
    * @param successCb     The developer-defined function to handle a successful subscription attempt.
    * @param errorCb       The developer-defined function to gracefully handle a failed subscription attempt.
    */
  def timelineSubscribe(
    topic: String,
    successCb: js.Function0[Unit],
    errorCb: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Obtain a list of topics that the user is currently subscribed to.
    * The length of the list should be checked to determine whether the user is subscribed to at least one topic.
    * @param successCb     The developer-defined function to process the retuned list of topic strings.
    * @param errorCb       The developer-defined function to gracefully handle any errors in obtaining the user's subscriptions.
    */
  def timelineSubscriptions(
    successCb: js.Function1[/* topics */ js.Array[String], Unit],
    errorCb: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Unsubscribe a user from a timeline topic for this app. Once unsubscribed,
    * the user will no longer receive any pins pushed to this topic.
    * @param topic         The topic the user is to be unsubscribed from.
    * @param successCb     The developer-defined function to handle a successful unsubscription attempt.
    * @param errorCb       The developer-defined function to gracefully handle a failed unsubscription attempt.
    */
  def timelineUnsubscribe(
    topic: String,
    successCb: js.Function0[Unit],
    errorCb: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
}


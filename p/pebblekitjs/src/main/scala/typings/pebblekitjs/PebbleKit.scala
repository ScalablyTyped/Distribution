package typings.pebblekitjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PebbleKit {
  
  /**
    * The structure of an app glance.
    */
  trait AppGlanceSlice extends StObject {
    
    var expirationTime: js.UndefOr[String] = js.undefined
    
    var layout: Layout
  }
  object AppGlanceSlice {
    
    @scala.inline
    def apply(layout: Layout): AppGlanceSlice = {
      val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppGlanceSlice]
    }
    
    @scala.inline
    implicit class AppGlanceSliceMutableBuilder[Self <: AppGlanceSlice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppMessageData extends StObject {
    
    var transactionId: String
  }
  object AppMessageData {
    
    @scala.inline
    def apply(transactionId: String): AppMessageData = {
      val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppMessageData]
    }
    
    @scala.inline
    implicit class AppMessageDataMutableBuilder[Self <: AppMessageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppMessageEvent extends StObject {
    
    var data: AppMessageData
    
    var error: js.UndefOr[Error] = js.undefined
  }
  object AppMessageEvent {
    
    @scala.inline
    def apply(data: AppMessageData): AppMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppMessageEvent]
    }
    
    @scala.inline
    implicit class AppMessageEventMutableBuilder[Self <: AppMessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: AppMessageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var message: String
  }
  object Error {
    
    @scala.inline
    def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var payload: js.UndefOr[js.Object] = js.undefined
    
    var response: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object Event {
    
    @scala.inline
    def apply(`type`: String): Event = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object containing firmware version information.
    */
  trait Firmware extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
    
    var suffix: String
  }
  object Firmware {
    
    @scala.inline
    def apply(major: Double, minor: Double, patch: Double, suffix: String): Firmware = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Firmware]
    }
    
    @scala.inline
    implicit class FirmwareMutableBuilder[Self <: Firmware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Layout extends StObject {
    
    var icon: String
    
    var subtitleTemplateString: String
  }
  object Layout {
    
    @scala.inline
    def apply(icon: String, subtitleTemplateString: String): Layout = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], subtitleTemplateString = subtitleTemplateString.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleTemplateString(value: String): Self = StObject.set(x, "subtitleTemplateString", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pebble extends StObject {
    
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
    def sendAppMessage(jsonAppMessage: js.Object, callbackForAck: js.Function1[/* e */ AppMessageEvent, Unit]): String = js.native
    def sendAppMessage(
      jsonAppMessage: js.Object,
      callbackForAck: js.Function1[/* e */ AppMessageEvent, Unit],
      callbackForNack: js.Function1[/* e */ AppMessageEvent, Unit]
    ): String = js.native
    def sendAppMessage(
      jsonAppMessage: js.Object,
      callbackForAck: Unit,
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
  
  /**
    * Object containing information about the currently connected watch,
    * returned by Pebble.getActiveWatchInfo().
    * Read the PebbleKit JS guides for complete information on possible values.
    * @see Pebble.getActiveWatchInfo
    */
  trait WatchInfo extends StObject {
    
    var firmware: Firmware
    
    var language: String
    
    var model: String
    
    var platform: String
  }
  object WatchInfo {
    
    @scala.inline
    def apply(firmware: Firmware, language: String, model: String, platform: String): WatchInfo = {
      val __obj = js.Dynamic.literal(firmware = firmware.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchInfo]
    }
    
    @scala.inline
    implicit class WatchInfoMutableBuilder[Self <: WatchInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirmware(value: Firmware): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}

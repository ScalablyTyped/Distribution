package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  def defaultMessageStorage(): js.UndefOr[DefaultMessageStorage] = js.native
  /**
    * Performs depersonalization of the current installation on the platform.
    *
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def depersonalize(
    callback: js.Function1[/* personalizeContext */ PersonalizeContext, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Performs depersonalization of the installation referenced by pushRegistrationId.
    *
    * @param pushRegistrationId of the remote installation to depersonalize
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def depersonalizeInstallation(
    pushRegistrationId: String,
    callback: js.Function1[/* installation */ Installation, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Fetches installation from the server.
    *
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def fetchInstallation(
    callback: js.Function1[/* installation */ Installation, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Fetch user data from the server.
    *
    * @param callback will be called with fetched user data on success
    * @param errorCallback will be called on error
    */
  def fetchUser(
    callback: js.Function1[/* userData */ UserData, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Gets locally cached installation.
    *
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def getInstallation(
    callback: js.Function1[/* installation */ Installation, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Gets user data from the locally stored cache.
    *
    * @param callback will be called with fetched user data on success
    * @param errorCallback will be called on error
    */
  def getUser(
    callback: js.Function1[/* userData */ UserData, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Starts a new Mobile Messaging session.
    *
    * @param config. Configuration for Mobile Messaging
    * @param onInitError. Error callback
    */
  def init(config: Configuration): Unit = js.native
  def init(config: Configuration, onInitError: js.Function1[/* error */ MobileMessagingError, Unit]): Unit = js.native
  /**
    * Mark messages as seen
    *
    * @param messageIds of identifiers of message to mark as seen
    * @param callback will be called upon completion
    * @param errorCallback will be called on error
    */
  def markMessagesSeen(
    messageIds: js.Array[String],
    callback: js.Function1[/* messages */ js.Array[Message], Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  def off(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
  def on(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
  /**
    * Performs personalization of the current installation on the platform.
    *
    * @param context. An object containing user identity information as well as additional user attributes.
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def personalize(
    context: PersonalizeContext,
    callback: js.Function1[/* personalizeContext */ PersonalizeContext, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Register to event coming from MobileMessaging library.
    * The following events are supported:
    *
    * @param event
    * @param handler will be called when event occurs
    */
  def register(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
  /**
    * Saves installation to the server.
    *
    * @param installation. An object containing installation data
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def saveInstallation(
    installation: Installation,
    callback: js.Function1[/* data */ Installation, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Saves user data to the server.
    *
    * @param userData. An object containing user data
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def saveUser(
    userData: UserData,
    callback: js.Function1[/* userData */ UserData, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Sets any installation as primary for this user.
    *
    * @param pushRegistrationId of an installation
    * @param primary or not
    * @param callback will be called on success
    * @param errorCallback will be called on error
    */
  def setInstallationAsPrimary(
    pushRegistrationId: String,
    primary: Boolean,
    callback: js.Function1[/* installation */ Installation, Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Displays built-in error dialog so that user can resolve errors during sdk initialization.
    *
    * @param errorCode to display dialog for
    * @param callback will be called upon completion
    * @param errorCallback will be called on error
    */
  def showDialogForError(
    errorCode: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
  ): Unit = js.native
  /**
    * Un register from MobileMessaging library event.
    *
    * @param event
    * @param handler will be unregistered from event
    */
  def unregister(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
}


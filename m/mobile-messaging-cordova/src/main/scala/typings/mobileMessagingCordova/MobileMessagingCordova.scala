package typings.mobileMessagingCordova

import typings.mobileMessagingCordova.anon.Actions
import typings.mobileMessagingCordova.anon.ApplicationCodePersistingDisabled
import typings.mobileMessagingCordova.anon.ForceCleanup
import typings.mobileMessagingCordova.anon.MultipleNotifications
import typings.std.CustomEvent
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MobileMessagingCordova {
  
  @js.native
  trait Api extends StObject {
    
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
      * Sends an event to the server eventually, handles possible errors and do retries for you.
      *
      * @param eventData. An object containing event data
      * {
      *   definitionId: "eventDefinitionId"
      *   properties: {
      *     "stringAttribute": "string",
      *     "numberAttribute": 1,
      *     "dateAttribute": "2020-02-26T09:41:57Z",
      *     "booleanAttribute": true
      *   }
      * }
      */
    def submitEvent(eventData: CustomEvent[js.Any]): Unit = js.native
    
    /**
      * Sends an event to the server immediately.
      * You have to handle possible connection or server errors, do retries yourself.
      *
      * @param eventData. An object containing event data
      * {
      *   definitionId: "eventDefinitionId"
      *   properties: {
      *     "stringAttribute": "string",
      *     "numberAttribute": 1,
      *     "dateAttribute": "2020-02-26T09:41:57Z",
      *     "booleanAttribute": true
      *   }
      * }
      * @param callback will be called on result
      * @param errorCallback will be called on error, you have to handle error and do retries yourself
      */
    def submitEventImmediately(eventData: CustomEvent[js.Any], callback: js.Function0[Unit], errorCallback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Un register from MobileMessaging library event.
      *
      * @param event
      * @param handler will be unregistered from event
      */
    def unregister(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
  }
  
  trait Configuration extends StObject {
    
    var android: js.UndefOr[MultipleNotifications] = js.undefined
    
    /**
      * The application code of your Application from Push Portal website
      */
    var applicationCode: String
    
    var defaultMessageStorage: js.UndefOr[Boolean] = js.undefined
    
    var geofencingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var ios: js.UndefOr[ForceCleanup] = js.undefined
    
    /**
      * Message storage save callback
      */
    var messageStorage: js.UndefOr[String] = js.undefined
    
    var notificationCategories: js.UndefOr[js.Array[Actions]] = js.undefined
    
    var privacySettings: js.UndefOr[ApplicationCodePersistingDisabled] = js.undefined
  }
  object Configuration {
    
    @scala.inline
    def apply(applicationCode: String): Configuration = {
      val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: MultipleNotifications): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setApplicationCode(value: String): Self = StObject.set(x, "applicationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageStorage(value: Boolean): Self = StObject.set(x, "defaultMessageStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageStorageUndefined: Self = StObject.set(x, "defaultMessageStorage", js.undefined)
      
      @scala.inline
      def setGeofencingEnabled(value: Boolean): Self = StObject.set(x, "geofencingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeofencingEnabledUndefined: Self = StObject.set(x, "geofencingEnabled", js.undefined)
      
      @scala.inline
      def setIos(value: ForceCleanup): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      @scala.inline
      def setMessageStorage(value: String): Self = StObject.set(x, "messageStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStorageUndefined: Self = StObject.set(x, "messageStorage", js.undefined)
      
      @scala.inline
      def setNotificationCategories(value: js.Array[Actions]): Self = StObject.set(x, "notificationCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationCategoriesUndefined: Self = StObject.set(x, "notificationCategories", js.undefined)
      
      @scala.inline
      def setNotificationCategoriesVarargs(value: Actions*): Self = StObject.set(x, "notificationCategories", js.Array(value :_*))
      
      @scala.inline
      def setPrivacySettings(value: ApplicationCodePersistingDisabled): Self = StObject.set(x, "privacySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacySettingsUndefined: Self = StObject.set(x, "privacySettings", js.undefined)
    }
  }
  
  trait DefaultMessageStorage extends StObject {
    
    def delete(messageId: String, callback: js.Function0[Unit]): Unit
    
    def deleteAll(callback: js.Function0[Unit]): Unit
    
    def find(messageId: String, callback: js.Function1[/* message */ Message, Unit]): Unit
    
    def findAll(callback: js.Function1[/* messages */ js.Array[Message], Unit]): Unit
  }
  object DefaultMessageStorage {
    
    @scala.inline
    def apply(
      delete: (String, js.Function0[Unit]) => Unit,
      deleteAll: js.Function0[Unit] => Unit,
      find: (String, js.Function1[/* message */ Message, Unit]) => Unit,
      findAll: js.Function1[/* messages */ js.Array[Message], Unit] => Unit
    ): DefaultMessageStorage = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), deleteAll = js.Any.fromFunction1(deleteAll), find = js.Any.fromFunction2(find), findAll = js.Any.fromFunction1(findAll))
      __obj.asInstanceOf[DefaultMessageStorage]
    }
    
    @scala.inline
    implicit class DefaultMessageStorageMutableBuilder[Self <: DefaultMessageStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeleteAll(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "deleteAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind(value: (String, js.Function1[/* message */ Message, Unit]) => Unit): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindAll(value: js.Function1[/* messages */ js.Array[Message], Unit] => Unit): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized
  */
  trait Event extends StObject
  object Event {
    
    @scala.inline
    def actionTapped: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped = "actionTapped".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped]
    
    @scala.inline
    def depersonalized: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized = "depersonalized".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized]
    
    @scala.inline
    def geofenceEntered: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered = "geofenceEntered".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered]
    
    @scala.inline
    def installationUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated = "installationUpdated".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated]
    
    @scala.inline
    def messageReceived: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived = "messageReceived".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived]
    
    @scala.inline
    def notificationTapped: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped = "notificationTapped".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped]
    
    @scala.inline
    def personalized: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized = "personalized".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized]
    
    @scala.inline
    def registrationUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated = "registrationUpdated".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated]
    
    @scala.inline
    def tokenReceived: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived = "tokenReceived".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived]
    
    @scala.inline
    def userUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated = "userUpdated".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Male
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Female
  */
  trait Gender extends StObject
  object Gender {
    
    @scala.inline
    def Female: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Female = "Female".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Female]
    
    @scala.inline
    def Male: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Male = "Male".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Male]
  }
  
  trait Installation extends StObject {
    
    var appVersion: js.UndefOr[String] = js.undefined
    
    var applicationUserId: js.UndefOr[String] = js.undefined
    
    var customAttributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var deviceManufacturer: js.UndefOr[String] = js.undefined
    
    var deviceModel: js.UndefOr[String] = js.undefined
    
    var deviceName: js.UndefOr[String] = js.undefined
    
    var deviceSecure: js.UndefOr[Boolean] = js.undefined
    
    var deviceTimezoneId: js.UndefOr[String] = js.undefined
    
    var geoEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isPrimaryDevice: js.UndefOr[Boolean] = js.undefined
    
    var isPushRegistrationEnabled: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var notificationsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var os: js.UndefOr[OS] = js.undefined
    
    var osVersion: String
    
    var sdkVersion: js.UndefOr[String] = js.undefined
  }
  object Installation {
    
    @scala.inline
    def apply(osVersion: String): Installation = {
      val __obj = js.Dynamic.literal(osVersion = osVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Installation]
    }
    
    @scala.inline
    implicit class InstallationMutableBuilder[Self <: Installation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      @scala.inline
      def setApplicationUserId(value: String): Self = StObject.set(x, "applicationUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUserIdUndefined: Self = StObject.set(x, "applicationUserId", js.undefined)
      
      @scala.inline
      def setCustomAttributes(value: Record[String, String]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      @scala.inline
      def setDeviceManufacturer(value: String): Self = StObject.set(x, "deviceManufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceManufacturerUndefined: Self = StObject.set(x, "deviceManufacturer", js.undefined)
      
      @scala.inline
      def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setDeviceSecure(value: Boolean): Self = StObject.set(x, "deviceSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceSecureUndefined: Self = StObject.set(x, "deviceSecure", js.undefined)
      
      @scala.inline
      def setDeviceTimezoneId(value: String): Self = StObject.set(x, "deviceTimezoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceTimezoneIdUndefined: Self = StObject.set(x, "deviceTimezoneId", js.undefined)
      
      @scala.inline
      def setGeoEnabled(value: Boolean): Self = StObject.set(x, "geoEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoEnabledUndefined: Self = StObject.set(x, "geoEnabled", js.undefined)
      
      @scala.inline
      def setIsPrimaryDevice(value: Boolean): Self = StObject.set(x, "isPrimaryDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrimaryDeviceUndefined: Self = StObject.set(x, "isPrimaryDevice", js.undefined)
      
      @scala.inline
      def setIsPushRegistrationEnabled(value: Boolean): Self = StObject.set(x, "isPushRegistrationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPushRegistrationEnabledUndefined: Self = StObject.set(x, "isPushRegistrationEnabled", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setNotificationsEnabled(value: Boolean): Self = StObject.set(x, "notificationsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsEnabledUndefined: Self = StObject.set(x, "notificationsEnabled", js.undefined)
      
      @scala.inline
      def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var customPayload: js.UndefOr[Record[String, String]] = js.undefined
    
    var internalData: js.UndefOr[String] = js.undefined
    
    var messageId: String
    
    var silent: js.UndefOr[String] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var vibrate: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(messageId: String): Message = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCustomPayload(value: Record[String, String]): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPayloadUndefined: Self = StObject.set(x, "customPayload", js.undefined)
      
      @scala.inline
      def setInternalData(value: String): Self = StObject.set(x, "internalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalDataUndefined: Self = StObject.set(x, "internalData", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: String): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVibrate(value: String): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  trait MobileMessagingError extends StObject {
    
    var code: String
    
    var message: String
  }
  object MobileMessagingError {
    
    @scala.inline
    def apply(code: String, message: String): MobileMessagingError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileMessagingError]
    }
    
    @scala.inline
    implicit class MobileMessagingErrorMutableBuilder[Self <: MobileMessagingError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Android
    - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS
  */
  trait OS extends StObject
  object OS {
    
    @scala.inline
    def Android: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Android = "Android".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Android]
    
    @scala.inline
    def iOS: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS = "iOS".asInstanceOf[typings.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS]
  }
  
  trait PersonalizeContext extends StObject {
    
    var forceDepersonalize: js.UndefOr[Boolean] = js.undefined
    
    var userAttributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var userIdentity: UserIdentity
  }
  object PersonalizeContext {
    
    @scala.inline
    def apply(userIdentity: UserIdentity): PersonalizeContext = {
      val __obj = js.Dynamic.literal(userIdentity = userIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonalizeContext]
    }
    
    @scala.inline
    implicit class PersonalizeContextMutableBuilder[Self <: PersonalizeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceDepersonalize(value: Boolean): Self = StObject.set(x, "forceDepersonalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDepersonalizeUndefined: Self = StObject.set(x, "forceDepersonalize", js.undefined)
      
      @scala.inline
      def setUserAttributes(value: Record[String, String]): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAttributesUndefined: Self = StObject.set(x, "userAttributes", js.undefined)
      
      @scala.inline
      def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserData extends StObject {
    
    var birthday: js.UndefOr[Date] = js.undefined
    
    var customAttributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    var externalUserId: String
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var gender: js.UndefOr[Gender] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var middleName: js.UndefOr[String] = js.undefined
    
    var phones: js.UndefOr[js.Array[String]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UserData {
    
    @scala.inline
    def apply(externalUserId: String): UserData = {
      val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    @scala.inline
    implicit class UserDataMutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBirthday(value: Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
      
      @scala.inline
      def setCustomAttributes(value: Record[String, String]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      @scala.inline
      def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      @scala.inline
      def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
      
      @scala.inline
      def setExternalUserId(value: String): Self = StObject.set(x, "externalUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setGender(value: Gender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      @scala.inline
      def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      @scala.inline
      def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait UserIdentity extends StObject {
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    var externalUserId: String
    
    var phones: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UserIdentity {
    
    @scala.inline
    def apply(externalUserId: String): UserIdentity = {
      val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
    
    @scala.inline
    implicit class UserIdentityMutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      @scala.inline
      def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
      
      @scala.inline
      def setExternalUserId(value: String): Self = StObject.set(x, "externalUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      @scala.inline
      def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value :_*))
    }
  }
}

package typings.parse.mod

import org.scalablytyped.runtime.StringDictionary
import typings.parse.mod.^
import typings.parse.mod.global.Parse.InstallationConstructor
import typings.parse.mod.global.Parse.RoleConstructor
import typings.parse.mod.global.Parse.SessionConstructor
import typings.parse.mod.global.Parse.UserConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Installation: InstallationConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Installation").asInstanceOf[InstallationConstructor]

inline def Role: RoleConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Role").asInstanceOf[RoleConstructor]

inline def Session: SessionConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Session").asInstanceOf[SessionConstructor]

inline def User: UserConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("User").asInstanceOf[UserConstructor]

inline def applicationId: String = ^.asInstanceOf[js.Dynamic].selectDynamic("applicationId").asInstanceOf[String]
inline def applicationId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(x.asInstanceOf[js.Any])

/**
  * Gets all contents from Local Datastore.
  */
inline def dumpLocalDatastore(): js.Promise[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpLocalDatastore")().asInstanceOf[js.Promise[StringDictionary[Any]]]

/**
  * Enable the current user encryption.
  * This must be called before login any user.
  */
inline def enableEncryptedUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableEncryptedUser")().asInstanceOf[Unit]

/**
  * Enable pinning in your application.
  * This must be called before your application can use pinning.
  */
inline def enableLocalDatastore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLocalDatastore")().asInstanceOf[Unit]

inline def encryptedUser: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("encryptedUser").asInstanceOf[Boolean]
inline def encryptedUser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encryptedUser")(x.asInstanceOf[js.Any])

inline def idempotency: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("idempotency").asInstanceOf[Boolean]
inline def idempotency_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idempotency")(x.asInstanceOf[js.Any])

/**
  * Call this method first to set up your authentication tokens for Parse.
  * You can get your keys from the Data Browser on parse.com.
  * @param applicationId Your Parse Application ID.
  * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
  * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
  */
inline def initialize(applicationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def initialize(applicationId: String, javaScriptKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initialize(applicationId: String, javaScriptKey: String, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initialize(applicationId: String, javaScriptKey: Unit, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Flag that indicates whether Encrypted User is enabled.
  */
inline def isEncryptedUserEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncryptedUserEnabled")().asInstanceOf[Boolean]

/**
  * Flag that indicates whether Local Datastore is enabled.
  */
inline def isLocalDatastoreEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDatastoreEnabled")().asInstanceOf[Boolean]

inline def javaScriptKey: js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("javaScriptKey").asInstanceOf[js.UndefOr[String]]
inline def javaScriptKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javaScriptKey")(x.asInstanceOf[js.Any])

inline def liveQueryServerURL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("liveQueryServerURL").asInstanceOf[String]
inline def liveQueryServerURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveQueryServerURL")(x.asInstanceOf[js.Any])

inline def masterKey: js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("masterKey").asInstanceOf[js.UndefOr[String]]
inline def masterKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(x.asInstanceOf[js.Any])

inline def secret: String = ^.asInstanceOf[js.Dynamic].selectDynamic("secret").asInstanceOf[String]
inline def secret_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secret")(x.asInstanceOf[js.Any])

inline def serverAuthToken: js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthToken").asInstanceOf[js.UndefOr[String]]
inline def serverAuthToken_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthToken")(x.asInstanceOf[js.Any])

inline def serverAuthType: js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthType").asInstanceOf[js.UndefOr[String]]
inline def serverAuthType_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthType")(x.asInstanceOf[js.Any])

inline def serverURL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("serverURL").asInstanceOf[String]
inline def serverURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(x.asInstanceOf[js.Any])

/**
  * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
  * @param AsyncStorage AsyncStorage from 'react-native' package
  */
inline def setAsyncStorage(AsyncStorage: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncStorage")(AsyncStorage.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLocalDatastoreController(controller: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalDatastoreController")(controller.asInstanceOf[js.Any]).asInstanceOf[Unit]

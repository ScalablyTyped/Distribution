package typings.parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Installation: typings.parse.mod.global.Parse.InstallationConstructor = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Installation").asInstanceOf[typings.parse.mod.global.Parse.InstallationConstructor]

inline def Role: typings.parse.mod.global.Parse.RoleConstructor = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Role").asInstanceOf[typings.parse.mod.global.Parse.RoleConstructor]

inline def Session: typings.parse.mod.global.Parse.SessionConstructor = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Session").asInstanceOf[typings.parse.mod.global.Parse.SessionConstructor]

inline def User: typings.parse.mod.global.Parse.UserConstructor = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("User").asInstanceOf[typings.parse.mod.global.Parse.UserConstructor]

inline def applicationId: java.lang.String = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("applicationId").asInstanceOf[java.lang.String]
inline def applicationId_=(x: java.lang.String): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(x.asInstanceOf[js.Any])

/**
  * Gets all contents from Local Datastore.
  */
inline def dumpLocalDatastore(): js.Promise[org.scalablytyped.runtime.StringDictionary[js.Any]] = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dumpLocalDatastore")().asInstanceOf[js.Promise[org.scalablytyped.runtime.StringDictionary[js.Any]]]

/**
  * Enable the current user encryption.
  * This must be called before login any user.
  */
inline def enableEncryptedUser(): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableEncryptedUser")().asInstanceOf[scala.Unit]

/**
  * Enable pinning in your application.
  * This must be called before your application can use pinning.
  */
inline def enableLocalDatastore(): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableLocalDatastore")().asInstanceOf[scala.Unit]

inline def encryptedUser: scala.Boolean = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("encryptedUser").asInstanceOf[scala.Boolean]
inline def encryptedUser_=(x: scala.Boolean): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("encryptedUser")(x.asInstanceOf[js.Any])

/**
  * Call this method first to set up your authentication tokens for Parse.
  * You can get your keys from the Data Browser on parse.com.
  * @param applicationId Your Parse Application ID.
  * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
  * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
  */
inline def initialize(applicationId: java.lang.String): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String): scala.Unit = (typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String, masterKey: java.lang.String): scala.Unit = (typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def initialize(applicationId: java.lang.String, javaScriptKey: scala.Unit, masterKey: java.lang.String): scala.Unit = (typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Flag that indicates whether Encrypted User is enabled.
  */
inline def isEncryptedUserEnabled(): scala.Boolean = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isEncryptedUserEnabled")().asInstanceOf[scala.Boolean]

/**
  * Flag that indicates whether Local Datastore is enabled.
  */
inline def isLocalDatastoreEnabled(): scala.Boolean = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDatastoreEnabled")().asInstanceOf[scala.Boolean]

inline def javaScriptKey: js.UndefOr[java.lang.String] = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("javaScriptKey").asInstanceOf[js.UndefOr[java.lang.String]]
inline def javaScriptKey_=(x: js.UndefOr[java.lang.String]): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("javaScriptKey")(x.asInstanceOf[js.Any])

inline def liveQueryServerURL: java.lang.String = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("liveQueryServerURL").asInstanceOf[java.lang.String]
inline def liveQueryServerURL_=(x: java.lang.String): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("liveQueryServerURL")(x.asInstanceOf[js.Any])

inline def masterKey: js.UndefOr[java.lang.String] = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("masterKey").asInstanceOf[js.UndefOr[java.lang.String]]
inline def masterKey_=(x: js.UndefOr[java.lang.String]): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(x.asInstanceOf[js.Any])

inline def secret: java.lang.String = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("secret").asInstanceOf[java.lang.String]
inline def secret_=(x: java.lang.String): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("secret")(x.asInstanceOf[js.Any])

inline def serverAuthToken: js.UndefOr[java.lang.String] = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthToken").asInstanceOf[js.UndefOr[java.lang.String]]
inline def serverAuthToken_=(x: js.UndefOr[java.lang.String]): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthToken")(x.asInstanceOf[js.Any])

inline def serverAuthType: js.UndefOr[java.lang.String] = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthType").asInstanceOf[js.UndefOr[java.lang.String]]
inline def serverAuthType_=(x: js.UndefOr[java.lang.String]): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthType")(x.asInstanceOf[js.Any])

inline def serverURL: java.lang.String = typings.parse.mod.^.asInstanceOf[js.Dynamic].selectDynamic("serverURL").asInstanceOf[java.lang.String]
inline def serverURL_=(x: java.lang.String): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(x.asInstanceOf[js.Any])

/**
  * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
  * @param AsyncStorage AsyncStorage from 'react-native' package
  */
inline def setAsyncStorage(AsyncStorage: js.Any): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncStorage")(AsyncStorage.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setLocalDatastoreController(controller: js.Any): scala.Unit = typings.parse.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLocalDatastoreController")(controller.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

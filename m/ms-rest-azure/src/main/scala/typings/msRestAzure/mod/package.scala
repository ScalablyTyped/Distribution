package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def interactiveLogin(): js.Promise[typings.msRestAzure.mod.DeviceTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")().asInstanceOf[js.Promise[typings.msRestAzure.mod.DeviceTokenCredentials]]
inline def interactiveLogin(
  optionalCallback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.DeviceTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(optionalCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def interactiveLogin(options: typings.msRestAzure.mod.InteractiveLoginOptions): js.Promise[typings.msRestAzure.mod.DeviceTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.DeviceTokenCredentials]]
inline def interactiveLogin(
  options: typings.msRestAzure.mod.InteractiveLoginOptions,
  optionalCallback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.DeviceTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any], optionalCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def interactiveLoginWithAuthResponse(): js.Promise[typings.msRestAzure.mod.AuthResponse] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")().asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]
inline def interactiveLoginWithAuthResponse(options: typings.msRestAzure.mod.InteractiveLoginOptions): js.Promise[typings.msRestAzure.mod.AuthResponse] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]

inline def loginWithAppServiceMSI(): js.Promise[typings.msRestAzure.mod.MSIAppServiceTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")().asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIAppServiceTokenCredentials]]
inline def loginWithAppServiceMSI(
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIAppServiceTokenCredentials, 
  scala.Unit
]
): scala.Unit = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithAppServiceMSI(options: typings.msRestAzure.mod.MSIAppServiceOptions): js.Promise[typings.msRestAzure.mod.MSIAppServiceTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIAppServiceTokenCredentials]]
inline def loginWithAppServiceMSI(
  options: typings.msRestAzure.mod.MSIAppServiceOptions,
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIAppServiceTokenCredentials, 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithAuthFile(): js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")().asInstanceOf[js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials]]
inline def loginWithAuthFile(
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithAuthFile(options: typings.msRestAzure.mod.AuthFileOptions): js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials]]
inline def loginWithAuthFile(
  options: typings.msRestAzure.mod.AuthFileOptions,
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithAuthFileWithAuthResponse(): js.Promise[typings.msRestAzure.mod.AuthResponse] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")().asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]
inline def loginWithAuthFileWithAuthResponse(options: typings.msRestAzure.mod.AuthFileOptions): js.Promise[typings.msRestAzure.mod.AuthResponse] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]

inline def loginWithMSI(): js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")().asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials]]
inline def loginWithMSI(
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIVmTokenCredentials, 
  scala.Unit
]
): scala.Unit = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithMSI(options: typings.msRestAzure.mod.MSIVmOptions): js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials]]
inline def loginWithMSI(
  options: typings.msRestAzure.mod.MSIVmOptions,
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIVmTokenCredentials, 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithServicePrincipalSecret(clientId: java.lang.String, secret: java.lang.String, domain: java.lang.String): js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials]]
inline def loginWithServicePrincipalSecret(
  clientId: java.lang.String,
  secret: java.lang.String,
  domain: java.lang.String,
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithServicePrincipalSecret(
  clientId: java.lang.String,
  secret: java.lang.String,
  domain: java.lang.String,
  options: typings.msRestAzure.mod.AzureTokenCredentialsOptions
): js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.ApplicationTokenCredentials]]
inline def loginWithServicePrincipalSecret(
  clientId: java.lang.String,
  secret: java.lang.String,
  domain: java.lang.String,
  options: typings.msRestAzure.mod.AzureTokenCredentialsOptions,
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithServicePrincipalSecretWithAuthResponse(clientId: java.lang.String, secret: java.lang.String, domain: java.lang.String): js.Promise[typings.msRestAzure.mod.AuthResponse] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]
inline def loginWithServicePrincipalSecretWithAuthResponse(
  clientId: java.lang.String,
  secret: java.lang.String,
  domain: java.lang.String,
  options: typings.msRestAzure.mod.AzureTokenCredentialsOptions
): js.Promise[typings.msRestAzure.mod.AuthResponse] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]

inline def loginWithUsernamePassword(username: java.lang.String, password: java.lang.String): js.Promise[typings.msRestAzure.mod.UserTokenCredentials] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.UserTokenCredentials]]
inline def loginWithUsernamePassword(
  username: java.lang.String,
  password: java.lang.String,
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.UserTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithUsernamePassword(
  username: java.lang.String,
  password: java.lang.String,
  options: typings.msRestAzure.mod.LoginWithUsernamePasswordOptions
): js.Promise[typings.msRestAzure.mod.UserTokenCredentials] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.UserTokenCredentials]]
inline def loginWithUsernamePassword(
  username: java.lang.String,
  password: java.lang.String,
  options: typings.msRestAzure.mod.LoginWithUsernamePasswordOptions,
  callback: js.Function3[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.UserTokenCredentials, 
  /* subscriptions */ js.Array[typings.msRestAzure.mod.LinkedSubscription], 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithUsernamePasswordWithAuthResponse(username: java.lang.String, password: java.lang.String): js.Promise[typings.msRestAzure.mod.AuthResponse] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]
inline def loginWithUsernamePasswordWithAuthResponse(
  username: java.lang.String,
  password: java.lang.String,
  options: typings.msRestAzure.mod.LoginWithUsernamePasswordOptions
): js.Promise[typings.msRestAzure.mod.AuthResponse] = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.msRestAzure.mod.AuthResponse]]

inline def loginWithVmMSI(): js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")().asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials]]
inline def loginWithVmMSI(
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIVmTokenCredentials, 
  scala.Unit
]
): scala.Unit = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithVmMSI(options: typings.msRestAzure.mod.MSIVmOptions): js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials] = typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msRestAzure.mod.MSIVmTokenCredentials]]
inline def loginWithVmMSI(
  options: typings.msRestAzure.mod.MSIVmOptions,
  callback: js.Function2[
  /* err */ typings.std.Error, 
  /* credentials */ typings.msRestAzure.mod.MSIVmTokenCredentials, 
  scala.Unit
]
): scala.Unit = (typings.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

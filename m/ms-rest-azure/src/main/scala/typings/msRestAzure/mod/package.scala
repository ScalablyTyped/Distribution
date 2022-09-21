package typings.msRestAzure.mod

import typings.msRestAzure.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def interactiveLogin(): js.Promise[DeviceTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")().asInstanceOf[js.Promise[DeviceTokenCredentials]]
inline def interactiveLogin(
  optionalCallback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ DeviceTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(optionalCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def interactiveLogin(options: InteractiveLoginOptions): js.Promise[DeviceTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeviceTokenCredentials]]
inline def interactiveLogin(
  options: InteractiveLoginOptions,
  optionalCallback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ DeviceTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any], optionalCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def interactiveLoginWithAuthResponse(): js.Promise[AuthResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")().asInstanceOf[js.Promise[AuthResponse]]
inline def interactiveLoginWithAuthResponse(options: InteractiveLoginOptions): js.Promise[AuthResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AuthResponse]]

inline def loginWithAppServiceMSI(): js.Promise[MSIAppServiceTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")().asInstanceOf[js.Promise[MSIAppServiceTokenCredentials]]
inline def loginWithAppServiceMSI(callback: js.Function2[/* err */ js.Error, /* credentials */ MSIAppServiceTokenCredentials, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loginWithAppServiceMSI(options: MSIAppServiceOptions): js.Promise[MSIAppServiceTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MSIAppServiceTokenCredentials]]
inline def loginWithAppServiceMSI(
  options: MSIAppServiceOptions,
  callback: js.Function2[/* err */ js.Error, /* credentials */ MSIAppServiceTokenCredentials, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loginWithAuthFile(): js.Promise[ApplicationTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")().asInstanceOf[js.Promise[ApplicationTokenCredentials]]
inline def loginWithAuthFile(
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loginWithAuthFile(options: AuthFileOptions): js.Promise[ApplicationTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationTokenCredentials]]
inline def loginWithAuthFile(
  options: AuthFileOptions,
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loginWithAuthFileWithAuthResponse(): js.Promise[AuthResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")().asInstanceOf[js.Promise[AuthResponse]]
inline def loginWithAuthFileWithAuthResponse(options: AuthFileOptions): js.Promise[AuthResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AuthResponse]]

inline def loginWithMSI(): js.Promise[MSIVmTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")().asInstanceOf[js.Promise[MSIVmTokenCredentials]]
inline def loginWithMSI(callback: js.Function2[/* err */ js.Error, /* credentials */ MSIVmTokenCredentials, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loginWithMSI(options: MSIVmOptions): js.Promise[MSIVmTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MSIVmTokenCredentials]]
inline def loginWithMSI(
  options: MSIVmOptions,
  callback: js.Function2[/* err */ js.Error, /* credentials */ MSIVmTokenCredentials, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loginWithServicePrincipalSecret(clientId: String, secret: String, domain: String): js.Promise[ApplicationTokenCredentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApplicationTokenCredentials]]
inline def loginWithServicePrincipalSecret(
  clientId: String,
  secret: String,
  domain: String,
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loginWithServicePrincipalSecret(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[ApplicationTokenCredentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApplicationTokenCredentials]]
inline def loginWithServicePrincipalSecret(
  clientId: String,
  secret: String,
  domain: String,
  options: AzureTokenCredentialsOptions,
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ ApplicationTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loginWithServicePrincipalSecretWithAuthResponse(clientId: String, secret: String, domain: String): js.Promise[AuthResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthResponse]]
inline def loginWithServicePrincipalSecretWithAuthResponse(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[AuthResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthResponse]]

inline def loginWithUsernamePassword(username: String, password: String): js.Promise[UserTokenCredentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserTokenCredentials]]
inline def loginWithUsernamePassword(
  username: String,
  password: String,
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ UserTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loginWithUsernamePassword(username: String, password: String, options: LoginWithUsernamePasswordOptions): js.Promise[UserTokenCredentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserTokenCredentials]]
inline def loginWithUsernamePassword(
  username: String,
  password: String,
  options: LoginWithUsernamePasswordOptions,
  callback: js.Function3[
  /* err */ js.Error, 
  /* credentials */ UserTokenCredentials, 
  /* subscriptions */ js.Array[LinkedSubscription], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loginWithUsernamePasswordWithAuthResponse(username: String, password: String): js.Promise[AuthResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthResponse]]
inline def loginWithUsernamePasswordWithAuthResponse(username: String, password: String, options: LoginWithUsernamePasswordOptions): js.Promise[AuthResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthResponse]]

inline def loginWithVmMSI(): js.Promise[MSIVmTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")().asInstanceOf[js.Promise[MSIVmTokenCredentials]]
inline def loginWithVmMSI(callback: js.Function2[/* err */ js.Error, /* credentials */ MSIVmTokenCredentials, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def loginWithVmMSI(options: MSIVmOptions): js.Promise[MSIVmTokenCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MSIVmTokenCredentials]]
inline def loginWithVmMSI(
  options: MSIVmOptions,
  callback: js.Function2[/* err */ js.Error, /* credentials */ MSIVmTokenCredentials, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

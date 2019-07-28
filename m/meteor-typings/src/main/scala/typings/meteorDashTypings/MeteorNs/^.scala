package typings.meteorDashTypings.MeteorNs

import typings.meteorDashTypings.Anon_LoginStyle
import typings.meteorDashTypings.Anon_OnResultReceived
import typings.meteorDashTypings.Anon_ReplaceLocalhost
import typings.meteorDashTypings.DDPNs.DDPStatus
import typings.meteorDashTypings.EJSONable
import typings.meteorDashTypings.MongoNs.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor")
@js.native
object ^ extends js.Object {
  /** User **/
  /** Error **/
  var Error: ErrorStatic = js.native
  /** Local storage **/
  var _localStorage: LocalStorage = js.native
  /** Global props **/
  var isClient: Boolean = js.native
  var isCordova: Boolean = js.native
  /** Global props **/
  var isDevelopment: Boolean = js.native
  var isProduction: Boolean = js.native
  var isServer: Boolean = js.native
  var isTest: Boolean = js.native
  var release: String = js.native
  var settings: Settings = js.native
  var users: Collection[User] = js.native
  def _debug(args: js.Any*): Unit = js.native
  /** Method **/
  /** Url **/
  def absoluteUrl(): String = js.native
  def absoluteUrl(path: String): String = js.native
  def absoluteUrl(path: String, options: Anon_ReplaceLocalhost): String = js.native
  @JSName("apply")
  def apply(name: String, args: js.Array[EJSONable]): js.Any = js.native
  @JSName("apply")
  def apply(name: String, args: js.Array[EJSONable], options: Anon_OnResultReceived): js.Any = js.native
  @JSName("apply")
  def apply(
    name: String,
    args: js.Array[EJSONable],
    options: Anon_OnResultReceived,
    asyncCallback: js.Function
  ): js.Any = js.native
  def bindEnvironment(func: js.Function): js.Any = js.native
  def call(name: String, args: js.Any*): js.Any = js.native
  def clearInterval(id: Double): Unit = js.native
  def clearTimeout(id: Double): Unit = js.native
  def defer(func: js.Function): Unit = js.native
  def disconnect(): Unit = js.native
  def loggingIn(): Boolean = js.native
  def loginWith[ExternalService](): Unit = js.native
  def loginWith[ExternalService](options: Anon_LoginStyle): Unit = js.native
  def loginWith[ExternalService](options: Anon_LoginStyle, callback: js.Function): Unit = js.native
  def loginWithFacebook(): Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithGithub(): Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithGoogle(): Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithMeetup(): Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithMeteorDeveloperAccount(): Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithPassword(user: String, password: String): Unit = js.native
  def loginWithPassword(user: String, password: String, callback: js.Function): Unit = js.native
  def loginWithPassword(user: js.Object, password: String): Unit = js.native
  def loginWithPassword(user: js.Object, password: String, callback: js.Function): Unit = js.native
  def loginWithToken(token: String): Unit = js.native
  def loginWithToken(token: String, callback: js.Function): Unit = js.native
  def loginWithTwitter(): Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def loginWithWeibo(): Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function): Unit = js.native
  def logoutOtherClients(): Unit = js.native
  def logoutOtherClients(callback: js.Function): Unit = js.native
  /** Error **/
  /** Method **/
  def methods(methods: js.Object): Unit = js.native
  def onConnection(callback: js.Function): Unit = js.native
  /** Connection **/
  def publish(name: String, func: js.Function): Unit = js.native
  /** Event **/
  /** Connection **/
  def reconnect(): Unit = js.native
  /** Url **/
  /** Timeout **/
  def setInterval(func: js.Function, delay: Double): Double = js.native
  def setTimeout(func: js.Function, delay: Double): Double = js.native
  /** Timeout **/
  /** utils **/
  def startup(func: js.Function): Unit = js.native
  /** Connection **/
  /** Status **/
  def status(): DDPStatus = js.native
  /** Status **/
  /** Pub/Sub **/
  def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
  def user(): User = js.native
  def userId(): String = js.native
  def wrapAsync(func: js.Function): js.Any = js.native
  def wrapAsync(func: js.Function, context: js.Object): js.Any = js.native
}


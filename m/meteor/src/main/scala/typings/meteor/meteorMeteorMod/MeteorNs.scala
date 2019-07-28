package typings.meteor.meteorMeteorMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Anon_ErrorOnResultReceivedResult
import typings.meteor.Anon_LoginStyle
import typings.meteor.BlazeNs.TemplateInstance
import typings.meteor.DDPNs.DDPStatus
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.MongoNs.Collection
import typings.meteor.global_Error
import typings.meteor.meteorMeteorMod.MeteorNs.Connection
import typings.meteor.meteorMeteorMod.MeteorNs.Error
import typings.meteor.meteorMeteorMod.MeteorNs.ErrorStatic
import typings.meteor.meteorMeteorMod.MeteorNs.Event
import typings.meteor.meteorMeteorMod.MeteorNs.EventHandlerFunction
import typings.meteor.meteorMeteorMod.MeteorNs.LoginWithExternalServiceOptions
import typings.meteor.meteorMeteorMod.MeteorNs.MethodThisType
import typings.meteor.meteorMeteorMod.MeteorNs.Settings
import typings.meteor.meteorMeteorMod.MeteorNs.SubscriptionHandle
import typings.meteor.meteorMeteorMod.MeteorNs.TypedError
import typings.meteor.meteorMeteorMod.MeteorNs.TypedErrorStatic
import typings.meteor.meteorMeteorMod.MeteorNs.User
import typings.meteor.meteorMeteorMod.MeteorNs.UserEmail
import typings.meteor.meteorMeteorMod.MeteorNs.absoluteUrlOptions
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor")
@js.native
object MeteorNs extends js.Object {
  /** Connection **/
  trait Connection extends js.Object {
    var clientAddress: String
    var close: js.Function
    var httpHeaders: js.Object
    var id: String
    var onClose: js.Function
  }
  
  trait Error
    extends typings.std.Error {
    var details: js.UndefOr[String] = js.undefined
    var error: String | Double
    var reason: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class ErrorCls protected () extends Error {
    def this(error: String) = this()
    def this(error: Double) = this()
    def this(error: String, reason: String) = this()
    def this(error: Double, reason: String) = this()
    def this(error: String, reason: String, details: String) = this()
    def this(error: Double, reason: String, details: String) = this()
    /* CompleteClass */
    override var error: String | Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  trait ErrorStatic
    extends Instantiable2[(/* error */ Double) | (/* error */ String), /* reason */ String, Error]
       with Instantiable1[(/* error */ Double) | (/* error */ String), Error]
       with Instantiable3[
          (/* error */ Double) | (/* error */ String), 
          /* reason */ String, 
          /* details */ String, 
          Error
        ]
  
  /** Login **/
  /** Event **/
  trait Event extends js.Object {
    var currentTarget: HTMLElement
    var target: HTMLElement
    var `type`: String
    var which: Double
    def isDefaultPrevented(): Boolean
    def isImmediatePropagationStopped(): Boolean
    def isPropagationStopped(): Boolean
    def preventDefault(): Unit
    def stopImmediatePropagation(): Unit
    def stopPropagation(): Unit
  }
  
  @js.native
  trait EventHandlerFunction
    extends js.Function {
    def apply(): Unit = js.native
    def apply(event: Event): Unit = js.native
    def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
  }
  
  trait LiveQueryHandle extends js.Object {
    def stop(): Unit
  }
  
  /** Login **/
  trait LoginWithExternalServiceOptions extends js.Object {
    var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
    var loginHint: js.UndefOr[String] = js.undefined
    var loginStyle: js.UndefOr[String] = js.undefined
    var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
    var redirectUrl: js.UndefOr[String] = js.undefined
    var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
    var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  /** Error **/
  /** Method **/
  trait MethodThisType extends js.Object {
    var connection: Connection | Null
    var isSimulation: Boolean
    var userId: String | Null
    def setUserId(userId: String): Unit
    def unblock(): Unit
  }
  
  /** Global props **/
  /** Settings **/
  trait Settings
    extends /* id */ StringDictionary[js.Any] {
    var public: StringDictionary[js.Any]
  }
  
  /** utils **/
  /** Pub/Sub **/
  trait SubscriptionHandle extends js.Object {
    def ready(): Boolean
    def stop(): Unit
  }
  
  trait TypedError
    extends typings.std.Error {
    var errorType: String
  }
  
  @js.native
  class TypedErrorCls protected () extends TypedError {
    def this(message: String, errorType: String) = this()
    /* CompleteClass */
    override var errorType: String = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  trait TypedErrorStatic extends Instantiable2[/* message */ String, /* errorType */ String, TypedError]
  
  trait User extends js.Object {
    var _id: js.UndefOr[String] = js.undefined
    var createdAt: js.UndefOr[Date] = js.undefined
    var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
    var profile: js.UndefOr[js.Any] = js.undefined
    var services: js.UndefOr[js.Any] = js.undefined
    var username: js.UndefOr[String] = js.undefined
  }
  
  /** Settings **/
  /** User **/
  trait UserEmail extends js.Object {
    var address: String
    var verified: Boolean
  }
  
  trait absoluteUrlOptions extends js.Object {
    var replaceLocalhost: js.UndefOr[Boolean] = js.undefined
    var rootUrl: js.UndefOr[String] = js.undefined
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  
  /** User **/
  /** Error **/
  var Error: ErrorStatic = js.native
  var TypedError: TypedErrorStatic = js.native
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
  @JSName("apply")
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  @JSName("apply")
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result]
  ): js.Any = js.native
  @JSName("apply")
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[global_Error | Error], /* result */ js.UndefOr[Result], Unit]
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
  def loginWith[ExternalService](
    options: Anon_LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithFacebook(): Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithFacebook(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithGithub(): Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithGithub(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithGoogle(): Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithGoogle(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithMeetup(): Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithMeetup(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithMeteorDeveloperAccount(): Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithMeteorDeveloperAccount(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithPassword(user: String, password: String): Unit = js.native
  def loginWithPassword(
    user: String,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithPassword(user: js.Object, password: String): Unit = js.native
  def loginWithPassword(
    user: js.Object,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithToken(token: String): Unit = js.native
  def loginWithToken(
    token: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithTwitter(): Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithTwitter(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loginWithWeibo(): Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = js.native
  def loginWithWeibo(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]): Unit = js.native
  def logoutOtherClients(): Unit = js.native
  def logoutOtherClients(callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]): Unit = js.native
  def methods(methods: StringDictionary[js.ThisFunction1[/* this */ MethodThisType, /* repeated */ js.Any, _]]): Unit = js.native
  def onConnection(callback: js.Function): Unit = js.native
  /** Connection **/
  def publish(
    name: String,
    func: js.ThisFunction1[/* this */ typings.meteor.meteorMeteorMod.Subscription, /* repeated */ js.Any, Unit]
  ): Unit = js.native
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
  def user(): User | Null = js.native
  def userId(): String | Null = js.native
  def wrapAsync(func: js.Function): js.Any = js.native
  def wrapAsync(func: js.Function, context: js.Object): js.Any = js.native
  /** Method **/
  /** Url **/
  @js.native
  object absoluteUrl extends js.Object {
    var defaultOptions: absoluteUrlOptions = js.native
    def apply(): String = js.native
    def apply(path: String): String = js.native
    def apply(path: String, options: absoluteUrlOptions): String = js.native
  }
  
  type EventMap = StringDictionary[EventHandlerFunction]
}


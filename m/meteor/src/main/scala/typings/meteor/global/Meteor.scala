package typings.meteor.global

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.DDP.DDPStatus
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.ErrorStatic
import typings.meteor.Meteor.LoginWithExternalServiceOptions
import typings.meteor.Meteor.MethodThisType
import typings.meteor.Meteor.Settings
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Meteor.TypedError
import typings.meteor.Meteor.TypedErrorStatic
import typings.meteor.Meteor.User
import typings.meteor.Meteor.absoluteUrlOptions
import typings.meteor.Mongo.Collection
import typings.meteor.Subscription
import typings.meteor.anon.Fields
import typings.meteor.anon.Isauto
import typings.meteor.anon.LoginStyle
import typings.meteor.anon.OnResultReceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meteor {
  
  @JSGlobal("Meteor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Meteor.EnvironmentVariable")
  @js.native
  open class EnvironmentVariable[T] ()
    extends StObject
       with typings.meteor.Meteor.EnvironmentVariable[T] {
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def getOrNullIfOutsideFiber(): T | Null = js.native
    
    /* CompleteClass */
    override val slot: Double = js.native
    
    /* CompleteClass */
    override def withValue[U](value: T, fn: js.Function0[U]): U = js.native
  }
  
  /** User **/
  /** Error **/
  /**
    * This class represents a symbolic error thrown by a method.
    */
  @JSGlobal("Meteor.Error")
  @js.native
  def Error: ErrorStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Meteor.Error")
  @js.native
  open class ErrorCls protected ()
    extends StObject
       with Error {
    /**
      * @param error A string code uniquely identifying this kind of error.
      * This string should be used by callers of the method to determine the
      * appropriate action to take, instead of attempting to parse the reason
      * or details fields. For example:
      *
      * ```
      * // on the server, pick a code unique to this error
      * // the reason field should be a useful debug message
      * throw new Meteor.Error("logged-out",
      *   "The user must be logged in to post a comment.");
      *
      * // on the client
      * Meteor.call("methodName", function (error) {
      *   // identify the error
      *   if (error && error.error === "logged-out") {
      *     // show a nice error message
      *     Session.set("errorMessage", "Please log in to post a comment.");
      *   }
      * });
      * ```
      *
      * For legacy reasons, some built-in Meteor functions such as `check` throw
      * errors with a number in this field.
      *
      * @param reason Optional. A short human-readable summary of the
      * error, like 'Not Found'.
      * @param details Optional. Additional information about the error,
      * like a textual stack trace.
      */
    def this(error: String) = this()
    def this(error: Double) = this()
    def this(error: String, reason: String) = this()
    def this(error: Double, reason: String) = this()
    def this(error: String, reason: String, details: String) = this()
    def this(error: String, reason: Unit, details: String) = this()
    def this(error: Double, reason: String, details: String) = this()
    def this(error: Double, reason: Unit, details: String) = this()
    
    /* CompleteClass */
    var error: String | Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def Error_=(x: ErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Meteor.TypedError")
  @js.native
  def TypedError: TypedErrorStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Meteor.TypedError")
  @js.native
  open class TypedErrorCls protected ()
    extends StObject
       with TypedError {
    def this(message: String, errorType: String) = this()
    
    /* CompleteClass */
    var errorType: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def TypedError_=(x: TypedErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypedError")(x.asInstanceOf[js.Any])
  
  /** Method **/
  /** Url **/
  /**
    * Generate an absolute URL pointing to the application. The server reads from the `ROOT_URL` environment variable to determine where it is running. This is taken care of automatically for
    * apps deployed to Galaxy, but must be provided when using `meteor build`.
    */
  object absoluteUrl {
    
    /**
      * @param path A path to append to the root URL. Do not include a leading "`/`".
      */
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(path: String, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(path: Unit, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("Meteor.absoluteUrl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.absoluteUrl.defaultOptions")
    @js.native
    def defaultOptions: absoluteUrlOptions = js.native
    inline def defaultOptions_=(x: absoluteUrlOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Unit,
    asyncCallback: js.Function2[/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result], Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: OnResultReceived[Result]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: OnResultReceived[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result], Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def bindEnvironment[TFunc /* <: js.Function */](func: TFunc): TFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[TFunc]
  
  /**
    * Invokes a method passing any number of arguments.
    * @param name Name of method to invoke
    * @param args Optional method arguments
    */
  inline def call(name: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  /**
    * Cancel a repeating function call scheduled by `Meteor.setInterval`.
    * @param id The handle returned by `Meteor.setInterval`
    */
  inline def clearInterval(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Cancel a function call scheduled by `Meteor.setTimeout`.
    * @param id The handle returned by `Meteor.setTimeout`
    */
  inline def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /**
    * Defer execution of a function to run asynchronously in the background (similar to `Meteor.setTimeout(func, 0)`.
    * @param func The function to run
    */
  inline def defer(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
  
  @JSGlobal("Meteor.isAppTest")
  @js.native
  def isAppTest: Boolean = js.native
  inline def isAppTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAppTest")(x.asInstanceOf[js.Any])
  
  /** Global props **/
  /** True if running in client environment. */
  @JSGlobal("Meteor.isClient")
  @js.native
  def isClient: Boolean = js.native
  inline def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
  
  /** True if running in a Cordova mobile environment. */
  @JSGlobal("Meteor.isCordova")
  @js.native
  def isCordova: Boolean = js.native
  inline def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
  
  /** Global props **/
  /** True if running in development environment. */
  @JSGlobal("Meteor.isDevelopment")
  @js.native
  def isDevelopment: Boolean = js.native
  inline def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
  
  /** True if running in production environment. */
  @JSGlobal("Meteor.isProduction")
  @js.native
  def isProduction: Boolean = js.native
  inline def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
  
  /** True if running in server environment. */
  @JSGlobal("Meteor.isServer")
  @js.native
  def isServer: Boolean = js.native
  inline def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Meteor.isTest")
  @js.native
  def isTest: Boolean = js.native
  inline def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
  
  inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
  
  inline def loggingOut(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingOut")().asInstanceOf[Boolean]
  
  inline def loginWith[ExternalService](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[Unit]
  inline def loginWith[ExternalService](options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWith[ExternalService](options: LoginStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWith[ExternalService](
    options: LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithFacebook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[Unit]
  inline def loginWithFacebook(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithFacebook(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithGithub(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[Unit]
  inline def loginWithGithub(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithGithub(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithGoogle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[Unit]
  inline def loginWithGoogle(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithGoogle(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithMeetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[Unit]
  inline def loginWithMeetup(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithMeetup(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithMeteorDeveloperAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[Unit]
  inline def loginWithMeteorDeveloperAccount(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithMeteorDeveloperAccount(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithPassword(user: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithPassword(
    user: String,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithPassword(user: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithPassword(
    user: js.Object,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithToken(token: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithTwitter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[Unit]
  inline def loginWithTwitter(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithTwitter(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginWithWeibo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[Unit]
  inline def loginWithWeibo(options: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loginWithWeibo(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
  inline def logout(callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
  inline def logoutOtherClients(callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Defines functions that can be invoked over the network by clients.
    * @param methods Dictionary whose keys are method names and values are functions.
    */
  inline def methods(methods: StringDictionary[js.ThisFunction1[/* this */ MethodThisType, /* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onConnection(callback: js.Function1[/* connection */ Connection, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Connection **/
  /**
    * Publish a record set.
    * @param name If String, name of the record set.  If Object, publications Dictionary of publish functions by name. If `null`, the set has no name, and the record set is automatically sent to
    * all connected clients.
    * @param func Function called on the server each time a client subscribes. Inside the function, `this` is the publish handler object, described below. If the client passed arguments to
    * `subscribe`, the function is called with the same arguments.
    */
  inline def publish(name: String, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(
    name: String,
    func: js.ThisFunction1[/* this */ Subscription, /* repeated */ Any, Unit],
    options: Isauto
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(name: Null, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publish(
    name: Null,
    func: js.ThisFunction1[/* this */ Subscription, /* repeated */ Any, Unit],
    options: Isauto
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Event **/
  /** Connection **/
  inline def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
  
  /**
    * `Meteor.release` is a string containing the name of the release with which the project was built (for example, `"1.2.3"`). It is `undefined` if the project was built using a git checkout
    * of Meteor.
    */
  @JSGlobal("Meteor.release")
  @js.native
  def release: String = js.native
  inline def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
  
  /** Url **/
  /** Timeout **/
  /**
    * Call a function repeatedly, with a time delay between calls.
    * @param func The function to run
    * @param delay Number of milliseconds to wait between each function call.
    */
  inline def setInterval(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Call a function in the future after waiting for a specified delay.
    * @param func The function to run
    * @param delay Number of milliseconds to wait before calling function
    */
  inline def setTimeout(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * `Meteor.settings` contains deployment-specific configuration options. You can initialize settings by passing the `--settings` option (which takes the name of a file containing JSON data)
    * to `meteor run` or `meteor deploy`. When running your server directly (e.g. from a bundle), you instead specify settings by putting the JSON directly into the `METEOR_SETTINGS` environment
    * variable. If the settings object contains a key named `public`, then `Meteor.settings.public` will be available on the client as well as the server.  All other properties of
    * `Meteor.settings` are only defined on the server.  You can rely on `Meteor.settings` and `Meteor.settings.public` being defined objects (not undefined) on both client and server even if
    * there are no settings specified.  Changes to `Meteor.settings.public` at runtime will be picked up by new client connections.
    */
  @JSGlobal("Meteor.settings")
  @js.native
  def settings: Settings = js.native
  inline def settings_=(x: Settings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  
  /** Timeout **/
  /** utils **/
  /**
    * Run code when a client or a server starts.
    * @param func A function to run on startup.
    */
  inline def startup(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Connection **/
  /** Status **/
  inline def status(): DDPStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[DDPStatus]
  
  /** Status **/
  /** Pub/Sub **/
  /**
    * Subscribe to a record set.  Returns a handle that provides
    * `stop()` and `ready()` methods.
    * @param name Name of the subscription.  Matches the name of the
    * server's `publish()` call.
    * @param args Optional arguments passed to publisher
    * function on server.
    * @param callbacks Optional. May include `onStop`
    * and `onReady` callbacks. If there is an error, it is passed as an
    * argument to `onStop`. If a function is passed instead of an object, it
    * is interpreted as an `onReady` callback.
    */
  inline def subscribe(name: String, args: Any*): SubscriptionHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SubscriptionHandle]
  
  inline def user(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User | Null]
  inline def user(options: Fields): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")(options.asInstanceOf[js.Any]).asInstanceOf[User | Null]
  
  inline def userId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String | Null]
  
  @JSGlobal("Meteor.users")
  @js.native
  def users: Collection[User, User] = js.native
  inline def users_=(x: Collection[User, User]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
  
  /**
    * Wrap a function that takes a callback function as its final parameter.
    * The signature of the callback of the wrapped function should be `function(error, result){}`.
    * On the server, the wrapped function can be used either synchronously (without passing a callback) or asynchronously
    * (when a callback is passed). On the client, a callback is always required; errors will be logged if there is no callback.
    * If a callback is provided, the environment captured when the original function was called will be restored in the callback.
    * The parameters of the wrapped function must not contain any optional parameters or be undefined, as the callback function is expected to be the final, non-undefined parameter.
    * @param func A function that takes a callback as its final parameter
    * @param context Optional `this` object against which the original function will be invoked
    */
  inline def wrapAsync(func: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def wrapAsync(func: js.Function, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
}

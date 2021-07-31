package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.Blaze.TemplateInstance
import typings.meteorTypings.DDP.DDPStatus
import typings.meteorTypings.Mongo.Collection
import typings.meteorTypings.anon.LoginStyle
import typings.meteorTypings.anon.OnResultReceived
import typings.meteorTypings.anon.ReplaceLocalhost
import typings.meteorTypings.meteorMod.Meteor.Connection
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorMod {
  
  object Meteor {
    
    @JSImport("meteor/meteor", "Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    trait Error extends StObject {
      
      var details: js.UndefOr[String] = js.undefined
      
      var error: String | Double
      
      var reason: js.UndefOr[String] = js.undefined
    }
    object Error {
      
      /** User **/
      /** Error **/
      @JSImport("meteor/meteor", "Meteor.Error")
      @js.native
      val ^ : ErrorStatic = js.native
      
      @scala.inline
      implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        @scala.inline
        def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/meteor", "Meteor.Error")
    @js.native
    class ErrorCls protected ()
      extends StObject
         with Error {
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
    }
    
    /** Local storage **/
    @JSImport("meteor/meteor", "Meteor._localStorage")
    @js.native
    def _localStorage: LocalStorage = js.native
    @scala.inline
    def _localStorage_=(x: LocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_localStorage")(x.asInstanceOf[js.Any])
    
    /** Method **/
    /** Url **/
    @scala.inline
    def absoluteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")().asInstanceOf[String]
    @scala.inline
    def absoluteUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def absoluteUrl(path: String, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def absoluteUrl(path: Unit, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def apply(name: String, args: js.Array[EJSONable]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(name: String, args: js.Array[EJSONable], options: Unit, asyncCallback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived, asyncCallback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def bindEnvironment(func: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def call(name: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def clearInterval(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def debug(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def defer(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
    
    /** Global props **/
    @JSImport("meteor/meteor", "Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    @scala.inline
    def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isCordova")
    @js.native
    def isCordova: Boolean = js.native
    @scala.inline
    def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
    
    /** Global props **/
    @JSImport("meteor/meteor", "Meteor.isDevelopment")
    @js.native
    def isDevelopment: Boolean = js.native
    @scala.inline
    def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isProduction")
    @js.native
    def isProduction: Boolean = js.native
    @scala.inline
    def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    @scala.inline
    def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isTest")
    @js.native
    def isTest: Boolean = js.native
    @scala.inline
    def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    @scala.inline
    def loginWith[ExternalService](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[Unit]
    @scala.inline
    def loginWith[ExternalService](options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWith[ExternalService](options: LoginStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWith[ExternalService](options: LoginStyle, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithFacebook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[Unit]
    @scala.inline
    def loginWithFacebook(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithFacebook(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithGithub(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[Unit]
    @scala.inline
    def loginWithGithub(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithGithub(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithGoogle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[Unit]
    @scala.inline
    def loginWithGoogle(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithGoogle(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithMeetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[Unit]
    @scala.inline
    def loginWithMeetup(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithMeetup(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithMeteorDeveloperAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[Unit]
    @scala.inline
    def loginWithMeteorDeveloperAccount(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithPassword(user: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithPassword(user: String, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithPassword(user: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithPassword(user: js.Object, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithToken(token: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithTwitter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[Unit]
    @scala.inline
    def loginWithTwitter(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithTwitter(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loginWithWeibo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[Unit]
    @scala.inline
    def loginWithWeibo(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def loginWithWeibo(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    @scala.inline
    def logout(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    @scala.inline
    def logoutOtherClients(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Error **/
    /** Method **/
    @scala.inline
    def methods(methods: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onConnection(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    @scala.inline
    def publish(name: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Event **/
    /** Connection **/
    @scala.inline
    def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
    
    @JSImport("meteor/meteor", "Meteor.release")
    @js.native
    def release: String = js.native
    @scala.inline
    def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
    
    /** Url **/
    /** Timeout **/
    @scala.inline
    def setInterval(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def setTimeout(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("meteor/meteor", "Meteor.settings")
    @js.native
    def settings: Settings_ = js.native
    @scala.inline
    def settings_=(x: Settings_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
    
    /** Timeout **/
    /** utils **/
    @scala.inline
    def startup(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    /** Status **/
    @scala.inline
    def status(): DDPStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[DDPStatus]
    
    /** Status **/
    /** Pub/Sub **/
    @scala.inline
    def subscribe(name: String, args: js.Any*): SubscriptionHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SubscriptionHandle]
    
    @scala.inline
    def user(): User_ = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User_]
    
    @scala.inline
    def userId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String]
    
    @JSImport("meteor/meteor", "Meteor.users")
    @js.native
    def users: Collection[User_] = js.native
    @scala.inline
    def users_=(x: Collection[User_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapAsync(func: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def wrapAsync(func: js.Function, context: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** Connection **/
    trait Connection extends StObject {
      
      var clientAddress: String
      
      var close: js.Function
      
      var httpHeaders: js.Object
      
      var id: String
      
      var onClose: js.Function
    }
    object Connection {
      
      @scala.inline
      def apply(
        clientAddress: String,
        close: js.Function,
        httpHeaders: js.Object,
        id: String,
        onClose: js.Function
      ): Connection = {
        val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Connection]
      }
      
      @scala.inline
      implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ErrorStatic
      extends StObject
         with Instantiable1[(/* error */ Double) | (/* error */ String), Error]
         with Instantiable2[(/* error */ Double) | (/* error */ String), /* reason */ String, Error]
         with Instantiable3[
              (/* error */ Double) | (/* error */ String), 
              (/* reason */ String) | (/* reason */ Unit), 
              /* details */ String, 
              Error
            ]
    
    /** Login **/
    /** Event **/
    trait Event extends StObject {
      
      var currentTarget: HTMLElement
      
      def isDefaultPrevented(): Boolean
      
      def isImmediatePropagationStopped(): Boolean
      
      def isPropagationStopped(): Boolean
      
      def preventDefault(): Unit
      
      def stopImmediatePropagation(): Unit
      
      def stopPropagation(): Unit
      
      var target: HTMLElement
      
      var `type`: String
      
      var which: Double
    }
    object Event {
      
      @scala.inline
      def apply(
        currentTarget: HTMLElement,
        isDefaultPrevented: () => Boolean,
        isImmediatePropagationStopped: () => Boolean,
        isPropagationStopped: () => Boolean,
        preventDefault: () => Unit,
        stopImmediatePropagation: () => Unit,
        stopPropagation: () => Unit,
        target: HTMLElement,
        `type`: String,
        which: Double
      ): Event = {
        val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventHandlerFunction
      extends js.Function {
      
      def apply(): Unit = js.native
      def apply(event: Unit, templateInstance: TemplateInstance): Unit = js.native
      def apply(event: Event): Unit = js.native
      def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
    }
    
    type EventMap = StringDictionary[EventHandlerFunction]
    
    trait LiveQueryHandle extends StObject {
      
      def stop(): Unit
    }
    object LiveQueryHandle {
      
      @scala.inline
      def apply(stop: () => Unit): LiveQueryHandle = {
        val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[LiveQueryHandle]
      }
      
      @scala.inline
      implicit class LiveQueryHandleMutableBuilder[Self <: LiveQueryHandle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    trait LocalStorage extends StObject {
      
      var _data: js.Any
      
      def getItem(key: js.Any): js.Any
      
      def removeItem(key: js.Any): Unit
      
      def setItem(key: js.Any, value: js.Any): js.Any
    }
    object LocalStorage {
      
      @scala.inline
      def apply(
        _data: js.Any,
        getItem: js.Any => js.Any,
        removeItem: js.Any => Unit,
        setItem: (js.Any, js.Any) => js.Any
      ): LocalStorage = {
        val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
        __obj.asInstanceOf[LocalStorage]
      }
      
      @scala.inline
      implicit class LocalStorageMutableBuilder[Self <: LocalStorage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetItem(value: js.Any => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemoveItem(value: js.Any => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetItem(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
        
        @scala.inline
        def set_data(value: js.Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
      }
    }
    
    /** Login **/
    trait LoginWithExternalServiceOptions extends StObject {
      
      var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
      
      var loginHint: js.UndefOr[String] = js.undefined
      
      var loginStyle: js.UndefOr[String] = js.undefined
      
      var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
      
      var redirectUrl: js.UndefOr[String] = js.undefined
      
      var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
      
      var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
    }
    object LoginWithExternalServiceOptions {
      
      @scala.inline
      def apply(): LoginWithExternalServiceOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoginWithExternalServiceOptions]
      }
      
      @scala.inline
      implicit class LoginWithExternalServiceOptionsMutableBuilder[Self <: LoginWithExternalServiceOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
        
        @scala.inline
        def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
        
        @scala.inline
        def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
        
        @scala.inline
        def setLoginUrlParameters(value: js.Object): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoginUrlParametersUndefined: Self = StObject.set(x, "loginUrlParameters", js.undefined)
        
        @scala.inline
        def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
        
        @scala.inline
        def setRequestOfflineToken(value: Boolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
        
        @scala.inline
        def setRequestPermissions(value: js.Array[String]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
        
        @scala.inline
        def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value :_*))
      }
    }
    
    /** Global props **/
    /** Settings **/
    trait Settings_
      extends StObject
         with /* id */ StringDictionary[js.Any] {
      
      var public: StringDictionary[js.Any]
    }
    object Settings_ {
      
      @scala.inline
      def apply(public: StringDictionary[js.Any]): Settings_ = {
        val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
        __obj.asInstanceOf[Settings_]
      }
      
      @scala.inline
      implicit class Settings_MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPublic(value: StringDictionary[js.Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      }
    }
    
    /** utils **/
    /** Pub/Sub **/
    trait SubscriptionHandle extends StObject {
      
      def ready(): Boolean
      
      def stop(): Unit
    }
    object SubscriptionHandle {
      
      @scala.inline
      def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
        val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[SubscriptionHandle]
      }
      
      @scala.inline
      implicit class SubscriptionHandleMutableBuilder[Self <: SubscriptionHandle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReady(value: () => Boolean): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    /** Settings **/
    /** User **/
    trait UserEmail extends StObject {
      
      var address: String
      
      var verified: Boolean
    }
    object UserEmail {
      
      @scala.inline
      def apply(address: String, verified: Boolean): UserEmail = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserEmail]
      }
      
      @scala.inline
      implicit class UserEmailMutableBuilder[Self <: UserEmail] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      }
    }
    
    trait User_ extends StObject {
      
      var _id: js.UndefOr[String] = js.undefined
      
      var createdAt: js.UndefOr[Double] = js.undefined
      
      var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
      
      var profile: js.UndefOr[js.Any] = js.undefined
      
      var services: js.UndefOr[js.Any] = js.undefined
      
      var username: js.UndefOr[String] = js.undefined
    }
    object User_ {
      
      @scala.inline
      def apply(): User_ = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User_]
      }
      
      @scala.inline
      implicit class User_MutableBuilder[Self <: User_] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
        
        @scala.inline
        def setEmails(value: js.Array[UserEmail]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
        
        @scala.inline
        def setEmailsVarargs(value: UserEmail*): Self = StObject.set(x, "emails", js.Array(value :_*))
        
        @scala.inline
        def setProfile(value: js.Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        @scala.inline
        def setServices(value: js.Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
        
        @scala.inline
        def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      }
    }
  }
  
  trait Subscription extends StObject {
    
    def added(collection: String, id: String, fields: js.Object): Unit
    
    def changed(collection: String, id: String, fields: js.Object): Unit
    
    var connection: Connection
    
    def error(error: Error): Unit
    
    def onStop(func: js.Function): Unit
    
    def ready(): Unit
    
    def removed(collection: String, id: String): Unit
    
    def stop(): Unit
    
    var userId: String
  }
  object Subscription {
    
    @scala.inline
    def apply(
      added: (String, String, js.Object) => Unit,
      changed: (String, String, js.Object) => Unit,
      connection: Connection,
      error: Error => Unit,
      onStop: js.Function => Unit,
      ready: () => Unit,
      removed: (String, String) => Unit,
      stop: () => Unit,
      userId: String
    ): typings.meteorTypings.meteorMod.Subscription = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorTypings.meteorMod.Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: typings.meteorTypings.meteorMod.Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChanged(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoved(value: (String, String) => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}

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
import typings.meteorTypings.meteorMeteorMod.Meteor.Connection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorMeteorMod {
  
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
      
      extension [Self <: Error](x: Self) {
        
        inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        inline def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/meteor", "Meteor.Error")
    @js.native
    open class ErrorCls protected ()
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
    inline def _localStorage_=(x: LocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_localStorage")(x.asInstanceOf[js.Any])
    
    /** Method **/
    /** Url **/
    inline def absoluteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")().asInstanceOf[String]
    inline def absoluteUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def absoluteUrl(path: String, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def absoluteUrl(path: Unit, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def apply(name: String, args: js.Array[EJSONable]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: Unit, asyncCallback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived, asyncCallback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def bindEnvironment(func: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def call(name: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def clearInterval(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def defer(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
    
    /** Global props **/
    @JSImport("meteor/meteor", "Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    inline def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isCordova")
    @js.native
    def isCordova: Boolean = js.native
    inline def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
    
    /** Global props **/
    @JSImport("meteor/meteor", "Meteor.isDevelopment")
    @js.native
    def isDevelopment: Boolean = js.native
    inline def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isProduction")
    @js.native
    def isProduction: Boolean = js.native
    inline def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    inline def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/meteor", "Meteor.isTest")
    @js.native
    def isTest: Boolean = js.native
    inline def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
    
    inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    inline def loginWith[ExternalService](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: LoginStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: LoginStyle, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithFacebook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[Unit]
    inline def loginWithFacebook(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithFacebook(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGithub(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[Unit]
    inline def loginWithGithub(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGithub(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGoogle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[Unit]
    inline def loginWithGoogle(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGoogle(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[Unit]
    inline def loginWithMeetup(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeetup(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeteorDeveloperAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithPassword(user: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: String, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: js.Object, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithToken(token: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithTwitter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[Unit]
    inline def loginWithTwitter(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithTwitter(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithWeibo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[Unit]
    inline def loginWithWeibo(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithWeibo(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Error **/
    /** Method **/
    inline def methods(methods: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onConnection(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    inline def publish(name: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Event **/
    /** Connection **/
    inline def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
    
    @JSImport("meteor/meteor", "Meteor.release")
    @js.native
    def release: String = js.native
    inline def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
    
    /** Url **/
    /** Timeout **/
    inline def setInterval(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setTimeout(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("meteor/meteor", "Meteor.settings")
    @js.native
    def settings: Settings_ = js.native
    inline def settings_=(x: Settings_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
    
    /** Timeout **/
    /** utils **/
    inline def startup(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    /** Status **/
    inline def status(): DDPStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[DDPStatus]
    
    /** Status **/
    /** Pub/Sub **/
    inline def subscribe(name: String, args: Any*): SubscriptionHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SubscriptionHandle]
    
    inline def user(): User_ = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User_]
    
    inline def userId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String]
    
    @JSImport("meteor/meteor", "Meteor.users")
    @js.native
    def users: Collection[User_] = js.native
    inline def users_=(x: Collection[User_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
    
    inline def wrapAsync(func: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def wrapAsync(func: js.Function, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Connection **/
    trait Connection extends StObject {
      
      var clientAddress: String
      
      var close: js.Function
      
      var httpHeaders: js.Object
      
      var id: String
      
      var onClose: js.Function
    }
    object Connection {
      
      inline def apply(
        clientAddress: String,
        close: js.Function,
        httpHeaders: js.Object,
        id: String,
        onClose: js.Function
      ): Connection = {
        val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Connection]
      }
      
      extension [Self <: Connection](x: Self) {
        
        inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
        
        inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
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
      
      inline def apply(
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
      
      extension [Self <: Event](x: Self) {
        
        inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
        
        inline def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
        
        inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
        
        inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
        
        inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
        
        inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
        
        inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
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
      
      inline def apply(stop: () => Unit): LiveQueryHandle = {
        val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[LiveQueryHandle]
      }
      
      extension [Self <: LiveQueryHandle](x: Self) {
        
        inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    trait LocalStorage extends StObject {
      
      var _data: Any
      
      def getItem(key: Any): Any
      
      def removeItem(key: Any): Unit
      
      def setItem(key: Any, value: Any): Any
    }
    object LocalStorage {
      
      inline def apply(_data: Any, getItem: Any => Any, removeItem: Any => Unit, setItem: (Any, Any) => Any): LocalStorage = {
        val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
        __obj.asInstanceOf[LocalStorage]
      }
      
      extension [Self <: LocalStorage](x: Self) {
        
        inline def setGetItem(value: Any => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
        
        inline def setRemoveItem(value: Any => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
        
        inline def setSetItem(value: (Any, Any) => Any): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
        
        inline def set_data(value: Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
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
      
      inline def apply(): LoginWithExternalServiceOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoginWithExternalServiceOptions]
      }
      
      extension [Self <: LoginWithExternalServiceOptions](x: Self) {
        
        inline def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
        
        inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
        
        inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
        
        inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
        
        inline def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
        
        inline def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
        
        inline def setLoginUrlParameters(value: js.Object): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
        
        inline def setLoginUrlParametersUndefined: Self = StObject.set(x, "loginUrlParameters", js.undefined)
        
        inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
        
        inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
        
        inline def setRequestOfflineToken(value: Boolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
        
        inline def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
        
        inline def setRequestPermissions(value: js.Array[String]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
        
        inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
        
        inline def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value*))
      }
    }
    
    /** Global props **/
    /** Settings **/
    trait Settings_
      extends StObject
         with /* id */ StringDictionary[Any] {
      
      var public: StringDictionary[Any]
    }
    object Settings_ {
      
      inline def apply(public: StringDictionary[Any]): Settings_ = {
        val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
        __obj.asInstanceOf[Settings_]
      }
      
      extension [Self <: Settings_](x: Self) {
        
        inline def setPublic(value: StringDictionary[Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      }
    }
    
    /** utils **/
    /** Pub/Sub **/
    trait SubscriptionHandle extends StObject {
      
      def ready(): Boolean
      
      def stop(): Unit
    }
    object SubscriptionHandle {
      
      inline def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
        val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[SubscriptionHandle]
      }
      
      extension [Self <: SubscriptionHandle](x: Self) {
        
        inline def setReady(value: () => Boolean): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
        
        inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    /** Settings **/
    /** User **/
    trait UserEmail extends StObject {
      
      var address: String
      
      var verified: Boolean
    }
    object UserEmail {
      
      inline def apply(address: String, verified: Boolean): UserEmail = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserEmail]
      }
      
      extension [Self <: UserEmail](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      }
    }
    
    trait User_ extends StObject {
      
      var _id: js.UndefOr[String] = js.undefined
      
      var createdAt: js.UndefOr[Double] = js.undefined
      
      var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
      
      var profile: js.UndefOr[Any] = js.undefined
      
      var services: js.UndefOr[Any] = js.undefined
      
      var username: js.UndefOr[String] = js.undefined
    }
    object User_ {
      
      inline def apply(): User_ = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User_]
      }
      
      extension [Self <: User_](x: Self) {
        
        inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
        
        inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
        
        inline def setEmails(value: js.Array[UserEmail]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
        
        inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
        
        inline def setEmailsVarargs(value: UserEmail*): Self = StObject.set(x, "emails", js.Array(value*))
        
        inline def setProfile(value: Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        inline def setServices(value: Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
        
        inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
        
        inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        
        inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      }
    }
  }
  
  trait Subscription extends StObject {
    
    def added(collection: String, id: String, fields: js.Object): Unit
    
    def changed(collection: String, id: String, fields: js.Object): Unit
    
    var connection: Connection
    
    def error(error: js.Error): Unit
    
    def onStop(func: js.Function): Unit
    
    def ready(): Unit
    
    def removed(collection: String, id: String): Unit
    
    def stop(): Unit
    
    var userId: String
  }
  object Subscription {
    
    inline def apply(
      added: (String, String, js.Object) => Unit,
      changed: (String, String, js.Object) => Unit,
      connection: Connection,
      error: js.Error => Unit,
      onStop: js.Function => Unit,
      ready: () => Unit,
      removed: (String, String) => Unit,
      stop: () => Unit,
      userId: String
    ): typings.meteorTypings.meteorMeteorMod.Subscription = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorTypings.meteorMeteorMod.Subscription]
    }
    
    extension [Self <: typings.meteorTypings.meteorMeteorMod.Subscription](x: Self) {
      
      inline def setAdded(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction3(value))
      
      inline def setChanged(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction3(value))
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setRemoved(value: (String, String) => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction2(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}

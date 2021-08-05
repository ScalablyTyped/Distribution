package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Accounts.LoginMethodOptions
import typings.meteor.Accounts.Password
import typings.meteor.Blaze.EventsMap
import typings.meteor.Blaze.HelpersMap
import typings.meteor.Blaze.TemplateInstance
import typings.meteor.Blaze.TemplateInstanceStatic
import typings.meteor.Blaze.View
import typings.meteor.Blaze.ViewStatic
import typings.meteor.DDP.DDPStatic
import typings.meteor.DDP.DDPStatus
import typings.meteor.DDPRateLimiter.Matcher
import typings.meteor.HTTP.AsyncCallback
import typings.meteor.HTTP.HTTPRequest
import typings.meteor.HTTP.HTTPResponse
import typings.meteor.Match.Pattern
import typings.meteor.Match.PatternMatch
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
import typings.meteor.Mongo.CollectionStatic
import typings.meteor.Mongo.Cursor
import typings.meteor.Mongo.CursorStatic
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.ObjectIDStatic
import typings.meteor.Tracker.Computation
import typings.meteor.Tracker.Dependency
import typings.meteor.Tracker.DependencyStatic
import typings.meteor.anon.Algorithm
import typings.meteor.anon.AmbiguousErrorMessages
import typings.meteor.anon.Auth
import typings.meteor.anon.Author
import typings.meteor.anon.Bcc
import typings.meteor.anon.Canonical
import typings.meteor.anon.Connection
import typings.meteor.anon.Cwd
import typings.meteor.anon.DebugOnly
import typings.meteor.anon.Email
import typings.meteor.anon.ForceApprovalPrompt
import typings.meteor.anon.IdGeneration
import typings.meteor.anon.Isauto
import typings.meteor.anon.KeyOrderSensitive
import typings.meteor.anon.LaunchExternal
import typings.meteor.anon.LoginStyle
import typings.meteor.anon.Logout
import typings.meteor.anon.Name
import typings.meteor.anon.OnError
import typings.meteor.anon.Profile
import typings.meteor.anon.ReturnStubValue
import typings.meteor.anon.Stop
import typings.meteor.anon.`0`
import typings.std.BooleanConstructor
import typings.std.Console
import typings.std.Error
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.Record
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accounts {
    
    @JSGlobal("Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEmail(userId: String, newEmail: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEmail(userId: String, newEmail: String, verified: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], verified.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *
      * Call a login method on the server.
      *
      * A login method is a method which on success calls `this.setUserId(id)` and
      * `Accounts._setLoginToken` on the server and returns an object with fields
      * 'id' (containing the user id), 'token' (containing a resume token), and
      * optionally `tokenExpires`.
      *
      * This function takes care of:
      * - Updating the Meteor.loggingIn() reactive data source
      * - Calling the method in 'wait' mode
      * - On success, saving the resume token to localStorage
      * - On success, calling Accounts.connection.setUserId()
      * - Setting up an onReconnect handler which logs in with
      *   the resume token
      *
      * Options:
      * - methodName: The method to call (default 'login')
      * - methodArguments: The arguments for the method
      * - validateResult: If provided, will be called with the result of the
      *   method. If it throws, the client will not be logged in (and
      *   its error will be passed to the callback).
      * - userCallback: Will be called with no arguments once the user is fully
      * logged in, or with the error on error.
      *
      * */
    inline def callLoginMethod(options: LoginMethodOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callLoginMethod")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def changePassword(oldPassword: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def changePassword(
      oldPassword: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *
      * Check whether the provided password matches the bcrypt'ed password in
      * the database user record. `password` can be a string (in which case
      * it will be run through SHA256 before bcrypt) or an object with
      * properties `digest` and `algorithm` (in which case we bcrypt
      * `password.digest`).
      */
    inline def checkPassword(user: User, password: Password): typings.meteor.anon.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("_checkPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.meteor.anon.Error]
    
    inline def config(options: AmbiguousErrorMessages): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createUser(options: Email): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def createUser(
      options: Email,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("Accounts.emailTemplates")
    @js.native
    def emailTemplates: EmailTemplates = js.native
    inline def emailTemplates_=(x: EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    inline def findUserByEmail(email: String): js.UndefOr[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[User | Null]]
    
    inline def findUserByUsername(username: String): js.UndefOr[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[User | Null]]
    
    inline def forgotPassword(options: `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def forgotPassword(
      options: `0`,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def hashPassword(password: String): Algorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("_hashPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Algorithm]
    
    inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    inline def loginServicesConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loginServicesConfigured")().asInstanceOf[Boolean]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onCreateUser(func: js.Function2[/* options */ Profile, /* user */ User, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCreateUser")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEmailVerificationLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEmailVerificationLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEnrollmentLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnrollmentLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onLogin(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def onLoginFailure(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoginFailure")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def onLogout(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onLogout(func: js.Function1[/* options */ Connection, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPageLoadLogin(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageLoadLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onResetPasswordLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResetPasswordLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *
      * The main entry point for auth packages to hook in to login.
      *
      * A login handler is a login method which can return `undefined` to
      * indicate that the login request is not handled by this handler.
      *
      * @param name {String} Optional.  The service name, used by default
      * if a specific service name isn't returned in the result.
      *
      * @param handler {Function} A function that receives an options object
      * (as passed as an argument to the `login` method) and returns one of:
      * - `undefined`, meaning don't handle;
      * - a login method result object
      **/
    inline def registerLoginHandler(name: String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoginHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resetPassword(token: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resetPassword(
      token: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendEnrollmentEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendResetPasswordEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendVerificationEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPassword(userId: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPassword(userId: String, newPassword: String, options: Logout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUsername(userId: String, newUsername: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(userId.asInstanceOf[js.Any], newUsername.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object ui {
      
      @JSGlobal("Accounts.ui")
      @js.native
      val ^ : js.Any = js.native
      
      inline def config(options: ForceApprovalPrompt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("Accounts.urls")
    @js.native
    def urls: URLS = js.native
    inline def urls_=(x: URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    inline def user(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User | Null]
    
    inline def userId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String | Null]
    
    inline def validateLoginAttempt(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoginAttempt")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def validateNewUser(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNewUser")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def verifyEmail(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def verifyEmail(
      token: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object App {
    
    @JSGlobal("App")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accessRule(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def accessRule(pattern: String, options: LaunchExternal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def configurePlugin(id: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configurePlugin")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def icons(icons: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("icons")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(options: Author): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def launchScreens(launchScreens: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("launchScreens")(launchScreens.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setPreference(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPreference(name: String, value: String, platform: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Assets {
    
    @JSGlobal("Assets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absoluteFilePath(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFilePath")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getBinary(assetPath: String): js.UndefOr[EJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EJSON]]
    inline def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[EJSON] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EJSON]]
    
    inline def getText(assetPath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  }
  
  object Blaze {
    
    @JSGlobal("Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Each(argFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def If(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def Let(bindings: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Let")(bindings.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.Template")
    @js.native
    def Template: typings.meteor.Blaze.TemplateStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.Template")
    @js.native
    class TemplateCls ()
      extends StObject
         with typings.meteor.Blaze.Template {
      def this(viewName: String) = this()
      def this(viewName: String, renderFunction: js.Function) = this()
      def this(viewName: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      @JSName("$")
      var $: js.Any = js.native
      
      /* CompleteClass */
      override def constructView(): View = js.native
      
      /* CompleteClass */
      var created: js.Function = js.native
      
      /* CompleteClass */
      var destroyed: js.Function = js.native
      
      /* CompleteClass */
      override def events(eventsMap: EventsMap): Unit = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var head: typings.meteor.Blaze.Template = js.native
      
      /* CompleteClass */
      override def helpers(helpersMap: HelpersMap): Unit = js.native
      
      /* CompleteClass */
      override def onCreated(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onDestroyed(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onRendered(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      var renderFunction: js.Function = js.native
      
      /* CompleteClass */
      var rendered: js.Function = js.native
      
      /* CompleteClass */
      var viewName: String = js.native
    }
    
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    def TemplateInstance: TemplateInstanceStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    class TemplateInstanceCls protected ()
      extends StObject
         with TemplateInstance {
      def this(view: View) = this()
      
      /* CompleteClass */
      @JSName("$")
      override def $(selector: String): js.Any = js.native
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      var data: Record[String, js.Any] = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var firstNode: js.Object = js.native
      
      /* CompleteClass */
      var lastNode: js.Object = js.native
      
      /* CompleteClass */
      override def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
      
      /* CompleteClass */
      override def subscriptionsReady(): Boolean = js.native
      
      /* CompleteClass */
      var view: js.Object = js.native
    }
    
    inline def TemplateInstance_=(x: TemplateInstanceStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateInstance")(x.asInstanceOf[js.Any])
    
    inline def Template_=(x: typings.meteor.Blaze.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
    
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.View")
    @js.native
    def View: ViewStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.View")
    @js.native
    class ViewCls ()
      extends StObject
         with View {
      def this(name: String) = this()
      def this(name: String, renderFunction: js.Function) = this()
      def this(name: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      override def firstNode(): Node = js.native
      
      /* CompleteClass */
      var isCreated: Boolean = js.native
      
      /* CompleteClass */
      var isDestroyed: Boolean = js.native
      
      /* CompleteClass */
      var isRendered: Boolean = js.native
      
      /* CompleteClass */
      override def lastNode(): Node = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override def onViewCreated(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewDestroyed(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewReady(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      var parentView: View = js.native
      
      /* CompleteClass */
      var renderCount: Double = js.native
      
      /* CompleteClass */
      var template: typings.meteor.Blaze.Template = js.native
      
      /* CompleteClass */
      override def templateInstance(): TemplateInstance = js.native
    }
    
    inline def View_=(x: ViewStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    inline def With(data: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def With(data: js.Object, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.currentView")
    @js.native
    def currentView: View = js.native
    inline def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
    
    inline def getData(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Object]
    inline def getData(elementOrView: View): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def getData(elementOrView: HTMLElement): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def getView(): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")().asInstanceOf[View]
    inline def getView(element: HTMLElement): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")(element.asInstanceOf[js.Any]).asInstanceOf[View]
    
    inline def isTemplate(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def remove(renderedView: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(renderedView.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def toHTML(templateOrView: typings.meteor.Blaze.Template): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHTML(templateOrView: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHTMLWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object BrowserPolicy {
    
    object content {
      
      @JSGlobal("BrowserPolicy.content")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowAllContentDataUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentDataUrl")().asInstanceOf[Unit]
      
      inline def allowAllContentOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentOrigin")().asInstanceOf[Unit]
      
      inline def allowAllContentSameOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentSameOrigin")().asInstanceOf[Unit]
      
      inline def allowConnectOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowConnectOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowContentTypeSniffing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowContentTypeSniffing")().asInstanceOf[Unit]
      
      inline def allowDataUrlForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDataUrlForAll")().asInstanceOf[Unit]
      
      inline def allowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowEval")().asInstanceOf[Unit]
      
      inline def allowFontOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFontOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowFrameAncestorsOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameAncestorsOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowFrameOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowImageOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowImageOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineScripts")().asInstanceOf[Unit]
      
      inline def allowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineStyles")().asInstanceOf[Unit]
      
      inline def allowMediaOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowMediaOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowObjectOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowObjectOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowOriginForAll(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowOriginForAll")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowSameOriginForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSameOriginForAll")().asInstanceOf[Unit]
      
      inline def allowScriptOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowScriptOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowStyleOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStyleOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def disallowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAll")().asInstanceOf[Unit]
      
      inline def disallowAllContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAllContent")().asInstanceOf[Unit]
      
      inline def disallowConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowConnect")().asInstanceOf[Unit]
      
      inline def disallowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowEval")().asInstanceOf[Unit]
      
      inline def disallowFont(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowFont")().asInstanceOf[Unit]
      
      inline def disallowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineScripts")().asInstanceOf[Unit]
      
      inline def disallowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineStyles")().asInstanceOf[Unit]
      
      inline def disallowObject(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowObject")().asInstanceOf[Unit]
    }
    
    object framing {
      
      @JSGlobal("BrowserPolicy.framing")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAll")().asInstanceOf[Unit]
      
      inline def disallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")().asInstanceOf[Unit]
      
      inline def restrictToOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictToOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
  
  object Cordova {
    
    @JSGlobal("Cordova")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object DDP {
    
    @JSGlobal("DDP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allSubscriptionsReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSubscriptionsReady")().asInstanceOf[Boolean]
    
    inline def connect(url: String): DDPStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[DDPStatic]
  }
  
  object DDPRateLimiter {
    
    @JSGlobal("DDPRateLimiter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(matcher.asInstanceOf[js.Any], numRequests.asInstanceOf[js.Any], timeInterval.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def removeRule(ruleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRule")(ruleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object EJSON {
    
    @JSGlobal("EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON, options: KeyOrderSensitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromJSONValue(`val`: JSONable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def isBinary(x: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("EJSON.newBinary")
    @js.native
    def newBinary: js.Any = js.native
    inline def newBinary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newBinary")(x.asInstanceOf[js.Any])
    
    inline def parse(str: String): typings.meteor.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.EJSON]
    
    inline def stringify(`val`: typings.meteor.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`val`: typings.meteor.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSONValue(`val`: typings.meteor.EJSON): JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[JSONable]
  }
  
  object Email {
    
    @JSGlobal("Email")
    @js.native
    val ^ : js.Any = js.native
    
    inline def send(options: Bcc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object HTTP {
    
    @JSGlobal("HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def call(method: String, url: String): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def del(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def get(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def post(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def put(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: Unit, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MailComposer")
  @js.native
  class MailComposer protected ()
    extends StObject
       with typings.meteor.MailComposer {
    def this(options: MailComposerOptions) = this()
    
    /* CompleteClass */
    override def addHeader(name: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def pipe(stream: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
    
    /* CompleteClass */
    override def streamMessage(): Unit = js.native
  }
  @JSGlobal("MailComposer")
  @js.native
  def MailComposer: MailComposerStatic = js.native
  inline def MailComposer_=(x: MailComposerStatic): Unit = js.Dynamic.global.updateDynamic("MailComposer")(x.asInstanceOf[js.Any])
  
  object Match {
    
    @JSGlobal("Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Match.Any")
    @js.native
    def Any: typings.meteor.Match.Matcher[js.Any] = js.native
    inline def Any_=(x: typings.meteor.Match.Matcher[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Match.Integer")
    @js.native
    def Integer: typings.meteor.Match.Matcher[Double] = js.native
    inline def Integer_=(x: typings.meteor.Match.Matcher[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    inline def Maybe(pattern: String): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String] | Null]]]
    inline def Maybe(pattern: Boolean): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean] | Null]]]
    inline def Maybe(pattern: Double): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double] | Null]]]
    inline def Maybe(pattern: Null): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null] | Null]]]
    inline def Maybe(pattern: Unit): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Unit] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Unit] | Null]]]
    inline def Maybe(pattern: BooleanConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]]]
    inline def Maybe(pattern: FunctionConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]]]
    inline def Maybe(pattern: NumberConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]]]
    inline def Maybe(pattern: ObjectConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]]]
    inline def Maybe(pattern: StringConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]]]
    inline def Maybe[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[js.Any] */](pattern: T): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T] | Null]]]
    
    inline def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): typings.meteor.Match.Matcher[PatternMatch[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[PatternMatch[T]]]
    
    inline def OneOf[T /* <: js.Array[Pattern] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
    ): typings.meteor.Match.Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ]]
    
    inline def Optional(pattern: String): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String]]]]
    inline def Optional(pattern: Boolean): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean]]]]
    inline def Optional(pattern: Double): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double]]]]
    inline def Optional(pattern: Null): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null]]]]
    inline def Optional(pattern: Unit): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Unit]]]]
    inline def Optional(pattern: BooleanConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]]]
    inline def Optional(pattern: FunctionConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]]]
    inline def Optional(pattern: NumberConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor]]]]
    inline def Optional(pattern: ObjectConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]]]
    inline def Optional(pattern: StringConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor]]]]
    inline def Optional[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[js.Any] */](pattern: T): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T]]]]
    
    inline def Where(condition: js.Function1[/* val */ js.Any, Boolean]): typings.meteor.Match.Matcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.Match.Matcher[js.Any]]
    
    inline def test(value: js.Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<string> */ Boolean]
    inline def test(value: js.Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<boolean> */ Boolean]
    inline def test(value: js.Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<number> */ Boolean]
    inline def test(value: js.Any, pattern: Null): /* is meteor.Match.PatternMatch<null> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<null> */ Boolean]
    inline def test(value: js.Any, pattern: Unit): /* is meteor.Match.PatternMatch<undefined> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<undefined> */ Boolean]
    inline def test(value: js.Any, pattern: BooleanConstructor): /* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: FunctionConstructor): /* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: NumberConstructor): /* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: ObjectConstructor): /* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: StringConstructor): /* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean]
    inline def test[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[js.Any] */](value: js.Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.Match.PatternMatch<T> */ Boolean]
  }
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.EnvironmentVariable")
    @js.native
    class EnvironmentVariable[T] ()
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
    @JSGlobal("Meteor.Error")
    @js.native
    def Error: ErrorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Meteor.Error")
    @js.native
    class ErrorCls protected ()
      extends StObject
         with typings.meteor.Meteor.Error {
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
      
      /* CompleteClass */
      var message: String = js.native
      
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
    class TypedErrorCls protected ()
      extends StObject
         with TypedError {
      def this(message: String, errorType: String) = this()
      
      /* CompleteClass */
      var errorType: String = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    inline def TypedError_=(x: TypedErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypedError")(x.asInstanceOf[js.Any])
    
    /** Method **/
    /** Url **/
    object absoluteUrl {
      
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
    
    inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
      name: String,
      args: js.Array[EJSONable | EJSONableProperty],
      options: Unit,
      asyncCallback: js.Function2[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
          /* result */ js.UndefOr[Result], 
          Unit
        ]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: ReturnStubValue[Result]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
      name: String,
      args: js.Array[EJSONable | EJSONableProperty],
      options: ReturnStubValue[Result],
      asyncCallback: js.Function2[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
          /* result */ js.UndefOr[Result], 
          Unit
        ]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def bindEnvironment[TFunc /* <: js.Function */](func: TFunc): TFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[TFunc]
    
    inline def call(name: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def clearInterval(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def debug(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def defer(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
    
    /** Global props **/
    @JSGlobal("Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    inline def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isCordova")
    @js.native
    def isCordova: Boolean = js.native
    inline def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
    
    /** Global props **/
    @JSGlobal("Meteor.isDevelopment")
    @js.native
    def isDevelopment: Boolean = js.native
    inline def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isProduction")
    @js.native
    def isProduction: Boolean = js.native
    inline def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
    
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
    inline def loginWith[ExternalService](
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: LoginStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWith[ExternalService](
      options: LoginStyle,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithFacebook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[Unit]
    inline def loginWithFacebook(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithFacebook(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGithub(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[Unit]
    inline def loginWithGithub(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGithub(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGoogle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[Unit]
    inline def loginWithGoogle(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGoogle(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[Unit]
    inline def loginWithMeetup(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeetup(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeteorDeveloperAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithPassword(user: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(
      user: String,
      password: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(
      user: js.Object,
      password: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithToken(
      token: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithTwitter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[Unit]
    inline def loginWithTwitter(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithTwitter(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithWeibo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[Unit]
    inline def loginWithWeibo(
      options: Unit,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithWeibo(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def methods(
      methods: StringDictionary[js.ThisFunction1[/* this */ MethodThisType, /* repeated */ js.Any, js.Any]]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onConnection(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    inline def publish(name: String, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def publish(
      name: String,
      func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
      options: Isauto
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def publish(name: Null, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def publish(
      name: Null,
      func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
      options: Isauto
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Event **/
    /** Connection **/
    inline def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
    
    @JSGlobal("Meteor.release")
    @js.native
    def release: String = js.native
    inline def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
    
    /** Url **/
    /** Timeout **/
    inline def setInterval(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setTimeout(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSGlobal("Meteor.settings")
    @js.native
    def settings: Settings = js.native
    inline def settings_=(x: Settings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
    
    /** Timeout **/
    /** utils **/
    inline def startup(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    /** Status **/
    inline def status(): DDPStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[DDPStatus]
    
    /** Status **/
    /** Pub/Sub **/
    inline def subscribe(name: String, args: js.Any*): SubscriptionHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SubscriptionHandle]
    
    inline def user(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User | Null]
    
    inline def userId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String | Null]
    
    @JSGlobal("Meteor.users")
    @js.native
    def users: Collection[User, User] = js.native
    inline def users_=(x: Collection[User, User]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
    
    inline def wrapAsync(func: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def wrapAsync(func: js.Function, context: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object Mongo {
    
    @JSGlobal("Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Mongo.Collection")
    @js.native
    def Collection: CollectionStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Collection")
    @js.native
    class CollectionCls[T, U] ()
      extends StObject
         with Collection[T, U] {
      def this(name: String) = this()
      def this(name: String, options: IdGeneration[T, U]) = this()
      def this(name: Null, options: IdGeneration[T, U]) = this()
    }
    
    inline def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Cursor")
    @js.native
    class CursorCls[T, U] ()
      extends StObject
         with Cursor[T, U]
    
    inline def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.ObjectID")
    @js.native
    def ObjectID: ObjectIDStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.ObjectID")
    @js.native
    class ObjectIDCls ()
      extends StObject
         with ObjectID {
      def this(hexString: String) = this()
      
      /* CompleteClass */
      override def equals(otherID: ObjectID): Boolean = js.native
      
      /* CompleteClass */
      override def toHexString(): String = js.native
    }
    
    inline def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
    
    inline def setConnectionOptions(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnectionOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Npm {
    
    @JSGlobal("Npm")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def require(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object Package {
    
    @JSGlobal("Package")
    @js.native
    val ^ : js.Any = js.native
    
    inline def describe(options: DebugOnly): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTest")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUse")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerBuildPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")().asInstanceOf[Unit]
    inline def registerBuildPlugin(options: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Random {
    
    @JSGlobal("Random")
    @js.native
    val ^ : js.Any = js.native
    
    // @param array, @return a random element in array
    inline def choice(array: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(array.asInstanceOf[js.Any]).asInstanceOf[String]
    // @param str, @return a random char in str
    inline def choice(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fraction(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fraction")().asInstanceOf[Double]
    
    // @param numberOfDigits, @returns a random hex string of the given length
    inline def hexString(numberOfDigits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexString")(numberOfDigits.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def id(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[String]
    inline def id(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def secret(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")().asInstanceOf[String]
    inline def secret(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReactiveDict")
  @js.native
  class ReactiveDict ()
    extends StObject
       with typings.meteor.ReactiveDict {
    def this(name: String) = this()
    def this(name: String, initialValue: EJSONable) = this()
    def this(name: Unit, initialValue: EJSONable) = this()
  }
  @JSGlobal("ReactiveDict")
  @js.native
  def ReactiveDict: ReactiveDictStatic = js.native
  inline def ReactiveDict_=(x: ReactiveDictStatic): Unit = js.Dynamic.global.updateDynamic("ReactiveDict")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReactiveVar")
  @js.native
  class ReactiveVar[T] protected ()
    extends StObject
       with typings.meteor.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function) = this()
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def set(newValue: T): Unit = js.native
  }
  @JSGlobal("ReactiveVar")
  @js.native
  def ReactiveVar: ReactiveVarStatic = js.native
  inline def ReactiveVar_=(x: ReactiveVarStatic): Unit = js.Dynamic.global.updateDynamic("ReactiveVar")(x.asInstanceOf[js.Any])
  
  object Session {
    
    @JSGlobal("Session")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals_(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def get(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def set(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDefault(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDefault(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Template")
  @js.native
  class Template ()
    extends StObject
       with typings.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    def this(viewName: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: js.Any = js.native
    
    /* CompleteClass */
    override def constructView(): View = js.native
    
    /* CompleteClass */
    var created: js.Function = js.native
    
    /* CompleteClass */
    var destroyed: js.Function = js.native
    
    /* CompleteClass */
    override def events(eventsMap: EventsMap): Unit = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var head: typings.meteor.Blaze.Template = js.native
    
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    
    /* CompleteClass */
    override def onCreated(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onDestroyed(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onRendered(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    var renderFunction: js.Function = js.native
    
    /* CompleteClass */
    var rendered: js.Function = js.native
    
    /* CompleteClass */
    var viewName: String = js.native
  }
  @JSGlobal("Template")
  @js.native
  def Template: TemplateStatic = js.native
  inline def Template_=(x: TemplateStatic): Unit = js.Dynamic.global.updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  object Tinytest {
    
    @JSGlobal("Tinytest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAsync")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Tracker {
    
    @JSGlobal("Tracker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Computation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Computation")().asInstanceOf[Unit]
    
    @JSGlobal("Tracker.Dependency")
    @js.native
    def Dependency: DependencyStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Tracker.Dependency")
    @js.native
    class DependencyCls ()
      extends StObject
         with Dependency
    
    inline def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Tracker.active")
    @js.native
    def active: Boolean = js.native
    inline def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    inline def afterFlush(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFlush")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any]).asInstanceOf[Computation]
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computation]
    
    @JSGlobal("Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    inline def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def nonreactive[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nonreactive")(func.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def onInvalidate(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvalidate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def check(value: js.Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Null): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Unit): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: BooleanConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: FunctionConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: NumberConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: ObjectConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: StringConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean]
  inline def check[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[js.Any] */](value: js.Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean]
  
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  inline def execFileAsync(command: String): js.Any = js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def execFileAsync(command: String, args: js.Array[js.Any]): js.Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def execFileAsync(command: String, args: js.Array[js.Any], options: Cwd): js.Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def execFileAsync(command: String, args: Unit, options: Cwd): js.Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def execFileSync(command: String): String = js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[js.Any]): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[js.Any], options: Cwd): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: Unit, options: Cwd): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}

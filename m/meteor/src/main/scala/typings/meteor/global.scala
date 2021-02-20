package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Accounts.LoginMethodOptions
import typings.meteor.Accounts.Password
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
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accounts {
    
    @JSGlobal("Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Accounts.addEmail")
    @js.native
    def addEmail(userId: String, newEmail: String): Unit = js.native
    @JSGlobal("Accounts.addEmail")
    @js.native
    def addEmail(userId: String, newEmail: String, verified: Boolean): Unit = js.native
    
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
    @JSGlobal("Accounts.callLoginMethod")
    @js.native
    def callLoginMethod(options: LoginMethodOptions): Unit = js.native
    
    @JSGlobal("Accounts.changePassword")
    @js.native
    def changePassword(oldPassword: String, newPassword: String): Unit = js.native
    @JSGlobal("Accounts.changePassword")
    @js.native
    def changePassword(
      oldPassword: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    /**
      *
      * Check whether the provided password matches the bcrypt'ed password in
      * the database user record. `password` can be a string (in which case
      * it will be run through SHA256 before bcrypt) or an object with
      * properties `digest` and `algorithm` (in which case we bcrypt
      * `password.digest`).
      */
    @JSGlobal("Accounts._checkPassword")
    @js.native
    def checkPassword(user: User, password: Password): typings.meteor.anon.Error = js.native
    
    @JSGlobal("Accounts.config")
    @js.native
    def config(options: AmbiguousErrorMessages): Unit = js.native
    
    @JSGlobal("Accounts.createUser")
    @js.native
    def createUser(options: Email): String = js.native
    @JSGlobal("Accounts.createUser")
    @js.native
    def createUser(
      options: Email,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): String = js.native
    
    @JSGlobal("Accounts.emailTemplates")
    @js.native
    def emailTemplates: EmailTemplates = js.native
    @scala.inline
    def emailTemplates_=(x: EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Accounts.findUserByEmail")
    @js.native
    def findUserByEmail(email: String): js.UndefOr[User | Null] = js.native
    
    @JSGlobal("Accounts.findUserByUsername")
    @js.native
    def findUserByUsername(username: String): js.UndefOr[User | Null] = js.native
    
    @JSGlobal("Accounts.forgotPassword")
    @js.native
    def forgotPassword(options: `0`): Unit = js.native
    @JSGlobal("Accounts.forgotPassword")
    @js.native
    def forgotPassword(
      options: `0`,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSGlobal("Accounts._hashPassword")
    @js.native
    def hashPassword(password: String): Algorithm = js.native
    
    @JSGlobal("Accounts.loggingIn")
    @js.native
    def loggingIn(): Boolean = js.native
    
    @JSGlobal("Accounts.loginServicesConfigured")
    @js.native
    def loginServicesConfigured(): Boolean = js.native
    
    @JSGlobal("Accounts.logout")
    @js.native
    def logout(): Unit = js.native
    @JSGlobal("Accounts.logout")
    @js.native
    def logout(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSGlobal("Accounts.logoutOtherClients")
    @js.native
    def logoutOtherClients(): Unit = js.native
    @JSGlobal("Accounts.logoutOtherClients")
    @js.native
    def logoutOtherClients(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSGlobal("Accounts.onCreateUser")
    @js.native
    def onCreateUser(func: js.Function2[/* options */ Profile, /* user */ User, Unit]): Unit = js.native
    
    @JSGlobal("Accounts.onEmailVerificationLink")
    @js.native
    def onEmailVerificationLink(callback: js.Function): Unit = js.native
    
    @JSGlobal("Accounts.onEnrollmentLink")
    @js.native
    def onEnrollmentLink(callback: js.Function): Unit = js.native
    
    @JSGlobal("Accounts.onLogin")
    @js.native
    def onLogin(func: js.Function): Stop = js.native
    
    @JSGlobal("Accounts.onLoginFailure")
    @js.native
    def onLoginFailure(func: js.Function): Stop = js.native
    
    @JSGlobal("Accounts.onLogout")
    @js.native
    def onLogout(func: js.Function): Unit = js.native
    @JSGlobal("Accounts.onLogout")
    @js.native
    def onLogout(func: js.Function1[/* options */ Connection, Unit]): Unit = js.native
    
    @JSGlobal("Accounts.onPageLoadLogin")
    @js.native
    def onPageLoadLogin(func: js.Function): Unit = js.native
    
    @JSGlobal("Accounts.onResetPasswordLink")
    @js.native
    def onResetPasswordLink(callback: js.Function): Unit = js.native
    
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
    @JSGlobal("Accounts.registerLoginHandler")
    @js.native
    def registerLoginHandler(name: String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): Unit = js.native
    
    @JSGlobal("Accounts.removeEmail")
    @js.native
    def removeEmail(userId: String, email: String): Unit = js.native
    
    @JSGlobal("Accounts.resetPassword")
    @js.native
    def resetPassword(token: String, newPassword: String): Unit = js.native
    @JSGlobal("Accounts.resetPassword")
    @js.native
    def resetPassword(
      token: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSGlobal("Accounts.sendEnrollmentEmail")
    @js.native
    def sendEnrollmentEmail(userId: String): Unit = js.native
    @JSGlobal("Accounts.sendEnrollmentEmail")
    @js.native
    def sendEnrollmentEmail(userId: String, email: String): Unit = js.native
    
    @JSGlobal("Accounts.sendResetPasswordEmail")
    @js.native
    def sendResetPasswordEmail(userId: String): Unit = js.native
    @JSGlobal("Accounts.sendResetPasswordEmail")
    @js.native
    def sendResetPasswordEmail(userId: String, email: String): Unit = js.native
    
    @JSGlobal("Accounts.sendVerificationEmail")
    @js.native
    def sendVerificationEmail(userId: String): Unit = js.native
    @JSGlobal("Accounts.sendVerificationEmail")
    @js.native
    def sendVerificationEmail(userId: String, email: String): Unit = js.native
    
    @JSGlobal("Accounts.setPassword")
    @js.native
    def setPassword(userId: String, newPassword: String): Unit = js.native
    @JSGlobal("Accounts.setPassword")
    @js.native
    def setPassword(userId: String, newPassword: String, options: Logout): Unit = js.native
    
    @JSGlobal("Accounts.setUsername")
    @js.native
    def setUsername(userId: String, newUsername: String): Unit = js.native
    
    object ui {
      
      @JSGlobal("Accounts.ui.config")
      @js.native
      def config(options: ForceApprovalPrompt): Unit = js.native
    }
    
    @JSGlobal("Accounts.urls")
    @js.native
    def urls: URLS = js.native
    @scala.inline
    def urls_=(x: URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Accounts.user")
    @js.native
    def user(): User | Null = js.native
    
    @JSGlobal("Accounts.userId")
    @js.native
    def userId(): String | Null = js.native
    
    @JSGlobal("Accounts.validateLoginAttempt")
    @js.native
    def validateLoginAttempt(func: js.Function): Stop = js.native
    
    @JSGlobal("Accounts.validateNewUser")
    @js.native
    def validateNewUser(func: js.Function): Boolean = js.native
    
    @JSGlobal("Accounts.verifyEmail")
    @js.native
    def verifyEmail(token: String): Unit = js.native
    @JSGlobal("Accounts.verifyEmail")
    @js.native
    def verifyEmail(
      token: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
  }
  
  object App {
    
    @JSGlobal("App.accessRule")
    @js.native
    def accessRule(pattern: String): Unit = js.native
    @JSGlobal("App.accessRule")
    @js.native
    def accessRule(pattern: String, options: LaunchExternal): Unit = js.native
    
    @JSGlobal("App.configurePlugin")
    @js.native
    def configurePlugin(id: String, config: js.Object): Unit = js.native
    
    @JSGlobal("App.icons")
    @js.native
    def icons(icons: js.Object): Unit = js.native
    
    @JSGlobal("App.info")
    @js.native
    def info(options: Author): Unit = js.native
    
    @JSGlobal("App.launchScreens")
    @js.native
    def launchScreens(launchScreens: js.Object): Unit = js.native
    
    @JSGlobal("App.setPreference")
    @js.native
    def setPreference(name: String, value: String): Unit = js.native
    @JSGlobal("App.setPreference")
    @js.native
    def setPreference(name: String, value: String, platform: String): Unit = js.native
  }
  
  object Assets {
    
    @JSGlobal("Assets.absoluteFilePath")
    @js.native
    def absoluteFilePath(assetPath: String): String = js.native
    
    @JSGlobal("Assets.getBinary")
    @js.native
    def getBinary(assetPath: String): js.UndefOr[EJSON] = js.native
    @JSGlobal("Assets.getBinary")
    @js.native
    def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[EJSON] = js.native
    
    @JSGlobal("Assets.getText")
    @js.native
    def getText(assetPath: String): js.UndefOr[String] = js.native
    @JSGlobal("Assets.getText")
    @js.native
    def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = js.native
  }
  
  object Blaze {
    
    @JSGlobal("Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Blaze.Each")
    @js.native
    def Each(argFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSGlobal("Blaze.Each")
    @js.native
    def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @JSGlobal("Blaze.If")
    @js.native
    def If(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSGlobal("Blaze.If")
    @js.native
    def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @JSGlobal("Blaze.Let")
    @js.native
    def Let(bindings: js.Function, contentFunc: js.Function): View = js.native
    
    @JSGlobal("Blaze.Template")
    @js.native
    def Template: typings.meteor.Blaze.TemplateStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.Template")
    @js.native
    class TemplateCls ()
      extends typings.meteor.Blaze.Template {
      def this(viewName: String) = this()
      def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
      def this(viewName: String, renderFunction: js.Function) = this()
    }
    
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    def TemplateInstance: TemplateInstanceStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    class TemplateInstanceCls protected () extends TemplateInstance {
      def this(view: View) = this()
    }
    
    @scala.inline
    def TemplateInstance_=(x: TemplateInstanceStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateInstance")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Template_=(x: typings.meteor.Blaze.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Blaze.Unless")
    @js.native
    def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
    @JSGlobal("Blaze.Unless")
    @js.native
    def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
    
    @JSGlobal("Blaze.View")
    @js.native
    def View: ViewStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.View")
    @js.native
    class ViewCls () extends View {
      def this(name: String) = this()
      def this(name: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
      def this(name: String, renderFunction: js.Function) = this()
    }
    
    @scala.inline
    def View_=(x: ViewStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Blaze.With")
    @js.native
    def With(data: js.Function, contentFunc: js.Function): View = js.native
    @JSGlobal("Blaze.With")
    @js.native
    def With(data: js.Object, contentFunc: js.Function): View = js.native
    
    @JSGlobal("Blaze.currentView")
    @js.native
    def currentView: View = js.native
    @scala.inline
    def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Blaze.getData")
    @js.native
    def getData(): js.Object = js.native
    @JSGlobal("Blaze.getData")
    @js.native
    def getData(elementOrView: View): js.Object = js.native
    @JSGlobal("Blaze.getData")
    @js.native
    def getData(elementOrView: HTMLElement): js.Object = js.native
    
    @JSGlobal("Blaze.getView")
    @js.native
    def getView(): View = js.native
    @JSGlobal("Blaze.getView")
    @js.native
    def getView(element: HTMLElement): View = js.native
    
    @JSGlobal("Blaze.isTemplate")
    @js.native
    def isTemplate(value: js.Any): Boolean = js.native
    
    @JSGlobal("Blaze.remove")
    @js.native
    def remove(renderedView: View): Unit = js.native
    
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(
      templateOrView: typings.meteor.Blaze.Template,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: typings.meteor.Blaze.Template, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: js.UndefOr[scala.Nothing], parentView: View): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.render")
    @js.native
    def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function, parentNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object, parentNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: typings.meteor.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: View,
      data: js.Function,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(
      templateOrView: View,
      data: js.Object,
      parentNode: Node,
      nextNode: js.UndefOr[scala.Nothing],
      parentView: View
    ): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
    @JSGlobal("Blaze.renderWithData")
    @js.native
    def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = js.native
    
    @JSGlobal("Blaze.toHTML")
    @js.native
    def toHTML(templateOrView: typings.meteor.Blaze.Template): String = js.native
    @JSGlobal("Blaze.toHTML")
    @js.native
    def toHTML(templateOrView: View): String = js.native
    
    @JSGlobal("Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Function): String = js.native
    @JSGlobal("Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: typings.meteor.Blaze.Template, data: js.Object): String = js.native
    @JSGlobal("Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: View, data: js.Function): String = js.native
    @JSGlobal("Blaze.toHTMLWithData")
    @js.native
    def toHTMLWithData(templateOrView: View, data: js.Object): String = js.native
  }
  
  object BrowserPolicy {
    
    object content {
      
      @JSGlobal("BrowserPolicy.content.allowAllContentDataUrl")
      @js.native
      def allowAllContentDataUrl(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowAllContentOrigin")
      @js.native
      def allowAllContentOrigin(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowAllContentSameOrigin")
      @js.native
      def allowAllContentSameOrigin(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowConnectOrigin")
      @js.native
      def allowConnectOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowContentTypeSniffing")
      @js.native
      def allowContentTypeSniffing(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowDataUrlForAll")
      @js.native
      def allowDataUrlForAll(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowEval")
      @js.native
      def allowEval(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowFontOrigin")
      @js.native
      def allowFontOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowFrameAncestorsOrigin")
      @js.native
      def allowFrameAncestorsOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowFrameOrigin")
      @js.native
      def allowFrameOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowImageOrigin")
      @js.native
      def allowImageOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowInlineScripts")
      @js.native
      def allowInlineScripts(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowInlineStyles")
      @js.native
      def allowInlineStyles(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowMediaOrigin")
      @js.native
      def allowMediaOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowObjectOrigin")
      @js.native
      def allowObjectOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowOriginForAll")
      @js.native
      def allowOriginForAll(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowSameOriginForAll")
      @js.native
      def allowSameOriginForAll(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowScriptOrigin")
      @js.native
      def allowScriptOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.allowStyleOrigin")
      @js.native
      def allowStyleOrigin(origin: String): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowAll")
      @js.native
      def disallowAll(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowAllContent")
      @js.native
      def disallowAllContent(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowConnect")
      @js.native
      def disallowConnect(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowEval")
      @js.native
      def disallowEval(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowFont")
      @js.native
      def disallowFont(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowInlineScripts")
      @js.native
      def disallowInlineScripts(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowInlineStyles")
      @js.native
      def disallowInlineStyles(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.content.disallowObject")
      @js.native
      def disallowObject(): Unit = js.native
    }
    
    object framing {
      
      @JSGlobal("BrowserPolicy.framing.allowAll")
      @js.native
      def allowAll(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.framing.disallow")
      @js.native
      def disallow(): Unit = js.native
      
      @JSGlobal("BrowserPolicy.framing.restrictToOrigin")
      @js.native
      def restrictToOrigin(origin: String): Unit = js.native
    }
  }
  
  object Cordova {
    
    @JSGlobal("Cordova.depends")
    @js.native
    def depends(dependencies: StringDictionary[String]): Unit = js.native
  }
  
  object DDP {
    
    @JSGlobal("DDP._allSubscriptionsReady")
    @js.native
    def allSubscriptionsReady(): Boolean = js.native
    
    @JSGlobal("DDP.connect")
    @js.native
    def connect(url: String): DDPStatic = js.native
  }
  
  object DDPRateLimiter {
    
    @JSGlobal("DDPRateLimiter.addRule")
    @js.native
    def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
    
    @JSGlobal("DDPRateLimiter.removeRule")
    @js.native
    def removeRule(ruleId: String): Boolean = js.native
  }
  
  object EJSON {
    
    @JSGlobal("EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("EJSON.addType")
    @js.native
    def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = js.native
    
    @JSGlobal("EJSON.clone")
    @js.native
    def clone_[T](`val`: T): T = js.native
    
    @JSGlobal("EJSON.equals")
    @js.native
    def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON): Boolean = js.native
    @JSGlobal("EJSON.equals")
    @js.native
    def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON, options: KeyOrderSensitive): Boolean = js.native
    
    @JSGlobal("EJSON.fromJSONValue")
    @js.native
    def fromJSONValue(`val`: JSONable): js.Any = js.native
    
    @JSGlobal("EJSON.isBinary")
    @js.native
    def isBinary(x: js.Object): Boolean = js.native
    
    @JSGlobal("EJSON.newBinary")
    @js.native
    def newBinary: js.Any = js.native
    @scala.inline
    def newBinary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newBinary")(x.asInstanceOf[js.Any])
    
    @JSGlobal("EJSON.parse")
    @js.native
    def parse(str: String): typings.meteor.EJSON = js.native
    
    @JSGlobal("EJSON.stringify")
    @js.native
    def stringify(`val`: typings.meteor.EJSON): String = js.native
    @JSGlobal("EJSON.stringify")
    @js.native
    def stringify(`val`: typings.meteor.EJSON, options: Canonical): String = js.native
    
    @JSGlobal("EJSON.toJSONValue")
    @js.native
    def toJSONValue(`val`: typings.meteor.EJSON): JSONable = js.native
  }
  
  object Email {
    
    @JSGlobal("Email.send")
    @js.native
    def send(options: Bcc): Unit = js.native
  }
  
  object HTTP {
    
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String): HTTPResponse = js.native
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String, options: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String, options: Auth): HTTPResponse = js.native
    @JSGlobal("HTTP.call")
    @js.native
    def call(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSGlobal("HTTP.del")
    @js.native
    def del(url: String): HTTPResponse = js.native
    @JSGlobal("HTTP.del")
    @js.native
    def del(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.del")
    @js.native
    def del(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSGlobal("HTTP.del")
    @js.native
    def del(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSGlobal("HTTP.get")
    @js.native
    def get(url: String): HTTPResponse = js.native
    @JSGlobal("HTTP.get")
    @js.native
    def get(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.get")
    @js.native
    def get(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSGlobal("HTTP.get")
    @js.native
    def get(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSGlobal("HTTP.post")
    @js.native
    def post(url: String): HTTPResponse = js.native
    @JSGlobal("HTTP.post")
    @js.native
    def post(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.post")
    @js.native
    def post(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSGlobal("HTTP.post")
    @js.native
    def post(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
    
    @JSGlobal("HTTP.put")
    @js.native
    def put(url: String): HTTPResponse = js.native
    @JSGlobal("HTTP.put")
    @js.native
    def put(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
    @JSGlobal("HTTP.put")
    @js.native
    def put(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
    @JSGlobal("HTTP.put")
    @js.native
    def put(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MailComposer")
  @js.native
  class MailComposer protected ()
    extends typings.meteor.MailComposer {
    def this(options: MailComposerOptions) = this()
  }
  @JSGlobal("MailComposer")
  @js.native
  def MailComposer: MailComposerStatic = js.native
  @scala.inline
  def MailComposer_=(x: MailComposerStatic): Unit = js.Dynamic.global.updateDynamic("MailComposer")(x.asInstanceOf[js.Any])
  
  object Match {
    
    @JSGlobal("Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Match.Any")
    @js.native
    def Any: typings.meteor.Match.Matcher[js.Any] = js.native
    @scala.inline
    def Any_=(x: typings.meteor.Match.Matcher[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Match.Integer")
    @js.native
    def Integer: typings.meteor.Match.Matcher[Double] = js.native
    @scala.inline
    def Integer_=(x: typings.meteor.Match.Matcher[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: js.UndefOr[scala.Nothing]): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: String): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: Boolean): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: Double): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: Null): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: BooleanConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: FunctionConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: NumberConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: ObjectConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe(pattern: StringConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = js.native
    @JSGlobal("Match.Maybe")
    @js.native
    def Maybe[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[_] */](pattern: T): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T] | Null]] = js.native
    
    @JSGlobal("Match.ObjectIncluding")
    @js.native
    def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): typings.meteor.Match.Matcher[PatternMatch[T]] = js.native
    
    @JSGlobal("Match.OneOf")
    @js.native
    def OneOf[T /* <: js.Array[Pattern] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
    ): typings.meteor.Match.Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ] = js.native
    
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: js.UndefOr[scala.Nothing]): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: String): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[String]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: Boolean): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: Double): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: Null): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[Null]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: BooleanConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: FunctionConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: NumberConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: ObjectConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional(pattern: StringConstructor): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = js.native
    @JSGlobal("Match.Optional")
    @js.native
    def Optional[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[_] */](pattern: T): typings.meteor.Match.Matcher[js.UndefOr[PatternMatch[T]]] = js.native
    
    @JSGlobal("Match.Where")
    @js.native
    def Where(condition: js.Function1[/* val */ js.Any, Boolean]): typings.meteor.Match.Matcher[_] = js.native
    
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: js.UndefOr[scala.Nothing]): /* is meteor.Match.PatternMatch<undefined> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: Null): /* is meteor.Match.PatternMatch<null> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: BooleanConstructor): /* is meteor.Match.PatternMatch<std.BooleanConstructor> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: FunctionConstructor): /* is meteor.Match.PatternMatch<std.FunctionConstructor> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: NumberConstructor): /* is meteor.Match.PatternMatch<std.NumberConstructor> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: ObjectConstructor): /* is meteor.Match.PatternMatch<std.ObjectConstructor> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test(value: js.Any, pattern: StringConstructor): /* is meteor.Match.PatternMatch<std.StringConstructor> */ Boolean = js.native
    @JSGlobal("Match.test")
    @js.native
    def test[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[_] */](value: js.Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = js.native
  }
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.EnvironmentVariable")
    @js.native
    class EnvironmentVariable[T] ()
      extends typings.meteor.Meteor.EnvironmentVariable[T]
    
    /** User **/
    /** Error **/
    @JSGlobal("Meteor.Error")
    @js.native
    def Error: ErrorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Meteor.Error")
    @js.native
    class ErrorCls protected ()
      extends typings.meteor.Meteor.Error {
      def this(error: String) = this()
      def this(error: Double) = this()
      def this(error: String, reason: String) = this()
      def this(error: Double, reason: String) = this()
      def this(error: String, reason: js.UndefOr[scala.Nothing], details: String) = this()
      def this(error: String, reason: String, details: String) = this()
      def this(error: Double, reason: js.UndefOr[scala.Nothing], details: String) = this()
      def this(error: Double, reason: String, details: String) = this()
    }
    
    @scala.inline
    def Error_=(x: ErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.TypedError")
    @js.native
    def TypedError: TypedErrorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Meteor.TypedError")
    @js.native
    class TypedErrorCls protected () extends TypedError {
      def this(message: String, errorType: String) = this()
    }
    
    @scala.inline
    def TypedError_=(x: TypedErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypedError")(x.asInstanceOf[js.Any])
    
    /** Method **/
    /** Url **/
    object absoluteUrl {
      
      @JSGlobal("Meteor.absoluteUrl")
      @js.native
      def apply(): String = js.native
      @JSGlobal("Meteor.absoluteUrl")
      @js.native
      def apply(path: js.UndefOr[scala.Nothing], options: absoluteUrlOptions): String = js.native
      @JSGlobal("Meteor.absoluteUrl")
      @js.native
      def apply(path: String): String = js.native
      @JSGlobal("Meteor.absoluteUrl")
      @js.native
      def apply(path: String, options: absoluteUrlOptions): String = js.native
      @JSGlobal("Meteor.absoluteUrl")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Meteor.absoluteUrl.defaultOptions")
      @js.native
      def defaultOptions: absoluteUrlOptions = js.native
      @scala.inline
      def defaultOptions_=(x: absoluteUrlOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Meteor.apply")
    @js.native
    def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
    @JSGlobal("Meteor.apply")
    @js.native
    def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
      name: String,
      args: js.Array[EJSONable | EJSONableProperty],
      options: js.UndefOr[scala.Nothing],
      asyncCallback: js.Function2[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
          /* result */ js.UndefOr[Result], 
          Unit
        ]
    ): js.Any = js.native
    @JSGlobal("Meteor.apply")
    @js.native
    def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: ReturnStubValue[Result]): js.Any = js.native
    @JSGlobal("Meteor.apply")
    @js.native
    def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
      name: String,
      args: js.Array[EJSONable | EJSONableProperty],
      options: ReturnStubValue[Result],
      asyncCallback: js.Function2[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error], 
          /* result */ js.UndefOr[Result], 
          Unit
        ]
    ): js.Any = js.native
    
    @JSGlobal("Meteor.bindEnvironment")
    @js.native
    def bindEnvironment[TFunc /* <: js.Function */](func: TFunc): TFunc = js.native
    
    @JSGlobal("Meteor.call")
    @js.native
    def call(name: String, args: js.Any*): js.Any = js.native
    
    @JSGlobal("Meteor.clearInterval")
    @js.native
    def clearInterval(id: Double): Unit = js.native
    
    @JSGlobal("Meteor.clearTimeout")
    @js.native
    def clearTimeout(id: Double): Unit = js.native
    
    @JSGlobal("Meteor._debug")
    @js.native
    def debug(args: js.Any*): Unit = js.native
    
    @JSGlobal("Meteor.defer")
    @js.native
    def defer(func: js.Function): Unit = js.native
    
    @JSGlobal("Meteor.disconnect")
    @js.native
    def disconnect(): Unit = js.native
    
    /** Global props **/
    @JSGlobal("Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    @scala.inline
    def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isCordova")
    @js.native
    def isCordova: Boolean = js.native
    @scala.inline
    def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
    
    /** Global props **/
    @JSGlobal("Meteor.isDevelopment")
    @js.native
    def isDevelopment: Boolean = js.native
    @scala.inline
    def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isProduction")
    @js.native
    def isProduction: Boolean = js.native
    @scala.inline
    def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    @scala.inline
    def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isTest")
    @js.native
    def isTest: Boolean = js.native
    @scala.inline
    def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.loggingIn")
    @js.native
    def loggingIn(): Boolean = js.native
    
    @JSGlobal("Meteor.loggingOut")
    @js.native
    def loggingOut(): Boolean = js.native
    
    @JSGlobal("Meteor.loginWith")
    @js.native
    def loginWith[ExternalService](): Unit = js.native
    @JSGlobal("Meteor.loginWith")
    @js.native
    def loginWith[ExternalService](
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWith")
    @js.native
    def loginWith[ExternalService](options: LoginStyle): Unit = js.native
    @JSGlobal("Meteor.loginWith")
    @js.native
    def loginWith[ExternalService](
      options: LoginStyle,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithFacebook")
    @js.native
    def loginWithFacebook(): Unit = js.native
    @JSGlobal("Meteor.loginWithFacebook")
    @js.native
    def loginWithFacebook(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithFacebook")
    @js.native
    def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithFacebook")
    @js.native
    def loginWithFacebook(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithGithub")
    @js.native
    def loginWithGithub(): Unit = js.native
    @JSGlobal("Meteor.loginWithGithub")
    @js.native
    def loginWithGithub(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithGithub")
    @js.native
    def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithGithub")
    @js.native
    def loginWithGithub(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithGoogle")
    @js.native
    def loginWithGoogle(): Unit = js.native
    @JSGlobal("Meteor.loginWithGoogle")
    @js.native
    def loginWithGoogle(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithGoogle")
    @js.native
    def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithGoogle")
    @js.native
    def loginWithGoogle(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithMeetup")
    @js.native
    def loginWithMeetup(): Unit = js.native
    @JSGlobal("Meteor.loginWithMeetup")
    @js.native
    def loginWithMeetup(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithMeetup")
    @js.native
    def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithMeetup")
    @js.native
    def loginWithMeetup(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithMeteorDeveloperAccount")
    @js.native
    def loginWithMeteorDeveloperAccount(): Unit = js.native
    @JSGlobal("Meteor.loginWithMeteorDeveloperAccount")
    @js.native
    def loginWithMeteorDeveloperAccount(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithMeteorDeveloperAccount")
    @js.native
    def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithMeteorDeveloperAccount")
    @js.native
    def loginWithMeteorDeveloperAccount(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithPassword")
    @js.native
    def loginWithPassword(user: String, password: String): Unit = js.native
    @JSGlobal("Meteor.loginWithPassword")
    @js.native
    def loginWithPassword(
      user: String,
      password: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithPassword")
    @js.native
    def loginWithPassword(user: js.Object, password: String): Unit = js.native
    @JSGlobal("Meteor.loginWithPassword")
    @js.native
    def loginWithPassword(
      user: js.Object,
      password: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithToken")
    @js.native
    def loginWithToken(token: String): Unit = js.native
    @JSGlobal("Meteor.loginWithToken")
    @js.native
    def loginWithToken(
      token: String,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithTwitter")
    @js.native
    def loginWithTwitter(): Unit = js.native
    @JSGlobal("Meteor.loginWithTwitter")
    @js.native
    def loginWithTwitter(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithTwitter")
    @js.native
    def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithTwitter")
    @js.native
    def loginWithTwitter(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.loginWithWeibo")
    @js.native
    def loginWithWeibo(): Unit = js.native
    @JSGlobal("Meteor.loginWithWeibo")
    @js.native
    def loginWithWeibo(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Meteor.loginWithWeibo")
    @js.native
    def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = js.native
    @JSGlobal("Meteor.loginWithWeibo")
    @js.native
    def loginWithWeibo(
      options: LoginWithExternalServiceOptions,
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.logout")
    @js.native
    def logout(): Unit = js.native
    @JSGlobal("Meteor.logout")
    @js.native
    def logout(
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.logoutOtherClients")
    @js.native
    def logoutOtherClients(): Unit = js.native
    @JSGlobal("Meteor.logoutOtherClients")
    @js.native
    def logoutOtherClients(
      callback: js.Function1[
          /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | TypedError], 
          Unit
        ]
    ): Unit = js.native
    
    @JSGlobal("Meteor.methods")
    @js.native
    def methods(methods: StringDictionary[js.ThisFunction1[/* this */ MethodThisType, /* repeated */ js.Any, _]]): Unit = js.native
    
    @JSGlobal("Meteor.onConnection")
    @js.native
    def onConnection(callback: js.Function): Unit = js.native
    
    /** Connection **/
    @JSGlobal("Meteor.publish")
    @js.native
    def publish(name: String, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = js.native
    @JSGlobal("Meteor.publish")
    @js.native
    def publish(
      name: String,
      func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
      options: Isauto
    ): Unit = js.native
    @JSGlobal("Meteor.publish")
    @js.native
    def publish(name: Null, func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit]): Unit = js.native
    @JSGlobal("Meteor.publish")
    @js.native
    def publish(
      name: Null,
      func: js.ThisFunction1[/* this */ Subscription, /* repeated */ js.Any, Unit],
      options: Isauto
    ): Unit = js.native
    
    /** Event **/
    /** Connection **/
    @JSGlobal("Meteor.reconnect")
    @js.native
    def reconnect(): Unit = js.native
    
    @JSGlobal("Meteor.release")
    @js.native
    def release: String = js.native
    @scala.inline
    def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
    
    /** Url **/
    /** Timeout **/
    @JSGlobal("Meteor.setInterval")
    @js.native
    def setInterval(func: js.Function, delay: Double): Double = js.native
    
    @JSGlobal("Meteor.setTimeout")
    @js.native
    def setTimeout(func: js.Function, delay: Double): Double = js.native
    
    @JSGlobal("Meteor.settings")
    @js.native
    def settings: Settings = js.native
    @scala.inline
    def settings_=(x: Settings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
    
    /** Timeout **/
    /** utils **/
    @JSGlobal("Meteor.startup")
    @js.native
    def startup(func: js.Function): Unit = js.native
    
    /** Connection **/
    /** Status **/
    @JSGlobal("Meteor.status")
    @js.native
    def status(): DDPStatus = js.native
    
    /** Status **/
    /** Pub/Sub **/
    @JSGlobal("Meteor.subscribe")
    @js.native
    def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
    
    @JSGlobal("Meteor.user")
    @js.native
    def user(): User | Null = js.native
    
    @JSGlobal("Meteor.userId")
    @js.native
    def userId(): String | Null = js.native
    
    @JSGlobal("Meteor.users")
    @js.native
    def users: Collection[User, User] = js.native
    @scala.inline
    def users_=(x: Collection[User, User]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.wrapAsync")
    @js.native
    def wrapAsync(func: js.Function): js.Any = js.native
    @JSGlobal("Meteor.wrapAsync")
    @js.native
    def wrapAsync(func: js.Function, context: js.Object): js.Any = js.native
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
    class CollectionCls[T, U] () extends Collection[T, U] {
      def this(name: String) = this()
      def this(name: String, options: IdGeneration[T, U]) = this()
      def this(name: Null, options: IdGeneration[T, U]) = this()
    }
    
    @scala.inline
    def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Cursor")
    @js.native
    class CursorCls[T, U] () extends Cursor[T, U]
    
    @scala.inline
    def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.ObjectID")
    @js.native
    def ObjectID: ObjectIDStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.ObjectID")
    @js.native
    class ObjectIDCls () extends ObjectID {
      def this(hexString: String) = this()
    }
    
    @scala.inline
    def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.setConnectionOptions")
    @js.native
    def setConnectionOptions(options: js.Any): Unit = js.native
  }
  
  object Npm {
    
    @JSGlobal("Npm.depends")
    @js.native
    def depends(dependencies: StringDictionary[String]): Unit = js.native
    
    @JSGlobal("Npm.require")
    @js.native
    def require(name: String): js.Any = js.native
  }
  
  object Package {
    
    @JSGlobal("Package.describe")
    @js.native
    def describe(options: DebugOnly): Unit = js.native
    
    @JSGlobal("Package.onTest")
    @js.native
    def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
    
    @JSGlobal("Package.onUse")
    @js.native
    def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
    
    @JSGlobal("Package.registerBuildPlugin")
    @js.native
    def registerBuildPlugin(): Unit = js.native
    @JSGlobal("Package.registerBuildPlugin")
    @js.native
    def registerBuildPlugin(options: Name): Unit = js.native
  }
  
  object Random {
    
    // @param array, @return a random element in array
    @JSGlobal("Random.choice")
    @js.native
    def choice(array: js.Array[_]): String = js.native
    // @param str, @return a random char in str
    @JSGlobal("Random.choice")
    @js.native
    def choice(str: String): String = js.native
    
    @JSGlobal("Random.fraction")
    @js.native
    def fraction(): Double = js.native
    
    // @param numberOfDigits, @returns a random hex string of the given length
    @JSGlobal("Random.hexString")
    @js.native
    def hexString(numberOfDigits: Double): String = js.native
    
    @JSGlobal("Random.id")
    @js.native
    def id(): String = js.native
    @JSGlobal("Random.id")
    @js.native
    def id(numberOfChars: Double): String = js.native
    
    @JSGlobal("Random.secret")
    @js.native
    def secret(): String = js.native
    @JSGlobal("Random.secret")
    @js.native
    def secret(numberOfChars: Double): String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReactiveDict")
  @js.native
  class ReactiveDict ()
    extends typings.meteor.ReactiveDict {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], initialValue: EJSONable) = this()
    def this(name: String, initialValue: EJSONable) = this()
  }
  @JSGlobal("ReactiveDict")
  @js.native
  def ReactiveDict: ReactiveDictStatic = js.native
  @scala.inline
  def ReactiveDict_=(x: ReactiveDictStatic): Unit = js.Dynamic.global.updateDynamic("ReactiveDict")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReactiveVar")
  @js.native
  class ReactiveVar[T] protected ()
    extends typings.meteor.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function) = this()
  }
  @JSGlobal("ReactiveVar")
  @js.native
  def ReactiveVar: ReactiveVarStatic = js.native
  @scala.inline
  def ReactiveVar_=(x: ReactiveVarStatic): Unit = js.Dynamic.global.updateDynamic("ReactiveVar")(x.asInstanceOf[js.Any])
  
  object Session {
    
    @JSGlobal("Session.equals")
    @js.native
    def equals_(key: String, value: String): Boolean = js.native
    @JSGlobal("Session.equals")
    @js.native
    def equals_(key: String, value: js.Any): Boolean = js.native
    @JSGlobal("Session.equals")
    @js.native
    def equals_(key: String, value: Boolean): Boolean = js.native
    @JSGlobal("Session.equals")
    @js.native
    def equals_(key: String, value: Double): Boolean = js.native
    
    @JSGlobal("Session.get")
    @js.native
    def get(key: String): js.Any = js.native
    
    @JSGlobal("Session.set")
    @js.native
    def set(key: String, value: js.Any): Unit = js.native
    @JSGlobal("Session.set")
    @js.native
    def set(key: String, value: EJSONable): Unit = js.native
    
    @JSGlobal("Session.setDefault")
    @js.native
    def setDefault(key: String, value: js.Any): Unit = js.native
    @JSGlobal("Session.setDefault")
    @js.native
    def setDefault(key: String, value: EJSONable): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Template")
  @js.native
  class Template ()
    extends typings.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
  }
  @JSGlobal("Template")
  @js.native
  def Template: TemplateStatic = js.native
  @scala.inline
  def Template_=(x: TemplateStatic): Unit = js.Dynamic.global.updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  object Tinytest {
    
    @JSGlobal("Tinytest.add")
    @js.native
    def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
    
    @JSGlobal("Tinytest.addAsync")
    @js.native
    def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
  }
  
  object Tracker {
    
    @JSGlobal("Tracker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Tracker.Computation")
    @js.native
    def Computation(): Unit = js.native
    
    @JSGlobal("Tracker.Dependency")
    @js.native
    def Dependency: DependencyStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Tracker.Dependency")
    @js.native
    class DependencyCls () extends Dependency
    
    @scala.inline
    def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Tracker.active")
    @js.native
    def active: Boolean = js.native
    @scala.inline
    def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Tracker.afterFlush")
    @js.native
    def afterFlush(callback: js.Function): Unit = js.native
    
    @JSGlobal("Tracker.autorun")
    @js.native
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    @JSGlobal("Tracker.autorun")
    @js.native
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = js.native
    
    @JSGlobal("Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    @scala.inline
    def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Tracker.flush")
    @js.native
    def flush(): Unit = js.native
    
    @JSGlobal("Tracker.nonreactive")
    @js.native
    def nonreactive[T](func: js.Function0[T]): T = js.native
    
    @JSGlobal("Tracker.onInvalidate")
    @js.native
    def onInvalidate(callback: js.Function): Unit = js.native
  }
  
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: js.UndefOr[scala.Nothing]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: Null): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: BooleanConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: FunctionConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: NumberConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: ObjectConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check(value: js.Any, pattern: StringConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean = js.native
  @JSGlobal("check")
  @js.native
  def check[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | typings.meteor.Match.Matcher[_] */](value: js.Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
  
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  @scala.inline
  def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  @JSGlobal("execFileAsync")
  @js.native
  def execFileAsync(command: String): js.Any = js.native
  @JSGlobal("execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): js.Any = js.native
  @JSGlobal("execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.Array[_]): js.Any = js.native
  @JSGlobal("execFileAsync")
  @js.native
  def execFileAsync(command: String, args: js.Array[_], options: Cwd): js.Any = js.native
  
  @JSGlobal("execFileSync")
  @js.native
  def execFileSync(command: String): String = js.native
  @JSGlobal("execFileSync")
  @js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: Cwd): String = js.native
  @JSGlobal("execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[_]): String = js.native
  @JSGlobal("execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[_], options: Cwd): String = js.native
}

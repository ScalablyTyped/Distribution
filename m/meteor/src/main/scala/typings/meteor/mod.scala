package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.TypedError
import typings.meteor.Meteor.User
import typings.meteor.anon.Algorithm
import typings.meteor.anon.AmbiguousErrorMessages
import typings.meteor.anon.Connection
import typings.meteor.anon.Digest
import typings.meteor.anon.Email
import typings.meteor.anon.ForceApprovalPrompt
import typings.meteor.anon.Logout
import typings.meteor.anon.Profile
import typings.meteor.anon.Stop
import typings.meteor.anon.`0`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Accounts {
    
    @JSImport("meteor/accounts-base", "Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.addEmail")
    @js.native
    def addEmail(userId: String, newEmail: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.addEmail")
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
    @JSImport("meteor/accounts-base", "Accounts.callLoginMethod")
    @js.native
    def callLoginMethod(options: LoginMethodOptions): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.changePassword")
    @js.native
    def changePassword(oldPassword: String, newPassword: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.changePassword")
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
    @JSImport("meteor/accounts-base", "Accounts._checkPassword")
    @js.native
    def checkPassword(user: User, password: Password): typings.meteor.anon.Error = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.config")
    @js.native
    def config(options: AmbiguousErrorMessages): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.createUser")
    @js.native
    def createUser(options: Email): String = js.native
    @JSImport("meteor/accounts-base", "Accounts.createUser")
    @js.native
    def createUser(
      options: Email,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): String = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.emailTemplates")
    @js.native
    def emailTemplates: typings.meteor.mod.EmailTemplates = js.native
    @scala.inline
    def emailTemplates_=(x: typings.meteor.mod.EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/accounts-base", "Accounts.findUserByEmail")
    @js.native
    def findUserByEmail(email: String): js.UndefOr[User | Null] = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.findUserByUsername")
    @js.native
    def findUserByUsername(username: String): js.UndefOr[User | Null] = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.forgotPassword")
    @js.native
    def forgotPassword(options: `0`): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.forgotPassword")
    @js.native
    def forgotPassword(
      options: `0`,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts._hashPassword")
    @js.native
    def hashPassword(password: String): Algorithm = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.loggingIn")
    @js.native
    def loggingIn(): Boolean = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.loginServicesConfigured")
    @js.native
    def loginServicesConfigured(): Boolean = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.logout")
    @js.native
    def logout(): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.logout")
    @js.native
    def logout(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.logoutOtherClients")
    @js.native
    def logoutOtherClients(): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.logoutOtherClients")
    @js.native
    def logoutOtherClients(
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onCreateUser")
    @js.native
    def onCreateUser(func: js.Function2[/* options */ Profile, /* user */ User, Unit]): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onEmailVerificationLink")
    @js.native
    def onEmailVerificationLink(callback: js.Function): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onEnrollmentLink")
    @js.native
    def onEnrollmentLink(callback: js.Function): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onLogin")
    @js.native
    def onLogin(func: js.Function): Stop = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onLoginFailure")
    @js.native
    def onLoginFailure(func: js.Function): Stop = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onLogout")
    @js.native
    def onLogout(func: js.Function): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.onLogout")
    @js.native
    def onLogout(func: js.Function1[/* options */ Connection, Unit]): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onPageLoadLogin")
    @js.native
    def onPageLoadLogin(func: js.Function): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.onResetPasswordLink")
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
    @JSImport("meteor/accounts-base", "Accounts.registerLoginHandler")
    @js.native
    def registerLoginHandler(name: String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.removeEmail")
    @js.native
    def removeEmail(userId: String, email: String): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.resetPassword")
    @js.native
    def resetPassword(token: String, newPassword: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.resetPassword")
    @js.native
    def resetPassword(
      token: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.sendEnrollmentEmail")
    @js.native
    def sendEnrollmentEmail(userId: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.sendEnrollmentEmail")
    @js.native
    def sendEnrollmentEmail(userId: String, email: String): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.sendResetPasswordEmail")
    @js.native
    def sendResetPasswordEmail(userId: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.sendResetPasswordEmail")
    @js.native
    def sendResetPasswordEmail(userId: String, email: String): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.sendVerificationEmail")
    @js.native
    def sendVerificationEmail(userId: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.sendVerificationEmail")
    @js.native
    def sendVerificationEmail(userId: String, email: String): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.setPassword")
    @js.native
    def setPassword(userId: String, newPassword: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.setPassword")
    @js.native
    def setPassword(userId: String, newPassword: String, options: Logout): Unit = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.setUsername")
    @js.native
    def setUsername(userId: String, newUsername: String): Unit = js.native
    
    object ui {
      
      @JSImport("meteor/accounts-base", "Accounts.ui.config")
      @js.native
      def config(options: ForceApprovalPrompt): Unit = js.native
    }
    
    @JSImport("meteor/accounts-base", "Accounts.urls")
    @js.native
    def urls: typings.meteor.mod.URLS = js.native
    @scala.inline
    def urls_=(x: typings.meteor.mod.URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/accounts-base", "Accounts.user")
    @js.native
    def user(): User | Null = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.userId")
    @js.native
    def userId(): String | Null = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.validateLoginAttempt")
    @js.native
    def validateLoginAttempt(func: js.Function): Stop = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.validateNewUser")
    @js.native
    def validateNewUser(func: js.Function): Boolean = js.native
    
    @JSImport("meteor/accounts-base", "Accounts.verifyEmail")
    @js.native
    def verifyEmail(token: String): Unit = js.native
    @JSImport("meteor/accounts-base", "Accounts.verifyEmail")
    @js.native
    def verifyEmail(
      token: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
    ): Unit = js.native
    
    @js.native
    trait IValidateLoginAttemptCbOpts extends StObject {
      
      var allowed: Boolean = js.native
      
      var connection: typings.meteor.Meteor.Connection = js.native
      
      var error: typings.meteor.Meteor.Error = js.native
      
      var methodArguments: js.Array[_] = js.native
      
      var methodName: String = js.native
      
      var `type`: String = js.native
      
      var user: User = js.native
    }
    object IValidateLoginAttemptCbOpts {
      
      @scala.inline
      def apply(
        allowed: Boolean,
        connection: typings.meteor.Meteor.Connection,
        error: typings.meteor.Meteor.Error,
        methodArguments: js.Array[_],
        methodName: String,
        `type`: String,
        user: User
      ): IValidateLoginAttemptCbOpts = {
        val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
      }
      
      @scala.inline
      implicit class IValidateLoginAttemptCbOptsMutableBuilder[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnection(value: typings.meteor.Meteor.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: typings.meteor.Meteor.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodArguments(value: js.Array[_]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
        
        @scala.inline
        def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait LoginMethodOptions extends StObject {
      
      /**
        * The arguments for the method
        */
      var methodArguments: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * The method to call (default 'login')
        */
      var methodName: js.UndefOr[String] = js.native
      
      /**
        * Will be called with no arguments once the user is fully
        * logged in, or with the error on error.
        */
      var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
      
      /**
        * If provided, will be called with the result of the
        * method. If it throws, the client will not be logged in (and
        * its error will be passed to the callback).
        */
      var validateResult: js.UndefOr[js.Function] = js.native
    }
    object LoginMethodOptions {
      
      @scala.inline
      def apply(): LoginMethodOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoginMethodOptions]
      }
      
      @scala.inline
      implicit class LoginMethodOptionsMutableBuilder[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethodArguments(value: js.Array[_]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodArgumentsUndefined: Self = StObject.set(x, "methodArguments", js.undefined)
        
        @scala.inline
        def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
        
        @scala.inline
        def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
        
        @scala.inline
        def setUserCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "userCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUserCallbackUndefined: Self = StObject.set(x, "userCallback", js.undefined)
        
        @scala.inline
        def setValidateResult(value: js.Function): Self = StObject.set(x, "validateResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidateResultUndefined: Self = StObject.set(x, "validateResult", js.undefined)
      }
    }
    
    type Password = String | Digest
  }
  
  @js.native
  trait EmailFields extends StObject {
    
    var from: js.UndefOr[js.Function1[/* user */ User, String]] = js.native
    
    var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
    
    var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.native
    
    var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
  }
  object EmailFields {
    
    @scala.inline
    def apply(): typings.meteor.mod.EmailFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.meteor.mod.EmailFields]
    }
    
    @scala.inline
    implicit class EmailFieldsMutableBuilder[Self <: typings.meteor.mod.EmailFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: /* user */ User => String): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHtml(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setSubject(value: /* user */ User => String): Self = StObject.set(x, "subject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setText(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait EmailTemplates extends StObject {
    
    var enrollAccount: typings.meteor.mod.EmailFields = js.native
    
    var from: String = js.native
    
    var headers: js.UndefOr[typings.meteor.mod.Header] = js.native
    
    var resetPassword: typings.meteor.mod.EmailFields = js.native
    
    var siteName: String = js.native
    
    var verifyEmail: typings.meteor.mod.EmailFields = js.native
  }
  object EmailTemplates {
    
    @scala.inline
    def apply(
      enrollAccount: typings.meteor.mod.EmailFields,
      from: String,
      resetPassword: typings.meteor.mod.EmailFields,
      siteName: String,
      verifyEmail: typings.meteor.mod.EmailFields
    ): typings.meteor.mod.EmailTemplates = {
      val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.mod.EmailTemplates]
    }
    
    @scala.inline
    implicit class EmailTemplatesMutableBuilder[Self <: typings.meteor.mod.EmailTemplates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnrollAccount(value: typings.meteor.mod.EmailFields): Self = StObject.set(x, "enrollAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: typings.meteor.mod.Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setResetPassword(value: typings.meteor.mod.EmailFields): Self = StObject.set(x, "resetPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyEmail(value: typings.meteor.mod.EmailFields): Self = StObject.set(x, "verifyEmail", value.asInstanceOf[js.Any])
    }
  }
  
  type Header = StringDictionary[String]
  
  @js.native
  trait URLS extends StObject {
    
    def enrollAccount(token: String): String = js.native
    
    def resetPassword(token: String): String = js.native
    
    def verifyEmail(token: String): String = js.native
  }
  object URLS {
    
    @scala.inline
    def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): typings.meteor.mod.URLS = {
      val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
      __obj.asInstanceOf[typings.meteor.mod.URLS]
    }
    
    @scala.inline
    implicit class URLSMutableBuilder[Self <: typings.meteor.mod.URLS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnrollAccount(value: String => String): Self = StObject.set(x, "enrollAccount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetPassword(value: String => String): Self = StObject.set(x, "resetPassword", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyEmail(value: String => String): Self = StObject.set(x, "verifyEmail", js.Any.fromFunction1(value))
    }
  }
}

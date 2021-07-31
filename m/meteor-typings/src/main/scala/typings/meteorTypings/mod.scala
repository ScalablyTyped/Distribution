package typings.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.Meteor.Connection
import typings.meteorTypings.Meteor.Error
import typings.meteorTypings.Meteor.User
import typings.meteorTypings.anon.Email
import typings.meteorTypings.anon.ForbidClientAccountCreation
import typings.meteorTypings.anon.ForceApprovalPrompt
import typings.meteorTypings.anon.Logout
import typings.meteorTypings.anon.Stop
import typings.meteorTypings.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Accounts {
    
    @JSImport("meteor/accounts-base", "Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addEmail(userId: String, newEmail: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def addEmail(userId: String, newEmail: String, verified: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], verified.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def changePassword(oldPassword: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def changePassword(oldPassword: String, newPassword: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def config(options: ForbidClientAccountCreation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def createUser(options: Email): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def createUser(options: Email, callback: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("meteor/accounts-base", "Accounts.emailTemplates")
    @js.native
    def emailTemplates: typings.meteorTypings.mod.EmailTemplates = js.native
    @scala.inline
    def emailTemplates_=(x: typings.meteorTypings.mod.EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def findUserByEmail(email: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    @scala.inline
    def findUserByUsername(username: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    @scala.inline
    def forgotPassword(options: `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def forgotPassword(options: `0`, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    @scala.inline
    def loginServicesConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loginServicesConfigured")().asInstanceOf[Boolean]
    
    @scala.inline
    def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    @scala.inline
    def logout(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    @scala.inline
    def logoutOtherClients(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def makeClientLoggedOut(): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClientLoggedOut")().asInstanceOf[Boolean | Unit]
    
    @scala.inline
    def onCreateUser(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCreateUser")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEmailVerificationLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEmailVerificationLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEnrollmentLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnrollmentLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onLogin(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    @scala.inline
    def onLoginFailure(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoginFailure")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    @scala.inline
    def onLogout(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onLogout(func: js.Function2[/* user */ User, /* connection */ Connection, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onPageLoadLogin(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageLoadLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onResetPasswordLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResetPasswordLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def removeEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def resetPassword(token: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def resetPassword(token: String, newPassword: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def sendEnrollmentEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def sendEnrollmentEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def sendResetPasswordEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def sendResetPasswordEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def sendVerificationEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def sendVerificationEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setPassword(userId: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def setPassword(userId: String, newPassword: String, options: Logout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setUsername(userId: String, newUsername: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(userId.asInstanceOf[js.Any], newUsername.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object ui {
      
      @JSImport("meteor/accounts-base", "Accounts.ui")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def config(options: ForceApprovalPrompt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSImport("meteor/accounts-base", "Accounts.urls")
    @js.native
    def urls: typings.meteorTypings.mod.URLS = js.native
    @scala.inline
    def urls_=(x: typings.meteorTypings.mod.URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def user(): User = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User]
    
    @scala.inline
    def userId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String]
    
    @scala.inline
    def validateLoginAttempt(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoginAttempt")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    @scala.inline
    def validateNewUser(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNewUser")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def verifyEmail(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def verifyEmail(token: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait IValidateLoginAttemptCbOpts extends StObject {
      
      var allowed: Boolean
      
      var connection: Connection
      
      var error: Error
      
      var methodArguments: js.Array[js.Any]
      
      var methodName: String
      
      var `type`: String
      
      var user: User
    }
    object IValidateLoginAttemptCbOpts {
      
      @scala.inline
      def apply(
        allowed: Boolean,
        connection: Connection,
        error: Error,
        methodArguments: js.Array[js.Any],
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
        def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodArguments(value: js.Array[js.Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
        
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
  }
  
  trait EmailFields extends StObject {
    
    var from: js.UndefOr[js.Function0[String]] = js.undefined
    
    var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
    
    var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
    
    var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
  }
  object EmailFields {
    
    @scala.inline
    def apply(): typings.meteorTypings.mod.EmailFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.meteorTypings.mod.EmailFields]
    }
    
    @scala.inline
    implicit class EmailFieldsMutableBuilder[Self <: typings.meteorTypings.mod.EmailFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: () => String): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
      
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
  
  trait EmailTemplates extends StObject {
    
    var enrollAccount: typings.meteorTypings.mod.EmailFields
    
    var from: String
    
    var headers: js.UndefOr[typings.meteorTypings.mod.Header] = js.undefined
    
    var resetPassword: typings.meteorTypings.mod.EmailFields
    
    var siteName: String
    
    var verifyEmail: typings.meteorTypings.mod.EmailFields
  }
  object EmailTemplates {
    
    @scala.inline
    def apply(
      enrollAccount: typings.meteorTypings.mod.EmailFields,
      from: String,
      resetPassword: typings.meteorTypings.mod.EmailFields,
      siteName: String,
      verifyEmail: typings.meteorTypings.mod.EmailFields
    ): typings.meteorTypings.mod.EmailTemplates = {
      val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorTypings.mod.EmailTemplates]
    }
    
    @scala.inline
    implicit class EmailTemplatesMutableBuilder[Self <: typings.meteorTypings.mod.EmailTemplates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnrollAccount(value: typings.meteorTypings.mod.EmailFields): Self = StObject.set(x, "enrollAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: typings.meteorTypings.mod.Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setResetPassword(value: typings.meteorTypings.mod.EmailFields): Self = StObject.set(x, "resetPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyEmail(value: typings.meteorTypings.mod.EmailFields): Self = StObject.set(x, "verifyEmail", value.asInstanceOf[js.Any])
    }
  }
  
  type Header = StringDictionary[String]
  
  trait URLS extends StObject {
    
    def enrollAccount(token: String): String
    
    def resetPassword(token: String): String
    
    def verifyEmail(token: String): String
  }
  object URLS {
    
    @scala.inline
    def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): typings.meteorTypings.mod.URLS = {
      val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
      __obj.asInstanceOf[typings.meteorTypings.mod.URLS]
    }
    
    @scala.inline
    implicit class URLSMutableBuilder[Self <: typings.meteorTypings.mod.URLS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnrollAccount(value: String => String): Self = StObject.set(x, "enrollAccount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetPassword(value: String => String): Self = StObject.set(x, "resetPassword", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyEmail(value: String => String): Self = StObject.set(x, "verifyEmail", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object meteorAccountsBaseAugmentingMod
}

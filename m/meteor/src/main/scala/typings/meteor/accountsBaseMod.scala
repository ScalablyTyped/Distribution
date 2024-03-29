package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.TypedError
import typings.meteor.Meteor.User
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.Selector
import typings.meteor.anon.Algorithm
import typings.meteor.anon.AmbiguousErrorMessages
import typings.meteor.anon.Connection
import typings.meteor.anon.Digest
import typings.meteor.anon.Fields
import typings.meteor.anon.ForceApprovalPrompt
import typings.meteor.anon.Logout
import typings.meteor.anon.Profile
import typings.meteor.anon.Stop
import typings.meteor.anon.UserId
import typings.meteor.anon.`0`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountsBaseMod {
  
  object Accounts {
    
    @JSImport("meteor/accounts-base", "Accounts")
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
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *
      * Check whether the provided password matches the bcrypt'ed password in
      * the database user record. `password` can be a string (in which case
      * it will be run through SHA256 before bcrypt) or an object with
      * properties `digest` and `algorithm` (in which case we bcrypt
      * `password.digest`).
      */
    inline def checkPassword(user: User, password: Password): UserId = (^.asInstanceOf[js.Dynamic].applyDynamic("_checkPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[UserId]
    
    inline def config(options: AmbiguousErrorMessages): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createUser(options: typings.meteor.anon.Email): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def createUser(
      options: typings.meteor.anon.Email,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createUserAsync(options: typings.meteor.anon.Email): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def createUserAsync(
      options: typings.meteor.anon.Email,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserAsync")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @JSImport("meteor/accounts-base", "Accounts.emailTemplates")
    @js.native
    def emailTemplates: typings.meteor.accountsBaseMod.EmailTemplates = js.native
    inline def emailTemplates_=(x: typings.meteor.accountsBaseMod.EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    inline def findUserByEmail(email: String): js.UndefOr[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[User | Null]]
    inline def findUserByEmail(email: String, options: Fields): js.UndefOr[User | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[User | Null]]
    
    inline def findUserByUsername(username: String): js.UndefOr[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[User | Null]]
    inline def findUserByUsername(username: String, options: Fields): js.UndefOr[User | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[User | Null]]
    
    inline def forgotPassword(options: `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def forgotPassword(options: `0`, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def generateStampedLoginToken(): StampedLoginToken = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateStampedLoginToken")().asInstanceOf[StampedLoginToken]
    
    inline def hashLoginToken(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_hashLoginToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashPassword(password: String): Algorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("_hashPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Algorithm]
    
    inline def hashStampedToken(token: StampedLoginToken): HashedStampedLoginToken = ^.asInstanceOf[js.Dynamic].applyDynamic("_hashStampedToken")(token.asInstanceOf[js.Any]).asInstanceOf[HashedStampedLoginToken]
    
    inline def insertHashedLoginToken[T](userId: String, token: HashedStampedLoginToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_insertHashedLoginToken")(userId.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertHashedLoginToken[T](userId: String, token: HashedStampedLoginToken, query: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_insertHashedLoginToken")(userId.asInstanceOf[js.Any], token.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertHashedLoginToken[T](userId: String, token: HashedStampedLoginToken, query: ObjectID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_insertHashedLoginToken")(userId.asInstanceOf[js.Any], token.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertHashedLoginToken[T](userId: String, token: HashedStampedLoginToken, query: Selector[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_insertHashedLoginToken")(userId.asInstanceOf[js.Any], token.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    inline def loggingOut(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingOut")().asInstanceOf[Boolean]
    
    inline def loginServicesConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loginServicesConfigured")().asInstanceOf[Boolean]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def registerLoginHandler(handler: js.Function1[/* options */ Any, js.UndefOr[LoginMethodResult]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoginHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerLoginHandler(name: String, handler: js.Function1[/* options */ Any, js.UndefOr[LoginMethodResult]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoginHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resetPassword(token: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resetPassword(
      token: String,
      newPassword: String,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendEnrollmentEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: String, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: String, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(
      userId: String,
      email: String,
      extraTokenData: Record[String, Any],
      extraParams: Record[String, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: Unit, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: Unit, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: Unit, extraTokenData: Record[String, Any], extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendResetPasswordEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: String, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: String, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(
      userId: String,
      email: String,
      extraTokenData: Record[String, Any],
      extraParams: Record[String, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: Unit, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: Unit, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: Unit, extraTokenData: Record[String, Any], extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendVerificationEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: String, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: String, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(
      userId: String,
      email: String,
      extraTokenData: Record[String, Any],
      extraParams: Record[String, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: Unit, extraTokenData: Unit, extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: Unit, extraTokenData: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: Unit, extraTokenData: Record[String, Any], extraParams: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any], extraTokenData.asInstanceOf[js.Any], extraParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPassword(userId: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPassword(userId: String, newPassword: String, options: Logout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPasswordAsync(userId: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPasswordAsync")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setPasswordAsync(userId: String, newPassword: String, options: Logout): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPasswordAsync")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setUsername(userId: String, newUsername: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(userId.asInstanceOf[js.Any], newUsername.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object ui {
      
      @JSImport("meteor/accounts-base", "Accounts.ui")
      @js.native
      val ^ : js.Any = js.native
      
      inline def config(options: ForceApprovalPrompt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSImport("meteor/accounts-base", "Accounts.urls")
    @js.native
    def urls: typings.meteor.accountsBaseMod.URLS = js.native
    inline def urls_=(x: typings.meteor.accountsBaseMod.URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    inline def user(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User | Null]
    inline def user(options: Fields): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")(options.asInstanceOf[js.Any]).asInstanceOf[User | Null]
    
    inline def userAsync(): js.Promise[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAsync")().asInstanceOf[js.Promise[User | Null]]
    inline def userAsync(options: Fields): js.Promise[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User | Null]]
    
    inline def userId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String | Null]
    
    inline def validateLoginAttempt(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoginAttempt")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def validateNewUser(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNewUser")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def verifyEmail(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def verifyEmail(token: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait HashedStampedLoginToken extends StObject {
      
      var hashedToken: String
      
      var when: js.Date
    }
    object HashedStampedLoginToken {
      
      inline def apply(hashedToken: String, when: js.Date): HashedStampedLoginToken = {
        val __obj = js.Dynamic.literal(hashedToken = hashedToken.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
        __obj.asInstanceOf[HashedStampedLoginToken]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HashedStampedLoginToken] (val x: Self) extends AnyVal {
        
        inline def setHashedToken(value: String): Self = StObject.set(x, "hashedToken", value.asInstanceOf[js.Any])
        
        inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      }
    }
    
    trait IValidateLoginAttemptCbOpts extends StObject {
      
      var allowed: Boolean
      
      var connection: typings.meteor.Meteor.Connection
      
      var error: Error
      
      var methodArguments: js.Array[Any]
      
      var methodName: String
      
      var `type`: String
      
      var user: User
    }
    object IValidateLoginAttemptCbOpts {
      
      inline def apply(
        allowed: Boolean,
        connection: typings.meteor.Meteor.Connection,
        error: Error,
        methodArguments: js.Array[Any],
        methodName: String,
        `type`: String,
        user: User
      ): IValidateLoginAttemptCbOpts = {
        val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
        
        inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        inline def setConnection(value: typings.meteor.Meteor.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setMethodArguments(value: js.Array[Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
        
        inline def setMethodArgumentsVarargs(value: Any*): Self = StObject.set(x, "methodArguments", js.Array(value*))
        
        inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    trait LoginMethodOptions extends StObject {
      
      /**
        * The arguments for the method
        */
      var methodArguments: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * The method to call (default 'login')
        */
      var methodName: js.UndefOr[String] = js.undefined
      
      /**
        * Will be called with no arguments once the user is fully
        * logged in, or with the error on error.
        */
      var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]] = js.undefined
      
      /**
        * If provided, will be called with the result of the
        * method. If it throws, the client will not be logged in (and
        * its error will be passed to the callback).
        */
      var validateResult: js.UndefOr[js.Function] = js.undefined
    }
    object LoginMethodOptions {
      
      inline def apply(): LoginMethodOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoginMethodOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
        
        inline def setMethodArguments(value: js.Array[Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
        
        inline def setMethodArgumentsUndefined: Self = StObject.set(x, "methodArguments", js.undefined)
        
        inline def setMethodArgumentsVarargs(value: Any*): Self = StObject.set(x, "methodArguments", js.Array(value*))
        
        inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
        
        inline def setUserCallback(value: /* err */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "userCallback", js.Any.fromFunction1(value))
        
        inline def setUserCallbackUndefined: Self = StObject.set(x, "userCallback", js.undefined)
        
        inline def setValidateResult(value: js.Function): Self = StObject.set(x, "validateResult", value.asInstanceOf[js.Any])
        
        inline def setValidateResultUndefined: Self = StObject.set(x, "validateResult", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.anon.Error
      - typings.meteor.anon.Options
    */
    trait LoginMethodResult extends StObject
    object LoginMethodResult {
      
      inline def Error(error: js.Error): typings.meteor.anon.Error = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.meteor.anon.Error]
      }
      
      inline def Options(userId: String): typings.meteor.anon.Options = {
        val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.meteor.anon.Options]
      }
    }
    
    type Password = String | Digest
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.meteorStrings.USERNAME_AND_EMAIL
      - typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL
      - typings.meteor.meteorStrings.USERNAME_ONLY
      - typings.meteor.meteorStrings.EMAIL_ONLY
    */
    trait PasswordSignupField extends StObject
    object PasswordSignupField {
      
      inline def EMAIL_ONLY: typings.meteor.meteorStrings.EMAIL_ONLY = "EMAIL_ONLY".asInstanceOf[typings.meteor.meteorStrings.EMAIL_ONLY]
      
      inline def USERNAME_AND_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_EMAIL = "USERNAME_AND_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_EMAIL]
      
      inline def USERNAME_AND_OPTIONAL_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL = "USERNAME_AND_OPTIONAL_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL]
      
      inline def USERNAME_ONLY: typings.meteor.meteorStrings.USERNAME_ONLY = "USERNAME_ONLY".asInstanceOf[typings.meteor.meteorStrings.USERNAME_ONLY]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.meteorStrings.USERNAME_AND_EMAIL
      - typings.meteor.meteorStrings.EMAIL_ONLY
    */
    trait PasswordlessSignupField extends StObject
    object PasswordlessSignupField {
      
      inline def EMAIL_ONLY: typings.meteor.meteorStrings.EMAIL_ONLY = "EMAIL_ONLY".asInstanceOf[typings.meteor.meteorStrings.EMAIL_ONLY]
      
      inline def USERNAME_AND_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_EMAIL = "USERNAME_AND_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_EMAIL]
    }
    
    trait StampedLoginToken extends StObject {
      
      var token: String
      
      var when: js.Date
    }
    object StampedLoginToken {
      
      inline def apply(token: String, when: js.Date): StampedLoginToken = {
        val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
        __obj.asInstanceOf[StampedLoginToken]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StampedLoginToken] (val x: Self) extends AnyVal {
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait EmailFields extends StObject {
    
    var from: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
    
    var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
    
    var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
    
    var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
  }
  object EmailFields {
    
    inline def apply(): typings.meteor.accountsBaseMod.EmailFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.meteor.accountsBaseMod.EmailFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.accountsBaseMod.EmailFields] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: /* user */ User => String): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHtml(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setSubject(value: /* user */ User => String): Self = StObject.set(x, "subject", js.Any.fromFunction1(value))
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait EmailTemplates extends StObject {
    
    var enrollAccount: typings.meteor.accountsBaseMod.EmailFields
    
    var from: String
    
    var headers: js.UndefOr[typings.meteor.accountsBaseMod.Header] = js.undefined
    
    var resetPassword: typings.meteor.accountsBaseMod.EmailFields
    
    var siteName: String
    
    var verifyEmail: typings.meteor.accountsBaseMod.EmailFields
  }
  object EmailTemplates {
    
    inline def apply(
      enrollAccount: typings.meteor.accountsBaseMod.EmailFields,
      from: String,
      resetPassword: typings.meteor.accountsBaseMod.EmailFields,
      siteName: String,
      verifyEmail: typings.meteor.accountsBaseMod.EmailFields
    ): typings.meteor.accountsBaseMod.EmailTemplates = {
      val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.accountsBaseMod.EmailTemplates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.accountsBaseMod.EmailTemplates] (val x: Self) extends AnyVal {
      
      inline def setEnrollAccount(value: typings.meteor.accountsBaseMod.EmailFields): Self = StObject.set(x, "enrollAccount", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: typings.meteor.accountsBaseMod.Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setResetPassword(value: typings.meteor.accountsBaseMod.EmailFields): Self = StObject.set(x, "resetPassword", value.asInstanceOf[js.Any])
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setVerifyEmail(value: typings.meteor.accountsBaseMod.EmailFields): Self = StObject.set(x, "verifyEmail", value.asInstanceOf[js.Any])
    }
  }
  
  type Header = StringDictionary[String]
  
  trait URLS extends StObject {
    
    def enrollAccount(token: String): String
    
    def resetPassword(token: String): String
    
    def verifyEmail(token: String): String
  }
  object URLS {
    
    inline def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): typings.meteor.accountsBaseMod.URLS = {
      val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
      __obj.asInstanceOf[typings.meteor.accountsBaseMod.URLS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.accountsBaseMod.URLS] (val x: Self) extends AnyVal {
      
      inline def setEnrollAccount(value: String => String): Self = StObject.set(x, "enrollAccount", js.Any.fromFunction1(value))
      
      inline def setResetPassword(value: String => String): Self = StObject.set(x, "resetPassword", js.Any.fromFunction1(value))
      
      inline def setVerifyEmail(value: String => String): Self = StObject.set(x, "verifyEmail", js.Any.fromFunction1(value))
    }
  }
}

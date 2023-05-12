package typings.meteor.global

import typings.meteor.Accounts.HashedStampedLoginToken
import typings.meteor.Accounts.LoginMethodOptions
import typings.meteor.Accounts.LoginMethodResult
import typings.meteor.Accounts.Password
import typings.meteor.Accounts.StampedLoginToken
import typings.meteor.EmailTemplates
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.TypedError
import typings.meteor.Meteor.User
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.Selector
import typings.meteor.URLS
import typings.meteor.anon.Algorithm
import typings.meteor.anon.AmbiguousErrorMessages
import typings.meteor.anon.Connection
import typings.meteor.anon.Fields
import typings.meteor.anon.Logout
import typings.meteor.anon.PasswordSignupFields
import typings.meteor.anon.Profile
import typings.meteor.anon.Stop
import typings.meteor.anon.UserId
import typings.meteor.anon.`0`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSGlobal("Accounts.emailTemplates")
  @js.native
  def emailTemplates: EmailTemplates = js.native
  inline def emailTemplates_=(x: EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
  
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
    
    @JSGlobal("Accounts.ui")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(options: PasswordSignupFields): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Accounts.urls")
  @js.native
  def urls: URLS = js.native
  inline def urls_=(x: URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
  
  inline def user(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User | Null]
  inline def user(options: Fields): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("user")(options.asInstanceOf[js.Any]).asInstanceOf[User | Null]
  
  inline def userAsync(): js.Promise[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAsync")().asInstanceOf[js.Promise[User | Null]]
  inline def userAsync(options: Fields): js.Promise[User | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User | Null]]
  
  inline def userId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String | Null]
  
  inline def validateLoginAttempt(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoginAttempt")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
  
  inline def validateNewUser(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNewUser")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def verifyEmail(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def verifyEmail(token: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

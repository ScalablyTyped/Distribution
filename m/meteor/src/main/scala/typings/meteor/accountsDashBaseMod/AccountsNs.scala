package typings.meteor.accountsDashBaseMod

import typings.meteor.Anon_Algorithm
import typings.meteor.Anon_AlgorithmDigest
import typings.meteor.Anon_AmbiguousErrorMessages
import typings.meteor.Anon_Email
import typings.meteor.Anon_EmailString
import typings.meteor.Anon_Error
import typings.meteor.Anon_ForceApprovalPrompt
import typings.meteor.Anon_Logout
import typings.meteor.Anon_Profile
import typings.meteor.Anon_Stop
import typings.meteor.MeteorNs.Connection
import typings.meteor.MeteorNs.Error
import typings.meteor.MeteorNs.TypedError
import typings.meteor.MeteorNs.User
import typings.meteor.accountsDashBaseMod.AccountsNs.LoginMethodOptions
import typings.meteor.accountsDashBaseMod.AccountsNs.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts")
@js.native
object AccountsNs extends js.Object {
  trait IValidateLoginAttemptCbOpts extends js.Object {
    var allowed: Boolean
    var connection: Connection
    var error: Error
    var methodArguments: js.Array[_]
    var methodName: String
    var `type`: String
    var user: User
  }
  
  trait LoginMethodOptions extends js.Object {
    /**
      * The arguments for the method
      */
    var methodArguments: js.UndefOr[js.Array[_]] = js.undefined
    /**
      * The method to call (default 'login')
      */
    var methodName: js.UndefOr[String] = js.undefined
    /**
      * Will be called with no arguments once the user is fully
      * logged in, or with the error on error.
      */
    var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.undefined
    /**
      * If provided, will be called with the result of the
      * method. If it throws, the client will not be logged in (and
      * its error will be passed to the callback).
      */
    var validateResult: js.UndefOr[js.Function] = js.undefined
  }
  
  var emailTemplates: typings.meteor.accountsDashBaseMod.EmailTemplates = js.native
  var urls: typings.meteor.accountsDashBaseMod.URLS = js.native
  /**
    *
    * Check whether the provided password matches the bcrypt'ed password in
    * the database user record. `password` can be a string (in which case
    * it will be run through SHA256 before bcrypt) or an object with
    * properties `digest` and `algorithm` (in which case we bcrypt
    * `password.digest`).
    */
  def _checkPassword(user: User, password: Password): Anon_Error = js.native
  def _hashPassword(password: String): Anon_Algorithm = js.native
  def addEmail(userId: String, newEmail: String): Unit = js.native
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
  def callLoginMethod(options: LoginMethodOptions): Unit = js.native
  def changePassword(oldPassword: String, newPassword: String): Unit = js.native
  def changePassword(
    oldPassword: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]
  ): Unit = js.native
  def config(options: Anon_AmbiguousErrorMessages): Unit = js.native
  def createUser(options: Anon_Email): String = js.native
  def createUser(
    options: Anon_Email,
    callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]
  ): String = js.native
  def findUserByEmail(email: String): js.UndefOr[User | Null] = js.native
  def findUserByUsername(username: String): js.UndefOr[User | Null] = js.native
  def forgotPassword(options: Anon_EmailString): Unit = js.native
  def forgotPassword(
    options: Anon_EmailString,
    callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]
  ): Unit = js.native
  def loggingIn(): Boolean = js.native
  def loginServicesConfigured(): Boolean = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]): Unit = js.native
  def logoutOtherClients(): Unit = js.native
  def logoutOtherClients(callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]): Unit = js.native
  def onCreateUser(func: js.Function2[/* options */ Anon_Profile, /* user */ User, Unit]): Unit = js.native
  def onEmailVerificationLink(callback: js.Function): Unit = js.native
  def onEnrollmentLink(callback: js.Function): Unit = js.native
  def onLogin(func: js.Function): Anon_Stop = js.native
  def onLoginFailure(func: js.Function): Anon_Stop = js.native
  def onLogout(func: js.Function): Unit = js.native
  def onLogout(func: js.Function2[/* user */ User, /* connection */ Connection, Unit]): Unit = js.native
  def onPageLoadLogin(func: js.Function): Unit = js.native
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
  def registerLoginHandler(name: String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): Unit = js.native
  def removeEmail(userId: String, email: String): Unit = js.native
  def resetPassword(token: String, newPassword: String): Unit = js.native
  def resetPassword(
    token: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]
  ): Unit = js.native
  def sendEnrollmentEmail(userId: String): Unit = js.native
  def sendEnrollmentEmail(userId: String, email: String): Unit = js.native
  def sendResetPasswordEmail(userId: String): Unit = js.native
  def sendResetPasswordEmail(userId: String, email: String): Unit = js.native
  def sendVerificationEmail(userId: String): Unit = js.native
  def sendVerificationEmail(userId: String, email: String): Unit = js.native
  def setPassword(userId: String, newPassword: String): Unit = js.native
  def setPassword(userId: String, newPassword: String, options: Anon_Logout): Unit = js.native
  def setUsername(userId: String, newUsername: String): Unit = js.native
  def user(): User | Null = js.native
  def userId(): String | Null = js.native
  def validateLoginAttempt(func: js.Function): Anon_Stop = js.native
  def validateNewUser(func: js.Function): Boolean = js.native
  def verifyEmail(token: String): Unit = js.native
  def verifyEmail(
    token: String,
    callback: js.Function1[/* error */ js.UndefOr[typings.std.Error | Error | TypedError], Unit]
  ): Unit = js.native
  @js.native
  object ui extends js.Object {
    def config(options: Anon_ForceApprovalPrompt): Unit = js.native
  }
  
  type Password = String | Anon_AlgorithmDigest
}


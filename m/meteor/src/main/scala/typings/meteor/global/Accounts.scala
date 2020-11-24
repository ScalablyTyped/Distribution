package typings.meteor.global

import typings.meteor.Accounts.LoginMethodOptions
import typings.meteor.Accounts.Password
import typings.meteor.EmailTemplates
import typings.meteor.Meteor.TypedError
import typings.meteor.Meteor.User
import typings.meteor.URLS
import typings.meteor.anon.Algorithm
import typings.meteor.anon.AmbiguousErrorMessages
import typings.meteor.anon.Connection
import typings.meteor.anon.ForceApprovalPrompt
import typings.meteor.anon.Logout
import typings.meteor.anon.Profile
import typings.meteor.anon.Stop
import typings.meteor.anon.`0`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Accounts")
@js.native
object Accounts extends js.Object {
  
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
  @JSName("_checkPassword")
  def checkPassword(user: User, password: Password): typings.meteor.anon.Error = js.native
  
  def config(options: AmbiguousErrorMessages): Unit = js.native
  
  def createUser(options: typings.meteor.anon.Email): String = js.native
  def createUser(
    options: typings.meteor.anon.Email,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): String = js.native
  
  var emailTemplates: EmailTemplates = js.native
  
  def findUserByEmail(email: String): js.UndefOr[User | Null] = js.native
  
  def findUserByUsername(username: String): js.UndefOr[User | Null] = js.native
  
  def forgotPassword(options: `0`): Unit = js.native
  def forgotPassword(
    options: `0`,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
  
  @JSName("_hashPassword")
  def hashPassword(password: String): Algorithm = js.native
  
  def loggingIn(): Boolean = js.native
  
  def loginServicesConfigured(): Boolean = js.native
  
  def logout(): Unit = js.native
  def logout(
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
  
  def logoutOtherClients(): Unit = js.native
  def logoutOtherClients(
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
  
  def onCreateUser(func: js.Function2[/* options */ Profile, /* user */ User, Unit]): Unit = js.native
  
  def onEmailVerificationLink(callback: js.Function): Unit = js.native
  
  def onEnrollmentLink(callback: js.Function): Unit = js.native
  
  def onLogin(func: js.Function): Stop = js.native
  
  def onLoginFailure(func: js.Function): Stop = js.native
  
  def onLogout(func: js.Function): Unit = js.native
  def onLogout(func: js.Function1[/* options */ Connection, Unit]): Unit = js.native
  
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
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
  
  def sendEnrollmentEmail(userId: String): Unit = js.native
  def sendEnrollmentEmail(userId: String, email: String): Unit = js.native
  
  def sendResetPasswordEmail(userId: String): Unit = js.native
  def sendResetPasswordEmail(userId: String, email: String): Unit = js.native
  
  def sendVerificationEmail(userId: String): Unit = js.native
  def sendVerificationEmail(userId: String, email: String): Unit = js.native
  
  def setPassword(userId: String, newPassword: String): Unit = js.native
  def setPassword(userId: String, newPassword: String, options: Logout): Unit = js.native
  
  def setUsername(userId: String, newUsername: String): Unit = js.native
  
  var urls: URLS = js.native
  
  def user(): User | Null = js.native
  
  def userId(): String | Null = js.native
  
  def validateLoginAttempt(func: js.Function): Stop = js.native
  
  def validateNewUser(func: js.Function): Boolean = js.native
  
  def verifyEmail(token: String): Unit = js.native
  def verifyEmail(
    token: String,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
  
  @js.native
  object ui extends js.Object {
    
    def config(options: ForceApprovalPrompt): Unit = js.native
  }
}

package typings
package meteorLib.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts")
@js.native
object ^ extends js.Object {
  var emailTemplates: meteorLib.EmailTemplates = js.native
  var urls: meteorLib.URLS = js.native
  /**
    *
    * Check whether the provided password matches the bcrypt'ed password in
    * the database user record. `password` can be a string (in which case
    * it will be run through SHA256 before bcrypt) or an object with
    * properties `digest` and `algorithm` (in which case we bcrypt
    * `password.digest`).
    */
  def _checkPassword(user: meteorLib.MeteorNs.User, password: Password): meteorLib.Anon_Error = js.native
  def _hashPassword(password: java.lang.String): meteorLib.Anon_Algorithm = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String): scala.Unit = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String, verified: scala.Boolean): scala.Unit = js.native
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
  def callLoginMethod(options: LoginMethodOptions): scala.Unit = js.native
  def changePassword(oldPassword: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def changePassword(
    oldPassword: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def config(options: meteorLib.Anon_AmbiguousErrorMessages): scala.Unit = js.native
  def createUser(options: meteorLib.Anon_Email): java.lang.String = js.native
  def createUser(
    options: meteorLib.Anon_Email,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def findUserByEmail(email: java.lang.String): js.UndefOr[meteorLib.MeteorNs.User | scala.Null] = js.native
  def findUserByUsername(username: java.lang.String): js.UndefOr[meteorLib.MeteorNs.User | scala.Null] = js.native
  def forgotPassword(options: meteorLib.Anon_EmailString): scala.Unit = js.native
  def forgotPassword(
    options: meteorLib.Anon_EmailString,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loggingIn(): scala.Boolean = js.native
  def loginServicesConfigured(): scala.Boolean = js.native
  def logout(): scala.Unit = js.native
  def logout(
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def logoutOtherClients(): scala.Unit = js.native
  def logoutOtherClients(
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onCreateUser(
    func: js.Function2[/* options */ meteorLib.Anon_Profile, /* user */ meteorLib.MeteorNs.User, scala.Unit]
  ): scala.Unit = js.native
  def onEmailVerificationLink(callback: js.Function): scala.Unit = js.native
  def onEnrollmentLink(callback: js.Function): scala.Unit = js.native
  def onLogin(func: js.Function): meteorLib.Anon_Stop = js.native
  def onLoginFailure(func: js.Function): meteorLib.Anon_Stop = js.native
  def onLogout(func: js.Function): scala.Unit = js.native
  def onLogout(
    func: js.Function2[
      /* user */ meteorLib.MeteorNs.User, 
      /* connection */ meteorLib.MeteorNs.Connection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onPageLoadLogin(func: js.Function): scala.Unit = js.native
  def onResetPasswordLink(callback: js.Function): scala.Unit = js.native
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
  def registerLoginHandler(name: java.lang.String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): scala.Unit = js.native
  def removeEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def resetPassword(token: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def resetPassword(
    token: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String, options: meteorLib.Anon_Logout): scala.Unit = js.native
  def setUsername(userId: java.lang.String, newUsername: java.lang.String): scala.Unit = js.native
  def user(): meteorLib.MeteorNs.User | scala.Null = js.native
  def userId(): java.lang.String | scala.Null = js.native
  def validateLoginAttempt(func: js.Function): meteorLib.Anon_Stop = js.native
  def validateNewUser(func: js.Function): scala.Boolean = js.native
  def verifyEmail(token: java.lang.String): scala.Unit = js.native
  def verifyEmail(
    token: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}


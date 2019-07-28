package typings.meteorDashTypings.AccountsNs

import typings.meteorDashTypings.Anon_Email
import typings.meteorDashTypings.Anon_EmailString
import typings.meteorDashTypings.Anon_ForbidClientAccountCreation
import typings.meteorDashTypings.Anon_Logout
import typings.meteorDashTypings.Anon_Stop
import typings.meteorDashTypings.EmailTemplates
import typings.meteorDashTypings.MeteorNs.Connection
import typings.meteorDashTypings.MeteorNs.User
import typings.meteorDashTypings.URLS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts")
@js.native
object ^ extends js.Object {
  var emailTemplates: EmailTemplates = js.native
  var urls: URLS = js.native
  def addEmail(userId: String, newEmail: String): Unit = js.native
  def addEmail(userId: String, newEmail: String, verified: Boolean): Unit = js.native
  def changePassword(oldPassword: String, newPassword: String): Unit = js.native
  def changePassword(oldPassword: String, newPassword: String, callback: js.Function): Unit = js.native
  def config(options: Anon_ForbidClientAccountCreation): Unit = js.native
  def createUser(options: Anon_Email): String = js.native
  def createUser(options: Anon_Email, callback: js.Function): String = js.native
  def findUserByEmail(email: String): js.Object = js.native
  def findUserByUsername(username: String): js.Object = js.native
  def forgotPassword(options: Anon_EmailString): Unit = js.native
  def forgotPassword(options: Anon_EmailString, callback: js.Function): Unit = js.native
  def loggingIn(): Boolean = js.native
  def loginServicesConfigured(): Boolean = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function): Unit = js.native
  def logoutOtherClients(): Unit = js.native
  def logoutOtherClients(callback: js.Function): Unit = js.native
  def makeClientLoggedOut(): Boolean | Unit = js.native
  def onCreateUser(func: js.Function): Unit = js.native
  def onEmailVerificationLink(callback: js.Function): Unit = js.native
  def onEnrollmentLink(callback: js.Function): Unit = js.native
  def onLogin(func: js.Function): Anon_Stop = js.native
  def onLoginFailure(func: js.Function): Anon_Stop = js.native
  def onLogout(func: js.Function): Unit = js.native
  def onLogout(func: js.Function2[/* user */ User, /* connection */ Connection, Unit]): Unit = js.native
  def onPageLoadLogin(func: js.Function): Unit = js.native
  def onResetPasswordLink(callback: js.Function): Unit = js.native
  def removeEmail(userId: String, email: String): Unit = js.native
  def resetPassword(token: String, newPassword: String): Unit = js.native
  def resetPassword(token: String, newPassword: String, callback: js.Function): Unit = js.native
  def sendEnrollmentEmail(userId: String): Unit = js.native
  def sendEnrollmentEmail(userId: String, email: String): Unit = js.native
  def sendResetPasswordEmail(userId: String): Unit = js.native
  def sendResetPasswordEmail(userId: String, email: String): Unit = js.native
  def sendVerificationEmail(userId: String): Unit = js.native
  def sendVerificationEmail(userId: String, email: String): Unit = js.native
  def setPassword(userId: String, newPassword: String): Unit = js.native
  def setPassword(userId: String, newPassword: String, options: Anon_Logout): Unit = js.native
  def setUsername(userId: String, newUsername: String): Unit = js.native
  def user(): User = js.native
  def userId(): String = js.native
  def validateLoginAttempt(func: js.Function): Anon_Stop = js.native
  def validateNewUser(func: js.Function): Boolean = js.native
  def verifyEmail(token: String): Unit = js.native
  def verifyEmail(token: String, callback: js.Function): Unit = js.native
}


package typings
package meteorDashTypingsLib.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts")
@js.native
object AccountsNs extends js.Object {
  trait IValidateLoginAttemptCbOpts extends js.Object {
    var allowed: scala.Boolean
    var connection: meteorDashTypingsLib.MeteorNs.Connection
    var error: meteorDashTypingsLib.MeteorNs.Error
    var methodArguments: js.Array[_]
    var methodName: java.lang.String
    var `type`: java.lang.String
    var user: meteorDashTypingsLib.MeteorNs.User
  }
  
  var emailTemplates: meteorDashTypingsLib.accountsDashBaseMod.EmailTemplates = js.native
  var ui: meteorDashTypingsLib.Anon_Config = js.native
  var urls: meteorDashTypingsLib.accountsDashBaseMod.URLS = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String): scala.Unit = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String, verified: scala.Boolean): scala.Unit = js.native
  def changePassword(oldPassword: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def changePassword(oldPassword: java.lang.String, newPassword: java.lang.String, callback: js.Function): scala.Unit = js.native
  def config(options: meteorDashTypingsLib.Anon_RestrictCreationByEmailDomain): scala.Unit = js.native
  def createUser(options: meteorDashTypingsLib.Anon_Username): java.lang.String = js.native
  def createUser(options: meteorDashTypingsLib.Anon_Username, callback: js.Function): java.lang.String = js.native
  def findUserByEmail(email: java.lang.String): js.Object = js.native
  def findUserByUsername(username: java.lang.String): js.Object = js.native
  def forgotPassword(options: meteorDashTypingsLib.Anon_Email): scala.Unit = js.native
  def forgotPassword(options: meteorDashTypingsLib.Anon_Email, callback: js.Function): scala.Unit = js.native
  def loggingIn(): scala.Boolean = js.native
  def loginServicesConfigured(): scala.Boolean = js.native
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function): scala.Unit = js.native
  def logoutOtherClients(): scala.Unit = js.native
  def logoutOtherClients(callback: js.Function): scala.Unit = js.native
  def makeClientLoggedOut(): scala.Boolean | scala.Unit = js.native
  def onCreateUser(func: js.Function): scala.Unit = js.native
  def onEmailVerificationLink(callback: js.Function): scala.Unit = js.native
  def onEnrollmentLink(callback: js.Function): scala.Unit = js.native
  def onLogin(func: js.Function): meteorDashTypingsLib.Anon_Stop = js.native
  def onLoginFailure(func: js.Function): meteorDashTypingsLib.Anon_Stop = js.native
  def onLogout(func: js.Function): scala.Unit = js.native
  def onLogout(
    func: js.Function2[
      /* user */ meteorDashTypingsLib.MeteorNs.User, 
      /* connection */ meteorDashTypingsLib.MeteorNs.Connection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onPageLoadLogin(func: js.Function): scala.Unit = js.native
  def onResetPasswordLink(callback: js.Function): scala.Unit = js.native
  def removeEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def resetPassword(token: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def resetPassword(token: java.lang.String, newPassword: java.lang.String, callback: js.Function): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String, options: meteorDashTypingsLib.Anon_Logout): scala.Unit = js.native
  def setUsername(userId: java.lang.String, newUsername: java.lang.String): scala.Unit = js.native
  def user(): meteorDashTypingsLib.MeteorNs.User = js.native
  def userId(): java.lang.String = js.native
  def validateLoginAttempt(func: js.Function): meteorDashTypingsLib.Anon_Stop = js.native
  def validateNewUser(func: js.Function): scala.Boolean = js.native
  def verifyEmail(token: java.lang.String): scala.Unit = js.native
  def verifyEmail(token: java.lang.String, callback: js.Function): scala.Unit = js.native
}


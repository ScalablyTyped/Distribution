package typings
package meteorDashAccountsDashPhoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts")
@js.native
object AccountsNs extends js.Object {
  def createUserWithPhone(options: js.Object): scala.Unit = js.native
  def createUserWithPhone(options: js.Object, callback: js.Function): scala.Unit = js.native
  def isPhoneVerified(): scala.Boolean = js.native
  def onPhoneVerification(func: js.Function): scala.Unit = js.native
  def requestPhoneVerification(phone: java.lang.String): scala.Unit = js.native
  def requestPhoneVerification(phone: java.lang.String, callback: js.Function): scala.Unit = js.native
  def verifyPhone(phone: java.lang.String, code: java.lang.String): scala.Unit = js.native
  def verifyPhone(phone: java.lang.String, code: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def verifyPhone(
    phone: java.lang.String,
    code: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function
  ): scala.Unit = js.native
  def verifyPhone(phone: java.lang.String, code: java.lang.String, newPassword: js.Function): scala.Unit = js.native
  def verifyPhone(phone: java.lang.String, code: java.lang.String, newPassword: js.Function, callback: js.Function): scala.Unit = js.native
  @js.native
  object _options extends js.Object {
    var adminPhoneNumbers: js.UndefOr[js.Array[java.lang.String]] = js.native
    var forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.native
    var phoneVerificationMasterCode: js.UndefOr[js.Array[java.lang.String]] = js.native
    var sendPhoneVerificationCodeOnCreation: js.UndefOr[scala.Boolean] = js.native
    var verificationCodeLength: js.UndefOr[scala.Double] = js.native
    var verificationMaxRetries: js.UndefOr[scala.Double] = js.native
    var verificationRetriesWaitTime: js.UndefOr[scala.Double] = js.native
    var verificationWaitTime: js.UndefOr[scala.Double] = js.native
  }
  
}


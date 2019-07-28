package typings.meteorDashAccountsDashPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", JSImport.Namespace)
@js.native
object meteorAccountsDashBaseMod extends js.Object {
  @JSName("Accounts")
  @js.native
  object AccountsNs extends js.Object {
    def createUserWithPhone(options: js.Object): Unit = js.native
    def createUserWithPhone(options: js.Object, callback: js.Function): Unit = js.native
    def isPhoneVerified(): Boolean = js.native
    def onPhoneVerification(func: js.Function): Unit = js.native
    def requestPhoneVerification(phone: String): Unit = js.native
    def requestPhoneVerification(phone: String, callback: js.Function): Unit = js.native
    def verifyPhone(phone: String, code: String): Unit = js.native
    def verifyPhone(phone: String, code: String, newPassword: String): Unit = js.native
    def verifyPhone(phone: String, code: String, newPassword: String, callback: js.Function): Unit = js.native
    def verifyPhone(phone: String, code: String, newPassword: js.Function): Unit = js.native
    def verifyPhone(phone: String, code: String, newPassword: js.Function, callback: js.Function): Unit = js.native
    @js.native
    object _options extends js.Object {
      var adminPhoneNumbers: js.UndefOr[js.Array[String]] = js.native
      var forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
      var phoneVerificationMasterCode: js.UndefOr[js.Array[String]] = js.native
      var sendPhoneVerificationCodeOnCreation: js.UndefOr[Boolean] = js.native
      var verificationCodeLength: js.UndefOr[Double] = js.native
      var verificationMaxRetries: js.UndefOr[Double] = js.native
      var verificationRetriesWaitTime: js.UndefOr[Double] = js.native
      var verificationWaitTime: js.UndefOr[Double] = js.native
    }
    
  }
  
}


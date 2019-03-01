package typings
package meteorDashAccountsDashPhoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminPhoneNumbers extends js.Object {
  var adminPhoneNumbers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined
  var phoneVerificationMasterCode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sendPhoneVerificationCodeOnCreation: js.UndefOr[scala.Boolean] = js.undefined
  var verificationCodeLength: js.UndefOr[scala.Double] = js.undefined
  var verificationMaxRetries: js.UndefOr[scala.Double] = js.undefined
  var verificationRetriesWaitTime: js.UndefOr[scala.Double] = js.undefined
  var verificationWaitTime: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AdminPhoneNumbers {
  @scala.inline
  def apply(
    adminPhoneNumbers: js.Array[java.lang.String] = null,
    forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined,
    phoneVerificationMasterCode: js.Array[java.lang.String] = null,
    sendPhoneVerificationCodeOnCreation: js.UndefOr[scala.Boolean] = js.undefined,
    verificationCodeLength: scala.Int | scala.Double = null,
    verificationMaxRetries: scala.Int | scala.Double = null,
    verificationRetriesWaitTime: scala.Int | scala.Double = null,
    verificationWaitTime: scala.Int | scala.Double = null
  ): Anon_AdminPhoneNumbers = {
    val __obj = js.Dynamic.literal()
    if (adminPhoneNumbers != null) __obj.updateDynamic("adminPhoneNumbers")(adminPhoneNumbers)
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation)
    if (phoneVerificationMasterCode != null) __obj.updateDynamic("phoneVerificationMasterCode")(phoneVerificationMasterCode)
    if (!js.isUndefined(sendPhoneVerificationCodeOnCreation)) __obj.updateDynamic("sendPhoneVerificationCodeOnCreation")(sendPhoneVerificationCodeOnCreation)
    if (verificationCodeLength != null) __obj.updateDynamic("verificationCodeLength")(verificationCodeLength.asInstanceOf[js.Any])
    if (verificationMaxRetries != null) __obj.updateDynamic("verificationMaxRetries")(verificationMaxRetries.asInstanceOf[js.Any])
    if (verificationRetriesWaitTime != null) __obj.updateDynamic("verificationRetriesWaitTime")(verificationRetriesWaitTime.asInstanceOf[js.Any])
    if (verificationWaitTime != null) __obj.updateDynamic("verificationWaitTime")(verificationWaitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdminPhoneNumbers]
  }
}


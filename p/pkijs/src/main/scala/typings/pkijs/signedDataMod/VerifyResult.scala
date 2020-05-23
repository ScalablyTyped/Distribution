package typings.pkijs.signedDataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var code: Double
  var date: Date
  var message: String
  var signatureVerified: js.UndefOr[Boolean] = js.undefined
  var signerCertificate: js.UndefOr[typings.pkijs.certificateMod.default] = js.undefined
  var signerCertificateVerified: js.UndefOr[Boolean] = js.undefined
}

object VerifyResult {
  @scala.inline
  def apply(
    code: Double,
    date: Date,
    message: String,
    signatureVerified: js.UndefOr[Boolean] = js.undefined,
    signerCertificate: typings.pkijs.certificateMod.default = null,
    signerCertificateVerified: js.UndefOr[Boolean] = js.undefined
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureVerified)) __obj.updateDynamic("signatureVerified")(signatureVerified.get.asInstanceOf[js.Any])
    if (signerCertificate != null) __obj.updateDynamic("signerCertificate")(signerCertificate.asInstanceOf[js.Any])
    if (!js.isUndefined(signerCertificateVerified)) __obj.updateDynamic("signerCertificateVerified")(signerCertificateVerified.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
}


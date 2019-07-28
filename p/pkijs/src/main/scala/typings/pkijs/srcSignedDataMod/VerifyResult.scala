package typings.pkijs.srcSignedDataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var code: Double
  var date: Date
  var message: String
  var signatureVerified: js.UndefOr[Boolean] = js.undefined
  var signerCertificate: js.UndefOr[typings.pkijs.srcCertificateMod.default] = js.undefined
  var signerCertificateVerified: js.UndefOr[Boolean] = js.undefined
}

object VerifyResult {
  @scala.inline
  def apply(
    code: Double,
    date: Date,
    message: String,
    signatureVerified: js.UndefOr[Boolean] = js.undefined,
    signerCertificate: typings.pkijs.srcCertificateMod.default = null,
    signerCertificateVerified: js.UndefOr[Boolean] = js.undefined
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(code = code, date = date, message = message)
    if (!js.isUndefined(signatureVerified)) __obj.updateDynamic("signatureVerified")(signatureVerified)
    if (signerCertificate != null) __obj.updateDynamic("signerCertificate")(signerCertificate)
    if (!js.isUndefined(signerCertificateVerified)) __obj.updateDynamic("signerCertificateVerified")(signerCertificateVerified)
    __obj.asInstanceOf[VerifyResult]
  }
}


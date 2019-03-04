package typings
package pkijsLib.srcSignedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var code: scala.Double
  var date: stdLib.Date
  var message: java.lang.String
  var signatureVerified: js.UndefOr[scala.Boolean] = js.undefined
  var signerCertificate: js.UndefOr[pkijsLib.srcCertificateMod.default] = js.undefined
  var signerCertificateVerified: js.UndefOr[scala.Boolean] = js.undefined
}

object VerifyResult {
  @scala.inline
  def apply(
    code: scala.Double,
    date: stdLib.Date,
    message: java.lang.String,
    signatureVerified: js.UndefOr[scala.Boolean] = js.undefined,
    signerCertificate: pkijsLib.srcCertificateMod.default = null,
    signerCertificateVerified: js.UndefOr[scala.Boolean] = js.undefined
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(code = code, date = date, message = message)
    if (!js.isUndefined(signatureVerified)) __obj.updateDynamic("signatureVerified")(signatureVerified)
    if (signerCertificate != null) __obj.updateDynamic("signerCertificate")(signerCertificate)
    if (!js.isUndefined(signerCertificateVerified)) __obj.updateDynamic("signerCertificateVerified")(signerCertificateVerified)
    __obj.asInstanceOf[VerifyResult]
  }
}


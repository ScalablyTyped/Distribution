package typings
package pkijsLib.srcSignedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyParams extends js.Object {
  var checkChain: js.UndefOr[scala.Boolean] = js.undefined
  var checkDate: js.UndefOr[stdLib.Date] = js.undefined
  var data: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  var extendedMode: js.UndefOr[scala.Boolean] = js.undefined
  var includeSignerCertificate: js.UndefOr[scala.Boolean] = js.undefined
  var signer: js.UndefOr[scala.Double] = js.undefined
  var trustedCerts: js.UndefOr[js.Array[pkijsLib.srcCertificateMod.default]] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(
    checkChain: js.UndefOr[scala.Boolean] = js.undefined,
    checkDate: stdLib.Date = null,
    data: stdLib.ArrayBuffer = null,
    extendedMode: js.UndefOr[scala.Boolean] = js.undefined,
    includeSignerCertificate: js.UndefOr[scala.Boolean] = js.undefined,
    signer: scala.Int | scala.Double = null,
    trustedCerts: js.Array[pkijsLib.srcCertificateMod.default] = null
  ): VerifyParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkChain)) __obj.updateDynamic("checkChain")(checkChain)
    if (checkDate != null) __obj.updateDynamic("checkDate")(checkDate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(extendedMode)) __obj.updateDynamic("extendedMode")(extendedMode)
    if (!js.isUndefined(includeSignerCertificate)) __obj.updateDynamic("includeSignerCertificate")(includeSignerCertificate)
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts)
    __obj.asInstanceOf[VerifyParams]
  }
}


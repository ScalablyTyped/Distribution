package typings.pkijs.srcSignedDataMod

import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyParams extends js.Object {
  var checkChain: js.UndefOr[Boolean] = js.undefined
  var checkDate: js.UndefOr[Date] = js.undefined
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  var extendedMode: js.UndefOr[Boolean] = js.undefined
  var includeSignerCertificate: js.UndefOr[Boolean] = js.undefined
  var signer: js.UndefOr[Double] = js.undefined
  var trustedCerts: js.UndefOr[js.Array[typings.pkijs.srcCertificateMod.default]] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(
    checkChain: js.UndefOr[Boolean] = js.undefined,
    checkDate: Date = null,
    data: ArrayBuffer = null,
    extendedMode: js.UndefOr[Boolean] = js.undefined,
    includeSignerCertificate: js.UndefOr[Boolean] = js.undefined,
    signer: Int | Double = null,
    trustedCerts: js.Array[typings.pkijs.srcCertificateMod.default] = null
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


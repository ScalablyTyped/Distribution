package typings.pkijs.signedDataMod

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
  var trustedCerts: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(
    checkChain: js.UndefOr[Boolean] = js.undefined,
    checkDate: Date = null,
    data: ArrayBuffer = null,
    extendedMode: js.UndefOr[Boolean] = js.undefined,
    includeSignerCertificate: js.UndefOr[Boolean] = js.undefined,
    signer: js.UndefOr[Double] = js.undefined,
    trustedCerts: js.Array[typings.pkijs.certificateMod.default] = null
  ): VerifyParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkChain)) __obj.updateDynamic("checkChain")(checkChain.get.asInstanceOf[js.Any])
    if (checkDate != null) __obj.updateDynamic("checkDate")(checkDate.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(extendedMode)) __obj.updateDynamic("extendedMode")(extendedMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSignerCertificate)) __obj.updateDynamic("includeSignerCertificate")(includeSignerCertificate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signer)) __obj.updateDynamic("signer")(signer.get.asInstanceOf[js.Any])
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyParams]
  }
}


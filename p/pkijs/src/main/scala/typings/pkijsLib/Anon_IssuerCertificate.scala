package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[pkijsLib.srcCertificateMod.default] = js.undefined
  var publicKeyInfo: js.UndefOr[pkijsLib.srcPublicKeyInfoMod.default] = js.undefined
}

object Anon_IssuerCertificate {
  @scala.inline
  def apply(
    issuerCertificate: pkijsLib.srcCertificateMod.default = null,
    publicKeyInfo: pkijsLib.srcPublicKeyInfoMod.default = null
  ): Anon_IssuerCertificate = {
    val __obj = js.Dynamic.literal()
    if (issuerCertificate != null) __obj.updateDynamic("issuerCertificate")(issuerCertificate)
    if (publicKeyInfo != null) __obj.updateDynamic("publicKeyInfo")(publicKeyInfo)
    __obj.asInstanceOf[Anon_IssuerCertificate]
  }
}


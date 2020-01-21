package typings.pkijs

import typings.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[default] = js.undefined
  var publicKeyInfo: js.UndefOr[typings.pkijs.publicKeyInfoMod.default] = js.undefined
}

object AnonIssuerCertificate {
  @scala.inline
  def apply(issuerCertificate: default = null, publicKeyInfo: typings.pkijs.publicKeyInfoMod.default = null): AnonIssuerCertificate = {
    val __obj = js.Dynamic.literal()
    if (issuerCertificate != null) __obj.updateDynamic("issuerCertificate")(issuerCertificate.asInstanceOf[js.Any])
    if (publicKeyInfo != null) __obj.updateDynamic("publicKeyInfo")(publicKeyInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIssuerCertificate]
  }
}


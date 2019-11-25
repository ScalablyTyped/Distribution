package typings.pkijs

import typings.pkijs.srcCertificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TrustedCerts extends js.Object {
  var trustedCerts: js.UndefOr[js.Array[default]] = js.undefined
}

object Anon_TrustedCerts {
  @scala.inline
  def apply(trustedCerts: js.Array[default] = null): Anon_TrustedCerts = {
    val __obj = js.Dynamic.literal()
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TrustedCerts]
  }
}


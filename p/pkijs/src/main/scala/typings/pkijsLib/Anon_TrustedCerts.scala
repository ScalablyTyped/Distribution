package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TrustedCerts extends js.Object {
  var trustedCerts: js.UndefOr[js.Array[pkijsLib.srcCertificateMod.default]] = js.undefined
}

object Anon_TrustedCerts {
  @scala.inline
  def apply(trustedCerts: js.Array[pkijsLib.srcCertificateMod.default] = null): Anon_TrustedCerts = {
    val __obj = js.Dynamic.literal()
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts)
    __obj.asInstanceOf[Anon_TrustedCerts]
  }
}


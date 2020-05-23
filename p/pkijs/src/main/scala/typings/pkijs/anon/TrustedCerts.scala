package typings.pkijs.anon

import typings.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedCerts extends js.Object {
  var trustedCerts: js.UndefOr[js.Array[default]] = js.undefined
}

object TrustedCerts {
  @scala.inline
  def apply(trustedCerts: js.Array[default] = null): TrustedCerts = {
    val __obj = js.Dynamic.literal()
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedCerts]
  }
}


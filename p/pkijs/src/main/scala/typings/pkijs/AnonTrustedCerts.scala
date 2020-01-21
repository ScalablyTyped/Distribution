package typings.pkijs

import typings.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrustedCerts extends js.Object {
  var trustedCerts: js.UndefOr[js.Array[default]] = js.undefined
}

object AnonTrustedCerts {
  @scala.inline
  def apply(trustedCerts: js.Array[default] = null): AnonTrustedCerts = {
    val __obj = js.Dynamic.literal()
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTrustedCerts]
  }
}


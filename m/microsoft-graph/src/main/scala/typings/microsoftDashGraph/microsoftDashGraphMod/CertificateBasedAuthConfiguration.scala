package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateBasedAuthConfiguration extends Entity {
  // Collection of certificate authorities which creates a trusted certificate chain.
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.undefined
}

object CertificateBasedAuthConfiguration {
  @scala.inline
  def apply(certificateAuthorities: js.Array[CertificateAuthority] = null, id: String = null): CertificateBasedAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorities != null) __obj.updateDynamic("certificateAuthorities")(certificateAuthorities)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CertificateBasedAuthConfiguration]
  }
}


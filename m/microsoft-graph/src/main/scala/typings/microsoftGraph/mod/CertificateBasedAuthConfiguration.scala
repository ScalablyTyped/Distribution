package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateBasedAuthConfiguration extends Entity {
  // Collection of certificate authorities which creates a trusted certificate chain.
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.native
}

object CertificateBasedAuthConfiguration {
  @scala.inline
  def apply(): CertificateBasedAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateBasedAuthConfiguration]
  }
  @scala.inline
  implicit class CertificateBasedAuthConfigurationOps[Self <: CertificateBasedAuthConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = this.set("certificateAuthorities", js.Array(value :_*))
    @scala.inline
    def setCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = this.set("certificateAuthorities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorities: Self = this.set("certificateAuthorities", js.undefined)
  }
  
}


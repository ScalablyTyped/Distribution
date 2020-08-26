package typings.pkijs.anon

import typings.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[default] = js.native
  var publicKeyInfo: js.UndefOr[typings.pkijs.publicKeyInfoMod.default] = js.native
}

object IssuerCertificate {
  @scala.inline
  def apply(): IssuerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerCertificate]
  }
  @scala.inline
  implicit class IssuerCertificateOps[Self <: IssuerCertificate] (val x: Self) extends AnyVal {
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
    def setIssuerCertificate(value: default): Self = this.set("issuerCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerCertificate: Self = this.set("issuerCertificate", js.undefined)
    @scala.inline
    def setPublicKeyInfo(value: typings.pkijs.publicKeyInfoMod.default): Self = this.set("publicKeyInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeyInfo: Self = this.set("publicKeyInfo", js.undefined)
  }
  
}


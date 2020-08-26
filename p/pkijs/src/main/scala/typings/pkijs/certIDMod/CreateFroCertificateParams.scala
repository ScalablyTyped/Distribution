package typings.pkijs.certIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFroCertificateParams extends js.Object {
  var hashAlgorithm: String = js.native
  var issuerCertificate: typings.pkijs.certificateMod.default = js.native
}

object CreateFroCertificateParams {
  @scala.inline
  def apply(hashAlgorithm: String, issuerCertificate: typings.pkijs.certificateMod.default): CreateFroCertificateParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFroCertificateParams]
  }
  @scala.inline
  implicit class CreateFroCertificateParamsOps[Self <: CreateFroCertificateParams] (val x: Self) extends AnyVal {
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
    def setHashAlgorithm(value: String): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuerCertificate(value: typings.pkijs.certificateMod.default): Self = this.set("issuerCertificate", value.asInstanceOf[js.Any])
  }
  
}


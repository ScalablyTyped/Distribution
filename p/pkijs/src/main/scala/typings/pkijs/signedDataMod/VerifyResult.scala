package typings.pkijs.signedDataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResult extends js.Object {
  var code: Double = js.native
  var date: Date = js.native
  var message: String = js.native
  var signatureVerified: js.UndefOr[Boolean] = js.native
  var signerCertificate: js.UndefOr[typings.pkijs.certificateMod.default] = js.native
  var signerCertificateVerified: js.UndefOr[Boolean] = js.native
}

object VerifyResult {
  @scala.inline
  def apply(code: Double, date: Date, message: String): VerifyResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  @scala.inline
  implicit class VerifyResultOps[Self <: VerifyResult] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureVerified(value: Boolean): Self = this.set("signatureVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureVerified: Self = this.set("signatureVerified", js.undefined)
    @scala.inline
    def setSignerCertificate(value: typings.pkijs.certificateMod.default): Self = this.set("signerCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignerCertificate: Self = this.set("signerCertificate", js.undefined)
    @scala.inline
    def setSignerCertificateVerified(value: Boolean): Self = this.set("signerCertificateVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignerCertificateVerified: Self = this.set("signerCertificateVerified", js.undefined)
  }
  
}


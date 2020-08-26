package typings.nodejsLicenseFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var licenseFile: js.UndefOr[String] = js.native
  var licenseFilePath: js.UndefOr[String] = js.native
  var publicKey: js.UndefOr[String] = js.native
  var publicKeyPath: js.UndefOr[String] = js.native
  var template: String = js.native
}

object ParseOptions {
  @scala.inline
  def apply(template: String): ParseOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenseFile(value: String): Self = this.set("licenseFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseFile: Self = this.set("licenseFile", js.undefined)
    @scala.inline
    def setLicenseFilePath(value: String): Self = this.set("licenseFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseFilePath: Self = this.set("licenseFilePath", js.undefined)
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setPublicKeyPath(value: String): Self = this.set("publicKeyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeyPath: Self = this.set("publicKeyPath", js.undefined)
  }
  
}


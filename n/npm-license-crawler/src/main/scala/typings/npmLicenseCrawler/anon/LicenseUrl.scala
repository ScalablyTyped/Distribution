package typings.npmLicenseCrawler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseUrl extends js.Object {
  var licenseUrl: String = js.native
  var licenses: String = js.native
  var parents: String = js.native
  var repository: String = js.native
}

object LicenseUrl {
  @scala.inline
  def apply(licenseUrl: String, licenses: String, parents: String, repository: String): LicenseUrl = {
    val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseUrl]
  }
  @scala.inline
  implicit class LicenseUrlOps[Self <: LicenseUrl] (val x: Self) extends AnyVal {
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
    def setLicenseUrl(value: String): Self = this.set("licenseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenses(value: String): Self = this.set("licenses", value.asInstanceOf[js.Any])
    @scala.inline
    def setParents(value: String): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}


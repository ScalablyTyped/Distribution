package typings.npmLicenseCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLicenseUrl extends js.Object {
  var licenseUrl: String
  var licenses: String
  var parents: String
  var repository: String
}

object AnonLicenseUrl {
  @scala.inline
  def apply(licenseUrl: String, licenses: String, parents: String, repository: String): AnonLicenseUrl = {
    val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLicenseUrl]
  }
}


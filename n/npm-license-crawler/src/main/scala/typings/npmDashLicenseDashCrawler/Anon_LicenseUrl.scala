package typings.npmDashLicenseDashCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LicenseUrl extends js.Object {
  var licenseUrl: String
  var licenses: String
  var parents: String
  var repository: String
}

object Anon_LicenseUrl {
  @scala.inline
  def apply(licenseUrl: String, licenses: String, parents: String, repository: String): Anon_LicenseUrl = {
    val __obj = js.Dynamic.literal(licenseUrl = licenseUrl, licenses = licenses, parents = parents, repository = repository)
  
    __obj.asInstanceOf[Anon_LicenseUrl]
  }
}


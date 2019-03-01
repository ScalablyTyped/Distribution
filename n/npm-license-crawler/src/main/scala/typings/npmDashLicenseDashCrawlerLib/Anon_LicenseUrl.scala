package typings
package npmDashLicenseDashCrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LicenseUrl extends js.Object {
  var licenseUrl: java.lang.String
  var licenses: java.lang.String
  var parents: java.lang.String
  var repository: java.lang.String
}

object Anon_LicenseUrl {
  @scala.inline
  def apply(
    licenseUrl: java.lang.String,
    licenses: java.lang.String,
    parents: java.lang.String,
    repository: java.lang.String
  ): Anon_LicenseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("licenseUrl")(licenseUrl)
    __obj.updateDynamic("licenses")(licenses)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[Anon_LicenseUrl]
  }
}


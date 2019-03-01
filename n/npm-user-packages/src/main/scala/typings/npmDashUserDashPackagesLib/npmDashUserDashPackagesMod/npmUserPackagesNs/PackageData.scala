package typings
package npmDashUserDashPackagesLib.npmDashUserDashPackagesMod.npmUserPackagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageData extends js.Object {
  var author: npmDashUserDashPackagesLib.Anon_Email
  var date: java.lang.String
  var description: java.lang.String
  var keywords: js.Array[java.lang.String]
  var links: npmDashUserDashPackagesLib.Anon_Bugs
  var maintainers: js.Array[npmDashUserDashPackagesLib.Anon_EmailUsername]
  var name: java.lang.String
  var publisher: npmDashUserDashPackagesLib.Anon_EmailUsername
  var scope: java.lang.String
  var version: java.lang.String
}

object PackageData {
  @scala.inline
  def apply(
    author: npmDashUserDashPackagesLib.Anon_Email,
    date: java.lang.String,
    description: java.lang.String,
    keywords: js.Array[java.lang.String],
    links: npmDashUserDashPackagesLib.Anon_Bugs,
    maintainers: js.Array[npmDashUserDashPackagesLib.Anon_EmailUsername],
    name: java.lang.String,
    publisher: npmDashUserDashPackagesLib.Anon_EmailUsername,
    scope: java.lang.String,
    version: java.lang.String
  ): PackageData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("keywords")(keywords)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("maintainers")(maintainers)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publisher")(publisher)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PackageData]
  }
}


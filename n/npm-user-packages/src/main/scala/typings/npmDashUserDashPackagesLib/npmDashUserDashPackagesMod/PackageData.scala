package typings
package npmDashUserDashPackagesLib.npmDashUserDashPackagesMod

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
    val __obj = js.Dynamic.literal(author = author, date = date, description = description, keywords = keywords, links = links, maintainers = maintainers, name = name, publisher = publisher, scope = scope, version = version)
  
    __obj.asInstanceOf[PackageData]
  }
}


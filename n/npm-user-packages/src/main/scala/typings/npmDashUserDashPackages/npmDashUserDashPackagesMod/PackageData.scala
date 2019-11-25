package typings.npmDashUserDashPackages.npmDashUserDashPackagesMod

import typings.npmDashUserDashPackages.Anon_Bugs
import typings.npmDashUserDashPackages.Anon_Email
import typings.npmDashUserDashPackages.Anon_EmailUsername
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageData extends js.Object {
  var author: Anon_Email
  var date: String
  var description: String
  var keywords: js.Array[String]
  var links: Anon_Bugs
  var maintainers: js.Array[Anon_EmailUsername]
  var name: String
  var publisher: Anon_EmailUsername
  var scope: String
  var version: String
}

object PackageData {
  @scala.inline
  def apply(
    author: Anon_Email,
    date: String,
    description: String,
    keywords: js.Array[String],
    links: Anon_Bugs,
    maintainers: js.Array[Anon_EmailUsername],
    name: String,
    publisher: Anon_EmailUsername,
    scope: String,
    version: String
  ): PackageData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageData]
  }
}


package typings.npmUserPackages.mod

import typings.npmUserPackages.AnonBugs
import typings.npmUserPackages.AnonEmail
import typings.npmUserPackages.AnonUsername
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageData extends js.Object {
  var author: AnonEmail
  var date: String
  var description: String
  var keywords: js.Array[String]
  var links: AnonBugs
  var maintainers: js.Array[AnonUsername]
  var name: String
  var publisher: AnonUsername
  var scope: String
  var version: String
}

object PackageData {
  @scala.inline
  def apply(
    author: AnonEmail,
    date: String,
    description: String,
    keywords: js.Array[String],
    links: AnonBugs,
    maintainers: js.Array[AnonUsername],
    name: String,
    publisher: AnonUsername,
    scope: String,
    version: String
  ): PackageData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageData]
  }
}


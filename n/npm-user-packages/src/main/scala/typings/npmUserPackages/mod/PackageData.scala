package typings.npmUserPackages.mod

import typings.npmUserPackages.anon.Bugs
import typings.npmUserPackages.anon.Email
import typings.npmUserPackages.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageData extends js.Object {
  var author: Email
  var date: String
  var description: String
  var keywords: js.Array[String]
  var links: Bugs
  var maintainers: js.Array[Username]
  var name: String
  var publisher: Username
  var scope: String
  var version: String
}

object PackageData {
  @scala.inline
  def apply(
    author: Email,
    date: String,
    description: String,
    keywords: js.Array[String],
    links: Bugs,
    maintainers: js.Array[Username],
    name: String,
    publisher: Username,
    scope: String,
    version: String
  ): PackageData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageData]
  }
}


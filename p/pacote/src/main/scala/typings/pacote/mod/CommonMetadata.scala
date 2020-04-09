package typings.pacote.mod

import typings.pacote.AnonDirectory
import typings.pacote.AnonEmail
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMetadata extends js.Object {
  var author: js.UndefOr[Person] = js.undefined
  var bugs: js.UndefOr[AnonEmail] = js.undefined
  var contributors: js.UndefOr[js.Array[Person]] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  var readme: js.UndefOr[String] = js.undefined
  var readmeFilename: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[AnonDirectory] = js.undefined
  var users: js.UndefOr[Record[String, Boolean]] = js.undefined
}

object CommonMetadata {
  @scala.inline
  def apply(
    author: Person = null,
    bugs: AnonEmail = null,
    contributors: js.Array[Person] = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: AnonDirectory = null,
    users: Record[String, Boolean] = null
  ): CommonMetadata = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMetadata]
  }
}


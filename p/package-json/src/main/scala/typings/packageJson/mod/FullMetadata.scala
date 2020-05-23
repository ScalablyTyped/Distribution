package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.anon.Dictversion
import typings.packageJson.anon.Email
import typings.packageJson.anon.Type
import typings.packageJson.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata
  extends AbbreviatedMetadata
     with HoistedData {
  val _id: String
  val _rev: String
  val time: Dictversion
  val users: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  @JSName("versions")
  val versions_FullMetadata: StringDictionary[FullVersion]
}

object FullMetadata {
  @scala.inline
  def apply(
    _id: String,
    _rev: String,
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    time: Dictversion,
    versions: StringDictionary[FullVersion],
    author: Person = null,
    bugs: Email | Url = null,
    contributors: js.Array[Person] = null,
    description: String = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: Type = null,
    users: StringDictionary[Boolean] = null
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
}


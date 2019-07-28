package typings.packageDashJson.packageDashJsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.packageDashJson.Anon_Created
import typings.packageDashJson.Anon_Email
import typings.packageDashJson.Anon_EmailUrl
import typings.packageDashJson.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata
  extends AbbreviatedMetadata
     with HoistedData {
  val _id: String
  val _rev: String
  val time: Anon_Created
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
    time: Anon_Created,
    versions: StringDictionary[FullVersion],
    author: Person = null,
    bugs: Anon_Email | Anon_EmailUrl = null,
    contributors: js.Array[Person] = null,
    description: String = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: Anon_Type = null,
    users: StringDictionary[Boolean] = null
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(_id = _id, _rev = _rev, modified = modified, name = name, time = time, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    if (author != null) __obj.updateDynamic("author")(author)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (readme != null) __obj.updateDynamic("readme")(readme)
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[FullMetadata]
  }
}


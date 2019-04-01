package typings
package packageDashJsonLib.packageDashJsonMod.packageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata
  extends AbbreviatedMetadata
     with HoistedData {
  val _id: java.lang.String
  val _rev: java.lang.String
  val time: packageDashJsonLib.Anon_Created
  val users: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  @JSName("versions")
  val versions_FullMetadata: org.scalablytyped.runtime.StringDictionary[FullVersion]
}

object FullMetadata {
  @scala.inline
  def apply(
    _id: java.lang.String,
    _rev: java.lang.String,
    `dist-tags`: DistTags,
    modified: java.lang.String,
    name: java.lang.String,
    time: packageDashJsonLib.Anon_Created,
    versions: org.scalablytyped.runtime.StringDictionary[FullVersion],
    author: Person = null,
    bugs: packageDashJsonLib.Anon_Email | packageDashJsonLib.Anon_EmailUrl = null,
    contributors: js.Array[Person] = null,
    description: java.lang.String = null,
    homepage: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null,
    license: java.lang.String = null,
    maintainers: js.Array[Person] = null,
    readme: java.lang.String = null,
    readmeFilename: java.lang.String = null,
    repository: packageDashJsonLib.Anon_Type = null,
    users: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null
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


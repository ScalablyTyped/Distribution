package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoistedData extends js.Object {
  val author: js.UndefOr[Person] = js.undefined
  val bugs: js.UndefOr[packageDashJsonLib.Anon_Email | packageDashJsonLib.Anon_EmailUrl] = js.undefined
  val contributors: js.UndefOr[js.Array[Person]] = js.undefined
  val description: js.UndefOr[java.lang.String] = js.undefined
  val homepage: js.UndefOr[java.lang.String] = js.undefined
  val keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val license: js.UndefOr[java.lang.String] = js.undefined
  val maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  val readme: js.UndefOr[java.lang.String] = js.undefined
  val readmeFilename: js.UndefOr[java.lang.String] = js.undefined
  val repository: js.UndefOr[packageDashJsonLib.Anon_Type] = js.undefined
}

object HoistedData {
  @scala.inline
  def apply(
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
    repository: packageDashJsonLib.Anon_Type = null
  ): HoistedData = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[HoistedData]
  }
}


package typings.packageJson.mod

import typings.packageJson.AnonEmail
import typings.packageJson.AnonEmailUrl
import typings.packageJson.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoistedData extends js.Object {
  val author: js.UndefOr[Person] = js.undefined
  val bugs: js.UndefOr[AnonEmail | AnonEmailUrl] = js.undefined
  val contributors: js.UndefOr[js.Array[Person]] = js.undefined
  val description: js.UndefOr[String] = js.undefined
  val homepage: js.UndefOr[String] = js.undefined
  val keywords: js.UndefOr[js.Array[String]] = js.undefined
  val license: js.UndefOr[String] = js.undefined
  val maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  val readme: js.UndefOr[String] = js.undefined
  val readmeFilename: js.UndefOr[String] = js.undefined
  val repository: js.UndefOr[AnonType] = js.undefined
}

object HoistedData {
  @scala.inline
  def apply(
    author: Person = null,
    bugs: AnonEmail | AnonEmailUrl = null,
    contributors: js.Array[Person] = null,
    description: String = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: AnonType = null
  ): HoistedData = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[HoistedData]
  }
}


package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.AnonEmail
import typings.packageJson.AnonEmailUrl
import typings.packageJson.AnonIntegrity
import typings.packageJson.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullVersion
  extends AbbreviatedVersion
     with HoistedData {
  val _id: String
  val _nodeVersion: String
  val _npmUser: String
  val _npmVersion: String
  val files: js.UndefOr[js.Array[String]] = js.undefined
  val gitHead: js.UndefOr[String] = js.undefined
  val main: js.UndefOr[String] = js.undefined
  val man: js.UndefOr[js.Array[String]] = js.undefined
  val scripts: js.UndefOr[StringDictionary[String]] = js.undefined
  val types: js.UndefOr[String] = js.undefined
  @JSName("typings")
  val typings_ : js.UndefOr[String] = js.undefined
}

object FullVersion {
  @scala.inline
  def apply(
    _id: String,
    _nodeVersion: String,
    _npmUser: String,
    _npmVersion: String,
    dist: AnonIntegrity,
    name: String,
    version: String,
    _hasShrinkwrap: js.UndefOr[Boolean] = js.undefined,
    author: Person = null,
    bin: StringDictionary[String] = null,
    bugs: AnonEmail | AnonEmailUrl = null,
    bundleDependencies: StringDictionary[String] = null,
    contributors: js.Array[Person] = null,
    dependencies: StringDictionary[String] = null,
    deprecated: String = null,
    description: String = null,
    devDependencies: StringDictionary[String] = null,
    directories: js.Array[String] = null,
    engines: StringDictionary[String] = null,
    files: js.Array[String] = null,
    gitHead: String = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    main: String = null,
    maintainers: js.Array[Person] = null,
    man: js.Array[String] = null,
    optionalDependencies: StringDictionary[String] = null,
    peerDependencies: StringDictionary[String] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: AnonType = null,
    scripts: StringDictionary[String] = null,
    types: String = null,
    typings_ : String = null
  ): FullVersion = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(_hasShrinkwrap)) __obj.updateDynamic("_hasShrinkwrap")(_hasShrinkwrap.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (gitHead != null) __obj.updateDynamic("gitHead")(gitHead.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (typings_ != null) __obj.updateDynamic("typings")(typings_.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullVersion]
  }
}


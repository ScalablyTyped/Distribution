package typings.packageDashJson.packageDashJsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.packageDashJson.Anon_Email
import typings.packageDashJson.Anon_EmailUrl
import typings.packageDashJson.Anon_Integrity
import typings.packageDashJson.Anon_Type
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
    dist: Anon_Integrity,
    name: String,
    version: String,
    _hasShrinkwrap: js.UndefOr[Boolean] = js.undefined,
    author: Person = null,
    bin: StringDictionary[String] = null,
    bugs: Anon_Email | Anon_EmailUrl = null,
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
    repository: Anon_Type = null,
    scripts: StringDictionary[String] = null,
    types: String = null,
    typings_ : String = null
  ): FullVersion = {
    val __obj = js.Dynamic.literal(_id = _id, _nodeVersion = _nodeVersion, _npmUser = _npmUser, _npmVersion = _npmVersion, dist = dist, name = name, version = version)
    if (!js.isUndefined(_hasShrinkwrap)) __obj.updateDynamic("_hasShrinkwrap")(_hasShrinkwrap)
    if (author != null) __obj.updateDynamic("author")(author)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (directories != null) __obj.updateDynamic("directories")(directories)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (files != null) __obj.updateDynamic("files")(files)
    if (gitHead != null) __obj.updateDynamic("gitHead")(gitHead)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (main != null) __obj.updateDynamic("main")(main)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (man != null) __obj.updateDynamic("man")(man)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies)
    if (readme != null) __obj.updateDynamic("readme")(readme)
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (types != null) __obj.updateDynamic("types")(types)
    if (typings_ != null) __obj.updateDynamic("typings")(typings_)
    __obj.asInstanceOf[FullVersion]
  }
}


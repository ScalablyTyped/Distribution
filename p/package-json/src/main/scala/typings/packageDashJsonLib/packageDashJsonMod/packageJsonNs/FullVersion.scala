package typings
package packageDashJsonLib.packageDashJsonMod.packageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullVersion
  extends AbbreviatedVersion
     with HoistedData {
  val _id: java.lang.String
  val _nodeVersion: java.lang.String
  val _npmUser: java.lang.String
  val _npmVersion: java.lang.String
  val files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val gitHead: js.UndefOr[java.lang.String] = js.undefined
  val main: js.UndefOr[java.lang.String] = js.undefined
  val man: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val scripts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val types: js.UndefOr[java.lang.String] = js.undefined
  @JSName("typings")
  val typings_ : js.UndefOr[java.lang.String] = js.undefined
}

object FullVersion {
  @scala.inline
  def apply(
    _id: java.lang.String,
    _nodeVersion: java.lang.String,
    _npmUser: java.lang.String,
    _npmVersion: java.lang.String,
    dist: packageDashJsonLib.Anon_Integrity,
    name: java.lang.String,
    version: java.lang.String,
    _hasShrinkwrap: js.UndefOr[scala.Boolean] = js.undefined,
    author: Person = null,
    bin: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    bugs: packageDashJsonLib.Anon_Email | packageDashJsonLib.Anon_EmailUrl = null,
    bundleDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    contributors: js.Array[Person] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    deprecated: java.lang.String = null,
    description: java.lang.String = null,
    devDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    directories: js.Array[java.lang.String] = null,
    engines: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    files: js.Array[java.lang.String] = null,
    gitHead: java.lang.String = null,
    homepage: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null,
    license: java.lang.String = null,
    main: java.lang.String = null,
    maintainers: js.Array[Person] = null,
    man: js.Array[java.lang.String] = null,
    optionalDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    peerDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    readme: java.lang.String = null,
    readmeFilename: java.lang.String = null,
    repository: packageDashJsonLib.Anon_Type = null,
    scripts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    types: java.lang.String = null,
    typings_ : java.lang.String = null
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


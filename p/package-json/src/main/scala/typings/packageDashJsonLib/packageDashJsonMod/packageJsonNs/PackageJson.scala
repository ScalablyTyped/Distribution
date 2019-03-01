package typings
package packageDashJsonLib.packageDashJsonMod.packageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.undefined
  var bin: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var bugs: js.UndefOr[packageDashJsonLib.Anon_Email | packageDashJsonLib.Anon_EmailUrl] = js.undefined
  var bundleDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var contributors: js.UndefOr[js.Array[Person]] = js.undefined
  var dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var devDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var engines: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var license: js.UndefOr[java.lang.String] = js.undefined
  var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  var man: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var optionalDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var readme: js.UndefOr[java.lang.String] = js.undefined
  var repository: js.UndefOr[packageDashJsonLib.Anon_Type] = js.undefined
  var scripts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PackageJson {
  @scala.inline
  def apply(
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    author: Person = null,
    bin: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    bugs: packageDashJsonLib.Anon_Email | packageDashJsonLib.Anon_EmailUrl = null,
    bundleDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    contributors: js.Array[Person] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    description: java.lang.String = null,
    devDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    engines: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    files: js.Array[java.lang.String] = null,
    homepage: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null,
    license: java.lang.String = null,
    maintainers: js.Array[Person] = null,
    man: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    optionalDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    readme: java.lang.String = null,
    repository: packageDashJsonLib.Anon_Type = null,
    scripts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    version: java.lang.String = null
  ): PackageJson = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (files != null) __obj.updateDynamic("files")(files)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (man != null) __obj.updateDynamic("man")(man)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (readme != null) __obj.updateDynamic("readme")(readme)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PackageJson]
  }
}


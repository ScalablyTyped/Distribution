package typings.pacote.pacoteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.Anon_Directory
import typings.pacote.Anon_Url
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageVersion
  extends /* key */ StringDictionary[js.Any] {
  var _hasShrinkwrap: Boolean
  var _id: js.UndefOr[String] = js.undefined
  var _nodeVersion: js.UndefOr[String] = js.undefined
  var _npmUser: js.UndefOr[Human] = js.undefined
  var _npmVersion: js.UndefOr[String] = js.undefined
  var author: js.UndefOr[Human] = js.undefined
  var bugs: js.UndefOr[Anon_Url] = js.undefined
  var contributors: js.UndefOr[js.Array[Human]] = js.undefined
  var dependencies: js.UndefOr[Record[String, String]] = js.undefined
  // Extra metadata which may be added by the registry:
  var description: js.UndefOr[String] = js.undefined
  var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var dist: PackageDist
  var engines: js.UndefOr[Record[String, String]] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var maintainers: js.UndefOr[js.Array[Human]] = js.undefined
  var name: String
  var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var repository: js.UndefOr[Anon_Directory] = js.undefined
  var scripts: js.UndefOr[Record[String, String]] = js.undefined
  var version: String
}

object PackageVersion {
  @scala.inline
  def apply(
    _hasShrinkwrap: Boolean,
    dist: PackageDist,
    name: String,
    version: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _id: String = null,
    _nodeVersion: String = null,
    _npmUser: Human = null,
    _npmVersion: String = null,
    author: Human = null,
    bugs: Anon_Url = null,
    contributors: js.Array[Human] = null,
    dependencies: Record[String, String] = null,
    description: String = null,
    devDependencies: Record[String, String] = null,
    engines: Record[String, String] = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    main: String = null,
    maintainers: js.Array[Human] = null,
    optionalDependencies: Record[String, String] = null,
    peerDependencies: Record[String, String] = null,
    repository: Anon_Directory = null,
    scripts: Record[String, String] = null
  ): PackageVersion = {
    val __obj = js.Dynamic.literal(_hasShrinkwrap = _hasShrinkwrap, dist = dist, name = name, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_nodeVersion != null) __obj.updateDynamic("_nodeVersion")(_nodeVersion)
    if (_npmUser != null) __obj.updateDynamic("_npmUser")(_npmUser)
    if (_npmVersion != null) __obj.updateDynamic("_npmVersion")(_npmVersion)
    if (author != null) __obj.updateDynamic("author")(author)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (main != null) __obj.updateDynamic("main")(main)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[PackageVersion]
  }
}


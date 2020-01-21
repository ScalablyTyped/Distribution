package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.AnonDirectory
import typings.pacote.AnonUrl
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
  var bugs: js.UndefOr[AnonUrl] = js.undefined
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
  var repository: js.UndefOr[AnonDirectory] = js.undefined
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
    bugs: AnonUrl = null,
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
    repository: AnonDirectory = null,
    scripts: Record[String, String] = null
  ): PackageVersion = {
    val __obj = js.Dynamic.literal(_hasShrinkwrap = _hasShrinkwrap.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_nodeVersion != null) __obj.updateDynamic("_nodeVersion")(_nodeVersion.asInstanceOf[js.Any])
    if (_npmUser != null) __obj.updateDynamic("_npmUser")(_npmUser.asInstanceOf[js.Any])
    if (_npmVersion != null) __obj.updateDynamic("_npmVersion")(_npmVersion.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersion]
  }
}


package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.AnonIntegrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbbreviatedVersion
  extends /* key */ StringDictionary[js.Any] {
  val _hasShrinkwrap: js.UndefOr[Boolean] = js.undefined
  val bin: js.UndefOr[StringDictionary[String]] = js.undefined
  val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  val dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  val deprecated: js.UndefOr[String] = js.undefined
  val devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  val directories: js.UndefOr[js.Array[String]] = js.undefined
  val dist: AnonIntegrity
  val engines: js.UndefOr[StringDictionary[String]] = js.undefined
  val name: String
  val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  val peerDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  val version: String
}

object AbbreviatedVersion {
  @scala.inline
  def apply(
    dist: AnonIntegrity,
    name: String,
    version: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _hasShrinkwrap: js.UndefOr[Boolean] = js.undefined,
    bin: StringDictionary[String] = null,
    bundleDependencies: StringDictionary[String] = null,
    dependencies: StringDictionary[String] = null,
    deprecated: String = null,
    devDependencies: StringDictionary[String] = null,
    directories: js.Array[String] = null,
    engines: StringDictionary[String] = null,
    optionalDependencies: StringDictionary[String] = null,
    peerDependencies: StringDictionary[String] = null
  ): AbbreviatedVersion = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(_hasShrinkwrap)) __obj.updateDynamic("_hasShrinkwrap")(_hasShrinkwrap.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbreviatedVersion]
  }
}


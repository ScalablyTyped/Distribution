package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbbreviatedVersion
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  val _hasShrinkwrap: js.UndefOr[scala.Boolean] = js.undefined
  val bin: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val bundleDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val deprecated: js.UndefOr[java.lang.String] = js.undefined
  val devDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val directories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val dist: packageDashJsonLib.Anon_Integrity
  val engines: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val name: java.lang.String
  val optionalDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val peerDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  val version: java.lang.String
}

object AbbreviatedVersion {
  @scala.inline
  def apply(
    dist: packageDashJsonLib.Anon_Integrity,
    name: java.lang.String,
    version: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _hasShrinkwrap: js.UndefOr[scala.Boolean] = js.undefined,
    bin: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    bundleDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    deprecated: java.lang.String = null,
    devDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    directories: js.Array[java.lang.String] = null,
    engines: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    optionalDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    peerDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): AbbreviatedVersion = {
    val __obj = js.Dynamic.literal(dist = dist, name = name, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(_hasShrinkwrap)) __obj.updateDynamic("_hasShrinkwrap")(_hasShrinkwrap)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (directories != null) __obj.updateDynamic("directories")(directories)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies)
    __obj.asInstanceOf[AbbreviatedVersion]
  }
}


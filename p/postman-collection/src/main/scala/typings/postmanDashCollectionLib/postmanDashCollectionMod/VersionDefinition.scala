package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionDefinition extends PropertyBaseDefinition {
  var build: js.UndefOr[java.lang.String] = js.undefined
  var major: js.UndefOr[java.lang.String] = js.undefined
  var minor: js.UndefOr[java.lang.String] = js.undefined
  var patch: js.UndefOr[java.lang.String] = js.undefined
  var prerelease: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object VersionDefinition {
  @scala.inline
  def apply(
    build: java.lang.String = null,
    description: java.lang.String | DescriptionDefinition = null,
    major: java.lang.String = null,
    minor: java.lang.String = null,
    patch: java.lang.String = null,
    prerelease: java.lang.String = null,
    raw: java.lang.String = null,
    version: java.lang.String = null
  ): VersionDefinition = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major)
    if (minor != null) __obj.updateDynamic("minor")(minor)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[VersionDefinition]
  }
}


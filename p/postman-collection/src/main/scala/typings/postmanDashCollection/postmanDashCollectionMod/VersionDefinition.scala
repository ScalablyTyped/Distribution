package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionDefinition extends PropertyBaseDefinition {
  var build: js.UndefOr[String] = js.undefined
  var major: js.UndefOr[String] = js.undefined
  var minor: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[String] = js.undefined
  var prerelease: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object VersionDefinition {
  @scala.inline
  def apply(
    build: String = null,
    description: String | DescriptionDefinition = null,
    major: String = null,
    minor: String = null,
    patch: String = null,
    prerelease: String = null,
    raw: String = null,
    version: String = null
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


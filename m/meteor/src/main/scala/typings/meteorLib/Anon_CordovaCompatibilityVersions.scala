package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CordovaCompatibilityVersions extends js.Object {
  var PUBLIC_SETTINGS: js.Any
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.undefined
  var format: java.lang.String
  var manifest: js.Any
  var version: java.lang.String
}

object Anon_CordovaCompatibilityVersions {
  @scala.inline
  def apply(
    PUBLIC_SETTINGS: js.Any,
    format: java.lang.String,
    manifest: js.Any,
    version: java.lang.String,
    cordovaCompatibilityVersions: js.Any = null
  ): Anon_CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS, format = format, manifest = manifest, version = version)
    if (cordovaCompatibilityVersions != null) __obj.updateDynamic("cordovaCompatibilityVersions")(cordovaCompatibilityVersions)
    __obj.asInstanceOf[Anon_CordovaCompatibilityVersions]
  }
}


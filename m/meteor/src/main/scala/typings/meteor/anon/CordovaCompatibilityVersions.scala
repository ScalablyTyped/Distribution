package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaCompatibilityVersions extends js.Object {
  var PUBLIC_SETTINGS: js.Any
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.undefined
  var format: String
  var manifest: js.Any
  var version: String
}

object CordovaCompatibilityVersions {
  @scala.inline
  def apply(
    PUBLIC_SETTINGS: js.Any,
    format: String,
    manifest: js.Any,
    version: String,
    cordovaCompatibilityVersions: js.Any = null
  ): CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (cordovaCompatibilityVersions != null) __obj.updateDynamic("cordovaCompatibilityVersions")(cordovaCompatibilityVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaCompatibilityVersions]
  }
}


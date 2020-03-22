package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCordovaCompatibilityVersions extends js.Object {
  var PUBLIC_SETTINGS: js.Any
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.undefined
  var format: String
  var manifest: js.Any
  var version: String
}

object AnonCordovaCompatibilityVersions {
  @scala.inline
  def apply(
    PUBLIC_SETTINGS: js.Any,
    format: String,
    manifest: js.Any,
    version: String,
    cordovaCompatibilityVersions: js.Any = null
  ): AnonCordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (cordovaCompatibilityVersions != null) __obj.updateDynamic("cordovaCompatibilityVersions")(cordovaCompatibilityVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCordovaCompatibilityVersions]
  }
}


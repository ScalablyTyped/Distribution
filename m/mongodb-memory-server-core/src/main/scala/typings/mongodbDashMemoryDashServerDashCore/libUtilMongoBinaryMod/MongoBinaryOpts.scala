package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryOpts extends js.Object {
  var arch: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean | js.Function] = js.undefined
  var downloadDir: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object MongoBinaryOpts {
  @scala.inline
  def apply(
    arch: String = null,
    debug: Boolean | js.Function = null,
    downloadDir: String = null,
    platform: String = null,
    version: String = null
  ): MongoBinaryOpts = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (downloadDir != null) __obj.updateDynamic("downloadDir")(downloadDir)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MongoBinaryOpts]
  }
}


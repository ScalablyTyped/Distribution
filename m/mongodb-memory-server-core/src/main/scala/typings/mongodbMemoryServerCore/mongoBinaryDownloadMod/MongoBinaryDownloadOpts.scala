package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.mongodbMemoryServerCore.typesMod.DebugPropT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadOpts extends js.Object {
  var arch: js.UndefOr[String] = js.undefined
  var checkMD5: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[DebugPropT] = js.undefined
  var downloadDir: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object MongoBinaryDownloadOpts {
  @scala.inline
  def apply(
    arch: String = null,
    checkMD5: js.UndefOr[Boolean] = js.undefined,
    debug: DebugPropT = null,
    downloadDir: String = null,
    platform: String = null,
    version: String = null
  ): MongoBinaryDownloadOpts = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (!js.isUndefined(checkMD5)) __obj.updateDynamic("checkMD5")(checkMD5.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (downloadDir != null) __obj.updateDynamic("downloadDir")(downloadDir.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadOpts]
  }
}


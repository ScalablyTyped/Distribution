package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadUrlMod

import typings.getos.getosMod.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadUrlOpts extends js.Object {
  var arch: String
  var os: js.UndefOr[Os] = js.undefined
  var platform: String
  var version: String
}

object MongoBinaryDownloadUrlOpts {
  @scala.inline
  def apply(arch: String, platform: String, version: String, os: Os = null): MongoBinaryDownloadUrlOpts = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
  }
}


package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadUrlMod

import typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.AnyOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadUrlOpts extends js.Object {
  var arch: String
  var os: js.UndefOr[AnyOS] = js.undefined
  var platform: String
  var version: String
}

object MongoBinaryDownloadUrlOpts {
  @scala.inline
  def apply(arch: String, platform: String, version: String, os: AnyOS = null): MongoBinaryDownloadUrlOpts = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
  }
}


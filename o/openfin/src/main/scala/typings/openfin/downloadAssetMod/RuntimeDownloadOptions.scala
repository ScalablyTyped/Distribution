package typings.openfin.downloadAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeDownloadOptions extends js.Object {
  var version: String
}

object RuntimeDownloadOptions {
  @scala.inline
  def apply(version: String): RuntimeDownloadOptions = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeDownloadOptions]
  }
}


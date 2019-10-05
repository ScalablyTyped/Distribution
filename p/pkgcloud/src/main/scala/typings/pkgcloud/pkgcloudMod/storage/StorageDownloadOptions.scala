package typings.pkgcloud.pkgcloudMod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageDownloadOptions extends js.Object {
  var container: String
  var remote: String
}

object StorageDownloadOptions {
  @scala.inline
  def apply(container: String, remote: String): StorageDownloadOptions = {
    val __obj = js.Dynamic.literal(container = container, remote = remote)
  
    __obj.asInstanceOf[StorageDownloadOptions]
  }
}


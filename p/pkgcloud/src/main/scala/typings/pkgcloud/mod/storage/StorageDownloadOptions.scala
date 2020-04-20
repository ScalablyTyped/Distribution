package typings.pkgcloud.mod.storage

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
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageDownloadOptions]
  }
}


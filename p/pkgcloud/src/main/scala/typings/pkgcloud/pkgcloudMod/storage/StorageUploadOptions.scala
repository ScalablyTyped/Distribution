package typings.pkgcloud.pkgcloudMod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageUploadOptions extends js.Object {
  var container: String
  var remote: String
}

object StorageUploadOptions {
  @scala.inline
  def apply(container: String, remote: String): StorageUploadOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageUploadOptions]
  }
}


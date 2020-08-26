package typings.pkgcloud.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageUploadOptions extends js.Object {
  var container: String = js.native
  var remote: String = js.native
}

object StorageUploadOptions {
  @scala.inline
  def apply(container: String, remote: String): StorageUploadOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUploadOptions]
  }
  @scala.inline
  implicit class StorageUploadOptionsOps[Self <: StorageUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
  }
  
}


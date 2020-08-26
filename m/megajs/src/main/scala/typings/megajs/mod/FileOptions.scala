package typings.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  var directory: js.UndefOr[Boolean] = js.native
  var downloadId: String = js.native
  var key: String = js.native
}

object FileOptions {
  @scala.inline
  def apply(downloadId: String, key: String): FileOptions = {
    val __obj = js.Dynamic.literal(downloadId = downloadId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def setDownloadId(value: String): Self = this.set("downloadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
  }
  
}


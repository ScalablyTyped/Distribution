package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemInfo extends js.Object {
  // The UTC date and time the file was created on a client.
  var createdDateTime: js.UndefOr[String] = js.native
  // The UTC date and time the file was last accessed. Available for the recent file list only.
  var lastAccessedDateTime: js.UndefOr[String] = js.native
  // The UTC date and time the file was last modified on a client.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
}

object FileSystemInfo {
  @scala.inline
  def apply(): FileSystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemInfo]
  }
  @scala.inline
  implicit class FileSystemInfoOps[Self <: FileSystemInfo] (val x: Self) extends AnyVal {
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
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setLastAccessedDateTime(value: String): Self = this.set("lastAccessedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessedDateTime: Self = this.set("lastAccessedDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
  }
  
}


package typings.mockFs.filesystemMod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  /**
    * The last file access time. Defaults to `new Date()`. Updated when
    * file contents are accessed.
    */
  var atime: js.UndefOr[Date] = js.native
  /**
    * The time of file creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[Date] = js.native
  /** File contents */
  var content: js.UndefOr[String | Buffer] = js.native
  /**
    * The last file change time. Defaults to `new Date()`. Updated when
    * file owner or permissions change.
    */
  var ctime: js.UndefOr[Date] = js.native
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.native
  /** File mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.native
  /**
    * The last file modification time. Defaults to `new Date()`. Updated
    * when file contents change.
    */
  var mtime: js.UndefOr[Date] = js.native
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
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
    def setAtime(value: Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    @scala.inline
    def setBirthtime(value: Date): Self = this.set("birthtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthtime: Self = this.set("birthtime", js.undefined)
    @scala.inline
    def setContent(value: String | Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtime: Self = this.set("ctime", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}


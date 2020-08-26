package typings.mockFs.filesystemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymlinkOptions extends js.Object {
  /** The last symlink access time. Defaults to `new Date()`. */
  var atime: js.UndefOr[Date] = js.native
  /** The time of symlink creation. Defaults to `new Date()`. */
  var birthtime: js.UndefOr[Date] = js.native
  /** The last symlink change time. Defaults to `new Date()`. */
  var ctime: js.UndefOr[Date] = js.native
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.native
  /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.native
  /** The last symlink modification time. Defaults to `new Date()`. */
  var mtime: js.UndefOr[Date] = js.native
  /** Path to the source (required). */
  var path: String = js.native
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.native
}

object SymlinkOptions {
  @scala.inline
  def apply(path: String): SymlinkOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlinkOptions]
  }
  @scala.inline
  implicit class SymlinkOptionsOps[Self <: SymlinkOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtime(value: Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    @scala.inline
    def setBirthtime(value: Date): Self = this.set("birthtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthtime: Self = this.set("birthtime", js.undefined)
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


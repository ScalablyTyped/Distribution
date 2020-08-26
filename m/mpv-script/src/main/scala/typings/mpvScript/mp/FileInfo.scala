package typings.mpvScript.mp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfo extends js.Object {
  var atime: Double = js.native
  var ctime: Double = js.native
  var is_dir: Boolean = js.native
  var is_file: Boolean = js.native
  var mode: Double = js.native
  var mtime: Double = js.native
  var size: Double = js.native
}

object FileInfo {
  @scala.inline
  def apply(
    atime: Double,
    ctime: Double,
    is_dir: Boolean,
    is_file: Boolean,
    mode: Double,
    mtime: Double,
    size: Double
  ): FileInfo = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], is_dir = is_dir.asInstanceOf[js.Any], is_file = is_file.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  implicit class FileInfoOps[Self <: FileInfo] (val x: Self) extends AnyVal {
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
    def setAtime(value: Double): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_dir(value: Boolean): Self = this.set("is_dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_file(value: Boolean): Self = this.set("is_file", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


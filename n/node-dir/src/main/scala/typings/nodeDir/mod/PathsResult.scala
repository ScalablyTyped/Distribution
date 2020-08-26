package typings.nodeDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathsResult extends js.Object {
  var dirs: js.Array[String] = js.native
  var files: js.Array[String] = js.native
}

object PathsResult {
  @scala.inline
  def apply(dirs: js.Array[String], files: js.Array[String]): PathsResult = {
    val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsResult]
  }
  @scala.inline
  implicit class PathsResultOps[Self <: PathsResult] (val x: Self) extends AnyVal {
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
    def setDirsVarargs(value: String*): Self = this.set("dirs", js.Array(value :_*))
    @scala.inline
    def setDirs(value: js.Array[String]): Self = this.set("dirs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}


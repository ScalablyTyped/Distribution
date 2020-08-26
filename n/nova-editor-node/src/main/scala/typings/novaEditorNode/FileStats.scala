package typings.novaEditorNode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/file-stats/
@js.native
trait FileStats extends js.Object {
  val atime: Date = js.native
  val birthtime: Date = js.native
  val ctime: Date = js.native
  val mtime: Date = js.native
  val size: Double = js.native
  def isDirectory(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
}

object FileStats {
  @scala.inline
  def apply(
    atime: Date,
    birthtime: Date,
    ctime: Date,
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    isSymbolicLink: () => Boolean,
    mtime: Date,
    size: Double
  ): FileStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  @scala.inline
  implicit class FileStatsOps[Self <: FileStats] (val x: Self) extends AnyVal {
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
    def setBirthtime(value: Date): Self = this.set("birthtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSymbolicLink(value: () => Boolean): Self = this.set("isSymbolicLink", js.Any.fromFunction0(value))
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


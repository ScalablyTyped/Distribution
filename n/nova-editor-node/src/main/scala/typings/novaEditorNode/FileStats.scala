package typings.novaEditorNode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/file-stats/
trait FileStats extends js.Object {
  val atime: Date
  val birthtime: Date
  val ctime: Date
  val mtime: Date
  val size: Double
  def isDirectory(): Boolean
  def isFile(): Boolean
  def isSymbolicLink(): Boolean
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
}


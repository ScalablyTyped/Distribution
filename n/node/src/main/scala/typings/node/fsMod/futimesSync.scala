package typings.node.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "futimesSync")
@js.native
object futimesSync extends js.Object {
  /**
    * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def apply(fd: Double, atime: String, mtime: String): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Date): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Date): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: String): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): Unit = js.native
}


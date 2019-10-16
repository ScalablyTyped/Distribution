package typings.node.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "Stats")
@js.native
class Stats () extends StatsBase[Double] {
  /* CompleteClass */
  override var atime: Date = js.native
  /* CompleteClass */
  override var atimeMs: Double = js.native
  /* CompleteClass */
  override var birthtime: Date = js.native
  /* CompleteClass */
  override var birthtimeMs: Double = js.native
  /* CompleteClass */
  override var blksize: Double = js.native
  /* CompleteClass */
  override var blocks: Double = js.native
  /* CompleteClass */
  override var ctime: Date = js.native
  /* CompleteClass */
  override var ctimeMs: Double = js.native
  /* CompleteClass */
  override var dev: Double = js.native
  /* CompleteClass */
  override var gid: Double = js.native
  /* CompleteClass */
  override var ino: Double = js.native
  /* CompleteClass */
  override var mode: Double = js.native
  /* CompleteClass */
  override var mtime: Date = js.native
  /* CompleteClass */
  override var mtimeMs: Double = js.native
  /* CompleteClass */
  override var nlink: Double = js.native
  /* CompleteClass */
  override var rdev: Double = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var uid: Double = js.native
  /* CompleteClass */
  override def isBlockDevice(): Boolean = js.native
  /* CompleteClass */
  override def isCharacterDevice(): Boolean = js.native
  /* CompleteClass */
  override def isDirectory(): Boolean = js.native
  /* CompleteClass */
  override def isFIFO(): Boolean = js.native
  /* CompleteClass */
  override def isFile(): Boolean = js.native
  /* CompleteClass */
  override def isSocket(): Boolean = js.native
  /* CompleteClass */
  override def isSymbolicLink(): Boolean = js.native
}


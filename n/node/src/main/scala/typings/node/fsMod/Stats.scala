package typings.node.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "Stats")
@js.native
class Stats () extends js.Object {
  var atime: Date = js.native
  var atimeMs: Double = js.native
  var birthtime: Date = js.native
  var birthtimeMs: Double = js.native
  var blksize: Double = js.native
  var blocks: Double = js.native
  var ctime: Date = js.native
  var ctimeMs: Double = js.native
  var dev: Double = js.native
  var gid: Double = js.native
  var ino: Double = js.native
  var mode: Double = js.native
  var mtime: Date = js.native
  var mtimeMs: Double = js.native
  var nlink: Double = js.native
  var rdev: Double = js.native
  var size: Double = js.native
  var uid: Double = js.native
  def isBlockDevice(): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
}


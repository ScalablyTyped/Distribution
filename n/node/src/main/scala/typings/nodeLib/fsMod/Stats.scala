package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "Stats")
@js.native
class Stats () extends js.Object {
  var atime: stdLib.Date = js.native
  var atimeMs: scala.Double = js.native
  var birthtime: stdLib.Date = js.native
  var birthtimeMs: scala.Double = js.native
  var blksize: scala.Double = js.native
  var blocks: scala.Double = js.native
  var ctime: stdLib.Date = js.native
  var ctimeMs: scala.Double = js.native
  var dev: scala.Double = js.native
  var gid: scala.Double = js.native
  var ino: scala.Double = js.native
  var mode: scala.Double = js.native
  var mtime: stdLib.Date = js.native
  var mtimeMs: scala.Double = js.native
  var nlink: scala.Double = js.native
  var rdev: scala.Double = js.native
  var size: scala.Double = js.native
  var uid: scala.Double = js.native
  def isBlockDevice(): scala.Boolean = js.native
  def isCharacterDevice(): scala.Boolean = js.native
  def isDirectory(): scala.Boolean = js.native
  def isFIFO(): scala.Boolean = js.native
  def isFile(): scala.Boolean = js.native
  def isSocket(): scala.Boolean = js.native
  def isSymbolicLink(): scala.Boolean = js.native
}


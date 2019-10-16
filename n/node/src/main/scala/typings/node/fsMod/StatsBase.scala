package typings.node.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsBase[T] extends js.Object {
  var atime: Date
  var atimeMs: Double
  var birthtime: Date
  var birthtimeMs: Double
  var blksize: Double
  var blocks: Double
  var ctime: Date
  var ctimeMs: Double
  var dev: Double
  var gid: Double
  var ino: Double
  var mode: Double
  var mtime: Date
  var mtimeMs: Double
  var nlink: Double
  var rdev: Double
  var size: Double
  var uid: Double
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
}

object StatsBase {
  @scala.inline
  def apply[T](
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    mtimeMs: Double,
    nlink: Double,
    rdev: Double,
    size: Double,
    uid: Double
  ): StatsBase[T] = {
    val __obj = js.Dynamic.literal(atime = atime, atimeMs = atimeMs, birthtime = birthtime, birthtimeMs = birthtimeMs, blksize = blksize, blocks = blocks, ctime = ctime, ctimeMs = ctimeMs, dev = dev, gid = gid, ino = ino, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, mtimeMs = mtimeMs, nlink = nlink, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[StatsBase[T]]
  }
}


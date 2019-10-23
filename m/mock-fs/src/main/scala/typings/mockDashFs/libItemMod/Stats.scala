package typings.mockDashFs.libItemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var atime: Date
  var birthtime: Date
  var blksize: Double
  var ctime: Date
  var dev: Double
  var gid: Double
  var ino: Double
  var mtime: Date
  var nlink: Double
  var rdev: Double
  var uid: Double
}

object Stats {
  @scala.inline
  def apply(
    atime: Date,
    birthtime: Date,
    blksize: Double,
    ctime: Date,
    dev: Double,
    gid: Double,
    ino: Double,
    mtime: Date,
    nlink: Double,
    rdev: Double,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, birthtime = birthtime, blksize = blksize, ctime = ctime, dev = dev, gid = gid, ino = ino, mtime = mtime, nlink = nlink, rdev = rdev, uid = uid)
  
    __obj.asInstanceOf[Stats]
  }
}


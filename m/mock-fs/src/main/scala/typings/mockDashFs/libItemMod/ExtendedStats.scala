package typings.mockDashFs.libItemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedStats extends Stats {
  var blocks: Double
  var mode: Double
  var size: Double
}

object ExtendedStats {
  @scala.inline
  def apply(
    atime: Date,
    birthtime: Date,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    dev: Double,
    gid: Double,
    ino: Double,
    mode: Double,
    mtime: Date,
    nlink: Double,
    rdev: Double,
    size: Double,
    uid: Double
  ): ExtendedStats = {
    val __obj = js.Dynamic.literal(atime = atime, birthtime = birthtime, blksize = blksize, blocks = blocks, ctime = ctime, dev = dev, gid = gid, ino = ino, mode = mode, mtime = mtime, nlink = nlink, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[ExtendedStats]
  }
}


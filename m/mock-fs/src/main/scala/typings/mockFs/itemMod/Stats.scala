package typings.mockFs.itemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var atime: Date = js.native
  var birthtime: Date = js.native
  var blksize: Double = js.native
  var ctime: Date = js.native
  var dev: Double = js.native
  var gid: Double = js.native
  var ino: Double = js.native
  var mtime: Date = js.native
  var nlink: Double = js.native
  var rdev: Double = js.native
  var uid: Double = js.native
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
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setBlksize(value: Double): Self = this.set("blksize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDev(value: Double): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIno(value: Double): Self = this.set("ino", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNlink(value: Double): Self = this.set("nlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdev(value: Double): Self = this.set("rdev", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}


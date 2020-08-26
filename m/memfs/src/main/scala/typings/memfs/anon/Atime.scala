package typings.memfs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atime extends js.Object {
  var atime: Double = js.native
  var ctime: Double = js.native
  var data: String = js.native
  var gid: Double = js.native
  var ino: Double = js.native
  var mode: Double = js.native
  var mtime: Double = js.native
  var nlink: Double = js.native
  var perm: Double = js.native
  var symlink: js.Array[String] = js.native
  var uid: Double = js.native
}

object Atime {
  @scala.inline
  def apply(
    atime: Double,
    ctime: Double,
    data: String,
    gid: Double,
    ino: Double,
    mode: Double,
    mtime: Double,
    nlink: Double,
    perm: Double,
    symlink: js.Array[String],
    uid: Double
  ): Atime = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], perm = perm.asInstanceOf[js.Any], symlink = symlink.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atime]
  }
  @scala.inline
  implicit class AtimeOps[Self <: Atime] (val x: Self) extends AnyVal {
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
    def setAtime(value: Double): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIno(value: Double): Self = this.set("ino", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNlink(value: Double): Self = this.set("nlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerm(value: Double): Self = this.set("perm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymlinkVarargs(value: String*): Self = this.set("symlink", js.Array(value :_*))
    @scala.inline
    def setSymlink(value: js.Array[String]): Self = this.set("symlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}


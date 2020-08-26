package typings.nodeZookeeperClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var aversion: Double = js.native
  var ctime: Double = js.native
  var cversion: Double = js.native
  var czxid: Double = js.native
  var dataLength: Double = js.native
  var ephemeralOwner: Double = js.native
  var mtime: Double = js.native
  var mzxid: Double = js.native
  var numChildren: Double = js.native
  var pzxid: Double = js.native
  var version: Double = js.native
}

object Stat {
  @scala.inline
  def apply(
    aversion: Double,
    ctime: Double,
    cversion: Double,
    czxid: Double,
    dataLength: Double,
    ephemeralOwner: Double,
    mtime: Double,
    mzxid: Double,
    numChildren: Double,
    pzxid: Double,
    version: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
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
    def setAversion(value: Double): Self = this.set("aversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCversion(value: Double): Self = this.set("cversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCzxid(value: Double): Self = this.set("czxid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataLength(value: Double): Self = this.set("dataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setEphemeralOwner(value: Double): Self = this.set("ephemeralOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMzxid(value: Double): Self = this.set("mzxid", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumChildren(value: Double): Self = this.set("numChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def setPzxid(value: Double): Self = this.set("pzxid", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


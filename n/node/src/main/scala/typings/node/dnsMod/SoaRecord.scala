package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoaRecord extends js.Object {
  var expire: Double = js.native
  var hostmaster: String = js.native
  var minttl: Double = js.native
  var nsname: String = js.native
  var refresh: Double = js.native
  var retry: Double = js.native
  var serial: Double = js.native
}

object SoaRecord {
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): SoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoaRecord]
  }
  @scala.inline
  implicit class SoaRecordOps[Self <: SoaRecord] (val x: Self) extends AnyVal {
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
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostmaster(value: String): Self = this.set("hostmaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinttl(value: Double): Self = this.set("minttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNsname(value: String): Self = this.set("nsname", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: Double): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: Double): Self = this.set("serial", value.asInstanceOf[js.Any])
  }
  
}


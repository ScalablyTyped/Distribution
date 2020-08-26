package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkforupdate extends js.Object {
  var checkforupdate: Boolean = js.native
  var devicetypes: Bridge = js.native
  @JSName("notify")
  var notify_FCheckforupdate: Boolean = js.native
  var text: String = js.native
  var updatestate: Double = js.native
  var url: String = js.native
}

object Checkforupdate {
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: Bridge,
    notify: Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkforupdate]
  }
  @scala.inline
  implicit class CheckforupdateOps[Self <: Checkforupdate] (val x: Self) extends AnyVal {
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
    def setCheckforupdate(value: Boolean): Self = this.set("checkforupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevicetypes(value: Bridge): Self = this.set("devicetypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatestate(value: Double): Self = this.set("updatestate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


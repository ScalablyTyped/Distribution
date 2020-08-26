package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemChannelTransport extends ChannelTransport {
  @JSName("type")
  var type_SystemChannelTransport: system = js.native
  var visualIdentity: DisplayMetadata = js.native
}

object SystemChannelTransport {
  @scala.inline
  def apply(id: ChannelId, `type`: system, visualIdentity: DisplayMetadata): SystemChannelTransport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visualIdentity = visualIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemChannelTransport]
  }
  @scala.inline
  implicit class SystemChannelTransportOps[Self <: SystemChannelTransport] (val x: Self) extends AnyVal {
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
    def setType(value: system): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualIdentity(value: DisplayMetadata): Self = this.set("visualIdentity", value.asInstanceOf[js.Any])
  }
  
}


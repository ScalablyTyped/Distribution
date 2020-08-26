package typings.openfin.contextChannelsMod

import typings.openfin.openfinStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppChannelTransport extends ChannelTransport {
  var name: String = js.native
  @JSName("type")
  var type_AppChannelTransport: app = js.native
}

object AppChannelTransport {
  @scala.inline
  def apply(id: ChannelId, name: String, `type`: app): AppChannelTransport = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppChannelTransport]
  }
  @scala.inline
  implicit class AppChannelTransportOps[Self <: AppChannelTransport] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: app): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


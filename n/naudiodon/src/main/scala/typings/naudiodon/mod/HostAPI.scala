package typings.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostAPI extends js.Object {
  var defaultInput: Double = js.native
  var defaultOutput: Double = js.native
  var deviceCount: Double = js.native
  var id: Double = js.native
  var name: String = js.native
  var `type`: String = js.native
}

object HostAPI {
  @scala.inline
  def apply(
    defaultInput: Double,
    defaultOutput: Double,
    deviceCount: Double,
    id: Double,
    name: String,
    `type`: String
  ): HostAPI = {
    val __obj = js.Dynamic.literal(defaultInput = defaultInput.asInstanceOf[js.Any], defaultOutput = defaultOutput.asInstanceOf[js.Any], deviceCount = deviceCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAPI]
  }
  @scala.inline
  implicit class HostAPIOps[Self <: HostAPI] (val x: Self) extends AnyVal {
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
    def setDefaultInput(value: Double): Self = this.set("defaultInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOutput(value: Double): Self = this.set("defaultOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceCount(value: Double): Self = this.set("deviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


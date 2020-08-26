package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var available: Boolean = js.native
  var capture: Capture = js.native
  var cordova: String = js.native
  var model: String = js.native
  var name: String = js.native
  var platform: String = js.native
  var uuid: String = js.native
  var version: String = js.native
}

object Device {
  @scala.inline
  def apply(
    available: Boolean,
    capture: Capture,
    cordova: String,
    model: String,
    name: String,
    platform: String,
    uuid: String,
    version: String
  ): Device = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapture(value: Capture): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def setCordova(value: String): Self = this.set("cordova", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


package typings.pahoMqtt.mod.global.Paho.MQTT

import typings.pahoMqtt.pahoMqttStrings.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceElement extends js.Object {
  var message: String = js.native
  var severity: Debug = js.native
}

object TraceElement {
  @scala.inline
  def apply(message: String, severity: Debug): TraceElement = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceElement]
  }
  @scala.inline
  implicit class TraceElementOps[Self <: TraceElement] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: Debug): Self = this.set("severity", value.asInstanceOf[js.Any])
  }
  
}


package typings.mqtt.anon

import typings.mqtt.mqttStrings.mqtt
import typings.mqtt.mqttStrings.mqtts
import typings.mqtt.mqttStrings.ssl
import typings.mqtt.mqttStrings.tcp
import typings.mqtt.mqttStrings.ws
import typings.mqtt.mqttStrings.wss
import typings.mqtt.mqttStrings.wx
import typings.mqtt.mqttStrings.wxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  var host: String = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.native
}

object Host {
  @scala.inline
  def apply(host: String, port: Double): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}


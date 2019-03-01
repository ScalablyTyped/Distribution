package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[
    mqttLib.mqttLibStrings.wss | mqttLib.mqttLibStrings.ws | mqttLib.mqttLibStrings.mqtt | mqttLib.mqttLibStrings.mqtts | mqttLib.mqttLibStrings.tcp | mqttLib.mqttLibStrings.ssl | mqttLib.mqttLibStrings.wx | mqttLib.mqttLibStrings.wxs
  ] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    protocol: mqttLib.mqttLibStrings.wss | mqttLib.mqttLibStrings.ws | mqttLib.mqttLibStrings.mqtt | mqttLib.mqttLibStrings.mqtts | mqttLib.mqttLibStrings.tcp | mqttLib.mqttLibStrings.ssl | mqttLib.mqttLibStrings.wx | mqttLib.mqttLibStrings.wxs = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}


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


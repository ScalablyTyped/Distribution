package typings
package mqttLib.mqttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", "MqttClient")
@js.native
class MqttClient protected ()
  extends mqttLib.typesLibConnectMod.MqttClient {
  def this(streamBuilder: js.Function1[
      /* client */ mqttLib.typesLibClientMod.MqttClient, 
      mqttLib.typesLibClientMod.IStream
    ], options: mqttLib.typesLibClientDashOptionsMod.IClientOptions) = this()
}


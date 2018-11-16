package typings
package mqttLib.typesLibConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", "MqttClient")
@js.native
class MqttClient protected ()
  extends mqttLib.typesLibClientMod.MqttClient {
  def this(streamBuilder: js.Function1[
      /* client */ mqttLib.typesLibClientMod.MqttClient, 
      mqttLib.typesLibClientMod.IStream
    ], options: mqttLib.typesLibClientDashOptionsMod.IClientOptions) = this()
}


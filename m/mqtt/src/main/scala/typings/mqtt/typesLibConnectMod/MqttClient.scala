package typings.mqtt.typesLibConnectMod

import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typings.mqtt.typesLibClientMod.IStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", "MqttClient")
@js.native
class MqttClient protected ()
  extends typings.mqtt.typesLibClientMod.MqttClient {
  def this(
    streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
    options: IClientOptions
  ) = this()
}


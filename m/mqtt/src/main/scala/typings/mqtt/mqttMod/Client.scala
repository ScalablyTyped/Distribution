package typings.mqtt.mqttMod

import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typings.mqtt.typesLibClientMod.IStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", "Client")
@js.native
class Client protected ()
  extends typings.mqtt.typesLibClientMod.MqttClient {
  def this(
    streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
    options: IClientOptions
  ) = this()
}


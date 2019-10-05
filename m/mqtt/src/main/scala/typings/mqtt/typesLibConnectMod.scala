package typings.mqtt

import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typings.mqtt.typesLibClientMod.IStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", JSImport.Namespace)
@js.native
object typesLibConnectMod extends js.Object {
  @js.native
  class MqttClient protected ()
    extends typings.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  def connect(): typings.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: String): typings.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any): typings.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typings.mqtt.typesLibClientMod.MqttClient = js.native
}


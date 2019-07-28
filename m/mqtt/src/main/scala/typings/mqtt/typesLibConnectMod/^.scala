package typings.mqtt.typesLibConnectMod

import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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


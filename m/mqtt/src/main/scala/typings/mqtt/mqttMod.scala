package typings.mqtt

import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typings.mqtt.typesLibClientMod.IStream
import typings.mqtt.typesLibStoreDashOptionsMod.IStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", JSImport.Namespace)
@js.native
object mqttMod extends js.Object {
  @js.native
  class Client protected ()
    extends typings.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @js.native
  class MqttClient protected ()
    extends typings.mqtt.typesLibConnectMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * In-memory implementation of the message store
    * This can actually be saved into files.
    *
    */
  @js.native
  class Store protected ()
    extends typings.mqtt.typesLibStoreMod.Store {
    /**
      * Store constructor
      *
      * @param {Object} [options] - store options
      */
    def this(options: IStoreOptions) = this()
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


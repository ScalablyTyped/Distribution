package typings.mqtt

import typings.mqtt.clientMod.IStream
import typings.mqtt.clientOptionsMod.IClientOptions
import typings.mqtt.storeOptionsMod.IStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Client protected ()
    extends typings.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @js.native
  class MqttClient protected ()
    extends typings.mqtt.connectMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.clientMod.MqttClient, IStream],
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
    extends typings.mqtt.storeMod.Store {
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
  def connect(): typings.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: js.UndefOr[scala.Nothing], opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: String): typings.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any): typings.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
}


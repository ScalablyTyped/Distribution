package typings.mqtt

import typings.mqtt.clientMod.IStream
import typings.mqtt.clientOptionsMod.IClientOptions
import typings.mqtt.storeOptionsMod.IStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mqtt", "Client")
  @js.native
  class Client protected ()
    extends typings.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @JSImport("mqtt", "MqttClient")
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
  @JSImport("mqtt", "Store")
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
  @JSImport("mqtt", "connect")
  @js.native
  def connect(): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt", "connect")
  @js.native
  def connect(brokerUrl: js.UndefOr[scala.Nothing], opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt", "connect")
  @js.native
  def connect(brokerUrl: String): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt", "connect")
  @js.native
  def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt", "connect")
  @js.native
  def connect(brokerUrl: js.Any): typings.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt", "connect")
  @js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = js.native
}

package typings.mqtt

import typings.mqtt.clientMod.IStream
import typings.mqtt.clientOptionsMod.IClientOptions
import typings.mqtt.storeOptionsMod.IStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mqtt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mqtt", "Client")
  @js.native
  open class Client protected ()
    extends typings.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @JSImport("mqtt", "MqttClient")
  @js.native
  open class MqttClient protected ()
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
  open class Store protected ()
    extends typings.mqtt.storeMod.Store {
    /**
      * Store constructor
      *
      * @param {Object} [options] - store options
      */
    def this(options: IStoreOptions) = this()
  }
  
  /**
    * UniqueMessageIdProvider
    */
  @JSImport("mqtt", "UniqueMessageIdProvider")
  @js.native
  /**
    * UniqueMessageIdProvider constructor.
    * @constructor
    */
  open class UniqueMessageIdProvider ()
    extends typings.mqtt.uniqueMessageIdProviderMod.UniqueMessageIdProvider
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} brokerUrl - url of the broker
    * @param {Object} opts - see MqttClient#constructor
    */
  inline def connect(brokerUrl: String): typings.mqtt.clientMod.MqttClient = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(brokerUrl.asInstanceOf[js.Any]).asInstanceOf[typings.mqtt.clientMod.MqttClient]
  inline def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.clientMod.MqttClient = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(brokerUrl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.mqtt.clientMod.MqttClient]
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {Object} opts - see MqttClient#constructor
    */
  inline def connect(opts: IClientOptions): typings.mqtt.clientMod.MqttClient = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.mqtt.clientMod.MqttClient]
}

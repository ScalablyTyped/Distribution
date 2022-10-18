package typings.mqtt

import typings.mqtt.typesLibClientMod.IStream
import typings.mqtt.typesLibClientOptionsMod.IClientOptions
import typings.mqtt.typesLibStoreOptionsMod.IStoreOptions
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
    extends typings.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @JSImport("mqtt", "MqttClient")
  @js.native
  open class MqttClient protected ()
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
  @JSImport("mqtt", "Store")
  @js.native
  open class Store protected ()
    extends typings.mqtt.typesLibStoreMod.Store {
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
    extends typings.mqtt.typesLibUniqueMessageIdProviderMod.UniqueMessageIdProvider
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} brokerUrl - url of the broker
    * @param {Object} opts - see MqttClient#constructor
    */
  inline def connect(brokerUrl: String): typings.mqtt.typesLibClientMod.MqttClient = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(brokerUrl.asInstanceOf[js.Any]).asInstanceOf[typings.mqtt.typesLibClientMod.MqttClient]
  inline def connect(brokerUrl: String, opts: IClientOptions): typings.mqtt.typesLibClientMod.MqttClient = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(brokerUrl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.mqtt.typesLibClientMod.MqttClient]
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {Object} opts - see MqttClient#constructor
    */
  inline def connect(opts: IClientOptions): typings.mqtt.typesLibClientMod.MqttClient = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.mqtt.typesLibClientMod.MqttClient]
}

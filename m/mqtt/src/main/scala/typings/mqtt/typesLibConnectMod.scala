package typings.mqtt

import typings.mqtt.typesLibClientMod.IStream
import typings.mqtt.typesLibClientOptionsMod.IClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibConnectMod {
  
  @JSImport("mqtt/types/lib/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mqtt/types/lib/connect", "MqttClient")
  @js.native
  open class MqttClient protected ()
    extends typings.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typings.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
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

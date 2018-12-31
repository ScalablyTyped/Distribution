package typings
package mqttLib.mqttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", JSImport.Namespace)
@js.native
object mqttModMembers extends js.Object {
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  def connect(): mqttLib.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: java.lang.String): mqttLib.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: java.lang.String, opts: mqttLib.typesLibClientDashOptionsMod.IClientOptions): mqttLib.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any): mqttLib.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any, opts: mqttLib.typesLibClientDashOptionsMod.IClientOptions): mqttLib.typesLibClientMod.MqttClient = js.native
}


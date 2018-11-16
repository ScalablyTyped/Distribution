package typings
package mqttLib.mqttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", "Client")
@js.native
class Client protected ()
  extends mqttLib.typesLibClientMod.MqttClient {
  def this(streamBuilder: js.Function1[
      /* client */ mqttLib.typesLibClientMod.MqttClient, 
      mqttLib.typesLibClientMod.IStream
    ], options: mqttLib.typesLibClientDashOptionsMod.IClientOptions) = this()
}


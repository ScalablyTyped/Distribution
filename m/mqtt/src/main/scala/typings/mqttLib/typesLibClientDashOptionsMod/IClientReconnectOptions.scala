package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientReconnectOptions extends js.Object {
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
}


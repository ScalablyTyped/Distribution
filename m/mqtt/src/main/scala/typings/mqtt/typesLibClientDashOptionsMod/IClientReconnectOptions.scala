package typings.mqtt.typesLibClientDashOptionsMod

import typings.mqtt.typesLibStoreMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientReconnectOptions extends js.Object {
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.undefined
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.undefined
}

object IClientReconnectOptions {
  @scala.inline
  def apply(incomingStore: Store = null, outgoingStore: Store = null): IClientReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientReconnectOptions]
  }
}


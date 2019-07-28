package typings.mqtt.typesLibClientDashOptionsMod

import typings.mqttDashPacket.mqttDashPacketMod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPublishOptions extends js.Object {
  /**
    * callback called when message is put into `outgoingStore`
    */
  var cbStorePut: js.UndefOr[StorePutCallback] = js.undefined
  /**
    * whether or not mark a message as duplicate
    */
  var dup: js.UndefOr[Boolean] = js.undefined
  /**
    * the QoS
    */
  var qos: QoS
  /**
    * the retain flag
    */
  var retain: js.UndefOr[Boolean] = js.undefined
}

object IClientPublishOptions {
  @scala.inline
  def apply(
    qos: QoS,
    cbStorePut: StorePutCallback = null,
    dup: js.UndefOr[Boolean] = js.undefined,
    retain: js.UndefOr[Boolean] = js.undefined
  ): IClientPublishOptions = {
    val __obj = js.Dynamic.literal(qos = qos)
    if (cbStorePut != null) __obj.updateDynamic("cbStorePut")(cbStorePut)
    if (!js.isUndefined(dup)) __obj.updateDynamic("dup")(dup)
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain)
    __obj.asInstanceOf[IClientPublishOptions]
  }
}


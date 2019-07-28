package typings.parityDashPmd.parityDashPmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMDMessage extends js.Object {
  var instrument: js.UndefOr[String] = js.undefined
  var messageType: String
  var orderNumber: js.UndefOr[Double] = js.undefined
  var price: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PMDMessage {
  @scala.inline
  def apply(
    messageType: String,
    instrument: String = null,
    orderNumber: Int | Double = null,
    price: Int | Double = null,
    quantity: Int | Double = null,
    side: String = null,
    timestamp: Int | Double = null,
    version: String = null
  ): PMDMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType)
    if (instrument != null) __obj.updateDynamic("instrument")(instrument)
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PMDMessage]
  }
}


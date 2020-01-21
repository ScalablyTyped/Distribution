package typings.parityPoe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POEMessage extends js.Object {
  var canceledQuantity: js.UndefOr[Double] = js.undefined
  var instrument: js.UndefOr[String] = js.undefined
  var liquidityFlag: js.UndefOr[String] = js.undefined
  var matchNumber: js.UndefOr[Double] = js.undefined
  var messageType: String
  var orderId: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
}

object POEMessage {
  @scala.inline
  def apply(
    messageType: String,
    canceledQuantity: Int | Double = null,
    instrument: String = null,
    liquidityFlag: String = null,
    matchNumber: Int | Double = null,
    orderId: String = null,
    price: Int | Double = null,
    quantity: Int | Double = null,
    reason: String = null,
    side: String = null,
    timestamp: Int | Double = null
  ): POEMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    if (canceledQuantity != null) __obj.updateDynamic("canceledQuantity")(canceledQuantity.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (liquidityFlag != null) __obj.updateDynamic("liquidityFlag")(liquidityFlag.asInstanceOf[js.Any])
    if (matchNumber != null) __obj.updateDynamic("matchNumber")(matchNumber.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[POEMessage]
  }
}


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
    canceledQuantity: js.UndefOr[Double] = js.undefined,
    instrument: String = null,
    liquidityFlag: String = null,
    matchNumber: js.UndefOr[Double] = js.undefined,
    orderId: String = null,
    price: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined,
    reason: String = null,
    side: String = null,
    timestamp: js.UndefOr[Double] = js.undefined
  ): POEMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(canceledQuantity)) __obj.updateDynamic("canceledQuantity")(canceledQuantity.get.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (liquidityFlag != null) __obj.updateDynamic("liquidityFlag")(liquidityFlag.asInstanceOf[js.Any])
    if (!js.isUndefined(matchNumber)) __obj.updateDynamic("matchNumber")(matchNumber.get.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[POEMessage]
  }
}


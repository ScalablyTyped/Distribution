package typings.parityPmr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMRMessage extends js.Object {
  var canceledQuantity: js.UndefOr[Double] = js.undefined
  var incomingOrderNumber: js.UndefOr[Double] = js.undefined
  var instrument: js.UndefOr[String] = js.undefined
  var matchNumber: js.UndefOr[Double] = js.undefined
  var messageType: String
  var orderNumber: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var restingOrderNumber: js.UndefOr[Double] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object PMRMessage {
  @scala.inline
  def apply(
    messageType: String,
    canceledQuantity: js.UndefOr[Double] = js.undefined,
    incomingOrderNumber: js.UndefOr[Double] = js.undefined,
    instrument: String = null,
    matchNumber: js.UndefOr[Double] = js.undefined,
    orderNumber: String = null,
    price: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined,
    restingOrderNumber: js.UndefOr[Double] = js.undefined,
    side: String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    username: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): PMRMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(canceledQuantity)) __obj.updateDynamic("canceledQuantity")(canceledQuantity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incomingOrderNumber)) __obj.updateDynamic("incomingOrderNumber")(incomingOrderNumber.get.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (!js.isUndefined(matchNumber)) __obj.updateDynamic("matchNumber")(matchNumber.get.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restingOrderNumber)) __obj.updateDynamic("restingOrderNumber")(restingOrderNumber.get.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMRMessage]
  }
}


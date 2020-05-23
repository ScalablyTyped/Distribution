package typings.parityPmd.mod

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
    orderNumber: js.UndefOr[Double] = js.undefined,
    price: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined,
    side: String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    version: String = null
  ): PMDMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (!js.isUndefined(orderNumber)) __obj.updateDynamic("orderNumber")(orderNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMDMessage]
  }
}


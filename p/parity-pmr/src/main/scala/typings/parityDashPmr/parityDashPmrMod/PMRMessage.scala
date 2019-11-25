package typings.parityDashPmr.parityDashPmrMod

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
    canceledQuantity: Int | Double = null,
    incomingOrderNumber: Int | Double = null,
    instrument: String = null,
    matchNumber: Int | Double = null,
    orderNumber: String = null,
    price: Int | Double = null,
    quantity: Int | Double = null,
    restingOrderNumber: Int | Double = null,
    side: String = null,
    timestamp: Int | Double = null,
    username: String = null,
    version: Int | Double = null
  ): PMRMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    if (canceledQuantity != null) __obj.updateDynamic("canceledQuantity")(canceledQuantity.asInstanceOf[js.Any])
    if (incomingOrderNumber != null) __obj.updateDynamic("incomingOrderNumber")(incomingOrderNumber.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (matchNumber != null) __obj.updateDynamic("matchNumber")(matchNumber.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (restingOrderNumber != null) __obj.updateDynamic("restingOrderNumber")(restingOrderNumber.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMRMessage]
  }
}


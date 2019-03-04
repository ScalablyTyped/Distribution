package typings
package parityDashPmrLib.parityDashPmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMRMessage extends js.Object {
  var canceledQuantity: js.UndefOr[scala.Double] = js.undefined
  var incomingOrderNumber: js.UndefOr[scala.Double] = js.undefined
  var instrument: js.UndefOr[java.lang.String] = js.undefined
  var matchNumber: js.UndefOr[scala.Double] = js.undefined
  var messageType: java.lang.String
  var orderNumber: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[scala.Double] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var restingOrderNumber: js.UndefOr[scala.Double] = js.undefined
  var side: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object PMRMessage {
  @scala.inline
  def apply(
    messageType: java.lang.String,
    canceledQuantity: scala.Int | scala.Double = null,
    incomingOrderNumber: scala.Int | scala.Double = null,
    instrument: java.lang.String = null,
    matchNumber: scala.Int | scala.Double = null,
    orderNumber: java.lang.String = null,
    price: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null,
    restingOrderNumber: scala.Int | scala.Double = null,
    side: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    username: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): PMRMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType)
    if (canceledQuantity != null) __obj.updateDynamic("canceledQuantity")(canceledQuantity.asInstanceOf[js.Any])
    if (incomingOrderNumber != null) __obj.updateDynamic("incomingOrderNumber")(incomingOrderNumber.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument)
    if (matchNumber != null) __obj.updateDynamic("matchNumber")(matchNumber.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (restingOrderNumber != null) __obj.updateDynamic("restingOrderNumber")(restingOrderNumber.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMRMessage]
  }
}


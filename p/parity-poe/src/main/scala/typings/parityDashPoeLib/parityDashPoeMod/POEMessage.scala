package typings
package parityDashPoeLib.parityDashPoeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POEMessage extends js.Object {
  var canceledQuantity: js.UndefOr[scala.Double] = js.undefined
  var instrument: js.UndefOr[java.lang.String] = js.undefined
  var liquidityFlag: js.UndefOr[java.lang.String] = js.undefined
  var matchNumber: js.UndefOr[scala.Double] = js.undefined
  var messageType: java.lang.String
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[scala.Double] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var side: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
}

object POEMessage {
  @scala.inline
  def apply(
    messageType: java.lang.String,
    canceledQuantity: scala.Int | scala.Double = null,
    instrument: java.lang.String = null,
    liquidityFlag: java.lang.String = null,
    matchNumber: scala.Int | scala.Double = null,
    orderId: java.lang.String = null,
    price: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    side: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null
  ): POEMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType)
    if (canceledQuantity != null) __obj.updateDynamic("canceledQuantity")(canceledQuantity.asInstanceOf[js.Any])
    if (instrument != null) __obj.updateDynamic("instrument")(instrument)
    if (liquidityFlag != null) __obj.updateDynamic("liquidityFlag")(liquidityFlag)
    if (matchNumber != null) __obj.updateDynamic("matchNumber")(matchNumber.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (side != null) __obj.updateDynamic("side")(side)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[POEMessage]
  }
}


package typings
package parityDashPmdLib.parityDashPmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMDMessage extends js.Object {
  var instrument: js.UndefOr[java.lang.String] = js.undefined
  var messageType: java.lang.String
  var orderNumber: js.UndefOr[scala.Double] = js.undefined
  var price: js.UndefOr[scala.Double] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var side: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PMDMessage {
  @scala.inline
  def apply(
    messageType: java.lang.String,
    instrument: java.lang.String = null,
    orderNumber: scala.Int | scala.Double = null,
    price: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null,
    side: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    version: java.lang.String = null
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


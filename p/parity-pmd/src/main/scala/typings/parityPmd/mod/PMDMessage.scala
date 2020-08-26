package typings.parityPmd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PMDMessage extends js.Object {
  var instrument: js.UndefOr[String] = js.native
  var messageType: String = js.native
  var orderNumber: js.UndefOr[Double] = js.native
  var price: js.UndefOr[Double] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var side: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var version: js.UndefOr[String] = js.native
}

object PMDMessage {
  @scala.inline
  def apply(messageType: String): PMDMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMDMessage]
  }
  @scala.inline
  implicit class PMDMessageOps[Self <: PMDMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstrument(value: String): Self = this.set("instrument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    @scala.inline
    def setOrderNumber(value: Double): Self = this.set("orderNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderNumber: Self = this.set("orderNumber", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


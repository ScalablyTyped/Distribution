package typings.parityPoe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait POEMessage extends js.Object {
  
  var canceledQuantity: js.UndefOr[Double] = js.native
  
  var instrument: js.UndefOr[String] = js.native
  
  var liquidityFlag: js.UndefOr[String] = js.native
  
  var matchNumber: js.UndefOr[Double] = js.native
  
  var messageType: String = js.native
  
  var orderId: js.UndefOr[String] = js.native
  
  var price: js.UndefOr[Double] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var side: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
}
object POEMessage {
  
  @scala.inline
  def apply(messageType: String): POEMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[POEMessage]
  }
  
  @scala.inline
  implicit class POEMessageOps[Self <: POEMessage] (val x: Self) extends AnyVal {
    
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
    def setCanceledQuantity(value: Double): Self = this.set("canceledQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanceledQuantity: Self = this.set("canceledQuantity", js.undefined)
    
    @scala.inline
    def setInstrument(value: String): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    
    @scala.inline
    def setLiquidityFlag(value: String): Self = this.set("liquidityFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiquidityFlag: Self = this.set("liquidityFlag", js.undefined)
    
    @scala.inline
    def setMatchNumber(value: Double): Self = this.set("matchNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchNumber: Self = this.set("matchNumber", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}

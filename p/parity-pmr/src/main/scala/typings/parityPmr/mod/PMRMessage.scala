package typings.parityPmr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PMRMessage extends js.Object {
  
  var canceledQuantity: js.UndefOr[Double] = js.native
  
  var incomingOrderNumber: js.UndefOr[Double] = js.native
  
  var instrument: js.UndefOr[String] = js.native
  
  var matchNumber: js.UndefOr[Double] = js.native
  
  var messageType: String = js.native
  
  var orderNumber: js.UndefOr[String] = js.native
  
  var price: js.UndefOr[Double] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var restingOrderNumber: js.UndefOr[Double] = js.native
  
  var side: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object PMRMessage {
  
  @scala.inline
  def apply(messageType: String): PMRMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMRMessage]
  }
  
  @scala.inline
  implicit class PMRMessageOps[Self <: PMRMessage] (val x: Self) extends AnyVal {
    
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
    def setIncomingOrderNumber(value: Double): Self = this.set("incomingOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingOrderNumber: Self = this.set("incomingOrderNumber", js.undefined)
    
    @scala.inline
    def setInstrument(value: String): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    
    @scala.inline
    def setMatchNumber(value: Double): Self = this.set("matchNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchNumber: Self = this.set("matchNumber", js.undefined)
    
    @scala.inline
    def setOrderNumber(value: String): Self = this.set("orderNumber", value.asInstanceOf[js.Any])
    
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
    def setRestingOrderNumber(value: Double): Self = this.set("restingOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestingOrderNumber: Self = this.set("restingOrderNumber", js.undefined)
    
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

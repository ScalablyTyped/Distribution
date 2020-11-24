package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Purchase extends js.Object {
  
  /**
    * A developer-specified string, provided during the purchase of the product.
    */
  var developerPayload: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the purchase transaction.
    */
  var paymentID: js.UndefOr[String] = js.native
  
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[String] = js.native
  
  /**
    * Unix timestamp of when the purchase occurred.
    */
  var purchaseTime: js.UndefOr[String] = js.native
  
  /**
    * A token representing the purchase that may be used to consume the purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.native
  
  /**
    * Server-signed encoding of the purchase request.
    */
  var signedRequest: js.UndefOr[String] = js.native
}
object Purchase {
  
  @scala.inline
  def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  
  @scala.inline
  implicit class PurchaseOps[Self <: Purchase] (val x: Self) extends AnyVal {
    
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
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    
    @scala.inline
    def setPaymentID(value: String): Self = this.set("paymentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentID: Self = this.set("paymentID", js.undefined)
    
    @scala.inline
    def setProductID(value: String): Self = this.set("productID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductID: Self = this.set("productID", js.undefined)
    
    @scala.inline
    def setPurchaseTime(value: String): Self = this.set("purchaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseTime: Self = this.set("purchaseTime", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseToken: Self = this.set("purchaseToken", js.undefined)
    
    @scala.inline
    def setSignedRequest(value: String): Self = this.set("signedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedRequest: Self = this.set("signedRequest", js.undefined)
  }
}

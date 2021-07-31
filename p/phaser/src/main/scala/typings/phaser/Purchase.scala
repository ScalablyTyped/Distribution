package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Purchase extends StObject {
  
  /**
    * A developer-specified string, provided during the purchase of the product.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the purchase transaction.
    */
  var paymentID: js.UndefOr[String] = js.undefined
  
  /**
    * The product's game-specified identifier.
    */
  var productID: js.UndefOr[String] = js.undefined
  
  /**
    * Unix timestamp of when the purchase occurred.
    */
  var purchaseTime: js.UndefOr[String] = js.undefined
  
  /**
    * A token representing the purchase that may be used to consume the purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.undefined
  
  /**
    * Server-signed encoding of the purchase request.
    */
  var signedRequest: js.UndefOr[String] = js.undefined
}
object Purchase {
  
  @scala.inline
  def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  
  @scala.inline
  implicit class PurchaseMutableBuilder[Self <: Purchase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentIDUndefined: Self = StObject.set(x, "paymentID", js.undefined)
    
    @scala.inline
    def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIDUndefined: Self = StObject.set(x, "productID", js.undefined)
    
    @scala.inline
    def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTimeUndefined: Self = StObject.set(x, "purchaseTime", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    @scala.inline
    def setSignedRequest(value: String): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedRequestUndefined: Self = StObject.set(x, "signedRequest", js.undefined)
  }
}

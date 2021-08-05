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
  
  inline def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  
  extension [Self <: Purchase](x: Self) {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    inline def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
    
    inline def setPaymentIDUndefined: Self = StObject.set(x, "paymentID", js.undefined)
    
    inline def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    inline def setProductIDUndefined: Self = StObject.set(x, "productID", js.undefined)
    
    inline def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeUndefined: Self = StObject.set(x, "purchaseTime", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    inline def setSignedRequest(value: String): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
    
    inline def setSignedRequestUndefined: Self = StObject.set(x, "signedRequest", js.undefined)
  }
}

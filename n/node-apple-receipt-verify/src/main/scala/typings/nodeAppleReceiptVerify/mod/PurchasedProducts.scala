package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchasedProducts extends js.Object {
  
   // only if extended = true
  var applicationVersion: js.UndefOr[String] = js.native
  
  var bundleId: String = js.native
  
   // only for subscriptions and if extended = true; since v1.5.1
  var environment: js.UndefOr[String] = js.native
  
  var expirationDate: js.UndefOr[Double] = js.native
  
   // only for subscriptions and if extended = true
  var isInIntroOfferPeriod: js.UndefOr[Boolean] = js.native
  
  var isTrialPeriod: js.UndefOr[Boolean] = js.native
  
   // only if extended = true
  var originalApplicationVersion: js.UndefOr[String] = js.native
  
   // only if extended = true
  var originalPurchaseDate: js.UndefOr[Double] = js.native
  
  var productId: String = js.native
  
  var purchaseDate: Double = js.native
  
  var quantity: Double = js.native
  
  var transactionId: String = js.native
}
object PurchasedProducts {
  
  @scala.inline
  def apply(bundleId: String, productId: String, purchaseDate: Double, quantity: Double, transactionId: String): PurchasedProducts = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasedProducts]
  }
  
  @scala.inline
  implicit class PurchasedProductsOps[Self <: PurchasedProducts] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseDate(value: Double): Self = this.set("purchaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: String): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Double): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setIsInIntroOfferPeriod(value: Boolean): Self = this.set("isInIntroOfferPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInIntroOfferPeriod: Self = this.set("isInIntroOfferPeriod", js.undefined)
    
    @scala.inline
    def setIsTrialPeriod(value: Boolean): Self = this.set("isTrialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTrialPeriod: Self = this.set("isTrialPeriod", js.undefined)
    
    @scala.inline
    def setOriginalApplicationVersion(value: String): Self = this.set("originalApplicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalApplicationVersion: Self = this.set("originalApplicationVersion", js.undefined)
    
    @scala.inline
    def setOriginalPurchaseDate(value: Double): Self = this.set("originalPurchaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPurchaseDate: Self = this.set("originalPurchaseDate", js.undefined)
  }
}

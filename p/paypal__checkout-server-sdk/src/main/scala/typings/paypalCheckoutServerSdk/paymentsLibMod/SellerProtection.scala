package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellerProtection extends StObject {
  
  val dispute_categories: js.Array[DisputeCategory]
  
  val status: Status
}
object SellerProtection {
  
  inline def apply(dispute_categories: js.Array[DisputeCategory], status: Status): SellerProtection = {
    val __obj = js.Dynamic.literal(dispute_categories = dispute_categories.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellerProtection]
  }
  
  extension [Self <: SellerProtection](x: Self) {
    
    inline def setDispute_categories(value: js.Array[DisputeCategory]): Self = StObject.set(x, "dispute_categories", value.asInstanceOf[js.Any])
    
    inline def setDispute_categoriesVarargs(value: DisputeCategory*): Self = StObject.set(x, "dispute_categories", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

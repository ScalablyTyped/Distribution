package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionAttributes extends StObject {
  
  var Affiliation: js.UndefOr[String] = js.undefined
  
  var CouponCode: js.UndefOr[String] = js.undefined
  
  var Id: String | Double
  
  var Revenue: js.UndefOr[Double] = js.undefined
  
  var Shipping: js.UndefOr[String] = js.undefined
  
  var Tax: js.UndefOr[Double] = js.undefined
}
object TransactionAttributes {
  
  inline def apply(Id: String | Double): TransactionAttributes = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionAttributes] (val x: Self) extends AnyVal {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "Affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "Affiliation", js.undefined)
    
    inline def setCouponCode(value: String): Self = StObject.set(x, "CouponCode", value.asInstanceOf[js.Any])
    
    inline def setCouponCodeUndefined: Self = StObject.set(x, "CouponCode", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRevenue(value: Double): Self = StObject.set(x, "Revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "Revenue", js.undefined)
    
    inline def setShipping(value: String): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
    
    inline def setTax(value: Double): Self = StObject.set(x, "Tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "Tax", js.undefined)
  }
}

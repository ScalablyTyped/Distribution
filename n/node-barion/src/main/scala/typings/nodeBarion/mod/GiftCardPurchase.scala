package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GiftCardPurchase extends StObject {
  
  var Amount: js.UndefOr[Double] = js.undefined
  
  var Count: js.UndefOr[Double] = js.undefined
}
object GiftCardPurchase {
  
  inline def apply(): GiftCardPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GiftCardPurchase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GiftCardPurchase] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}

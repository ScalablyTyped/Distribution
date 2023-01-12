package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedResources extends StObject {
  
  var authorization: js.UndefOr[AuthorizationResource] = js.undefined
  
  var capture: js.UndefOr[CaptureResource] = js.undefined
  
  var order: js.UndefOr[Any] = js.undefined
  
  var refund: js.UndefOr[RefundResource] = js.undefined
  
  var sale: js.UndefOr[SaleResource] = js.undefined
}
object RelatedResources {
  
  inline def apply(): RelatedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedResources] (val x: Self) extends AnyVal {
    
    inline def setAuthorization(value: AuthorizationResource): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setCapture(value: CaptureResource): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setOrder(value: Any): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRefund(value: RefundResource): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    inline def setSale(value: SaleResource): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
  }
}

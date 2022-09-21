package typings.paypalPaypalJs.ordersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payments extends StObject {
  
  var authorizations: js.UndefOr[js.Array[Authorization]] = js.undefined
  
  var captures: js.UndefOr[js.Array[Captures]] = js.undefined
  
  var refunds: js.UndefOr[js.Array[Refunds]] = js.undefined
}
object Payments {
  
  inline def apply(): Payments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payments]
  }
  
  extension [Self <: Payments](x: Self) {
    
    inline def setAuthorizations(value: js.Array[Authorization]): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationsUndefined: Self = StObject.set(x, "authorizations", js.undefined)
    
    inline def setAuthorizationsVarargs(value: Authorization*): Self = StObject.set(x, "authorizations", js.Array(value*))
    
    inline def setCaptures(value: js.Array[Captures]): Self = StObject.set(x, "captures", value.asInstanceOf[js.Any])
    
    inline def setCapturesUndefined: Self = StObject.set(x, "captures", js.undefined)
    
    inline def setCapturesVarargs(value: Captures*): Self = StObject.set(x, "captures", js.Array(value*))
    
    inline def setRefunds(value: js.Array[Refunds]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setRefundsVarargs(value: Refunds*): Self = StObject.set(x, "refunds", js.Array(value*))
  }
}

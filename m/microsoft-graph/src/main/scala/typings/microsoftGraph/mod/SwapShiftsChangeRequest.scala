package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwapShiftsChangeRequest
  extends StObject
     with OfferShiftRequest {
  
  // ShiftId for the recipient user with whom the request is to swap.
  var recipientShiftId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SwapShiftsChangeRequest {
  
  inline def apply(): SwapShiftsChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapShiftsChangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwapShiftsChangeRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipientShiftId(value: NullableOption[String]): Self = StObject.set(x, "recipientShiftId", value.asInstanceOf[js.Any])
    
    inline def setRecipientShiftIdNull: Self = StObject.set(x, "recipientShiftId", null)
    
    inline def setRecipientShiftIdUndefined: Self = StObject.set(x, "recipientShiftId", js.undefined)
  }
}

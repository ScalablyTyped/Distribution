package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwapShiftsChangeRequest extends OfferShiftRequest {
  
  // ShiftId for the recipient user with whom the request is to swap.
  var recipientShiftId: js.UndefOr[NullableOption[String]] = js.native
}
object SwapShiftsChangeRequest {
  
  @scala.inline
  def apply(): SwapShiftsChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapShiftsChangeRequest]
  }
  
  @scala.inline
  implicit class SwapShiftsChangeRequestMutableBuilder[Self <: SwapShiftsChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipientShiftId(value: NullableOption[String]): Self = StObject.set(x, "recipientShiftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientShiftIdNull: Self = StObject.set(x, "recipientShiftId", null)
    
    @scala.inline
    def setRecipientShiftIdUndefined: Self = StObject.set(x, "recipientShiftId", js.undefined)
  }
}

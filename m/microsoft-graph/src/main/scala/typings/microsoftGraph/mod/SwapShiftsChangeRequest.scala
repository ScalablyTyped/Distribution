package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapShiftsChangeRequest extends OfferShiftRequest {
  // ShiftId for the recipient user with whom the request is to swap.
  var recipientShiftId: js.UndefOr[String] = js.native
}

object SwapShiftsChangeRequest {
  @scala.inline
  def apply(): SwapShiftsChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapShiftsChangeRequest]
  }
  @scala.inline
  implicit class SwapShiftsChangeRequestOps[Self <: SwapShiftsChangeRequest] (val x: Self) extends AnyVal {
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
    def setRecipientShiftId(value: String): Self = this.set("recipientShiftId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientShiftId: Self = this.set("recipientShiftId", js.undefined)
  }
  
}


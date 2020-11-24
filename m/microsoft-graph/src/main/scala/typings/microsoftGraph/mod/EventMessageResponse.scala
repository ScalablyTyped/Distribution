package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMessageResponse extends EventMessage {
  
  var proposedNewTime: js.UndefOr[NullableOption[TimeSlot]] = js.native
  
  var responseType: js.UndefOr[NullableOption[ResponseType]] = js.native
}
object EventMessageResponse {
  
  @scala.inline
  def apply(): EventMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageResponse]
  }
  
  @scala.inline
  implicit class EventMessageResponseOps[Self <: EventMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setProposedNewTime(value: NullableOption[TimeSlot]): Self = this.set("proposedNewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedNewTime: Self = this.set("proposedNewTime", js.undefined)
    
    @scala.inline
    def setProposedNewTimeNull: Self = this.set("proposedNewTime", null)
    
    @scala.inline
    def setResponseType(value: NullableOption[ResponseType]): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setResponseTypeNull: Self = this.set("responseType", null)
  }
}

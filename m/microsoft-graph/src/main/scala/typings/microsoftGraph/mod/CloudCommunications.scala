package typings.microsoftGraph.mod

import typings.microsoftGraph.mod.CallRecords.CallRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudCommunications extends Entity {
  
  var callRecords: js.UndefOr[NullableOption[js.Array[CallRecord]]] = js.native
  
  var calls: js.UndefOr[NullableOption[js.Array[Call]]] = js.native
  
  var onlineMeetings: js.UndefOr[NullableOption[js.Array[OnlineMeeting]]] = js.native
}
object CloudCommunications {
  
  @scala.inline
  def apply(): CloudCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudCommunications]
  }
  
  @scala.inline
  implicit class CloudCommunicationsOps[Self <: CloudCommunications] (val x: Self) extends AnyVal {
    
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
    def setCallRecordsVarargs(value: CallRecord*): Self = this.set("callRecords", js.Array(value :_*))
    
    @scala.inline
    def setCallRecords(value: NullableOption[js.Array[CallRecord]]): Self = this.set("callRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallRecords: Self = this.set("callRecords", js.undefined)
    
    @scala.inline
    def setCallRecordsNull: Self = this.set("callRecords", null)
    
    @scala.inline
    def setCallsVarargs(value: Call*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: NullableOption[js.Array[Call]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalls: Self = this.set("calls", js.undefined)
    
    @scala.inline
    def setCallsNull: Self = this.set("calls", null)
    
    @scala.inline
    def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = this.set("onlineMeetings", js.Array(value :_*))
    
    @scala.inline
    def setOnlineMeetings(value: NullableOption[js.Array[OnlineMeeting]]): Self = this.set("onlineMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlineMeetings: Self = this.set("onlineMeetings", js.undefined)
    
    @scala.inline
    def setOnlineMeetingsNull: Self = this.set("onlineMeetings", null)
  }
}

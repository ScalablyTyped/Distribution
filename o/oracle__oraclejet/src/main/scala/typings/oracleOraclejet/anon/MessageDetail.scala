package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDetail extends js.Object {
  
  var hint: js.UndefOr[InRange] = js.native
  
  var messageDetail: js.UndefOr[RangeOverflow] = js.native
  
  var messageSummary: js.UndefOr[RangeOverflow] = js.native
}
object MessageDetail {
  
  @scala.inline
  def apply(): MessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageDetail]
  }
  
  @scala.inline
  implicit class MessageDetailOps[Self <: MessageDetail] (val x: Self) extends AnyVal {
    
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
    def setHint(value: InRange): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: RangeOverflow): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: RangeOverflow): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
  }
}

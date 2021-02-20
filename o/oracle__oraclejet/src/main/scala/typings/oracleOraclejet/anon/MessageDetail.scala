package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDetail extends StObject {
  
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
  implicit class MessageDetailMutableBuilder[Self <: MessageDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: InRange): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: RangeOverflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: RangeOverflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

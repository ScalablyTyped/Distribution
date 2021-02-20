package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HintMessageDetail extends StObject {
  
  var hint: js.UndefOr[Exact] = js.native
  
  var messageDetail: js.UndefOr[RangeUnderflow] = js.native
  
  var messageSummary: js.UndefOr[RangeOverflow] = js.native
}
object HintMessageDetail {
  
  @scala.inline
  def apply(): HintMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintMessageDetail]
  }
  
  @scala.inline
  implicit class HintMessageDetailMutableBuilder[Self <: HintMessageDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: Exact): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: RangeUnderflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: RangeOverflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

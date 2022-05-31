package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintMessageDetail extends StObject {
  
  var hint: js.UndefOr[Exact] = js.undefined
  
  var messageDetail: js.UndefOr[RangeUnderflow] = js.undefined
  
  var messageSummary: js.UndefOr[RangeOverflow] = js.undefined
}
object HintMessageDetail {
  
  inline def apply(): HintMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintMessageDetail]
  }
  
  extension [Self <: HintMessageDetail](x: Self) {
    
    inline def setHint(value: Exact): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setMessageDetail(value: RangeUnderflow): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    inline def setMessageSummary(value: RangeOverflow): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

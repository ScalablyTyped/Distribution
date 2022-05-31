package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSummary extends StObject {
  
  var messageDetail: js.UndefOr[String] = js.undefined
  
  var messageSummary: js.UndefOr[String] = js.undefined
}
object MessageSummary {
  
  inline def apply(): MessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSummary]
  }
  
  extension [Self <: MessageSummary](x: Self) {
    
    inline def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    inline def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

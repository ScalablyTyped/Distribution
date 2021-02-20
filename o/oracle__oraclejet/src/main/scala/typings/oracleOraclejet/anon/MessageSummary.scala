package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageSummary extends StObject {
  
  var messageDetail: js.UndefOr[String] = js.native
  
  var messageSummary: js.UndefOr[String] = js.native
}
object MessageSummary {
  
  @scala.inline
  def apply(): MessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSummary]
  }
  
  @scala.inline
  implicit class MessageSummaryMutableBuilder[Self <: MessageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

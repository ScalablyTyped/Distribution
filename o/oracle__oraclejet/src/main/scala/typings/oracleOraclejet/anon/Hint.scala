package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends StObject {
  
  var hint: js.UndefOr[String] = js.native
  
  var messageDetail: js.UndefOr[String] = js.native
  
  var messageSummary: js.UndefOr[String] = js.native
}
object Hint {
  
  @scala.inline
  def apply(): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
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

package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hint extends StObject {
  
  var hint: js.UndefOr[String] = js.undefined
  
  var messageDetail: js.UndefOr[String] = js.undefined
  
  var messageSummary: js.UndefOr[String] = js.undefined
}
object Hint {
  
  inline def apply(): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
    
    inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
    
    inline def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
    
    inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptions extends StObject {
  
  var hideBotAfterEscalation: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CallOptions {
  
  inline def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    inline def setHideBotAfterEscalation(value: NullableOption[Boolean]): Self = StObject.set(x, "hideBotAfterEscalation", value.asInstanceOf[js.Any])
    
    inline def setHideBotAfterEscalationNull: Self = StObject.set(x, "hideBotAfterEscalation", null)
    
    inline def setHideBotAfterEscalationUndefined: Self = StObject.set(x, "hideBotAfterEscalation", js.undefined)
  }
}

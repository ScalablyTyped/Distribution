package typings.mirrorx.mod

import typings.history.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptProps extends StObject {
  
  var message: String | (js.Function1[/* location */ Location, String | Boolean])
  
  var when: js.UndefOr[Boolean] = js.undefined
}
object PromptProps {
  
  inline def apply(message: String | (js.Function1[/* location */ Location, String | Boolean])): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
  
  extension [Self <: PromptProps](x: Self) {
    
    inline def setMessage(value: String | (js.Function1[/* location */ Location, String | Boolean])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* location */ Location => String | Boolean): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}

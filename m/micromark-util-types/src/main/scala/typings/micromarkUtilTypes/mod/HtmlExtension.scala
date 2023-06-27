package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlExtension extends StObject {
  
  var enter: js.UndefOr[Handles] = js.undefined
  
  var exit: js.UndefOr[Handles] = js.undefined
}
object HtmlExtension {
  
  inline def apply(): HtmlExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlExtension] (val x: Self) extends AnyVal {
    
    inline def setEnter(value: Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}

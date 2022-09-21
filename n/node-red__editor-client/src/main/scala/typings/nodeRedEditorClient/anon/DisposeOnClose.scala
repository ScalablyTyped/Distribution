package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.compact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisposeOnClose extends StObject {
  
  var disposeOnClose: js.UndefOr[Boolean] = js.undefined
  
  var onclose: js.UndefOr[js.Function1[/* v */ Boolean, Unit]] = js.undefined
  
  var options: js.UndefOr[js.Array[Onselect]] = js.undefined
  
  var style: js.UndefOr[compact] = js.undefined
}
object DisposeOnClose {
  
  inline def apply(): DisposeOnClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisposeOnClose]
  }
  
  extension [Self <: DisposeOnClose](x: Self) {
    
    inline def setDisposeOnClose(value: Boolean): Self = StObject.set(x, "disposeOnClose", value.asInstanceOf[js.Any])
    
    inline def setDisposeOnCloseUndefined: Self = StObject.set(x, "disposeOnClose", js.undefined)
    
    inline def setOnclose(value: /* v */ Boolean => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setOptions(value: js.Array[Onselect]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Onselect*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setStyle(value: compact): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

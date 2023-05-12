package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.WindowManager.EventMap, any>> */
trait PartialRecordkeyofEventMaOpening extends StObject {
  
  var closing: js.UndefOr[Any] = js.undefined
  
  var opening: js.UndefOr[Any] = js.undefined
  
  var resize: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaOpening {
  
  inline def apply(): PartialRecordkeyofEventMaOpening = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaOpening]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaOpening] (val x: Self) extends AnyVal {
    
    inline def setClosing(value: Any): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setClosingUndefined: Self = StObject.set(x, "closing", js.undefined)
    
    inline def setOpening(value: Any): Self = StObject.set(x, "opening", value.asInstanceOf[js.Any])
    
    inline def setOpeningUndefined: Self = StObject.set(x, "opening", js.undefined)
    
    inline def setResize(value: Any): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}

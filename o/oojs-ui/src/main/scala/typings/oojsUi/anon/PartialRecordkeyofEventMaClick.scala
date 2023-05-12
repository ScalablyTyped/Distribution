package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.ButtonWidget.EventMap, any>> */
trait PartialRecordkeyofEventMaClick extends StObject {
  
  var click: js.UndefOr[Any] = js.undefined
  
  var disable: js.UndefOr[Any] = js.undefined
  
  var flag: js.UndefOr[Any] = js.undefined
  
  var labelChange: js.UndefOr[Any] = js.undefined
  
  var toggle: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaClick {
  
  inline def apply(): PartialRecordkeyofEventMaClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaClick] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Any): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDisable(value: Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setFlag(value: Any): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setLabelChange(value: Any): Self = StObject.set(x, "labelChange", value.asInstanceOf[js.Any])
    
    inline def setLabelChangeUndefined: Self = StObject.set(x, "labelChange", js.undefined)
    
    inline def setToggle(value: Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}

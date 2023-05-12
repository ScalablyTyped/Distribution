package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.MultioptionWidget.EventMap, any>> */
trait PartialRecordkeyofEventMaToggle extends StObject {
  
  var change: js.UndefOr[Any] = js.undefined
  
  var disable: js.UndefOr[Any] = js.undefined
  
  var labelChange: js.UndefOr[Any] = js.undefined
  
  var toggle: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaToggle {
  
  inline def apply(): PartialRecordkeyofEventMaToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaToggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaToggle] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Any): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDisable(value: Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setLabelChange(value: Any): Self = StObject.set(x, "labelChange", value.asInstanceOf[js.Any])
    
    inline def setLabelChangeUndefined: Self = StObject.set(x, "labelChange", js.undefined)
    
    inline def setToggle(value: Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}

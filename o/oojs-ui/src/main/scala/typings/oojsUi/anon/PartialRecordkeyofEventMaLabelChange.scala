package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.LabelWidget.EventMap, any>> */
trait PartialRecordkeyofEventMaLabelChange extends StObject {
  
  var disable: js.UndefOr[Any] = js.undefined
  
  var labelChange: js.UndefOr[Any] = js.undefined
  
  var toggle: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaLabelChange {
  
  inline def apply(): PartialRecordkeyofEventMaLabelChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaLabelChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaLabelChange] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setLabelChange(value: Any): Self = StObject.set(x, "labelChange", value.asInstanceOf[js.Any])
    
    inline def setLabelChangeUndefined: Self = StObject.set(x, "labelChange", js.undefined)
    
    inline def setToggle(value: Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}

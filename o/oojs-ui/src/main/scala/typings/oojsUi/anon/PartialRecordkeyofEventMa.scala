package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.ActionSet.EventMap, any>> */
trait PartialRecordkeyofEventMa extends StObject {
  
  var add: js.UndefOr[Any] = js.undefined
  
  var change: js.UndefOr[Any] = js.undefined
  
  var click: js.UndefOr[Any] = js.undefined
  
  var remove: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMa {
  
  inline def apply(): PartialRecordkeyofEventMa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMa] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setChange(value: Any): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClick(value: Any): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setRemove(value: Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}

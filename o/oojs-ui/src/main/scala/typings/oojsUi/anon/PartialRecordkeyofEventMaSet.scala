package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.IndexLayout.EventMap, any>> */
trait PartialRecordkeyofEventMaSet extends StObject {
  
  var add: js.UndefOr[Any] = js.undefined
  
  var remove: js.UndefOr[Any] = js.undefined
  
  var set: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaSet {
  
  inline def apply(): PartialRecordkeyofEventMaSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaSet] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}

package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.TabPanelLayout.EventMap, any>> */
trait PartialRecordkeyofEventMaActive extends StObject {
  
  var active: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaActive {
  
  inline def apply(): PartialRecordkeyofEventMaActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaActive] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
  }
}

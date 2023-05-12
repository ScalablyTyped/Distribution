package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.FieldLayout.EventMap, any>> */
trait PartialRecordkeyofEventMa0 extends StObject {
  
  var labelChange: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMa0 {
  
  inline def apply(): PartialRecordkeyofEventMa0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMa0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMa0] (val x: Self) extends AnyVal {
    
    inline def setLabelChange(value: Any): Self = StObject.set(x, "labelChange", value.asInstanceOf[js.Any])
    
    inline def setLabelChangeUndefined: Self = StObject.set(x, "labelChange", js.undefined)
  }
}

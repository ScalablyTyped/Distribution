package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof oojs-ui.OO.ui.Tool.EventMap, any>> */
trait PartialRecordkeyofEventMaDisableFlag extends StObject {
  
  var disable: js.UndefOr[Any] = js.undefined
  
  var flag: js.UndefOr[Any] = js.undefined
  
  var toggle: js.UndefOr[Any] = js.undefined
}
object PartialRecordkeyofEventMaDisableFlag {
  
  inline def apply(): PartialRecordkeyofEventMaDisableFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofEventMaDisableFlag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordkeyofEventMaDisableFlag] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setFlag(value: Any): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setToggle(value: Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}

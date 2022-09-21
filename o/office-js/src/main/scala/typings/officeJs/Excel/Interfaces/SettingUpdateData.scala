package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Setting object, for use in `setting.set({ ... })`. */
trait SettingUpdateData extends StObject {
  
  /**
    * Represents the value stored for this setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object SettingUpdateData {
  
  inline def apply(): SettingUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingUpdateData]
  }
  
  extension [Self <: SettingUpdateData](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

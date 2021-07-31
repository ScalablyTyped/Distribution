package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the FormatProtection object, for use in `formatProtection.set({ ... })`. */
trait FormatProtectionUpdateData extends StObject {
  
  /**
    *
    * Specifies if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}
object FormatProtectionUpdateData {
  
  @scala.inline
  def apply(): FormatProtectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProtectionUpdateData]
  }
  
  @scala.inline
  implicit class FormatProtectionUpdateDataMutableBuilder[Self <: FormatProtectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}

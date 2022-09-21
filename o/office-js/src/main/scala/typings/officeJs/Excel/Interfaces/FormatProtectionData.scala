package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `formatProtection.toJSON()`. */
trait FormatProtectionData extends StObject {
  
  /**
    * Specifies if Excel hides the formula for the cells in the range. A `null` value indicates that the entire range doesn't have a uniform formula hidden setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if Excel locks the cells in the object. A `null` value indicates that the entire range doesn't have a uniform lock setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}
object FormatProtectionData {
  
  inline def apply(): FormatProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProtectionData]
  }
  
  extension [Self <: FormatProtectionData](x: Self) {
    
    inline def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    inline def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}

package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the format protection of a range object.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait FormatProtectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
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
object FormatProtectionLoadOptions {
  
  inline def apply(): FormatProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProtectionLoadOptions]
  }
  
  extension [Self <: FormatProtectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    inline def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}

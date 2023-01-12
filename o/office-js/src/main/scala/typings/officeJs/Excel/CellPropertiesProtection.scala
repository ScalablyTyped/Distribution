package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the `format.protection` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties`, or the `format.protection` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesProtection extends StObject {
  
  /**
    * Represents the `format.protection.formulaHidden` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.protection.locked` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesProtection {
  
  inline def apply(): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesProtection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellPropertiesProtection] (val x: Self) extends AnyVal {
    
    inline def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    inline def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}

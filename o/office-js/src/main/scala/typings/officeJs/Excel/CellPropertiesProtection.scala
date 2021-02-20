package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the `format.protection` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.protection` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesProtection extends StObject {
  
  /**
    *
    * Represents the `format.protection.formulaHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the `format.protection.locked` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[Boolean] = js.native
}
object CellPropertiesProtection {
  
  @scala.inline
  def apply(): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesProtection]
  }
  
  @scala.inline
  implicit class CellPropertiesProtectionMutableBuilder[Self <: CellPropertiesProtection] (val x: Self) extends AnyVal {
    
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

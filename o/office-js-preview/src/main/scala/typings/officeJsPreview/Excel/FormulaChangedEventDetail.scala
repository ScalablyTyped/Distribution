package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a changed formula during a formula changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.13]
  */
trait FormulaChangedEventDetail extends StObject {
  
  /**
    * The address of the cell that contains the changed formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var cellAddress: String
  
  /**
    * Represents the previous formula, before it was changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var previousFormula: String
}
object FormulaChangedEventDetail {
  
  inline def apply(cellAddress: String, previousFormula: String): FormulaChangedEventDetail = {
    val __obj = js.Dynamic.literal(cellAddress = cellAddress.asInstanceOf[js.Any], previousFormula = previousFormula.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaChangedEventDetail]
  }
  
  extension [Self <: FormulaChangedEventDetail](x: Self) {
    
    inline def setCellAddress(value: String): Self = StObject.set(x, "cellAddress", value.asInstanceOf[js.Any])
    
    inline def setPreviousFormula(value: String): Self = StObject.set(x, "previousFormula", value.asInstanceOf[js.Any])
  }
}

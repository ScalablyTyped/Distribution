package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalCellValueRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CellValueConditionalFormat object, for use in `cellValueConditionalFormat.set({ ... })`. */
trait CellValueConditionalFormatUpdateData extends StObject {
  
  /**
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  
  /**
    * Specifies the rule object on this conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalCellValueRule] = js.undefined
}
object CellValueConditionalFormatUpdateData {
  
  inline def apply(): CellValueConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellValueConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRule(value: ConditionalCellValueRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}

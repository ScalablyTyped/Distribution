package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.RangeValueType.empty
import typings.officeJsPreview.officeJsPreviewStrings.Empty
import typings.officeJsPreview.officeJsPreviewStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell that's empty and has no formulas or data.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EmptyCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[empty | Empty] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[_empty] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.empty | Empty
}
object EmptyCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.empty | Empty): EmptyCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyCellValue]
  }
  
  extension [Self <: EmptyCellValue](x: Self) {
    
    inline def setBasicType(value: empty | Empty): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: _empty): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.empty | Empty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

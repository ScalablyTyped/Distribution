package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.RangeValueType.string
import typings.officeJsPreview.officeJsPreviewStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a string.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait StringCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[string | String] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: java.lang.String
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.string | String
}
object StringCellValue {
  
  inline def apply(basicValue: java.lang.String, `type`: typings.officeJsPreview.Excel.CellValueType.string | String): StringCellValue = {
    val __obj = js.Dynamic.literal(basicValue = basicValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCellValue]
  }
  
  extension [Self <: StringCellValue](x: Self) {
    
    inline def setBasicType(value: string | String): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: java.lang.String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.string | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.RangeValueType.boolean
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a boolean.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait BooleanCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var basicType: js.UndefOr[boolean | Boolean] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var basicValue: scala.Boolean
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.boolean | Boolean
}
object BooleanCellValue {
  
  inline def apply(basicValue: scala.Boolean, `type`: typings.officeJsPreview.Excel.CellValueType.boolean | Boolean): BooleanCellValue = {
    val __obj = js.Dynamic.literal(basicValue = basicValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanCellValue]
  }
  
  extension [Self <: BooleanCellValue](x: Self) {
    
    inline def setBasicType(value: boolean | Boolean): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: scala.Boolean): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.boolean | Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

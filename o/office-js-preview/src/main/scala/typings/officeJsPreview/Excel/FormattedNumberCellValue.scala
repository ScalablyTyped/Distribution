package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.formattedNumber
import typings.officeJsPreview.Excel.RangeValueType.double
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.FormattedNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a number with a format string. Number format strings must conform to Excel guidelines. To learn more, see {@link https://support.microsoft.com/office/review-guidelines-for-customizing-a-number-format-c0a1d1fa-d3f4-4018-96b7-9c9354dd99f5  | Review guidelines for customizing a number format}.
  * In this scenario, the format is applied to the value and not to the cell, so the value retains its format string throughout calculation.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait FormattedNumberCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[double | Double] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: scala.Double
  
  /**
    * Returns the number format string that is used to display this value.
    * When accessed through a `valuesAsJson` property, this number format string is in the en-US locale.  When accessed through a `valuesAsJsonLocal` property, this number format is in the user's display locale.
    * Number format strings must conform to Excel guidelines.
    * To learn more, see {@link https://support.microsoft.com/office/review-guidelines-for-customizing-a-number-format-c0a1d1fa-d3f4-4018-96b7-9c9354dd99f5 | Review guidelines for customizing a number format}.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var numberFormat: String
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: formattedNumber | FormattedNumber
}
object FormattedNumberCellValue {
  
  inline def apply(basicValue: scala.Double, numberFormat: String, `type`: formattedNumber | FormattedNumber): FormattedNumberCellValue = {
    val __obj = js.Dynamic.literal(basicValue = basicValue.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedNumberCellValue]
  }
  
  extension [Self <: FormattedNumberCellValue](x: Self) {
    
    inline def setBasicType(value: double | Double): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: scala.Double): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setType(value: formattedNumber | FormattedNumber): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

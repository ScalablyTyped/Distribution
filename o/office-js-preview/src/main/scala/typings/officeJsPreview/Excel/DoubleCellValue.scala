package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.RangeValueType.double
import typings.officeJsPreview.officeJsPreviewStrings.Double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a double.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait DoubleCellValue extends StObject {
  
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
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.double | Double
}
object DoubleCellValue {
  
  inline def apply(basicValue: scala.Double, `type`: typings.officeJsPreview.Excel.CellValueType.double | Double): DoubleCellValue = {
    val __obj = js.Dynamic.literal(basicValue = basicValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: double | Double): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: scala.Double): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.double | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

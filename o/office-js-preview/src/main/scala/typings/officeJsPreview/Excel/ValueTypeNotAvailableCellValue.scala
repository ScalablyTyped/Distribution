package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.notAvailable
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.Empty
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.NotAvailable
import typings.officeJsPreview.officeJsPreviewStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a type of value which cannot be serialized.
  * For example, an #UNKNOWN! error which represents a type of rich value not known to this version of Excel.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ValueTypeNotAvailableCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: RangeValueType | Boolean | Double | Error | Empty | String
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: scala.Boolean | scala.Double | java.lang.String
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: notAvailable | NotAvailable
}
object ValueTypeNotAvailableCellValue {
  
  inline def apply(
    basicType: RangeValueType | Boolean | Double | Error | Empty | String,
    basicValue: scala.Boolean | scala.Double | java.lang.String,
    `type`: notAvailable | NotAvailable
  ): ValueTypeNotAvailableCellValue = {
    val __obj = js.Dynamic.literal(basicType = basicType.asInstanceOf[js.Any], basicValue = basicValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTypeNotAvailableCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueTypeNotAvailableCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: RangeValueType | Boolean | Double | Error | Empty | String): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicValue(value: scala.Boolean | scala.Double | java.lang.String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: notAvailable | NotAvailable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.array
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Array
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a 2D array of cell values.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ArrayCellValue
  extends StObject
     with ReferencedValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignVALUEExclamationmark | String] = js.undefined
  
  /**
    * Represents the elements of the array. May not directly contain an `ArrayCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var elements: js.Array[js.Array[CellValue]]
  
  /**
    * Represents the cell values which are referenced within `ArrayCellValue.elements`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var referencedValues: js.UndefOr[js.Array[ReferencedValue]] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: array | typings.officeJsPreview.Excel.ReferenceValueType.array | Array
}
object ArrayCellValue {
  
  inline def apply(
    elements: js.Array[js.Array[CellValue]],
    `type`: array | typings.officeJsPreview.Excel.ReferenceValueType.array | Array
  ): ArrayCellValue = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setElements(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setReferencedValues(value: js.Array[ReferencedValue]): Self = StObject.set(x, "referencedValues", value.asInstanceOf[js.Any])
    
    inline def setReferencedValuesUndefined: Self = StObject.set(x, "referencedValues", js.undefined)
    
    inline def setReferencedValuesVarargs(value: ReferencedValue*): Self = StObject.set(x, "referencedValues", js.Array(value*))
    
    inline def setType(value: array | typings.officeJsPreview.Excel.ReferenceValueType.array | Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.reference
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.Empty
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.Reference
import typings.officeJsPreview.officeJsPreviewStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference into `referencedValues`. One scenario for using this reference is to avoid duplicating cell value objects (such as an `EntityCellValue`). Define a cell value object once in `referencedValues`, and then refer to that cell value from many places by using a `ReferenceCellValue` where the duplicated value would have appeared.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ReferenceCellValue extends StObject {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[RangeValueType | Boolean | Double | Error | Empty | String] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  
  /**
    * Represents the index into the `referencedValues` properties of cell values such as `EntityCellValue` and `ArrayCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var reference: scala.Double
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: reference | Reference
}
object ReferenceCellValue {
  
  inline def apply(reference: scala.Double, `type`: reference | Reference): ReferenceCellValue = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: RangeValueType | Boolean | Double | Error | Empty | String): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: scala.Boolean | scala.Double | java.lang.String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setReference(value: scala.Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setType(value: reference | Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

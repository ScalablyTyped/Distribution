package typings.officeJs.Excel

import typings.officeJs.Excel.ReferenceValueType.root
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Empty
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.Root
import typings.officeJs.officeJsStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference to the value which contains `referencedValues`.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait RootReferenceCellValue
  extends StObject
     with ReferencedValue {
  
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
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: root | Root
}
object RootReferenceCellValue {
  
  inline def apply(`type`: root | Root): RootReferenceCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootReferenceCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootReferenceCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: RangeValueType | Boolean | Double | Error | Empty | String): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: scala.Boolean | scala.Double | java.lang.String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setType(value: root | Root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

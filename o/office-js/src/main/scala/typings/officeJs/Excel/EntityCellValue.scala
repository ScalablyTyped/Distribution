package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.Excel.CellValueType.entity
import typings.officeJs.Excel.RangeValueType.error
import typings.officeJs.officeJsStrings.Entity
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of properties without a schema or defined structure.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityCellValue
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
    * Represents layout information for views of this entity.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var layouts: js.UndefOr[EntityViewLayouts] = js.undefined
  
  /**
    * Represents the properties of this entity and their metadata.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var properties: js.UndefOr[StringDictionary[EntityPropertyType]] = js.undefined
  
  /**
    * Represents information that describes the service that provided the data in this `EntityCellValue`.
    * This information can be used for branding in entity cards.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var provider: js.UndefOr[CellValueProviderAttributes] = js.undefined
  
  /**
    * Represents the cell values which are referenced within `EntityCellValue.properties`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var referencedValues: js.UndefOr[js.Array[ReferencedValue]] = js.undefined
  
  /**
    * Represents the text shown when a cell with this value is rendered.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: entity | typings.officeJs.Excel.ReferenceValueType.entity | Entity
}
object EntityCellValue {
  
  inline def apply(`type`: entity | typings.officeJs.Excel.ReferenceValueType.entity | Entity): EntityCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setLayouts(value: EntityViewLayouts): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    inline def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
    
    inline def setProperties(value: StringDictionary[EntityPropertyType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProvider(value: CellValueProviderAttributes): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferencedValues(value: js.Array[ReferencedValue]): Self = StObject.set(x, "referencedValues", value.asInstanceOf[js.Any])
    
    inline def setReferencedValuesUndefined: Self = StObject.set(x, "referencedValues", js.undefined)
    
    inline def setReferencedValuesVarargs(value: ReferencedValue*): Self = StObject.set(x, "referencedValues", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: entity | typings.officeJs.Excel.ReferenceValueType.entity | Entity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.Excel.CellValueType.linkedEntity
import typings.officeJs.Excel.RangeValueType.error
import typings.officeJs.anon.PropertyMetadata
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.LinkedEntity
import typings.officeJs.officeJsStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a value whose properties derive from a service.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait LinkedEntityCellValue extends StObject {
  
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
    * Represents the layout of this linked entity in card view.
    * If the `CardLayout` object doesn't have a layout property, it default value is "Entity".
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var cardLayout: js.UndefOr[CardLayout] = js.undefined
  
  /**
    * Represents the service source that provided the information in this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var id: LinkedEntityId
  
  /**
    * Represents the properties of this linked entity and their metadata.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var properties: js.UndefOr[StringDictionary[CellValue & PropertyMetadata]] = js.undefined
  
  /**
    * Represents information that describes the service that provided data in this `LinkedEntityCellValue`.
    * This information can be used for branding in entity cards.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var provider: js.UndefOr[CellValueProviderAttributes] = js.undefined
  
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
  var `type`: linkedEntity | LinkedEntity
}
object LinkedEntityCellValue {
  
  inline def apply(id: LinkedEntityId, `type`: linkedEntity | LinkedEntity): LinkedEntityCellValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedEntityCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedEntityCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setCardLayout(value: CardLayout): Self = StObject.set(x, "cardLayout", value.asInstanceOf[js.Any])
    
    inline def setCardLayoutUndefined: Self = StObject.set(x, "cardLayout", js.undefined)
    
    inline def setId(value: LinkedEntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[CellValue & PropertyMetadata]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProvider(value: CellValueProviderAttributes): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: linkedEntity | LinkedEntity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

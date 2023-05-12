package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CellValue
import typings.officeJs.Excel.NamedItemScope
import typings.officeJs.Excel.NamedItemType
import typings.officeJs.officeJsStrings.Array
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.Integer
import typings.officeJs.officeJsStrings.Range
import typings.officeJs.officeJsStrings.Workbook
import typings.officeJs.officeJsStrings.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItem.toJSON()`. */
trait NamedItemData extends StObject {
  
  /**
    * Returns an object containing values and types of the named item.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesData] = js.undefined
  
  /**
    * Specifies the comment associated with this name.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The formula of the named item. Formulas always start with an equal sign ("=").
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Any] = js.undefined
  
  /**
    * The name of the object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[NamedItemScope | Worksheet | Workbook] = js.undefined
  
  /**
    * Specifies the type of the value returned by the name's formula. See `Excel.NamedItemType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[
    NamedItemType | typings.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array
  ] = js.undefined
  
  /**
    * Represents the value computed by the name's formula. For a named range it will return the range address.
    * Note: This API returns the #VALUE! error in the Excel UI if it refers to a custom function.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `NamedItem.valueAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJson: js.UndefOr[CellValue | String] = js.undefined
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `NamedItem.valueAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJsonLocal: js.UndefOr[CellValue | String] = js.undefined
  
  /**
    * Specifies if the object is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}
object NamedItemData {
  
  inline def apply(): NamedItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedItemData] (val x: Self) extends AnyVal {
    
    inline def setArrayValues(value: NamedItemArrayValuesData): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFormula(value: Any): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: NamedItemScope | Worksheet | Workbook): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(
      value: NamedItemType | typings.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsJson(value: CellValue | String): Self = StObject.set(x, "valueAsJson", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonLocal(value: CellValue | String): Self = StObject.set(x, "valueAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonLocalUndefined: Self = StObject.set(x, "valueAsJsonLocal", js.undefined)
    
    inline def setValueAsJsonUndefined: Self = StObject.set(x, "valueAsJson", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: scala.Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

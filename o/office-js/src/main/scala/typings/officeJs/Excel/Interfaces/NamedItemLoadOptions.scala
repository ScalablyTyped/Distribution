package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a defined name for a range of cells or value. Names can be primitive named objects (as seen in the type below), range object, or a reference to a range. This object can be used to obtain range object associated with names.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait NamedItemLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns an object containing values and types of the named item.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesLoadOptions] = js.undefined
  
  /**
    * Specifies the comment associated with this name.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The formula of the named item. Formulas always start with an equal sign ("=").
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the type of the value returned by the name's formula. See `Excel.NamedItemType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `NamedItem.valueAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `NamedItem.valueAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJsonLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the object is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
  
  /**
    * Returns the worksheet to which the named item is scoped. If the item is scoped to the workbook instead, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var worksheetOrNullObject: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object NamedItemLoadOptions {
  
  inline def apply(): NamedItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedItemLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setArrayValues(value: NamedItemArrayValuesLoadOptions): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFormula(value: Boolean): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsJson(value: Boolean): Self = StObject.set(x, "valueAsJson", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonLocal(value: Boolean): Self = StObject.set(x, "valueAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonLocalUndefined: Self = StObject.set(x, "valueAsJsonLocal", js.undefined)
    
    inline def setValueAsJsonUndefined: Self = StObject.set(x, "valueAsJson", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetOrNullObject(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheetOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setWorksheetOrNullObjectUndefined: Self = StObject.set(x, "worksheetOrNullObject", js.undefined)
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}

package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A collection of all the NamedItem objects that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
trait NamedItemCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The formula of the named item. Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The name of the object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the type of the value returned by the name's formula. See Excel.NamedItemType for details.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the object is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheetOrNullObject: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object NamedItemCollectionLoadOptions {
  
  inline def apply(): NamedItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionLoadOptions]
  }
  
  extension [Self <: NamedItemCollectionLoadOptions](x: Self) {
    
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
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetOrNullObject(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheetOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setWorksheetOrNullObjectUndefined: Self = StObject.set(x, "worksheetOrNullObject", js.undefined)
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}

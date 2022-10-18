package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the rows that are part of the table.
  
  Note that unlike ranges or columns, which will adjust if new rows or columns are added before them,
  a `TableRow` object represents the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait TableRowCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns the index number of the row within the rows collection of the table. Zero-indexed.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    If the returned value starts with a plus ("+"), minus ("-"), or equal sign ("="), Excel interprets this value as a formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: A JSON representation of the values in the cells in this table row.
    Unlike `TableRow.values`, `TableRow.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `TableRow.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: A JSON representation of the values in the cells in this table row.
    Unlike `TableRow.values`, `TableRow.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `TableRow.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJsonLocal: js.UndefOr[Boolean] = js.undefined
}
object TableRowCollectionLoadOptions {
  
  inline def apply(): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
  
  extension [Self <: TableRowCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJson(value: Boolean): Self = StObject.set(x, "valuesAsJson", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocal(value: Boolean): Self = StObject.set(x, "valuesAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocalUndefined: Self = StObject.set(x, "valuesAsJsonLocal", js.undefined)
    
    inline def setValuesAsJsonUndefined: Self = StObject.set(x, "valuesAsJson", js.undefined)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}

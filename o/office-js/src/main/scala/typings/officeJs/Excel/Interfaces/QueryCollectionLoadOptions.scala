package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of queries in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
trait QueryCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the query error message from when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the query loaded to object type.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var loadedTo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the query loaded to the data model.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var loadedToDataModel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the name of the query.
    Query names cannot contain periods or quotation marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the date and time when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var refreshDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the number of rows that were loaded when the query was last refreshed.
    If last refresh has errors the value will be -1.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var rowsLoadedCount: js.UndefOr[Boolean] = js.undefined
}
object QueryCollectionLoadOptions {
  
  inline def apply(): QueryCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCollectionLoadOptions]
  }
  
  extension [Self <: QueryCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLoadedTo(value: Boolean): Self = StObject.set(x, "loadedTo", value.asInstanceOf[js.Any])
    
    inline def setLoadedToDataModel(value: Boolean): Self = StObject.set(x, "loadedToDataModel", value.asInstanceOf[js.Any])
    
    inline def setLoadedToDataModelUndefined: Self = StObject.set(x, "loadedToDataModel", js.undefined)
    
    inline def setLoadedToUndefined: Self = StObject.set(x, "loadedTo", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefreshDate(value: Boolean): Self = StObject.set(x, "refreshDate", value.asInstanceOf[js.Any])
    
    inline def setRefreshDateUndefined: Self = StObject.set(x, "refreshDate", js.undefined)
    
    inline def setRowsLoadedCount(value: Boolean): Self = StObject.set(x, "rowsLoadedCount", value.asInstanceOf[js.Any])
    
    inline def setRowsLoadedCountUndefined: Self = StObject.set(x, "rowsLoadedCount", js.undefined)
  }
}

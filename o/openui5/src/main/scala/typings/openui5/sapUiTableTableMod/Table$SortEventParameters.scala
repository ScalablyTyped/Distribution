package typings.openui5.sapUiTableTableMod

import typings.openui5.sapUiTableLibraryMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$SortEventParameters extends StObject {
  
  /**
    * sorted column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * If column was added to sorter this is true. If new sort is started this is set to false
    */
  var columnAdded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sort Order
    */
  var sortOrder: js.UndefOr[
    SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
  ] = js.undefined
}
object Table$SortEventParameters {
  
  inline def apply(): Table$SortEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$SortEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$SortEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnAdded(value: Boolean): Self = StObject.set(x, "columnAdded", value.asInstanceOf[js.Any])
    
    inline def setColumnAddedUndefined: Self = StObject.set(x, "columnAdded", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setSortOrder(
      value: SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
    ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}

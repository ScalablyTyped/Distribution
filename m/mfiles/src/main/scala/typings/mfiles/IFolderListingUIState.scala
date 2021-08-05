package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingItemGroupingMode
import typings.mfiles.MFiles.MFFolderListingViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderListingUIState extends StObject {
  
  var ColumnSortings: IFolderListingColumnSortings
  
  var Columns: IFolderListingColumns
  
  var GroupingMode: MFFolderListingItemGroupingMode
  
  var IconSize: Double
  
  var ViewMode: MFFolderListingViewMode
}
object IFolderListingUIState {
  
  inline def apply(
    ColumnSortings: IFolderListingColumnSortings,
    Columns: IFolderListingColumns,
    GroupingMode: MFFolderListingItemGroupingMode,
    IconSize: Double,
    ViewMode: MFFolderListingViewMode
  ): IFolderListingUIState = {
    val __obj = js.Dynamic.literal(ColumnSortings = ColumnSortings.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], GroupingMode = GroupingMode.asInstanceOf[js.Any], IconSize = IconSize.asInstanceOf[js.Any], ViewMode = ViewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingUIState]
  }
  
  extension [Self <: IFolderListingUIState](x: Self) {
    
    inline def setColumnSortings(value: IFolderListingColumnSortings): Self = StObject.set(x, "ColumnSortings", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: IFolderListingColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGroupingMode(value: MFFolderListingItemGroupingMode): Self = StObject.set(x, "GroupingMode", value.asInstanceOf[js.Any])
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "IconSize", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: MFFolderListingViewMode): Self = StObject.set(x, "ViewMode", value.asInstanceOf[js.Any])
  }
}

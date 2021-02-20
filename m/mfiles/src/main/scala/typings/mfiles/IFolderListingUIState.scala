package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingItemGroupingMode
import typings.mfiles.MFiles.MFFolderListingViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderListingUIState extends StObject {
  
  var ColumnSortings: IFolderListingColumnSortings = js.native
  
  var Columns: IFolderListingColumns = js.native
  
  var GroupingMode: MFFolderListingItemGroupingMode = js.native
  
  var IconSize: Double = js.native
  
  var ViewMode: MFFolderListingViewMode = js.native
}
object IFolderListingUIState {
  
  @scala.inline
  def apply(
    ColumnSortings: IFolderListingColumnSortings,
    Columns: IFolderListingColumns,
    GroupingMode: MFFolderListingItemGroupingMode,
    IconSize: Double,
    ViewMode: MFFolderListingViewMode
  ): IFolderListingUIState = {
    val __obj = js.Dynamic.literal(ColumnSortings = ColumnSortings.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], GroupingMode = GroupingMode.asInstanceOf[js.Any], IconSize = IconSize.asInstanceOf[js.Any], ViewMode = ViewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingUIState]
  }
  
  @scala.inline
  implicit class IFolderListingUIStateMutableBuilder[Self <: IFolderListingUIState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSortings(value: IFolderListingColumnSortings): Self = StObject.set(x, "ColumnSortings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: IFolderListingColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingMode(value: MFFolderListingItemGroupingMode): Self = StObject.set(x, "GroupingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "IconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: MFFolderListingViewMode): Self = StObject.set(x, "ViewMode", value.asInstanceOf[js.Any])
  }
}

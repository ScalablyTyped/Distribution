package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingItemGroupingMode
import typings.mfiles.MFiles.MFFolderListingViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderListingUIState extends js.Object {
  
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
  implicit class IFolderListingUIStateOps[Self <: IFolderListingUIState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnSortings(value: IFolderListingColumnSortings): Self = this.set("ColumnSortings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: IFolderListingColumns): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingMode(value: MFFolderListingItemGroupingMode): Self = this.set("GroupingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("IconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: MFFolderListingViewMode): Self = this.set("ViewMode", value.asInstanceOf[js.Any])
  }
}

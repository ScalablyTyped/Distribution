package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingItemGroupingMode
import typings.mfiles.MFiles.MFFolderListingViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingUIState extends js.Object {
  var ColumnSortings: IFolderListingColumnSortings
  var Columns: IFolderListingColumns
  var GroupingMode: MFFolderListingItemGroupingMode
  var IconSize: Double
  var ViewMode: MFFolderListingViewMode
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
    val __obj = js.Dynamic.literal(ColumnSortings = ColumnSortings, Columns = Columns, GroupingMode = GroupingMode, IconSize = IconSize, ViewMode = ViewMode)
  
    __obj.asInstanceOf[IFolderListingUIState]
  }
}


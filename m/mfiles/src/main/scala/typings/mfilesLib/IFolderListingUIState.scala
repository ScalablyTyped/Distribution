package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingUIState extends js.Object {
  var ColumnSortings: IFolderListingColumnSortings
  var Columns: IFolderListingColumns
  var GroupingMode: mfilesLib.MFilesNs.MFFolderListingItemGroupingMode
  var IconSize: scala.Double
  var ViewMode: mfilesLib.MFilesNs.MFFolderListingViewMode
}

object IFolderListingUIState {
  @scala.inline
  def apply(
    ColumnSortings: IFolderListingColumnSortings,
    Columns: IFolderListingColumns,
    GroupingMode: mfilesLib.MFilesNs.MFFolderListingItemGroupingMode,
    IconSize: scala.Double,
    ViewMode: mfilesLib.MFilesNs.MFFolderListingViewMode
  ): IFolderListingUIState = {
    val __obj = js.Dynamic.literal(ColumnSortings = ColumnSortings, Columns = Columns, GroupingMode = GroupingMode, IconSize = IconSize, ViewMode = ViewMode)
  
    __obj.asInstanceOf[IFolderListingUIState]
  }
}


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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnSortings")(ColumnSortings)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("GroupingMode")(GroupingMode)
    __obj.updateDynamic("IconSize")(IconSize)
    __obj.updateDynamic("ViewMode")(ViewMode)
    __obj.asInstanceOf[IFolderListingUIState]
  }
}


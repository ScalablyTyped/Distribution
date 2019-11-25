package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderView extends js.Object {
  // The method by which the folder should be sorted.
  var sortBy: js.UndefOr[String] = js.undefined
  // If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
  var sortOrder: js.UndefOr[String] = js.undefined
  // The type of view that should be used to represent the folder.
  var viewType: js.UndefOr[String] = js.undefined
}

object FolderView {
  @scala.inline
  def apply(sortBy: String = null, sortOrder: String = null, viewType: String = null): FolderView = {
    val __obj = js.Dynamic.literal()
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderView]
  }
}


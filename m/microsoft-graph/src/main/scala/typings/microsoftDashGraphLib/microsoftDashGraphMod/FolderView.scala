package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderView extends js.Object {
  /** The method by which the folder should be sorted. */
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  /** If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** The type of view that should be used to represent the folder. */
  var viewType: js.UndefOr[java.lang.String] = js.undefined
}

object FolderView {
  @scala.inline
  def apply(
    sortBy: java.lang.String = null,
    sortOrder: java.lang.String = null,
    viewType: java.lang.String = null
  ): FolderView = {
    val __obj = js.Dynamic.literal()
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[FolderView]
  }
}


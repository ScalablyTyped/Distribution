package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingColumnSorting extends js.Object {
  var ID: scala.Double
  var Index: scala.Double
  var SortAscending: scala.Boolean
  def Clone(): IFolderListingColumnSorting
}

object IFolderListingColumnSorting {
  @scala.inline
  def apply(
    Clone: js.Function0[IFolderListingColumnSorting],
    ID: scala.Double,
    Index: scala.Double,
    SortAscending: scala.Boolean
  ): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Index")(Index)
    __obj.updateDynamic("SortAscending")(SortAscending)
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
}


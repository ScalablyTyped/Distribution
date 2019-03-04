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
    val __obj = js.Dynamic.literal(Clone = Clone, ID = ID, Index = Index, SortAscending = SortAscending)
  
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
}


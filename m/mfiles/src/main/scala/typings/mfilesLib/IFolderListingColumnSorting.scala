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
    Clone: () => IFolderListingColumnSorting,
    ID: scala.Double,
    Index: scala.Double,
    SortAscending: scala.Boolean
  ): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID, Index = Index, SortAscending = SortAscending)
  
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
}


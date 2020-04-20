package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingColumnSorting extends js.Object {
  var ID: Double
  var Index: Double
  var SortAscending: Boolean
  def Clone(): IFolderListingColumnSorting
}

object IFolderListingColumnSorting {
  @scala.inline
  def apply(Clone: () => IFolderListingColumnSorting, ID: Double, Index: Double, SortAscending: Boolean): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
}


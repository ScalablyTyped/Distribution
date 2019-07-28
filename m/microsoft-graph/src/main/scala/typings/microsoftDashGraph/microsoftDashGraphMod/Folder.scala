package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  // Number of children contained immediately within this container.
  var childCount: js.UndefOr[Double] = js.undefined
  // A collection of properties defining the recommended view for the folder.
  var view: js.UndefOr[FolderView] = js.undefined
}

object Folder {
  @scala.inline
  def apply(childCount: Int | Double = null, view: FolderView = null): Folder = {
    val __obj = js.Dynamic.literal()
    if (childCount != null) __obj.updateDynamic("childCount")(childCount.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Folder]
  }
}


package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenFolder extends IosHomeScreenItem {
  /**
    * Pages of Home Screen Layout Icons which must be Application Type. This collection can contain a maximum of 500
    * elements.
    */
  var pages: js.UndefOr[js.Array[IosHomeScreenFolderPage]] = js.undefined
}

object IosHomeScreenFolder {
  @scala.inline
  def apply(displayName: String = null, pages: js.Array[IosHomeScreenFolderPage] = null): IosHomeScreenFolder = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosHomeScreenFolder]
  }
}


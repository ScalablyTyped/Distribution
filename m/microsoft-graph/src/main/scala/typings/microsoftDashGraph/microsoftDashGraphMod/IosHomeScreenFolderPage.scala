package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenFolderPage extends js.Object {
  // A list of apps to appear on a page within a folder. This collection can contain a maximum of 500 elements.
  var apps: js.UndefOr[js.Array[IosHomeScreenApp]] = js.undefined
  // Name of the folder page
  var displayName: js.UndefOr[String] = js.undefined
}

object IosHomeScreenFolderPage {
  @scala.inline
  def apply(apps: js.Array[IosHomeScreenApp] = null, displayName: String = null): IosHomeScreenFolderPage = {
    val __obj = js.Dynamic.literal()
    if (apps != null) __obj.updateDynamic("apps")(apps)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[IosHomeScreenFolderPage]
  }
}


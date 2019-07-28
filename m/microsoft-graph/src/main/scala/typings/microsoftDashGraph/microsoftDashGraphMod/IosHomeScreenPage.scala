package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenPage extends js.Object {
  // Name of the page
  var displayName: js.UndefOr[String] = js.undefined
  // A list of apps and folders to appear on a page. This collection can contain a maximum of 500 elements.
  var icons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.undefined
}

object IosHomeScreenPage {
  @scala.inline
  def apply(displayName: String = null, icons: js.Array[IosHomeScreenItem] = null): IosHomeScreenPage = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[IosHomeScreenPage]
  }
}


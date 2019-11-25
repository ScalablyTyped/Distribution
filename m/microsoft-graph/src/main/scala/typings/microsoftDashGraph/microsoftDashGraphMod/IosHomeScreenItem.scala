package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenItem extends js.Object {
  // Name of the app
  var displayName: js.UndefOr[String] = js.undefined
}

object IosHomeScreenItem {
  @scala.inline
  def apply(displayName: String = null): IosHomeScreenItem = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosHomeScreenItem]
  }
}


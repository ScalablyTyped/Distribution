package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenItem extends js.Object {
  /** Name of the app */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object IosHomeScreenItem {
  @scala.inline
  def apply(displayName: java.lang.String = null): IosHomeScreenItem = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[IosHomeScreenItem]
  }
}


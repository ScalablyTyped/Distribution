package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookUser extends Entity {
  // A list of categories defined for the user.
  var masterCategories: js.UndefOr[js.Array[OutlookCategory]] = js.undefined
}

object OutlookUser {
  @scala.inline
  def apply(id: java.lang.String = null, masterCategories: js.Array[OutlookCategory] = null): OutlookUser = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (masterCategories != null) __obj.updateDynamic("masterCategories")(masterCategories)
    __obj.asInstanceOf[OutlookUser]
  }
}


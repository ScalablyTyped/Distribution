package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppCategory extends Entity {
  /** The name of the app category. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time the mobileAppCategory was last modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object MobileAppCategory {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null
  ): MobileAppCategory = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    __obj.asInstanceOf[MobileAppCategory]
  }
}


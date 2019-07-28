package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppCategory extends Entity {
  // The name of the app category.
  var displayName: js.UndefOr[String] = js.undefined
  // The date and time the mobileAppCategory was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}

object MobileAppCategory {
  @scala.inline
  def apply(displayName: String = null, id: String = null, lastModifiedDateTime: String = null): MobileAppCategory = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    __obj.asInstanceOf[MobileAppCategory]
  }
}


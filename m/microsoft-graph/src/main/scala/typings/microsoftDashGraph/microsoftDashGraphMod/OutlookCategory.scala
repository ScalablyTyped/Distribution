package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookCategory extends Entity {
  /**
    * A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note
    * below.
    */
  var color: js.UndefOr[CategoryColor] = js.undefined
  /**
    * A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be
    * changed. Read-only.
    */
  var displayName: js.UndefOr[String] = js.undefined
}

object OutlookCategory {
  @scala.inline
  def apply(color: CategoryColor = null, displayName: String = null, id: String = null): OutlookCategory = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[OutlookCategory]
  }
}


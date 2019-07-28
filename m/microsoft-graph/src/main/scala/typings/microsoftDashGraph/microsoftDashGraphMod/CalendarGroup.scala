package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarGroup extends Entity {
  // The calendars in the calendar group. Navigation property. Read-only. Nullable.
  var calendars: js.UndefOr[js.Array[Calendar]] = js.undefined
  /**
    * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[String] = js.undefined
  // The class identifier. Read-only.
  var classId: js.UndefOr[String] = js.undefined
  // The group name.
  var name: js.UndefOr[String] = js.undefined
}

object CalendarGroup {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar] = null,
    changeKey: String = null,
    classId: String = null,
    id: String = null,
    name: String = null
  ): CalendarGroup = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (classId != null) __obj.updateDynamic("classId")(classId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CalendarGroup]
  }
}


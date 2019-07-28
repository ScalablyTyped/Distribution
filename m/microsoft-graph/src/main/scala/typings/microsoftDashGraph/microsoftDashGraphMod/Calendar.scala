package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends Entity {
  // The calendar view for the calendar. Navigation property. Read-only.
  var calendarView: js.UndefOr[js.Array[Event]] = js.undefined
  /**
    * True if the user can write to the calendar, false otherwise. This property is true for the user who created the
    * calendar. This property is also true for a user who has been shared a calendar and granted write access.
    */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * True if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can
    * share it.
    */
  var canShare: js.UndefOr[Boolean] = js.undefined
  // True if the user can read calendar items that have been marked private, false otherwise.
  var canViewPrivateItems: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are:
    * LightBlue=0, LightGreen=1, LightOrange=2, LightGray=3, LightYellow=4, LightTeal=5, LightPink=6, LightBrown=7,
    * LightRed=8, MaxColor=9, Auto=-1
    */
  var color: js.UndefOr[CalendarColor] = js.undefined
  // The events in the calendar. Navigation property. Read-only.
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  // The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The calendar name.
  var name: js.UndefOr[String] = js.undefined
  /**
    * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the
    * owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who
    * shared that calendar with the user.
    */
  var owner: js.UndefOr[EmailAddress] = js.undefined
  // The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    calendarView: js.Array[Event] = null,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined,
    canViewPrivateItems: js.UndefOr[Boolean] = js.undefined,
    changeKey: String = null,
    color: CalendarColor = null,
    events: js.Array[Event] = null,
    id: String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    name: String = null,
    owner: EmailAddress = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    if (calendarView != null) __obj.updateDynamic("calendarView")(calendarView)
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit)
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare)
    if (!js.isUndefined(canViewPrivateItems)) __obj.updateDynamic("canViewPrivateItems")(canViewPrivateItems)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (color != null) __obj.updateDynamic("color")(color)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    __obj.asInstanceOf[Calendar]
  }
}


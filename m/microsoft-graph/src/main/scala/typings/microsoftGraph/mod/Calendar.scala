package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar extends Entity {
  
  /**
    * Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible
    * values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
    */
  var allowedOnlineMeetingProviders: js.UndefOr[NullableOption[js.Array[OnlineMeetingProviderType]]] = js.native
  
  // The permissions of the users with whom the calendar is shared.
  var calendarPermissions: js.UndefOr[NullableOption[js.Array[CalendarPermission]]] = js.native
  
  // The calendar view for the calendar. Navigation property. Read-only.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  /**
    * True if the user can write to the calendar, false otherwise. This property is true for the user who created the
    * calendar. This property is also true for a user who has been shared a calendar and granted write access.
    */
  var canEdit: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * True if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can
    * share it.
    */
  var canShare: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // True if the user can read calendar items that have been marked private, false otherwise.
  var canViewPrivateItems: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are:
    * LightBlue=0, LightGreen=1, LightOrange=2, LightGray=3, LightYellow=4, LightTeal=5, LightPink=6, LightBrown=7,
    * LightRed=8, MaxColor=9, Auto=-1
    */
  var color: js.UndefOr[NullableOption[CalendarColor]] = js.native
  
  /**
    * The default online meeting provider for meetings sent from this calendar. Possible values are: unknown,
    * skypeForBusiness, skypeForConsumer, teamsForBusiness.
    */
  var defaultOnlineMeetingProvider: js.UndefOr[NullableOption[OnlineMeetingProviderType]] = js.native
  
  // The events in the calendar. Navigation property. Read-only.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  var hexColor: js.UndefOr[NullableOption[String]] = js.native
  
  var isDefaultCalendar: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether this user calendar can be deleted from the user mailbox.
  var isRemovable: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users'
    * primary calendars support tracking of meeting responses.
    */
  var isTallyingResponses: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.native
  
  // The calendar name.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the
    * owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who
    * shared that calendar with the user.
    */
  var owner: js.UndefOr[NullableOption[EmailAddress]] = js.native
  
  // The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.native
}
object Calendar {
  
  @scala.inline
  def apply(): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedOnlineMeetingProvidersVarargs(value: OnlineMeetingProviderType*): Self = this.set("allowedOnlineMeetingProviders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOnlineMeetingProviders(value: NullableOption[js.Array[OnlineMeetingProviderType]]): Self = this.set("allowedOnlineMeetingProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOnlineMeetingProviders: Self = this.set("allowedOnlineMeetingProviders", js.undefined)
    
    @scala.inline
    def setAllowedOnlineMeetingProvidersNull: Self = this.set("allowedOnlineMeetingProviders", null)
    
    @scala.inline
    def setCalendarPermissionsVarargs(value: CalendarPermission*): Self = this.set("calendarPermissions", js.Array(value :_*))
    
    @scala.inline
    def setCalendarPermissions(value: NullableOption[js.Array[CalendarPermission]]): Self = this.set("calendarPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarPermissions: Self = this.set("calendarPermissions", js.undefined)
    
    @scala.inline
    def setCalendarPermissionsNull: Self = this.set("calendarPermissions", null)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = this.set("calendarView", js.Array(value :_*))
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = this.set("calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarView: Self = this.set("calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewNull: Self = this.set("calendarView", null)
    
    @scala.inline
    def setCanEdit(value: NullableOption[Boolean]): Self = this.set("canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEdit: Self = this.set("canEdit", js.undefined)
    
    @scala.inline
    def setCanEditNull: Self = this.set("canEdit", null)
    
    @scala.inline
    def setCanShare(value: NullableOption[Boolean]): Self = this.set("canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanShare: Self = this.set("canShare", js.undefined)
    
    @scala.inline
    def setCanShareNull: Self = this.set("canShare", null)
    
    @scala.inline
    def setCanViewPrivateItems(value: NullableOption[Boolean]): Self = this.set("canViewPrivateItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanViewPrivateItems: Self = this.set("canViewPrivateItems", js.undefined)
    
    @scala.inline
    def setCanViewPrivateItemsNull: Self = this.set("canViewPrivateItems", null)
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeKey: Self = this.set("changeKey", js.undefined)
    
    @scala.inline
    def setChangeKeyNull: Self = this.set("changeKey", null)
    
    @scala.inline
    def setColor(value: NullableOption[CalendarColor]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    
    @scala.inline
    def setDefaultOnlineMeetingProvider(value: NullableOption[OnlineMeetingProviderType]): Self = this.set("defaultOnlineMeetingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOnlineMeetingProvider: Self = this.set("defaultOnlineMeetingProvider", js.undefined)
    
    @scala.inline
    def setDefaultOnlineMeetingProviderNull: Self = this.set("defaultOnlineMeetingProvider", null)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    
    @scala.inline
    def setHexColor(value: NullableOption[String]): Self = this.set("hexColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexColor: Self = this.set("hexColor", js.undefined)
    
    @scala.inline
    def setHexColorNull: Self = this.set("hexColor", null)
    
    @scala.inline
    def setIsDefaultCalendar(value: NullableOption[Boolean]): Self = this.set("isDefaultCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultCalendar: Self = this.set("isDefaultCalendar", js.undefined)
    
    @scala.inline
    def setIsDefaultCalendarNull: Self = this.set("isDefaultCalendar", null)
    
    @scala.inline
    def setIsRemovable(value: NullableOption[Boolean]): Self = this.set("isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRemovable: Self = this.set("isRemovable", js.undefined)
    
    @scala.inline
    def setIsRemovableNull: Self = this.set("isRemovable", null)
    
    @scala.inline
    def setIsTallyingResponses(value: NullableOption[Boolean]): Self = this.set("isTallyingResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTallyingResponses: Self = this.set("isTallyingResponses", js.undefined)
    
    @scala.inline
    def setIsTallyingResponsesNull: Self = this.set("isTallyingResponses", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = this.set("multiValueExtendedProperties", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setOwner(value: NullableOption[EmailAddress]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = this.set("singleValueExtendedProperties", null)
  }
}

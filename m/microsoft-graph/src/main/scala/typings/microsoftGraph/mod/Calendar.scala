package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar
  extends StObject
     with Entity {
  
  /**
    * Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible
    * values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
    */
  var allowedOnlineMeetingProviders: js.UndefOr[NullableOption[js.Array[OnlineMeetingProviderType]]] = js.undefined
  
  // The permissions of the users with whom the calendar is shared.
  var calendarPermissions: js.UndefOr[NullableOption[js.Array[CalendarPermission]]] = js.undefined
  
  // The calendar view for the calendar. Navigation property. Read-only.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  /**
    * True if the user can write to the calendar, false otherwise. This property is true for the user who created the
    * calendar. This property is also true for a user who has been shared a calendar and granted write access.
    */
  var canEdit: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * True if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can
    * share it.
    */
  var canShare: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // True if the user can read calendar items that have been marked private, false otherwise.
  var canViewPrivateItems: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are:
    * LightBlue=0, LightGreen=1, LightOrange=2, LightGray=3, LightYellow=4, LightTeal=5, LightPink=6, LightBrown=7,
    * LightRed=8, MaxColor=9, Auto=-1
    */
  var color: js.UndefOr[NullableOption[CalendarColor]] = js.undefined
  
  /**
    * The default online meeting provider for meetings sent from this calendar. Possible values are: unknown,
    * skypeForBusiness, skypeForConsumer, teamsForBusiness.
    */
  var defaultOnlineMeetingProvider: js.UndefOr[NullableOption[OnlineMeetingProviderType]] = js.undefined
  
  // The events in the calendar. Navigation property. Read-only.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  var hexColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  var isDefaultCalendar: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether this user calendar can be deleted from the user mailbox.
  var isRemovable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users'
    * primary calendars support tracking of meeting responses.
    */
  var isTallyingResponses: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // The calendar name.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the
    * owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who
    * shared that calendar with the user.
    */
  var owner: js.UndefOr[NullableOption[EmailAddress]] = js.undefined
  
  // The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
}
object Calendar {
  
  @scala.inline
  def apply(): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedOnlineMeetingProviders(value: NullableOption[js.Array[OnlineMeetingProviderType]]): Self = StObject.set(x, "allowedOnlineMeetingProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOnlineMeetingProvidersNull: Self = StObject.set(x, "allowedOnlineMeetingProviders", null)
    
    @scala.inline
    def setAllowedOnlineMeetingProvidersUndefined: Self = StObject.set(x, "allowedOnlineMeetingProviders", js.undefined)
    
    @scala.inline
    def setAllowedOnlineMeetingProvidersVarargs(value: OnlineMeetingProviderType*): Self = StObject.set(x, "allowedOnlineMeetingProviders", js.Array(value :_*))
    
    @scala.inline
    def setCalendarPermissions(value: NullableOption[js.Array[CalendarPermission]]): Self = StObject.set(x, "calendarPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarPermissionsNull: Self = StObject.set(x, "calendarPermissions", null)
    
    @scala.inline
    def setCalendarPermissionsUndefined: Self = StObject.set(x, "calendarPermissions", js.undefined)
    
    @scala.inline
    def setCalendarPermissionsVarargs(value: CalendarPermission*): Self = StObject.set(x, "calendarPermissions", js.Array(value :_*))
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    @scala.inline
    def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = StObject.set(x, "calendarView", js.Array(value :_*))
    
    @scala.inline
    def setCanEdit(value: NullableOption[Boolean]): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEditNull: Self = StObject.set(x, "canEdit", null)
    
    @scala.inline
    def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    @scala.inline
    def setCanShare(value: NullableOption[Boolean]): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShareNull: Self = StObject.set(x, "canShare", null)
    
    @scala.inline
    def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    @scala.inline
    def setCanViewPrivateItems(value: NullableOption[Boolean]): Self = StObject.set(x, "canViewPrivateItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanViewPrivateItemsNull: Self = StObject.set(x, "canViewPrivateItems", null)
    
    @scala.inline
    def setCanViewPrivateItemsUndefined: Self = StObject.set(x, "canViewPrivateItems", js.undefined)
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    @scala.inline
    def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    @scala.inline
    def setColor(value: NullableOption[CalendarColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDefaultOnlineMeetingProvider(value: NullableOption[OnlineMeetingProviderType]): Self = StObject.set(x, "defaultOnlineMeetingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOnlineMeetingProviderNull: Self = StObject.set(x, "defaultOnlineMeetingProvider", null)
    
    @scala.inline
    def setDefaultOnlineMeetingProviderUndefined: Self = StObject.set(x, "defaultOnlineMeetingProvider", js.undefined)
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHexColor(value: NullableOption[String]): Self = StObject.set(x, "hexColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexColorNull: Self = StObject.set(x, "hexColor", null)
    
    @scala.inline
    def setHexColorUndefined: Self = StObject.set(x, "hexColor", js.undefined)
    
    @scala.inline
    def setIsDefaultCalendar(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefaultCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultCalendarNull: Self = StObject.set(x, "isDefaultCalendar", null)
    
    @scala.inline
    def setIsDefaultCalendarUndefined: Self = StObject.set(x, "isDefaultCalendar", js.undefined)
    
    @scala.inline
    def setIsRemovable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
    
    @scala.inline
    def setIsRemovableUndefined: Self = StObject.set(x, "isRemovable", js.undefined)
    
    @scala.inline
    def setIsTallyingResponses(value: NullableOption[Boolean]): Self = StObject.set(x, "isTallyingResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTallyingResponsesNull: Self = StObject.set(x, "isTallyingResponses", null)
    
    @scala.inline
    def setIsTallyingResponsesUndefined: Self = StObject.set(x, "isTallyingResponses", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: NullableOption[EmailAddress]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
  }
}

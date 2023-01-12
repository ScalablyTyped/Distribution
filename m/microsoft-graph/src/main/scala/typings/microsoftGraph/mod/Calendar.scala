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
    * true if the user can write to the calendar, false otherwise. This property is true for the user who created the
    * calendar. This property is also true for a user who has been shared a calendar and granted write access.
    */
  var canEdit: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can
    * share it.
    */
  var canShare: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // true if the user can read calendar items that have been marked private, false otherwise.
  var canViewPrivateItems: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto,
    * lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
    */
  var color: js.UndefOr[NullableOption[CalendarColor]] = js.undefined
  
  /**
    * The default online meeting provider for meetings sent from this calendar. Possible values are: unknown,
    * skypeForBusiness, skypeForConsumer, teamsForBusiness.
    */
  var defaultOnlineMeetingProvider: js.UndefOr[NullableOption[OnlineMeetingProviderType]] = js.undefined
  
  // The events in the calendar. Navigation property. Read-only.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  /**
    * The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and
    * representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly
    * set a color for the calendar, this property is empty. Read-only.
    */
  var hexColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  // true if this is the default calendar where new events are created by default, false otherwise.
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
  
  inline def apply(): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    inline def setAllowedOnlineMeetingProviders(value: NullableOption[js.Array[OnlineMeetingProviderType]]): Self = StObject.set(x, "allowedOnlineMeetingProviders", value.asInstanceOf[js.Any])
    
    inline def setAllowedOnlineMeetingProvidersNull: Self = StObject.set(x, "allowedOnlineMeetingProviders", null)
    
    inline def setAllowedOnlineMeetingProvidersUndefined: Self = StObject.set(x, "allowedOnlineMeetingProviders", js.undefined)
    
    inline def setAllowedOnlineMeetingProvidersVarargs(value: OnlineMeetingProviderType*): Self = StObject.set(x, "allowedOnlineMeetingProviders", js.Array(value*))
    
    inline def setCalendarPermissions(value: NullableOption[js.Array[CalendarPermission]]): Self = StObject.set(x, "calendarPermissions", value.asInstanceOf[js.Any])
    
    inline def setCalendarPermissionsNull: Self = StObject.set(x, "calendarPermissions", null)
    
    inline def setCalendarPermissionsUndefined: Self = StObject.set(x, "calendarPermissions", js.undefined)
    
    inline def setCalendarPermissionsVarargs(value: CalendarPermission*): Self = StObject.set(x, "calendarPermissions", js.Array(value*))
    
    inline def setCalendarView(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    inline def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    inline def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    inline def setCalendarViewVarargs(value: Event*): Self = StObject.set(x, "calendarView", js.Array(value*))
    
    inline def setCanEdit(value: NullableOption[Boolean]): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanEditNull: Self = StObject.set(x, "canEdit", null)
    
    inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    inline def setCanShare(value: NullableOption[Boolean]): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareNull: Self = StObject.set(x, "canShare", null)
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanViewPrivateItems(value: NullableOption[Boolean]): Self = StObject.set(x, "canViewPrivateItems", value.asInstanceOf[js.Any])
    
    inline def setCanViewPrivateItemsNull: Self = StObject.set(x, "canViewPrivateItems", null)
    
    inline def setCanViewPrivateItemsUndefined: Self = StObject.set(x, "canViewPrivateItems", js.undefined)
    
    inline def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    inline def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    inline def setColor(value: NullableOption[CalendarColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDefaultOnlineMeetingProvider(value: NullableOption[OnlineMeetingProviderType]): Self = StObject.set(x, "defaultOnlineMeetingProvider", value.asInstanceOf[js.Any])
    
    inline def setDefaultOnlineMeetingProviderNull: Self = StObject.set(x, "defaultOnlineMeetingProvider", null)
    
    inline def setDefaultOnlineMeetingProviderUndefined: Self = StObject.set(x, "defaultOnlineMeetingProvider", js.undefined)
    
    inline def setEvents(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHexColor(value: NullableOption[String]): Self = StObject.set(x, "hexColor", value.asInstanceOf[js.Any])
    
    inline def setHexColorNull: Self = StObject.set(x, "hexColor", null)
    
    inline def setHexColorUndefined: Self = StObject.set(x, "hexColor", js.undefined)
    
    inline def setIsDefaultCalendar(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefaultCalendar", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultCalendarNull: Self = StObject.set(x, "isDefaultCalendar", null)
    
    inline def setIsDefaultCalendarUndefined: Self = StObject.set(x, "isDefaultCalendar", js.undefined)
    
    inline def setIsRemovable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    inline def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
    
    inline def setIsRemovableUndefined: Self = StObject.set(x, "isRemovable", js.undefined)
    
    inline def setIsTallyingResponses(value: NullableOption[Boolean]): Self = StObject.set(x, "isTallyingResponses", value.asInstanceOf[js.Any])
    
    inline def setIsTallyingResponsesNull: Self = StObject.set(x, "isTallyingResponses", null)
    
    inline def setIsTallyingResponsesUndefined: Self = StObject.set(x, "isTallyingResponses", js.undefined)
    
    inline def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    inline def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    inline def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: NullableOption[EmailAddress]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    inline def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    inline def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value*))
  }
}

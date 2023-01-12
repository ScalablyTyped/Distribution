package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingService
  extends StObject
     with Entity {
  
  // Additional information that is sent to the customer when an appointment is confirmed.
  var additionalInformation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contains the set of custom questions associated with a particular service.
  var customQuestions: js.UndefOr[NullableOption[js.Array[BookingQuestionAssignment]]] = js.undefined
  
  /**
    * The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example,
    * P11D23H59M59.999999999999S.
    */
  var defaultDuration: js.UndefOr[String] = js.undefined
  
  // The default physical location for the service.
  var defaultLocation: js.UndefOr[NullableOption[Location]] = js.undefined
  
  // The default monetary price for the service.
  var defaultPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The default way the service is charged. Possible values are: undefined, fixedPrice, startingAt, hourly, free,
    * priceVaries, callUs, notSet, unknownFutureValue.
    */
  var defaultPriceType: js.UndefOr[BookingPriceType] = js.undefined
  
  // The value of this property is only available when reading an individual booking service by id.
  var defaultReminders: js.UndefOr[NullableOption[js.Array[BookingReminder]]] = js.undefined
  
  // A text description for the service.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name is suitable for human-readable interfaces.
  var displayName: js.UndefOr[String] = js.undefined
  
  // True means this service is not available to customers for booking.
  var isHiddenFromCustomers: js.UndefOr[Boolean] = js.undefined
  
  // True indicates that the appointments for the service will be held online. Default value is false.
  var isLocationOnline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass
    * valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer
    * operation.
    */
  var maximumAttendeesCount: js.UndefOr[Double] = js.undefined
  
  // Additional information about this service.
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
  var postBuffer: js.UndefOr[String] = js.undefined
  
  // The time to buffer before an appointment for this service can start.
  var preBuffer: js.UndefOr[String] = js.undefined
  
  // The set of policies that determine how appointments for this type of service should be created and managed.
  var schedulingPolicy: js.UndefOr[NullableOption[BookingSchedulingPolicy]] = js.undefined
  
  /**
    * True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is
    * false.
    */
  var smsNotificationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Represents those staff members who provide this service.
  var staffMemberIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The URL a customer uses to access the service.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object BookingService {
  
  inline def apply(): BookingService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingService] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInformation(value: NullableOption[String]): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationNull: Self = StObject.set(x, "additionalInformation", null)
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setCustomQuestions(value: NullableOption[js.Array[BookingQuestionAssignment]]): Self = StObject.set(x, "customQuestions", value.asInstanceOf[js.Any])
    
    inline def setCustomQuestionsNull: Self = StObject.set(x, "customQuestions", null)
    
    inline def setCustomQuestionsUndefined: Self = StObject.set(x, "customQuestions", js.undefined)
    
    inline def setCustomQuestionsVarargs(value: BookingQuestionAssignment*): Self = StObject.set(x, "customQuestions", js.Array(value*))
    
    inline def setDefaultDuration(value: String): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
    
    inline def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
    
    inline def setDefaultLocation(value: NullableOption[Location]): Self = StObject.set(x, "defaultLocation", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocationNull: Self = StObject.set(x, "defaultLocation", null)
    
    inline def setDefaultLocationUndefined: Self = StObject.set(x, "defaultLocation", js.undefined)
    
    inline def setDefaultPrice(value: Double): Self = StObject.set(x, "defaultPrice", value.asInstanceOf[js.Any])
    
    inline def setDefaultPriceType(value: BookingPriceType): Self = StObject.set(x, "defaultPriceType", value.asInstanceOf[js.Any])
    
    inline def setDefaultPriceTypeUndefined: Self = StObject.set(x, "defaultPriceType", js.undefined)
    
    inline def setDefaultPriceUndefined: Self = StObject.set(x, "defaultPrice", js.undefined)
    
    inline def setDefaultReminders(value: NullableOption[js.Array[BookingReminder]]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersNull: Self = StObject.set(x, "defaultReminders", null)
    
    inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    inline def setDefaultRemindersVarargs(value: BookingReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsHiddenFromCustomers(value: Boolean): Self = StObject.set(x, "isHiddenFromCustomers", value.asInstanceOf[js.Any])
    
    inline def setIsHiddenFromCustomersUndefined: Self = StObject.set(x, "isHiddenFromCustomers", js.undefined)
    
    inline def setIsLocationOnline(value: Boolean): Self = StObject.set(x, "isLocationOnline", value.asInstanceOf[js.Any])
    
    inline def setIsLocationOnlineUndefined: Self = StObject.set(x, "isLocationOnline", js.undefined)
    
    inline def setMaximumAttendeesCount(value: Double): Self = StObject.set(x, "maximumAttendeesCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumAttendeesCountUndefined: Self = StObject.set(x, "maximumAttendeesCount", js.undefined)
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPostBuffer(value: String): Self = StObject.set(x, "postBuffer", value.asInstanceOf[js.Any])
    
    inline def setPostBufferUndefined: Self = StObject.set(x, "postBuffer", js.undefined)
    
    inline def setPreBuffer(value: String): Self = StObject.set(x, "preBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreBufferUndefined: Self = StObject.set(x, "preBuffer", js.undefined)
    
    inline def setSchedulingPolicy(value: NullableOption[BookingSchedulingPolicy]): Self = StObject.set(x, "schedulingPolicy", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyNull: Self = StObject.set(x, "schedulingPolicy", null)
    
    inline def setSchedulingPolicyUndefined: Self = StObject.set(x, "schedulingPolicy", js.undefined)
    
    inline def setSmsNotificationsEnabled(value: Boolean): Self = StObject.set(x, "smsNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSmsNotificationsEnabledUndefined: Self = StObject.set(x, "smsNotificationsEnabled", js.undefined)
    
    inline def setStaffMemberIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "staffMemberIds", value.asInstanceOf[js.Any])
    
    inline def setStaffMemberIdsNull: Self = StObject.set(x, "staffMemberIds", null)
    
    inline def setStaffMemberIdsUndefined: Self = StObject.set(x, "staffMemberIds", js.undefined)
    
    inline def setStaffMemberIdsVarargs(value: String*): Self = StObject.set(x, "staffMemberIds", js.Array(value*))
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

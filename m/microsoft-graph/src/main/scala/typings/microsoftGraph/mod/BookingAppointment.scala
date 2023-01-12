package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingAppointment
  extends StObject
     with Entity {
  
  // Additional information that is sent to the customer when an appointment is confirmed.
  var additionalInformation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
  var customerTimeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * It lists down the customer properties for an appointment. An appointment will contain a list of customer information
    * and each unit will indicate the properties of a customer who is part of that appointment. Optional.
    */
  var customers: js.UndefOr[js.Array[BookingCustomerInformationBase]] = js.undefined
  
  // The length of the appointment, denoted in ISO8601 format.
  var duration: js.UndefOr[String] = js.undefined
  
  // The date, time, and time zone that the appointment ends.
  var endDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  
  // The current number of customers in the appointment
  var filledAttendeesCount: js.UndefOr[Double] = js.undefined
  
  // If true, indicates that the appointment will be held online. Default value is false.
  var isLocationOnline: js.UndefOr[Boolean] = js.undefined
  
  // The URL of the online meeting for the appointment.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1,
    * pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer
    * operation.
    */
  var maximumAttendeesCount: js.UndefOr[Double] = js.undefined
  
  /**
    * If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this
    * appointment.
    */
  var optOutOfCustomerEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in
    * ISO8601 format.
    */
  var postBuffer: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in
    * ISO8601 format.
    */
  var preBuffer: js.UndefOr[String] = js.undefined
  
  // The regular price for an appointment for the specified bookingService.
  var price: js.UndefOr[Double] = js.undefined
  
  /**
    * A setting to provide flexibility for the pricing structure of services. Possible values are: undefined, fixedPrice,
    * startingAt, hourly, free, priceVaries, callUs, notSet, unknownFutureValue.
    */
  var priceType: js.UndefOr[BookingPriceType] = js.undefined
  
  // The value of this property is only available when reading an individual booking appointment by id.
  var reminders: js.UndefOr[NullableOption[js.Array[BookingReminder]]] = js.undefined
  
  /**
    * An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the
    * scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if
    * maxAttendeeCount is 1.
    */
  var selfServiceAppointmentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the bookingService associated with this appointment.
  var serviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The location where the service is delivered.
  var serviceLocation: js.UndefOr[NullableOption[Location]] = js.undefined
  
  /**
    * This property is optional when creating a new appointment. If not specified, it is computed from the service associated
    * with the appointment by the service id.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  // The value of this property is only available when reading an individual booking appointment by id.
  var serviceNotes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
  var smsNotificationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  // The ID of each bookingStaffMember who is scheduled in this appointment.
  var staffMemberIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The date, time, and time zone that the appointment begins.
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
}
object BookingAppointment {
  
  inline def apply(): BookingAppointment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingAppointment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingAppointment] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInformation(value: NullableOption[String]): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationNull: Self = StObject.set(x, "additionalInformation", null)
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setCustomerTimeZone(value: NullableOption[String]): Self = StObject.set(x, "customerTimeZone", value.asInstanceOf[js.Any])
    
    inline def setCustomerTimeZoneNull: Self = StObject.set(x, "customerTimeZone", null)
    
    inline def setCustomerTimeZoneUndefined: Self = StObject.set(x, "customerTimeZone", js.undefined)
    
    inline def setCustomers(value: js.Array[BookingCustomerInformationBase]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: BookingCustomerInformationBase*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDateTime(value: DateTimeTimeZone): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFilledAttendeesCount(value: Double): Self = StObject.set(x, "filledAttendeesCount", value.asInstanceOf[js.Any])
    
    inline def setFilledAttendeesCountUndefined: Self = StObject.set(x, "filledAttendeesCount", js.undefined)
    
    inline def setIsLocationOnline(value: Boolean): Self = StObject.set(x, "isLocationOnline", value.asInstanceOf[js.Any])
    
    inline def setIsLocationOnlineUndefined: Self = StObject.set(x, "isLocationOnline", js.undefined)
    
    inline def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    inline def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    inline def setMaximumAttendeesCount(value: Double): Self = StObject.set(x, "maximumAttendeesCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumAttendeesCountUndefined: Self = StObject.set(x, "maximumAttendeesCount", js.undefined)
    
    inline def setOptOutOfCustomerEmail(value: Boolean): Self = StObject.set(x, "optOutOfCustomerEmail", value.asInstanceOf[js.Any])
    
    inline def setOptOutOfCustomerEmailUndefined: Self = StObject.set(x, "optOutOfCustomerEmail", js.undefined)
    
    inline def setPostBuffer(value: String): Self = StObject.set(x, "postBuffer", value.asInstanceOf[js.Any])
    
    inline def setPostBufferUndefined: Self = StObject.set(x, "postBuffer", js.undefined)
    
    inline def setPreBuffer(value: String): Self = StObject.set(x, "preBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreBufferUndefined: Self = StObject.set(x, "preBuffer", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceType(value: BookingPriceType): Self = StObject.set(x, "priceType", value.asInstanceOf[js.Any])
    
    inline def setPriceTypeUndefined: Self = StObject.set(x, "priceType", js.undefined)
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setReminders(value: NullableOption[js.Array[BookingReminder]]): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    inline def setRemindersNull: Self = StObject.set(x, "reminders", null)
    
    inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    inline def setRemindersVarargs(value: BookingReminder*): Self = StObject.set(x, "reminders", js.Array(value*))
    
    inline def setSelfServiceAppointmentId(value: NullableOption[String]): Self = StObject.set(x, "selfServiceAppointmentId", value.asInstanceOf[js.Any])
    
    inline def setSelfServiceAppointmentIdNull: Self = StObject.set(x, "selfServiceAppointmentId", null)
    
    inline def setSelfServiceAppointmentIdUndefined: Self = StObject.set(x, "selfServiceAppointmentId", js.undefined)
    
    inline def setServiceId(value: NullableOption[String]): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setServiceLocation(value: NullableOption[Location]): Self = StObject.set(x, "serviceLocation", value.asInstanceOf[js.Any])
    
    inline def setServiceLocationNull: Self = StObject.set(x, "serviceLocation", null)
    
    inline def setServiceLocationUndefined: Self = StObject.set(x, "serviceLocation", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNotes(value: NullableOption[String]): Self = StObject.set(x, "serviceNotes", value.asInstanceOf[js.Any])
    
    inline def setServiceNotesNull: Self = StObject.set(x, "serviceNotes", null)
    
    inline def setServiceNotesUndefined: Self = StObject.set(x, "serviceNotes", js.undefined)
    
    inline def setSmsNotificationsEnabled(value: Boolean): Self = StObject.set(x, "smsNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSmsNotificationsEnabledUndefined: Self = StObject.set(x, "smsNotificationsEnabled", js.undefined)
    
    inline def setStaffMemberIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "staffMemberIds", value.asInstanceOf[js.Any])
    
    inline def setStaffMemberIdsNull: Self = StObject.set(x, "staffMemberIds", null)
    
    inline def setStaffMemberIdsUndefined: Self = StObject.set(x, "staffMemberIds", js.undefined)
    
    inline def setStaffMemberIdsVarargs(value: String*): Self = StObject.set(x, "staffMemberIds", js.Array(value*))
    
    inline def setStartDateTime(value: DateTimeTimeZone): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}

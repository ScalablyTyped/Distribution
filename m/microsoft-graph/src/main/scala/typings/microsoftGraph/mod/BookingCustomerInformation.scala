package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingCustomerInformation
  extends StObject
     with BookingCustomerInformationBase {
  
  // It consists of the list of custom questions and answers given by the customer as part of the appointment
  var customQuestionAnswers: js.UndefOr[NullableOption[js.Array[BookingQuestionAnswer]]] = js.undefined
  
  /**
    * The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new
    * bookingCustomer object is created. Once set, you should consider the customerId immutable.
    */
  var customerId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The SMTP address of the bookingCustomer who is booking the appointment
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents location information for the booking customer who is booking the appointment.
  var location: js.UndefOr[NullableOption[Location]] = js.undefined
  
  // The customer's name.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Notes from the customer associated with this appointment. You can get the value only when reading this
    * bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new
    * customer. After that point, the value is computed from the customer represented by the customerId.
    */
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The customer's phone number.
  var phone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
}
object BookingCustomerInformation {
  
  inline def apply(): BookingCustomerInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingCustomerInformation]
  }
  
  extension [Self <: BookingCustomerInformation](x: Self) {
    
    inline def setCustomQuestionAnswers(value: NullableOption[js.Array[BookingQuestionAnswer]]): Self = StObject.set(x, "customQuestionAnswers", value.asInstanceOf[js.Any])
    
    inline def setCustomQuestionAnswersNull: Self = StObject.set(x, "customQuestionAnswers", null)
    
    inline def setCustomQuestionAnswersUndefined: Self = StObject.set(x, "customQuestionAnswers", js.undefined)
    
    inline def setCustomQuestionAnswersVarargs(value: BookingQuestionAnswer*): Self = StObject.set(x, "customQuestionAnswers", js.Array(value*))
    
    inline def setCustomerId(value: NullableOption[String]): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setLocation(value: NullableOption[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingBusiness
  extends StObject
     with Entity {
  
  /**
    * The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a
    * business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the
    * addresses to the type others.
    */
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // All the appointments of this business. Read-only. Nullable.
  var appointments: js.UndefOr[NullableOption[js.Array[BookingAppointment]]] = js.undefined
  
  // The hours of operation for the business.
  var businessHours: js.UndefOr[NullableOption[js.Array[BookingWorkHours]]] = js.undefined
  
  // The type of business.
  var businessType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The set of appointments of this business in a specified date range. Read-only. Nullable.
  var calendarView: js.UndefOr[NullableOption[js.Array[BookingAppointment]]] = js.undefined
  
  // All the custom questions of this business. Read-only. Nullable.
  var customQuestions: js.UndefOr[NullableOption[js.Array[BookingCustomQuestion]]] = js.undefined
  
  // All the customers of this business. Read-only. Nullable.
  var customers: js.UndefOr[NullableOption[js.Array[BookingCustomerBase]]] = js.undefined
  
  // The code for the currency that the business operates in on Microsoft Bookings.
  var defaultCurrencyIso: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name is suitable for human-readable interfaces.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The email address for the business.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this
    * property. Read-only.
    */
  var isPublished: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The language of the self-service booking page.
  var languageTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer
    * of a business scheduling page.
    */
  var phone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
  var publicUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies how bookings can be created for this business.
  var schedulingPolicy: js.UndefOr[NullableOption[BookingSchedulingPolicy]] = js.undefined
  
  // All the services offered by this business. Read-only. Nullable.
  var services: js.UndefOr[NullableOption[js.Array[BookingService]]] = js.undefined
  
  // All the staff members that provide services in this business. Read-only. Nullable.
  var staffMembers: js.UndefOr[NullableOption[js.Array[BookingStaffMemberBase]]] = js.undefined
  
  // Example: https://www.contoso.com
  var webSiteUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object BookingBusiness {
  
  inline def apply(): BookingBusiness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingBusiness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingBusiness] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAppointments(value: NullableOption[js.Array[BookingAppointment]]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
    
    inline def setAppointmentsNull: Self = StObject.set(x, "appointments", null)
    
    inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
    
    inline def setAppointmentsVarargs(value: BookingAppointment*): Self = StObject.set(x, "appointments", js.Array(value*))
    
    inline def setBusinessHours(value: NullableOption[js.Array[BookingWorkHours]]): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setBusinessHoursNull: Self = StObject.set(x, "businessHours", null)
    
    inline def setBusinessHoursUndefined: Self = StObject.set(x, "businessHours", js.undefined)
    
    inline def setBusinessHoursVarargs(value: BookingWorkHours*): Self = StObject.set(x, "businessHours", js.Array(value*))
    
    inline def setBusinessType(value: NullableOption[String]): Self = StObject.set(x, "businessType", value.asInstanceOf[js.Any])
    
    inline def setBusinessTypeNull: Self = StObject.set(x, "businessType", null)
    
    inline def setBusinessTypeUndefined: Self = StObject.set(x, "businessType", js.undefined)
    
    inline def setCalendarView(value: NullableOption[js.Array[BookingAppointment]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    inline def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    inline def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    inline def setCalendarViewVarargs(value: BookingAppointment*): Self = StObject.set(x, "calendarView", js.Array(value*))
    
    inline def setCustomQuestions(value: NullableOption[js.Array[BookingCustomQuestion]]): Self = StObject.set(x, "customQuestions", value.asInstanceOf[js.Any])
    
    inline def setCustomQuestionsNull: Self = StObject.set(x, "customQuestions", null)
    
    inline def setCustomQuestionsUndefined: Self = StObject.set(x, "customQuestions", js.undefined)
    
    inline def setCustomQuestionsVarargs(value: BookingCustomQuestion*): Self = StObject.set(x, "customQuestions", js.Array(value*))
    
    inline def setCustomers(value: NullableOption[js.Array[BookingCustomerBase]]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersNull: Self = StObject.set(x, "customers", null)
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: BookingCustomerBase*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setDefaultCurrencyIso(value: NullableOption[String]): Self = StObject.set(x, "defaultCurrencyIso", value.asInstanceOf[js.Any])
    
    inline def setDefaultCurrencyIsoNull: Self = StObject.set(x, "defaultCurrencyIso", null)
    
    inline def setDefaultCurrencyIsoUndefined: Self = StObject.set(x, "defaultCurrencyIso", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIsPublished(value: NullableOption[Boolean]): Self = StObject.set(x, "isPublished", value.asInstanceOf[js.Any])
    
    inline def setIsPublishedNull: Self = StObject.set(x, "isPublished", null)
    
    inline def setIsPublishedUndefined: Self = StObject.set(x, "isPublished", js.undefined)
    
    inline def setLanguageTag(value: NullableOption[String]): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
    
    inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
    
    inline def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPublicUrl(value: NullableOption[String]): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublicUrlNull: Self = StObject.set(x, "publicUrl", null)
    
    inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
    
    inline def setSchedulingPolicy(value: NullableOption[BookingSchedulingPolicy]): Self = StObject.set(x, "schedulingPolicy", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyNull: Self = StObject.set(x, "schedulingPolicy", null)
    
    inline def setSchedulingPolicyUndefined: Self = StObject.set(x, "schedulingPolicy", js.undefined)
    
    inline def setServices(value: NullableOption[js.Array[BookingService]]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: BookingService*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setStaffMembers(value: NullableOption[js.Array[BookingStaffMemberBase]]): Self = StObject.set(x, "staffMembers", value.asInstanceOf[js.Any])
    
    inline def setStaffMembersNull: Self = StObject.set(x, "staffMembers", null)
    
    inline def setStaffMembersUndefined: Self = StObject.set(x, "staffMembers", js.undefined)
    
    inline def setStaffMembersVarargs(value: BookingStaffMemberBase*): Self = StObject.set(x, "staffMembers", js.Array(value*))
    
    inline def setWebSiteUrl(value: NullableOption[String]): Self = StObject.set(x, "webSiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebSiteUrlNull: Self = StObject.set(x, "webSiteUrl", null)
    
    inline def setWebSiteUrlUndefined: Self = StObject.set(x, "webSiteUrl", js.undefined)
  }
}

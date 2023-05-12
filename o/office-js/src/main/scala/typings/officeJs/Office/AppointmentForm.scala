package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `AppointmentForm` object is used to access the currently selected appointment.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **restricted**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait AppointmentForm extends StObject {
  
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var body: Body | String
  
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The `end` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method to
    * convert the `end` property value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `end` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `end` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the end time, you should use the `convertToUtcClientTime` method to convert the local time on
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var end: Time | js.Date
  
  /**
    * Gets or sets the location of an appointment.
    *
    * *Read mode*
    *
    * The `location` property returns a string that contains the location of the appointment.
    *
    * *Compose mode*
    *
    * The `location` property returns a `Location` object that provides methods that are used to get and set the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var location: Location | String
  
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depend on the mode of the current item.
    *
    * *Read mode*
    *
    * The `optionalAttendees` property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for
    * each optional attendee to the meeting. Collection size limits:
    *
    * - Windows: 500 members
    *
    * - Classic Mac UI: 100 members
    *
    * - New Mac UI, web browser, Android: No limit
    *
    * *Compose mode*
    *
    * The `optionalAttendees` property returns a `Recipients` object that provides methods to get or update the
    * optional attendees for a meeting. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many
    * recipients you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var optionalAttendees: js.Array[EmailAddressDetails | Recipients]
  
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depend on the mode of the current item.
    *
    * *Read mode*
    *
    * The `requiredAttendees` property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for
    * each required attendee to the meeting. Collection size limits:
    *
    * - Windows: 500 members
    *
    * - Classic Mac UI: 100 members
    *
    * - New Mac UI, web browser, Android: No limit
    *
    * *Compose mode*
    *
    * The `requiredAttendees` property returns a `Recipients` object that provides methods to get or update the
    * required attendees for a meeting. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many
    * recipients you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var requiredAttendees: js.Array[EmailAddressDetails | Recipients]
  
  /**
    * Provides access to the resources of an event. Returns an array of strings containing the resources required for the appointment.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var resources: js.Array[String]
  
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The `start` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method
    * to convert the value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `start` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `start` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the start time, you should use the `convertToUtcClientTime` method to convert the local time on
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var start: Time | js.Date
  
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * *Read mode*
    *
    * The `subject` property returns a string. Use the `normalizedSubject` property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * *Compose mode*
    *
    * The `subject` property returns a `Subject` object that provides methods to get and set the subject.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var subject: Subject | String
}
object AppointmentForm {
  
  inline def apply(
    body: Body | String,
    end: Time | js.Date,
    location: Location | String,
    optionalAttendees: js.Array[EmailAddressDetails | Recipients],
    requiredAttendees: js.Array[EmailAddressDetails | Recipients],
    resources: js.Array[String],
    start: Time | js.Date,
    subject: Subject | String
  ): AppointmentForm = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], optionalAttendees = optionalAttendees.asInstanceOf[js.Any], requiredAttendees = requiredAttendees.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentForm] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Body | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Time | js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setOptionalAttendees(value: js.Array[EmailAddressDetails | Recipients]): Self = StObject.set(x, "optionalAttendees", value.asInstanceOf[js.Any])
    
    inline def setOptionalAttendeesVarargs(value: (EmailAddressDetails | Recipients)*): Self = StObject.set(x, "optionalAttendees", js.Array(value*))
    
    inline def setRequiredAttendees(value: js.Array[EmailAddressDetails | Recipients]): Self = StObject.set(x, "requiredAttendees", value.asInstanceOf[js.Any])
    
    inline def setRequiredAttendeesVarargs(value: (EmailAddressDetails | Recipients)*): Self = StObject.set(x, "requiredAttendees", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setStart(value: Time | js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Subject | String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}

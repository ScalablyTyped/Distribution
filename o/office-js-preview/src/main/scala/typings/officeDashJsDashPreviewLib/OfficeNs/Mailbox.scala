package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the Outlook Add-in object model for Microsoft Outlook and Microsoft Outlook on the web.
  *
  * Namespaces:
  *
  * - diagnostics: Provides diagnostic information to an Outlook add-in.
  *
  * - item: Provides methods and properties for accessing a message or appointment in an Outlook add-in.
  *
  * - userProfile: Provides information about the user in an Outlook add-in.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Mailbox extends js.Object {
  /**
    * Provides diagnostic information to an Outlook add-in.
    * 
    * Contains the following members:
    * 
    *  - hostName (string): A string that represents the name of the host application. 
    * It be one of the following values: Outlook, Mac Outlook, OutlookIOS, or OutlookWebApp.
    * 
    *  - hostVersion (string): A string that represents the version of either the host application or the Exchange Server. 
    * If the mail add-in is running in Outlook on desktop clients or iOS, the hostVersion property returns the version of the 
    * host application, Outlook. In Outlook on the web, the property returns the version of the Exchange Server. An example is the string 15.0.468.0.
    * 
    *  - OWAView (MailboxEnums.OWAView or string): An enum (or string literal) that represents the current view of Outlook on the web. 
    * If the host application is not Outlook on the web, then accessing this property results in undefined. 
    * Outlook on the web has three views (OneColumn - displayed when the screen is narrow, TwoColumns - displayed when the screen is wider, 
    * and ThreeColumns - displayed when the screen is wide) that correspond to the width of the screen and the window, and the number of columns 
    * that can be displayed.
    *
    *  More information is under {@link Office.Diagnostics}. 
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var diagnostics: Diagnostics = js.native
  /**
    * Gets the URL of the Exchange Web Services (EWS) endpoint for this email account. Read mode only.
    *
    * Your app must have the ReadItem permission specified in its manifest to call the ewsUrl member in read mode.
    *
    * In compose mode you must call the saveAsync method before you can use the ewsUrl member. 
    * Your app must have ReadWriteItem permissions to call the saveAsync method.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * The ewsUrl value can be used by a remote service to make EWS calls to the user's mailbox. 
    * For example, you can create a remote service to {@link https://docs.microsoft.com/outlook/add-ins/get-attachments-of-an-outlook-item | get attachments from the selected item}.
    *
    * **Note**: This member is not supported in Outlook on iOS or Android.
    */
  var ewsUrl: java.lang.String = js.native
  /**
    * The mailbox item.  Depending on the context in which the add-in opened, the item may be of any number of types.
    * If you want to see IntelliSense for only a specific type, you should cast this item to one of the following:
    * `ItemCompose`, `ItemRead`, `MessageCompose`, `MessageRead`, `AppointmentCompose`, `AppointmentRead`
    */
  var item: Item with ItemCompose with ItemRead with MessageRead with MessageCompose with AppointmentRead with AppointmentCompose = js.native
  /**
    * Gets an object that provides methods to manage the categories master list associated with a mailbox.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @beta
    */
  var masterCategories: MasterCategories = js.native
  /**
    * Gets the URL of the REST endpoint for this email account.
    *
    * Your app must have the ReadItem permission specified in its manifest to call the restUrl member in read mode.
    *
    * In compose mode you must call the saveAsync method before you can use the restUrl member. 
    * Your app must have ReadWriteItem permissions to call the saveAsync method.
    *
    * [Api set: Mailbox 1.5]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * The restUrl value can be used to make {@link https://docs.microsoft.com/outlook/rest/ | REST API} calls to the user's mailbox.
    */
  var restUrl: java.lang.String = js.native
  /**
    * Information about the user associated with the mailbox. This includes their account type, display name, email address, and time zone.
    * 
    * More information is under {@link Office.UserProfile}
    */
  var userProfile: UserProfile = js.native
  def addHandlerAsync(eventType: java.lang.String, handler: js.Function1[/* type */ EventType, scala.Unit]): scala.Unit = js.native
  def addHandlerAsync(
    eventType: java.lang.String,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: java.lang.String,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    options: AsyncContextOptions
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: java.lang.String,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Adds an event handler for a supported event.
    *
    * Currently, the only supported event type is `Office.EventType.ItemChanged`.
    * In Preview, `Office.EventType.OfficeThemeChanged` is also supported.
    *
    * [Api set: Mailbox 1.5]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal. 
    *                The type property on the parameter will match the eventType parameter passed to addHandlerAsync.
    * @param options - Optional. Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def addHandlerAsync(eventType: EventType, handler: js.Function1[/* type */ EventType, scala.Unit]): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    options: AsyncContextOptions
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* type */ EventType, scala.Unit],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def convertToEwsId(itemId: java.lang.String, restVersion: java.lang.String): java.lang.String = js.native
  /**
    * Converts an item ID formatted for REST into EWS format.
    *
    * Item IDs retrieved via a REST API (such as the Outlook Mail API or the Microsoft Graph) use a different format than the format used by 
    * Exchange Web Services (EWS). The convertToEwsId method converts a REST-formatted ID into the proper format for EWS.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param itemId - An item ID formatted for the Outlook REST APIs.
    * @param restVersion - A value indicating the version of the Outlook REST API used to retrieve the item ID.
    */
  def convertToEwsId(
    itemId: java.lang.String,
    restVersion: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RestVersion
  ): java.lang.String = js.native
  /**
    * Gets a dictionary containing time information in local client time.
    *
    * The dates and times used by a mail app for Outlook on the web or desktop clients can use different time zones. 
    * Outlook uses the client computer time zone; Outlook on the web uses the time zone set on the Exchange Admin Center (EAC). 
    * You should handle date and time values so that the values you display on the user interface are always consistent with the time zone that 
    * the user expects.
    *
    * If the mail app is running in Outlook on desktop clients, the convertToLocalClientTime method will return a dictionary object with the values set to the 
    * client computer time zone. 
    * If the mail app is running in Outlook on the web, the convertToLocalClientTime method will return a dictionary object with the values set to 
    * the time zone specified in the EAC.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param timeValue - A Date object.
    */
  def convertToLocalClientTime(timeValue: stdLib.Date): LocalClientTime = js.native
  def convertToRestId(itemId: java.lang.String, restVersion: java.lang.String): java.lang.String = js.native
  /**
    * Converts an item ID formatted for EWS into REST format.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * Item IDs retrieved via EWS or via the itemId property use a different format than the format used by REST APIs (such as the 
    * {@link https://docs.microsoft.com/previous-versions/office/office-365-api/api/version-2.0/mail-rest-operations | Outlook Mail API} or the {@link https://graph.microsoft.io/ | Microsoft Graph}. 
    * The convertToRestId method converts an EWS-formatted ID into the proper format for REST.
    *
    * @param itemId - An item ID formatted for Exchange Web Services (EWS)
    * @param restVersion - A value indicating the version of the Outlook REST API that the converted ID will be used with.
    */
  def convertToRestId(
    itemId: java.lang.String,
    restVersion: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RestVersion
  ): java.lang.String = js.native
  /**
    * Gets a Date object from a dictionary containing time information.
    *
    * The convertToUtcClientTime method converts a dictionary containing a local date and time to a Date object with the correct values for the 
    * local date and time.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param input - The local time value to convert.
    * @returns A Date object with the time expressed in UTC.
    */
  def convertToUtcClientTime(input: LocalClientTime): stdLib.Date = js.native
  /**
    * Displays an existing calendar appointment.
    *
    * The displayAppointmentForm method opens an existing calendar appointment in a new window on the desktop or in a dialog box on 
    * mobile devices.
    *
    * In Outlook on Mac, you can use this method to display a single appointment that is not part of a recurring series, or the 
    * master appointment of a recurring series, but you cannot display an instance of the series. 
    * This is because in Outlook on Mac, you cannot access the properties (including the item ID) of instances of a recurring series.
    *
    * In Outlook on the web, this method opens the specified form only if the body of the form is less than or equal to 32KB number of characters.
    *
    * If the specified item identifier does not identify an existing appointment, a blank pane opens on the client computer or device, and 
    * no error message will be returned.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param itemId - The Exchange Web Services (EWS) identifier for an existing calendar appointment.
    */
  def displayAppointmentForm(itemId: java.lang.String): scala.Unit = js.native
  /**
    * Displays an existing message.
    *
    * The displayMessageForm method opens an existing message in a new window on the desktop or in a dialog box on mobile devices.
    *
    * In Outlook on the web, this method opens the specified form only if the body of the form is less than or equal to 32 KB number of characters.
    *
    * If the specified item identifier does not identify an existing message, no message will be displayed on the client computer, and 
    * no error message will be returned.
    *
    * Do not use the displayMessageForm with an itemId that represents an appointment. Use the displayAppointmentForm method to display 
    * an existing appointment, and displayNewAppointmentForm to display a form to create a new appointment.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param itemId - The Exchange Web Services (EWS) identifier for an existing message.
    */
  def displayMessageForm(itemId: java.lang.String): scala.Unit = js.native
  /**
    * Displays a form for creating a new calendar appointment.
    *
    * The displayNewAppointmentForm method opens a form that enables the user to create a new appointment or meeting. 
    * If parameters are specified, the appointment form fields are automatically populated with the contents of the parameters.
    *
    * In Outlook on the web, this method always displays a form with an attendees field. 
    * If you do not specify any attendees as input arguments, the method displays a form with a Save button. 
    * If you have specified attendees, the form would include the attendees and a Send button.
    *
    * In the Outlook rich client and Outlook RT, if you specify any attendees or resources in the requiredAttendees, optionalAttendees, or 
    * resources parameter, this method displays a meeting form with a Send button. 
    * If you don't specify any recipients, this method displays an appointment form with a Save & Close button.
    *
    * If any of the parameters exceed the specified size limits, or if an unknown parameter name is specified, an exception is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Read
    *
    * @param parameters - An AppointmentForm describing the new appointment. All properties are optional.
    */
  def displayNewAppointmentForm(parameters: AppointmentForm): scala.Unit = js.native
  /**
    * Displays a form for creating a new message.
    *
    * The displayNewMessageForm method opens a form that enables the user to create a new message. If parameters are specified, the message form 
    * fields are automatically populated with the contents of the parameters.
    *
    * If any of the parameters exceed the specified size limits, or if an unknown parameter name is specified, an exception is thrown.
    *
    * [Api set: Mailbox 1.6]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Read
    *
    * @param parameters - A dictionary containing all values to be filled in for the user in the new form. All parameters are optional.
    * 
    *        toRecipients: An array of strings containing the email addresses or an array containing an {@link Office.EmailAddressDetails} object 
    *        for each of the recipients on the To line. The array is limited to a maximum of 100 entries.
    * 
    *        ccRecipients: An array of strings containing the email addresses or an array containing an {@link Office.EmailAddressDetails} object 
    *        for each of the recipients on the Cc line. The array is limited to a maximum of 100 entries.
    * 
    *        bccRecipients: An array of strings containing the email addresses or an array containing an {@link Office.EmailAddressDetails} object 
    *        for each of the recipients on the Bcc line. The array is limited to a maximum of 100 entries.
    * 
    *        subject: A string containing the subject of the message. The string is limited to a maximum of 255 characters.
    * 
    *        htmlBody: The HTML body of the message. The body content is limited to a maximum size of 32 KB.
    * 
    *        attachments: An array of JSON objects that are either file or item attachments.
    * 
    *        attachments.type: Indicates the type of attachment. Must be file for a file attachment or item for an item attachment.
    * 
    *        attachments.name: A string that contains the name of the attachment, up to 255 characters in length.
    * 
    *        attachments.url: Only used if type is set to file. The URI of the location for the file.
    * 
    *        attachments.isInline: Only used if type is set to file. If true, indicates that the attachment will be shown inline in the 
    *        message body, and should not be displayed in the attachment list.
    * 
    *        attachments.itemId: Only used if type is set to item. The EWS item id of the existing e-mail you want to attach to the new message. 
    *        This is a string up to 100 characters.
    */
  def displayNewMessageForm(parameters: js.Any): scala.Unit = js.native
  /**
    * Gets a string that contains a token used to get an attachment or item from an Exchange Server.
    *
    * The getCallbackTokenAsync method makes an asynchronous call to get an opaque token from the Exchange Server that hosts the user's mailbox. 
    * The lifetime of the callback token is 5 minutes.
    *
    * You can pass the token and an attachment identifier or item identifier to a third-party system. 
    * The third-party system uses the token as a bearer authorization token to call the Exchange Web Services (EWS) GetAttachment or 
    * GetItem operation to return an attachment or item. For example, you can create a remote service to get attachments from the selected item.
    *
    * Your app must have the ReadItem permission specified in its manifest to call the getCallbackTokenAsync method in read mode.
    *
    * In compose mode you must call the saveAsync method to get an item identifier to pass to the getCallbackTokenAsync method. 
    * Your app must have ReadWriteItem permissions to call the saveAsync method.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. The token is provided as a string in the `asyncResult.value` property.
    *                 If there was an error, then the `asyncResult.error` and `asyncResult.diagnostics` properties may provide additional information.
    * @param userContext - Optional. Any state data that is passed to the asynchronous method.
    */
  def getCallbackTokenAsync(callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getCallbackTokenAsync(
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit],
    userContext: js.Any
  ): scala.Unit = js.native
  /**
    * Gets a string that contains a token used to call REST APIs or Exchange Web Services.
    *
    * The getCallbackTokenAsync method makes an asynchronous call to get an opaque token from the Exchange Server that hosts the user's mailbox. 
    * The lifetime of the callback token is 5 minutes.
    *
    * *REST Tokens*
    *
    * When a REST token is requested (options.isRest = true), the resulting token will not work to authenticate Exchange Web Services calls. 
    * The token will be limited in scope to read-only access to the current item and its attachments, unless the add-in has specified the 
    * ReadWriteMailbox permission in its manifest. 
    * If the ReadWriteMailbox permission is specified, the resulting token will grant read/write access to mail, calendar, and contacts, 
    * including the ability to send mail.
    *
    * The add-in should use the restUrl property to determine the correct URL to use when making REST API calls.
    *
    * *EWS Tokens*
    *
    * When an EWS token is requested (options.isRest = false), the resulting token will not work to authenticate REST API calls. 
    * The token will be limited in scope to accessing the current item.
    *
    * The add-in should use the ewsUrl property to determine the correct URL to use when making EWS calls.
    *
    * **Note**: It is recommended that add-ins use the REST APIs instead of Exchange Web Services whenever possible.
    *
    * [Api set: Mailbox 1.5]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        isRest: Determines if the token provided will be used for the Outlook REST APIs or Exchange Web Services. Default value is false.
    *        asyncContext: Any state data that is passed to the asynchronous method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. The token is provided as a string in the `asyncResult.value` property.
    *                 If there was an error, then the `asyncResult.error` and `asyncResult.diagnostics` properties may provide additional information.
    */
  def getCallbackTokenAsync(
    options: AsyncContextOptions with officeDashJsDashPreviewLib.Anon_IsRest,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a token identifying the user and the Office Add-in.
    *
    * The token is provided as a string in the asyncResult.value property.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * The getUserIdentityTokenAsync method returns a token that you can use to identify and 
    * {@link https://docs.microsoft.com/outlook/add-ins/authentication | authenticate the add-in and user with a third-party system}.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *                 The token is provided as a string in the `asyncResult.value` property.
    *                 If there was an error, then the `asyncResult.error` and `asyncResult.diagnostics` properties may provide additional information.
    * @param userContext - Optional. Any state data that is passed to the asynchronous method.
    */
  def getUserIdentityTokenAsync(callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getUserIdentityTokenAsync(
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit],
    userContext: js.Any
  ): scala.Unit = js.native
  /**
    * Makes an asynchronous request to an Exchange Web Services (EWS) service on the Exchange server that hosts the user's mailbox.
    *
    * In these cases, add-ins should use REST APIs to access the user's mailbox instead.
    *
    * The makeEwsRequestAsync method sends an EWS request on behalf of the add-in to Exchange.
    *
    * You cannot request Folder Associated Items with the makeEwsRequestAsync method.
    *
    * The XML request must specify UTF-8 encoding. \<?xml version="1.0" encoding="utf-8"?\>
    *
    * Your add-in must have the ReadWriteMailbox permission to use the makeEwsRequestAsync method. 
    * For information about using the ReadWriteMailbox permission and the EWS operations that you can call with the makeEwsRequestAsync method, 
    * see {@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Specify permissions for mail add-in access to the user's mailbox}.
    *
    * The XML result of the EWS call is provided as a string in the asyncResult.value property. 
    * If the result exceeds 1 MB in size, an error message is returned instead.
    *
    * **Note**: This method is not supported in the following scenarios:
    * 
    * - In Outlook on iOS or Android.
    * 
    * - When the add-in is loaded in a Gmail mailbox.
    *
    * **Note**: The server administrator must set OAuthAuthentication to true on the Client Access Server EWS directory to enable the 
    * makeEwsRequestAsync method to make EWS requests.
    *
    * *Version differences*
    *
    * When you use the makeEwsRequestAsync method in mail apps running in Outlook versions earlier than version 15.0.4535.1004, you should set 
    * the encoding value to ISO-8859-1.
    *
    * `<?xml version="1.0" encoding="iso-8859-1"?>`
    *
    * You do not need to set the encoding value when your mail app is running in Outlook on the web. 
    * You can determine whether your mail app is running in Outlook or Outlook on the web by using the mailbox.diagnostics.hostName property. 
    * You can determine what version of Outlook is running by using the mailbox.diagnostics.hostVersion property.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param data - The EWS request.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                 The `value` property of the result is the XML of the EWS request provided as a string. 
    *                 If the result exceeds 1 MB in size, an error message is returned instead.
    * @param userContext - Optional. Any state data that is passed to the asynchronous method.
    */
  def makeEwsRequestAsync(data: js.Any, callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  def makeEwsRequestAsync(
    data: js.Any,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit],
    userContext: js.Any
  ): scala.Unit = js.native
  def removeHandlerAsync(eventType: java.lang.String): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def removeHandlerAsync(eventType: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes the event handlers for a supported event type.
    *
    * Currently, the only supported event type is `Office.EventType.ItemChanged`.
    * In Preview, `Office.EventType.OfficeThemeChanged` is also supported.
    *
    * [Api set: Mailbox 1.5]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param eventType - The event that should revoke the handler.
    * @param options - Optional. Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def removeHandlerAsync(eventType: EventType): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: AsyncContextOptions): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}


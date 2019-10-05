package typings.officeDashJs.Office

import typings.officeDashJs.Office.MailboxEnums.ItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item namespace is used to access the currently selected message, meeting request, or appointment. 
  * You can determine the type of the item by using the `itemType` property.
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
trait Item extends js.Object {
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var body: Body = js.native
  /**
    * Gets the type of item that an instance represents.
    *
    * The itemType property returns one of the ItemType enumeration values, indicating whether the item object instance is a message or 
    * an appointment.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var itemType: ItemType | String = js.native
  /**
    * Gets the notification messages for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var notificationMessages: NotificationMessages = js.native
  /**
    * Gets the id of the series that an instance belongs to.
    * 
    * In Outlook on the web and desktop clients, the seriesId returns the Exchange Web Services (EWS) ID of the parent (series) item that this item belongs to. 
    * However, on iOS and Android, the seriesId returns the REST ID of the parent item.
    * 
    * **Note**: The identifier returned by the seriesId property is the same as the Exchange Web Services item identifier. 
    * The seriesId property is not identical to the Outlook IDs used by the Outlook REST API. 
    * Before making REST API calls using this value, it should be converted using Office.context.mailbox.convertToRestId. 
    * For more details, see {@link https://docs.microsoft.com/outlook/add-ins/use-rest-api | Use the Outlook REST APIs from an Outlook add-in}.
    * 
    * The seriesId property returns null for items that do not have parent items such as single appointments, series items, or meeting requests 
    * and returns undefined for any other items that are not meeting requests.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var seriesId: String = js.native
  def addHandlerAsync(eventType: String, handler: js.Any): Unit = js.native
  def addHandlerAsync(
    eventType: String,
    handler: js.Any,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: String, handler: js.Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: String,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds an event handler for a supported event. **Note**: Events are available only with task pane.
    * 
    * Currently the supported event types are `Office.EventType.AppointmentTimeChanged`, `Office.EventType.RecipientsChanged`, and 
    * `Office.EventType.RecurrenceChanged`.
    * 
    * [Api set: Mailbox 1.7]
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
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  def addHandlerAsync(eventType: EventType, handler: js.Any): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: js.Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Asynchronously loads custom properties for this add-in on the selected item.
    *
    * Custom properties are stored as key/value pairs on a per-app, per-item basis. 
    * This method returns a CustomProperties object in the callback, which provides methods to access the custom properties specific to the 
    * current item and the current add-in. Custom properties are not encrypted on the item, so this should not be used as secure storage.
    *
    * The custom properties are provided as a CustomProperties object in the asyncResult.value property. 
    * This object can be used to get, set, and remove custom properties from the item and save changes to the custom property set back to 
    * the server.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    * @param userContext - Optional. Developers can provide any object they wish to access in the callback function. 
    *                    This object can be accessed by the asyncResult.asyncContext property in the callback function.
    */
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit]): Unit = js.native
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit], userContext: js.Any): Unit = js.native
  def removeHandlerAsync(eventType: String): Unit = js.native
  def removeHandlerAsync(eventType: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(eventType: String, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Removes the event handlers for a supported event type. **Note**: Events are available only with task pane.
    * 
    * Currently the supported event types are `Office.EventType.AppointmentTimeChanged`, `Office.EventType.RecipientsChanged`, and 
    * `Office.EventType.RecurrenceChanged`.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param eventType - The event that should revoke the handler.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  def removeHandlerAsync(eventType: EventType): Unit = js.native
  def removeHandlerAsync(eventType: EventType, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}


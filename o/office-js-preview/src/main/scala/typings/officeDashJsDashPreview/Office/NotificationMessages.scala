package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The NotificationMessages object is returned as the notificationMessages property of an item.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait NotificationMessages extends js.Object {
  /**
    * Adds a notification to an item.
    *
    * There are a maximum of 5 notifications per message. Setting more will return a NumberOfNotificationMessagesExceeded error.
    *
    * @param key - A developer-specified key used to reference this notification message. 
    *             Developers can use it to modify this message later. It can't be longer than 32 characters.
    * @param JSONmessage - A JSON object that contains the notification message to be added to the item. 
    *                    It contains a NotificationMessageDetails object.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def addAsync(key: String, JSONmessage: NotificationMessageDetails): Unit = js.native
  def addAsync(
    key: String,
    JSONmessage: NotificationMessageDetails,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addAsync(key: String, JSONmessage: NotificationMessageDetails, options: AsyncContextOptions): Unit = js.native
  def addAsync(
    key: String,
    JSONmessage: NotificationMessageDetails,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Returns all keys and messages for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                 The `value` property of the result is an array of NotificationMessageDetails objects.
    */
  def getAllAsync(): Unit = js.native
  def getAllAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[NotificationMessageDetails]], Unit]): Unit = js.native
  def getAllAsync(options: AsyncContextOptions): Unit = js.native
  def getAllAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[NotificationMessageDetails]], Unit]
  ): Unit = js.native
  /**
    * Removes a notification message for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param key - The key for the notification message to remove.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def removeAsync(key: String): Unit = js.native
  def removeAsync(key: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeAsync(key: String, options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    key: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Replaces a notification message that has a given key with another message.
    *
    * If a notification message with the specified key doesn't exist, replaceAsync will add the notification.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param key - The key for the notification message to replace. It can't be longer than 32 characters.
    * @param JSONmessage - A JSON object that contains the new notification message to replace the existing message. 
    *                    It contains a NotificationMessageDetails object.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def replaceAsync(key: String, JSONmessage: NotificationMessageDetails): Unit = js.native
  def replaceAsync(
    key: String,
    JSONmessage: NotificationMessageDetails,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def replaceAsync(key: String, JSONmessage: NotificationMessageDetails, options: AsyncContextOptions): Unit = js.native
  def replaceAsync(
    key: String,
    JSONmessage: NotificationMessageDetails,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}


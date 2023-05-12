package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `CustomProperties` object represents custom properties that are specific to a particular mail item and specific to an Outlook add-in.
  * For example, there might be a need for an add-in to save some data that's specific to the current message that activated the add-in.
  * If the user revisits the same message in the future and activates the add-in again, the add-in will be able to retrieve the data that had
  * been saved as custom properties. 
  *
  * To learn more about `CustomProperties`, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/metadata-for-an-outlook-add-in | Get and set add-in metadata for an Outlook add-in}.
  *
  * @remarks
  * [Api set: Mailbox 1.1]
  * 
  * When using custom properties in your add-in, keep in mind that:
  * 
  * - Custom properties saved while in compose mode aren't transmitted to recipients of the mail item. When a message or appointment with custom
  * properties is sent, its properties can be accessed from the item in the Sent Items folder.
  * If you want to make custom data accessible to recipients, consider using {@link Office.InternetHeaders | InternetHeaders} instead.
  * 
  * - The maximum length of a `CustomProperties` JSON object is 2500 characters.
  *
  * - Outlook on Mac doesn't cache custom properties. If the user's network goes down, mail add-ins can't access their custom properties.
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait CustomProperties extends StObject {
  
  /**
    * Returns the value of the specified custom property.
    *
    * @returns The value of the specified custom property.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The name of the custom property to be returned.
    */
  def get(name: String): Any = js.native
  
  /**
    * Returns an object with all custom properties in a collection of name/value pairs. The following are equivalent.
    *
    * `customProps.get("name")`
    *
    * `var dictionary = customProps.getAll(); dictionary["name"]`
    *
    * You can iterate through the dictionary object to discover all `names` and `values`.
    *
    * @returns An object with all custom properties in a collection of name/value pairs.
    *
    * @remarks
    * [Api set: Mailbox 1.9]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getAll(): Any = js.native
  
  /**
    * Removes the specified property from the custom property collection.
    *
    * To make the removal of the property permanent, you must call the `saveAsync` method of the `CustomProperties` object.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The `name` of the property to be removed.
    */
  def remove(name: String): Unit = js.native
  
  /**
    * Saves custom properties to a message or appointment.
    *
    * You must call the `saveAsync` method to persist any changes made with the `set` method or the `remove` method of the `CustomProperties` object.
    * The saving action is asynchronous.
    *
    * It's a good practice to have your callback function check for and handle errors from `saveAsync`.
    * In particular, a read add-in can be activated while the user is in a connected state in a read form, and subsequently the user becomes
    * disconnected.
    * If the add-in calls `saveAsync` while in the disconnected state, `saveAsync` would return an error.
    * Your callback function should handle this error accordingly.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param asyncContext - Optional. Any state data that is passed to the callback function.
    */
  def saveAsync(): Unit = js.native
  def saveAsync(asyncContext: Any): Unit = js.native
  /**
    * Saves custom properties to a message or appointment.
    *
    * You must call the `saveAsync` method to persist any changes made with the `set` method or the `remove` method of the `CustomProperties` object.
    * The saving action is asynchronous.
    *
    * It's a good practice to have your callback function check for and handle errors from `saveAsync`.
    * In particular, a read add-in can be activated while the user is in a connected state in a read form, and subsequently the user becomes
    * disconnected.
    * If the add-in calls `saveAsync` while in the disconnected state, `saveAsync` would return an error.
    * Your callback function should handle this error accordingly.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    * 
    * **Important**: In Outlook on Windows, custom properties saved while in compose mode only persist after the item being composed is closed or
    * after `Office.context.mailbox.item.saveAsync` is called.
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    * @param asyncContext - Optional. Any state data that is passed to the callback function.
    */
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit], asyncContext: Any): Unit = js.native
  
  /**
    * Sets the specified property to the specified value.
    *
    * The `set` method sets the specified property to the specified value. To ensure that the set property and value persist on the mail item,
    * you must call the `saveAsync` method.
    *
    * The `set` method creates a new property if the specified property does not already exist;
    * otherwise, the existing value is replaced with the new value.
    * The `value` parameter can be of any type; however, it is always passed to the server as a string.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The name of the property to be set.
    * @param value - The value of the property to be set.
    */
  def set(name: String, value: String): Unit = js.native
}

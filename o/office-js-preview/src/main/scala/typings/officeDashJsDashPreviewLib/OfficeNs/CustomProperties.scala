package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CustomProperties object represents custom properties that are specific to a particular item and specific to a mail add-in for Outlook. 
  * For example, there might be a need for a mail add-in to save some data that is specific to the current email message that activated the add-in. 
  * If the user revisits the same message in the future and activates the mail add-in again, the add-in will be able to retrieve the data that had 
  * been saved as custom properties.
  *
  * Because Outlook on Mac doesn't cache custom properties, if the user's network goes down, mail add-ins cannot access their custom properties.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait CustomProperties extends js.Object {
  /**
    * Returns the value of the specified custom property.
    * @param name - The name of the custom property to be returned.
    * @returns The value of the specified custom property.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def get(name: java.lang.String): js.Any = js.native
  /**
    * Removes the specified property from the custom property collection.
    *
    * To make the removal of the property permanent, you must call the saveAsync method of the CustomProperties object.
    * @param name - The name of the property to be removed.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def remove(name: java.lang.String): scala.Unit = js.native
  /**
    * Saves item-specific custom properties to the server.
    *
    * You must call the saveAsync method to persist any changes made with the set method or the remove method of the CustomProperties object. 
    * The saving action is asynchronous.
    *
    * It's a good practice to have your callback function check for and handle errors from saveAsync. 
    * In particular, a read add-in can be activated while the user is in a connected state in a read form, and subsequently the user becomes 
    * disconnected. 
    * If the add-in calls saveAsync while in the disconnected state, saveAsync would return an error. 
    * Your callback method should handle this error accordingly.
    *
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    * @param asyncContext - Optional. Any state data that is passed to the callback method.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def saveAsync(): scala.Unit = js.native
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def saveAsync(
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit],
    asyncContext: js.Any
  ): scala.Unit = js.native
  /**
    * Sets the specified property to the specified value.
    *
    * The set method sets the specified property to the specified value. You must use the saveAsync method to save the property to the server.
    *
    * The set method creates a new property if the specified property does not already exist; 
    * otherwise, the existing value is replaced with the new value. 
    * The value parameter can be of any type; however, it is always passed to the server as a string.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The name of the property to be set.
    * @param value - The value of the property to be set.
    */
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}


package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoamingSettings extends js.Object {
  /**
    * Retrieves the specified setting.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The case-sensitive name of the setting to retrieve.
    * @returns Type: String | Number | Boolean | Object | Array
    */
  def get(name: String): js.Any = js.native
  /**
    * Removes the specified setting
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The case-sensitive name of the setting to remove.
    */
  def remove(name: String): Unit = js.native
  /**
    * Saves the settings.
    *
    * Any settings previously saved by an add-in are loaded when it is initialized, so during the lifetime of the session you can just use 
    * the set and get methods to work with the in-memory copy of the settings property bag. 
    * When you want to persist the settings so that they are available the next time the add-in is used, use the saveAsync method.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def saveAsync(): Unit = js.native
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets or creates the specified setting.
    *
    * The set method creates a new setting of the specified name if it does not already exist, or sets an existing setting of the specified name. 
    * The value is stored in the document as the serialized JSON representation of its data type.
    *
    * A maximum of 32KB is available for the settings of each add-in.
    *
    * Any changes made to settings using the set function will not be saved to the server until the saveAsync function is called.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The case-sensitive name of the setting to set or create.
    * @param value - Specifies the value to be stored.
    */
  def set(name: String, value: js.Any): Unit = js.native
}


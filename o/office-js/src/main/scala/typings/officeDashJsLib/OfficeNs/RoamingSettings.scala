package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The settings created by using the methods of the RoamingSettings object are saved per add-in and per user. 
  * That is, they are available only to the add-in that created them, and only from the user's mail box in which they are saved.
  *
  * While the Outlook Add-in API limits access to these settings to only the add-in that created them, these settings should not be considered 
  * secure storage. They can be accessed by Exchange Web Services or Extended MAPI. 
  * They should not be used to store sensitive information such as user credentials or security tokens.
  *
  * The name of a setting is a String, while the value can be a String, Number, Boolean, null, Object, or Array.
  *
  * The RoamingSettings object is accessible via the roamingSettings property in the Office.context namespace.
  *
  * **Important**: The RoamingSettings object is initialized from the persisted storage only when the add-in is first loaded. 
  * For task panes, this means that it is only initialized when the task pane first opens. 
  * If the task pane navigates to another page or reloads the current page, the in-memory object is reset to its initial values, even if 
  * your add-in has persisted changes. The persisted changes will not be available until the task pane is closed and reopened.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
@js.native
trait RoamingSettings extends js.Object {
  /**
    * Retrieves the specified setting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    *
    * @param name - The case-sensitive name of the setting to retrieve.
    * @returns Type: String | Number | Boolean | Object | Array
    */
  def get(name: java.lang.String): js.Any = js.native
  /**
    * Removes the specified setting
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    *
    * @param name - The case-sensitive name of the setting to remove.
    */
  def remove(name: java.lang.String): scala.Unit = js.native
  /**
    * Saves the settings.
    *
    * Any settings previously saved by an add-in are loaded when it is initialized, so during the lifetime of the session you can just use 
    * the set and get methods to work with the in-memory copy of the settings property bag. 
    * When you want to persist the settings so that they are available the next time the add-in is used, use the saveAsync method.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    *
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def saveAsync(): scala.Unit = js.native
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
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
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    *
    * @param name - The case-sensitive name of the setting to set or create.
    * @param value - Specifies the value to be stored.
    */
  def set(name: java.lang.String, value: js.Any): scala.Unit = js.native
}


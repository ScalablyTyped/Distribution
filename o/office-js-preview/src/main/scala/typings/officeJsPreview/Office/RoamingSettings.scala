package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoamingSettings extends StObject {
  
  /**
    * Retrieves the specified setting.
    *
    * @returns Type: String | Number | Boolean | Object | Array
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The case-sensitive name of the setting to retrieve.
    */
  def get(name: String): Any = js.native
  
  /**
    * Removes the specified setting
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`.
    */
  def saveAsync(): Unit = js.native
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Sets or creates the specified setting.
    *
    * The `set` method creates a new setting of the specified name if it does not already exist, or sets an existing setting of the specified name.
    * The value is stored in the document as the serialized JSON representation of its data type.
    *
    * A maximum of 32KB is available for the settings of each add-in.
    *
    * Any changes made to settings using the `set` method will not be saved to the server until the `saveAsync` method is called.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param name - The case-sensitive name of the setting to set or create.
    * @param value - Specifies the value to be stored.
    */
  def set(name: String, value: Any): Unit = js.native
}

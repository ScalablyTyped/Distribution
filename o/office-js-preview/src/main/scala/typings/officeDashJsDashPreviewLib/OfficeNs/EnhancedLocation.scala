package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedLocation extends js.Object {
  /**
    * Adds to the set of locations associated with the appointment.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @remarks
    * <table>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td>
    *     <td>ReadWriteItem</td>
    *   </tr>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td>
    *     <td>Compose</td>
    *   </tr>
    *   <tr>
    *     <td>Errors</td>
    *     <td>InvalidFormatError - The format of the specified data object is not valid.</td>
    *   </tr>
    * </table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `addAsync(locationIdentifiers: LocationIdentifier[], callback?: (result: Office.AsyncResultStatus) => void): void;`
    * 
    * @param locationIdentifiers The locations to be added to the current list of locations.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object. Check the `status` property of asyncResult to determine if the call succeeded.
    * 
    * @beta
    */
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier]): scala.Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    callback: js.Function1[/* result */ AsyncResultStatus, scala.Unit]
  ): scala.Unit = js.native
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): scala.Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResultStatus, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the set of locations associated with the appointment.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @remarks
    * <table>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td>
    *     <td>ReadItem</td>
    *   </tr>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td>
    *     <td>Compose or read</td>
    *   </tr>
    * </table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `getAsync(callback?: (result: Office.AsyncResult<LocationDetails[]>) => void): void;`
    * 
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    * 
    * @beta
    */
  def getAsync(): scala.Unit = js.native
  def getAsync(callback: js.Function1[/* result */ AsyncResult[js.Array[LocationDetails]], scala.Unit]): scala.Unit = js.native
  def getAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[LocationDetails]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes the set of locations associated with the appointment.
    * 
    * If there are multiple locations with the same name, all matching locations will be removed even if only one was specified in locationIdentifiers.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @remarks
    * <table>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td>
    *     <td>ReadWriteItem</td>
    *   </tr>
    *   <tr>
    *     <td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td>
    *     <td>Compose</td>
    *   </tr>
    * </table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `removeAsync(locationIdentifiers: LocationIdentifier[], callback?: (result: Office.AsyncResultStatus) => void): void;`
    * 
    * @param locationIdentifiers The locations to be removed from the current list of locations.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object. Check the `status` property of asyncResult to determine if the call succeeded.
    * 
    * @beta
    */
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier]): scala.Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    callback: js.Function1[/* result */ AsyncResultStatus, scala.Unit]
  ): scala.Unit = js.native
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): scala.Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResultStatus, scala.Unit]
  ): scala.Unit = js.native
}


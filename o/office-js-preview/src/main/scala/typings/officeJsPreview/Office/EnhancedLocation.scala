package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedLocation extends StObject {
  
  /**
    * Adds to the set of locations associated with the appointment.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `InvalidFormatError`: The format of the specified data object is not valid.
    *
    * @param locationIdentifiers The locations to be added to the current list of locations.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier]): Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets the set of locations associated with the appointment.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def getAsync(): Unit = js.native
  def getAsync(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[LocationDetails]], Unit]
  ): Unit = js.native
  def getAsync(options: AsyncContextOptions): Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[LocationDetails]], Unit]
  ): Unit = js.native
  
  /**
    * Removes the set of locations associated with the appointment.
    *
    * If there are multiple locations with the same name, all matching locations will be removed even if only one was specified in `locationIdentifiers`.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param locationIdentifiers The locations to be removed from the current list of locations.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier]): Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

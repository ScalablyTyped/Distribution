package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedLocation extends StObject {
  
  /**
    * Adds to the set of locations associated with the appointment.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `InvalidFormatError`: The format of the specified data object is not valid.
    *
    * @param locationIdentifiers The locations to be added to the current list of locations.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier]): Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds to the set of locations associated with the appointment.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `InvalidFormatError`: The format of the specified data object is not valid.
    *
    * @param locationIdentifiers The locations to be added to the current list of locations.
    * @param options An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def addAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): Unit = js.native
  def addAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets the set of locations associated with the appointment.
    *
    * **Note**: {@link https://support.microsoft.com/office/88ff6c60-0a1d-4b54-8c9d-9e1a71bc3023 | Personal contact groups}
    * added as appointment locations aren't returned by this method.
    * 
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[LocationDetails]], Unit]): Unit = js.native
  /**
    * Gets the set of locations associated with the appointment.
    * 
    * **Note**: {@link https://support.microsoft.com/office/88ff6c60-0a1d-4b54-8c9d-9e1a71bc3023 | Personal contact groups}
    * added as appointment locations aren't returned by this method.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param options An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
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
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param locationIdentifiers The locations to be removed from the current list of locations.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier]): Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Removes the set of locations associated with the appointment.
    *
    * If there are multiple locations with the same name, all matching locations will be removed even if only one was specified in `locationIdentifiers`.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param locationIdentifiers The locations to be removed from the current list of locations.
    * @param options An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. Check the `status` property of `asyncResult` to determine if the call succeeded.
    */
  def removeAsync(locationIdentifiers: js.Array[LocationIdentifier], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    locationIdentifiers: js.Array[LocationIdentifier],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `DelayDeliveryTime` object enables you to manage the delayed delivery date and time of a message.
  *
  * @remarks
  * [Api set: Mailbox preview]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * @beta
  */
@js.native
trait DelayDeliveryTime extends StObject {
  
  /**
    * Gets the delivery date and time of a message.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Date], Unit]): Unit = js.native
  /**
    * Gets the delivery date and time of a message.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def getAsync(options: AsyncContextOptions): Unit = js.native
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[js.Date], Unit]): Unit = js.native
  
  /**
    * Sets the delivery date and time of a message.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param datetime - The future date and time when the message should be sent.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type Office.AsyncResult. Any errors encountered will be provided in the `asyncResult.error` property.
    *
    * @beta
    */
  def setAsync(datetime: js.Date): Unit = js.native
  def setAsync(datetime: js.Date, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets the delivery date and time of a message.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param datetime - The future date and time when the message should be sent.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type Office.AsyncResult. Any errors encountered will be provided in the `asyncResult.error` property.
    *
    * @beta
    */
  def setAsync(datetime: js.Date, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    datetime: js.Date,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

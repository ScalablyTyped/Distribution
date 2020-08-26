package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `InternetHeaders` object represents custom internet headers that are preserved after the message item leaves Exchange
  * and is converted to a MIME message. These headers are stored as x-headers in the MIME message.
  *
  * Internet headers are stored as key/value pairs on a per-item basis.
  *
  * **Note**: This object is intended for you to set and get your custom headers on a message item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **Recommended practices**
  *
  * Currently, internet headers are a finite resource on a user's mailbox. When the quota is exhausted, you can't create any more internet headers
  * on that mailbox, which can result in unexpected behavior from clients that rely on this to function.
  *
  * Apply the following guidelines when you create internet headers in your add-in.
  *
  * - Create the minimum number of headers required.
  *
  * - Name headers so that you can reuse and update their values later. As such, avoid naming headers in a variable manner
  * (for example, based on user input, timestamp, etc.).
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait InternetHeaders extends js.Object {
  /**
    * Given an array of internet header names, this method returns a dictionary containing those internet headers and their values.
    * If the add-in requests an x-header that is not available, that x-header will not be returned in the results.
    *
    * **Note**: This method is intended to return the values of the custom headers you set using the `setAsync` method.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param names - The names of the internet headers to be returned.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def getAsync(names: js.Array[String]): Unit = js.native
  def getAsync(names: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]): Unit = js.native
  def getAsync(
    names: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  def getAsync(names: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def getAsync(
    names: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  /**
    * Given an array of internet header names, this method removes the specified headers from the internet header collection.
    *
    * **Note**: This method is intended to remove the custom headers you set using the `setAsync` method.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param names - The names of the internet headers to be removed.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def removeAsync(names: js.Array[String]): Unit = js.native
  def removeAsync(names: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]): Unit = js.native
  def removeAsync(
    names: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  def removeAsync(names: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    names: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  /**
    * Sets the specified internet headers to the specified values.
    *
    * The `setAsync` method creates a new header if the specified header doesn't already exist; otherwise, the existing value is replaced with
    * the new value.
    *
    * **Note**: This method is intended to set the values of your custom headers.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param headers - The names and corresponding values of the headers to be set. Should be a dictionary object with keys being the names of the
    *                internet headers and values being the values of the internet headers.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type Office.AsyncResult. Any errors encountered will be provided in the `asyncResult.error` property.
    */
  def setAsync(headers: js.Object): Unit = js.native
  def setAsync(headers: js.Object, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def setAsync(
    headers: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setAsync(headers: js.Object, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    headers: js.Object,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}


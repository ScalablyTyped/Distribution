package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The InternetHeaders object represents properties that are preserved after the message item leaves Exchange and is converted to a MIME message. 
  * These properties are stored as x-headers in the MIME message.
  * 
  * InternetHeaders are stored as key/value pairs on a per-item basis.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
@js.native
trait InternetHeaders extends js.Object {
  /**
    * Given an array of internet header names, this method returns a dictionary containing those internet headers and their values. 
    * If the add-in requests an x-header that is not available, that x-header will not be returned in the results. 
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param names - The names of the internet headers to be returned.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    * 
    * @beta
    */
  def getAsync(names: js.Array[String]): Unit = js.native
  def getAsync(names: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]): Unit = js.native
  def getAsync(names: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def getAsync(
    names: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  /**
    * Given an array of internet header names, this method removes the specified headers from the internet header collection.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose 
    * 
    * @param names - The names of the internet headers to be removed.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    * 
    * @beta
    */
  def removeAsync(names: js.Array[String]): Unit = js.native
  def removeAsync(names: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]): Unit = js.native
  def removeAsync(names: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    names: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  /**
    * Sets the specified internet headers to the specified values.
    * 
    * The setAsync method creates a new header if the specified header does not already exist; otherwise, the existing value is replaced with 
    * the new value.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose 
    *
    * @param headers - The names and corresponding values of the headers to be set. Should be a dictionary object with keys being the names of the 
    *                internet headers and values being the values of the internet headers.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  Any errors encountered will be provided in the asyncResult.error property.
    * 
    * @beta
    */
  def setAsync(headers: js.Object): Unit = js.native
  def setAsync(headers: js.Object, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def setAsync(headers: js.Object, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    headers: js.Object,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}


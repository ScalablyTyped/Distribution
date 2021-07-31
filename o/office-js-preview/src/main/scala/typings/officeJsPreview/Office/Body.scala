package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The body object provides methods for adding and updating the content of the message or appointment.
  * It is returned in the body property of the selected item.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Body extends StObject {
  
  /**
    * Appends on send the specified content to the end of the item body, after any signature.
    *
    * If the user is running add-ins that implement the
    * {@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-on-send-addins?tabs=windows | on-send feature using `ItemSend` in the manifest},
    * append-on-send runs before on-send functionality.
    *
    * **Important**: If your add-in implements the on-send feature and calls `appendOnSendAsync` in the `ItemSend` handler,
    * the `appendOnSendAsync` call returns an error as this scenario is not supported.
    *
    * **Important**: To use `appendOnSendAsync`, the `ExtendedPermissions` manifest node must include the `AppendOnSend` extended permission.
    *
    * **Note**: To clear data from a previous `appendOnSendAsync` call, you can call it again with the `data` parameter set to `null`.
    *
    * [Api set: Mailbox 1.9]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The `data` parameter is longer than 5,000 characters.
    *
    * - `InvalidFormatError`: The `options.coercionType` parameter is set to `Office.CoercionType.Html` but the message body is in plain text.
    *
    * @param data - The string to be added to the end of the body. The string is limited to 5,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: The desired format for the data to be appended. The string in the `data` parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`. Any errors encountered will be provided in the `asyncResult.error` property.
    */
  def appendOnSendAsync(data: String): Unit = js.native
  def appendOnSendAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def appendOnSendAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def appendOnSendAsync(data: String, options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  def getAsync(coercionType: String): Unit = js.native
  def getAsync(
    coercionType: String,
    options: Unit,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def getAsync(coercionType: String, options: AsyncContextOptions): Unit = js.native
  def getAsync(
    coercionType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Returns the current body in a specified format.
    *
    * This method returns the entire current body in the format specified by `coercionType`.
    *
    * When working with HTML-formatted bodies, it is important to note that the `Body.getAsync` and `Body.setAsync` methods are not idempotent.
    * The value returned from the `getAsync` method will not necessarily be exactly the same as the value that was passed in the `setAsync` method previously.
    * The client may modify the value passed to `setAsync` in order to make it render efficiently with its rendering engine.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param coercionType - The format for the returned body.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type Office.AsyncResult. The body is provided in the requested format in the `asyncResult.value` property.
    */
  def getAsync(coercionType: CoercionType): Unit = js.native
  def getAsync(
    coercionType: CoercionType,
    options: Unit,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def getAsync(coercionType: CoercionType, options: AsyncContextOptions): Unit = js.native
  def getAsync(
    coercionType: CoercionType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  
  /**
    * Gets a value that indicates whether the content is in HTML or text format.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                  The content type is returned as one of the `CoercionType` values in the `asyncResult.value` property.
    */
  def getTypeAsync(): Unit = js.native
  def getTypeAsync(options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[CoercionType], Unit]): Unit = js.native
  def getTypeAsync(options: AsyncContextOptions): Unit = js.native
  def getTypeAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[CoercionType], Unit]
  ): Unit = js.native
  
  /**
    * Adds the specified content to the beginning of the item body.
    *
    * The `prependAsync` method inserts the specified string at the beginning of the item body.
    * After insertion, the cursor is returned to its original place, relative to the inserted content.
    *
    * When working with HTML-formatted bodies, it's important to note that the client may modify the value passed to `prependAsync` in order to
    * make it render efficiently with its rendering engine. This means that the value returned from a subsequent call to `Body.getAsync` method
    * will not necessarily exactly contain the value that was passed in the `prependAsync` method previously.
    *
    * When including links in HTML markup, you can disable online link preview by setting the `id` attribute on the anchor (\<a\>) to "LPNoLP"
    * (see the **Examples** section for a sample).
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The data parameter is longer than 1,000,000 characters.
    *
    * @param data - The string to be inserted at the beginning of the body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: The desired format for the body. The string in the `data` parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`. Any errors encountered will be provided in the `asyncResult.error` property.
    */
  def prependAsync(data: String): Unit = js.native
  def prependAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def prependAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def prependAsync(data: String, options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Replaces the entire body with the specified text.
    *
    * When working with HTML-formatted bodies, it is important to note that the `Body.getAsync` and `Body.setAsync` methods are not idempotent.
    * The value returned from the `getAsync` method will not necessarily be exactly the same as the value that was passed in the `setAsync` method
    * previously. The client may modify the value passed to `setAsync` in order to make it render efficiently with its rendering engine.
    *
    * When including links in HTML markup, you can disable online link preview by setting the `id` attribute on the anchor (\<a\>) to "LPNoLP"
    * (see the **Examples** section for a sample).
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The data parameter is longer than 1,000,000 characters.
    *
    * - `InvalidFormatError`: The `options.coercionType` parameter is set to `Office.CoercionType.Html` and the message body is in plain text.
    *
    * @param data - The string that will replace the existing body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: The desired format for the body. The string in the `data` parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type Office.AsyncResult. Any errors encountered will be provided in the `asyncResult.error` property.
    */
  def setAsync(data: String): Unit = js.native
  def setAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def setAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setAsync(data: String, options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Replaces the selection in the body with the specified text.
    *
    * The `setSelectedDataAsync` method inserts the specified string at the cursor location in the body of the item, or, if text is selected in
    * the editor, it replaces the selected text. If the cursor was never in the body of the item, or if the body of the item lost focus in the
    * UI, the string will be inserted at the top of the body content. After insertion, the cursor is placed at the end of the inserted content.
    *
    * When including links in HTML markup, you can disable online link preview by setting the id attribute on the anchor (\<a\>) to "LPNoLP"
    * (see the **Examples** section for a sample).
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The `data` parameter is longer than 1,000,000 characters.
    *
    * - `InvalidFormatError`: The `options.coercionType` parameter is set to `Office.CoercionType.Html` and the message body is in plain text.
    *
    * @param data - The string that will replace the existing body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: The desired format for the body. The string in the `data` parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`. Any errors encountered will be provided in the `asyncResult.error` property.
    */
  def setSelectedDataAsync(data: String): Unit = js.native
  def setSelectedDataAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def setSelectedDataAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setSelectedDataAsync(data: String, options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Adds or replaces the signature of the item body.
    *
    * **Important**: In Outlook on the web, `setSignatureAsync` only works on messages.
    *
    * **Important**: If your add-in implements the 
    * {@link https://docs.microsoft.com/office/dev/add-ins/outlook/autolaunch | event-based activation feature using `LaunchEvent` in the manifest},
    * and calls `setSignatureAsync` in the event handler, the following behavior applies.
    *
    * - When the user composes a new item (including reply or forward), the signature is set but doesn't modify the form. This means
    * if the user closes the form without making other edits, they won't be prompted to save changes.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `DataExceedsMaximumSize`: The `data` parameter is longer than 30,000 characters.
    *
    * - `InvalidFormatError`: The `options.coercionType` parameter is set to `Office.CoercionType.Html` and the message body is in plain text.
    *
    * @param data - The string that represents the signature to be set in the body of the mail. This string is limited to 30,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: The format the signature should be set to. If Text, the method sets the signature to plain text,
    *                        removing any HTML tags present. If Html, the method sets the signature to HTML.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *
    * @beta
    */
  def setSignatureAsync(data: String): Unit = js.native
  def setSignatureAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def setSignatureAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setSignatureAsync(data: String, options: Unit, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
}

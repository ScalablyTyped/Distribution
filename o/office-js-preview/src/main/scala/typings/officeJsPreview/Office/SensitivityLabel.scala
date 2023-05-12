package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to get or set the sensitivity label of a message or appointment. For more information on sensitivity labels, see
  * {@link https://learn.microsoft.com/microsoft-365/compliance/sensitivity-labels | Learn about sensitivity labels}.
  * 
  * @remarks
  * [Api set: Mailbox preview]
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
  *
  * To learn more about how to manage sensitivity labels in your add-in, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode (preview)}.
  *
  * @beta
  */
@js.native
trait SensitivityLabel extends StObject {
  
  /**
    * Gets the unique identifier (GUID) of the sensitivity label applied to a message or appointment being composed.
    * 
    * @remarks
    * [Api set: Mailbox preview]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode (preview)}.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The sensitivity label's GUID is returned in the
    *                 `asyncResult.value` property.
    *
    * @beta
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets the unique identifier (GUID) of the sensitivity label applied to a message or appointment being composed.
    * 
    * @remarks
    * [Api set: Mailbox preview]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode (preview)}.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The sensitivity label's GUID is returned in the
    *                 `asyncResult.value` property.
    *
    * @beta
    */
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Applies the specified sensitivity label to the message or appointment being composed.
    * 
    * @remarks
    * [Api set: Mailbox preview]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * **Tip**: To determine the sensitivity labels available for use, call the `Office.context.sensitivityLabelsCatalog.getAsync` method.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode (preview)}.
    * 
    * @param sensitivityLabel - The sensitivity label to be applied to the message or appointment being composed. The parameter value can be a sensitivity label's
    *                         unique identifier (GUID) or a {@link Office.SensitivityLabelDetails | SensitivityLabelDetails} object.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object.
    * 
    * @beta
    */
  def setAsync(sensitivityLabel: String): Unit = js.native
  def setAsync(sensitivityLabel: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Applies the specified sensitivity label to the message or appointment being composed.
    * 
    * @remarks
    * [Api set: Mailbox preview]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * **Tip**: To determine the sensitivity labels available for use, call the `Office.context.sensitivityLabelsCatalog.getAsync` method.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode (preview)}.
    * 
    * @param sensitivityLabel - The sensitivity label to be applied to the message or appointment being composed. The parameter value can be a sensitivity label's
    *                         unique identifier (GUID) or a {@link Office.SensitivityLabelDetails | SensitivityLabelDetails} object.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def setAsync(sensitivityLabel: String, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    sensitivityLabel: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setAsync(sensitivityLabel: SensitivityLabelDetails): Unit = js.native
  def setAsync(
    sensitivityLabel: SensitivityLabelDetails,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setAsync(sensitivityLabel: SensitivityLabelDetails, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    sensitivityLabel: SensitivityLabelDetails,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

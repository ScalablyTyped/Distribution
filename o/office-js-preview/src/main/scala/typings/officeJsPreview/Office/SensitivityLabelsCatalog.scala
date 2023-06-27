package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensitivityLabelsCatalog extends StObject {
  
  /**
    * Gets all the sensitivity labels that are enabled in Outlook.
    * 
    * @remarks
    * [Api set: Mailbox 1.13]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * **Recommended**: To determine whether the catalog of sensitivity labels is enabled in Outlook, call `getIsEnabledAsync` before using `getAsync`.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode}.
    * 
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The available sensitivity labels and their properties are returned in the
    *                 `asyncResult.value` property.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[SensitivityLabelDetails]], Unit]): Unit = js.native
  /**
    * Gets all the sensitivity labels that are enabled in Outlook.
    * 
    * @remarks
    * [Api set: Mailbox 1.13]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * **Recommended**: To determine whether the catalog of sensitivity labels is enabled in Outlook, call `getIsEnabledAsync` before using `getAsync`.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode}.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The available sensitivity labels and their properties are returned in the
    *                 `asyncResult.value` property.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[SensitivityLabelDetails]], Unit]
  ): Unit = js.native
  
  /**
    * Checks whether the catalog of sensitivity labels is enabled in Outlook.
    * 
    * @remarks
    * [Api set: Mailbox 1.13]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: The catalog of sensitivity labels is configured by an organization's administrator. For more information, see
    * {@link https://learn.microsoft.com/microsoft-365/compliance/get-started-with-sensitivity-labels | Get started with sensitivity labels}.
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode}.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The status of the catalog of sensitivity labels is returned in the `asyncResult.value` property.
    */
  def getIsEnabledAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  /**
    * Checks whether the catalog of sensitivity labels is enabled in Outlook.
    * 
    * @remarks
    * [Api set: Mailbox 1.13]
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Important**: The catalog of sensitivity labels is configured by an organization's administrator. For more information, see
    * {@link https://learn.microsoft.com/microsoft-365/compliance/get-started-with-sensitivity-labels | Get started with sensitivity labels}.
    *
    * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
    *
    * To learn more about how to manage sensitivity labels in your add-in, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode}.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter, `asyncResult`,
    *                 which is an `Office.AsyncResult` object. The status of the catalog of sensitivity labels is returned in the `asyncResult.value` property.
    */
  def getIsEnabledAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
}

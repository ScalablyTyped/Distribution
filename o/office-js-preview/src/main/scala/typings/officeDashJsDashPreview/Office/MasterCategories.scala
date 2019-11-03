package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the categories master list on the mailbox.
  * 
  * In Outlook, a user can group messages and appointments by using a category to color-code them.
  * The user defines categories in a master list on their mailbox. They can then apply one or more categories to an item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadMailbox
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait MasterCategories extends js.Object {
  /**
    * Adds categories to the master list on a mailbox. Each category must have a unique name but multiple categories can use the same color.
    *
    * @param categories - The categories to be added to the master list on the mailbox.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**:
    * 
    * - DuplicateCategory: One of the categories provided is already in the master category list.
    * 
    * - PermissionDenied: The user does not have permission to perform this action.
    */
  def addAsync(categories: js.Array[CategoryDetails]): Unit = js.native
  /**
    * Adds categories to the master list on a mailbox. Each category must have a unique name but multiple categories can use the same color.
    *
    * @param categories - The categories to be added to the master list on the mailbox.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**:
    * 
    * - DuplicateCategory: One of the categories provided is already in the master category list.
    * 
    * - PermissionDenied: The user does not have permission to perform this action.
    */
  def addAsync(
    categories: js.Array[CategoryDetails],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addAsync(categories: js.Array[CategoryDetails], options: AsyncContextOptions): Unit = js.native
  def addAsync(
    categories: js.Array[CategoryDetails],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Gets the master list of categories on a mailbox.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], Unit]): Unit = js.native
  /**
    * Gets the master list of categories on a mailbox.
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], Unit]
  ): Unit = js.native
  /**
    * Removes categories from the master list on a mailbox.
    *
    * @param categories - The categories to be removed from the master list on the mailbox.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If removing categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**:
    * 
    * - PermissionDenied: The user does not have permission to perform this action.
    */
  def removeAsync(categories: js.Array[String]): Unit = js.native
  /**
    * Removes categories from the master list on a mailbox.
    *
    * @param categories - The categories to be removed from the master list on the mailbox.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If removing categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteMailbox
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**:
    * 
    * - PermissionDenied: The user does not have permission to perform this action.
    */
  def removeAsync(categories: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeAsync(categories: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    categories: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}


package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the categories on an item.
  * 
  * In Outlook, a user can group messages and appointments by using a category to color-code them.
  * The user defines {@link Office.MasterCategories | categories in a master list} on their mailbox.
  * They can then apply one or more categories to an item.
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
trait Categories extends js.Object {
  /**
    * Adds categories to an item. Each category must be in the categories master list on that mailbox and so must have a unique name
    * but multiple categories can use the same color.
    *
    * @param categories - The categories to be added to the item.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**: 
    * 
    * - InvalidCategory: Invalid categories were provided.
    * 
    * @beta
    */
  def addAsync(categories: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Adds categories to an item. Each category must be in the categories master list on that mailbox and so must have a unique name
    * but multiple categories can use the same color.
    *
    * @param categories - The categories to be added to the item.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Errors**: 
    * 
    * - InvalidCategory: Invalid categories were provided.
    * 
    * @beta
    */
  def addAsync(
    categories: js.Array[java.lang.String],
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addAsync(categories: js.Array[java.lang.String], options: AsyncContextOptions): scala.Unit = js.native
  def addAsync(
    categories: js.Array[java.lang.String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets an item's categories.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
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
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], scala.Unit]): scala.Unit = js.native
  /**
    * Gets an item's categories.
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding categories fails, the asyncResult.error property will contain an error code.
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
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes categories from an item.
    *
    * @param categories - The categories to be removed from the item.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If removing categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @beta
    */
  def removeAsync(categories: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Removes categories from an item.
    *
    * @param categories - The categories to be removed from the item.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If removing categories fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @beta
    */
  def removeAsync(
    categories: js.Array[java.lang.String],
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def removeAsync(categories: js.Array[java.lang.String], options: AsyncContextOptions): scala.Unit = js.native
  def removeAsync(
    categories: js.Array[java.lang.String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}


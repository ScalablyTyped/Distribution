package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the categories on an item.
  *
  * In Outlook, a user can tag messages and appointments by using a category to color-code them.
  * The user defines {@link Office.MasterCategories | categories in a master list} on their mailbox.
  * They can then apply one or more categories to an item.
  *
  * **Important**: In Outlook on the web, you can't use the API to manage categories applied to a message in Compose mode.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Categories extends StObject {
  
  /**
    * Adds categories to an item. Each category must be in the categories master list on that mailbox and so must have a unique name
    * but multiple categories can use the same color.
    *
    * **Important**: In Outlook on the web, you can't use the API to manage categories applied to a message or appointment item in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * **Errors**:
    *
    * - `InvalidCategory`: Invalid categories were provided.
    *
    * @param categories - The categories to be added to the item.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def addAsync(categories: js.Array[String]): Unit = js.native
  def addAsync(categories: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Adds categories to an item. Each category must be in the categories master list on that mailbox and so must have a unique name
    * but multiple categories can use the same color.
    *
    * **Important**: In Outlook on the web, you can't use the API to manage categories applied to a message or appointment item in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * **Errors**:
    *
    * - `InvalidCategory`: Invalid categories were provided.
    *
    * @param categories - The categories to be added to the item.
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def addAsync(categories: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def addAsync(
    categories: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets an item's categories.
    *
    * **Important**:
    *
    * - If there are no categories on the item, `null` or an empty array will be returned depending on the Outlook version
    * so make sure to handle both cases.
    *
    * - In Outlook on the web, you can't use the API to manage categories applied to a message in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If getting categories fails, the `asyncResult.error` property will contain an error code.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], Unit]): Unit = js.native
  /**
    * Gets an item's categories.
    *
    * **Important**:
    *
    * - If there are no categories on the item, `null` or an empty array will be returned depending on the Outlook version
    * so make sure to handle both cases.
    *
    * - In Outlook on the web, you can't use the API to manage categories applied to a message in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If getting categories fails, the `asyncResult.error` property will contain an error code.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[CategoryDetails]], Unit]
  ): Unit = js.native
  
  /**
    * Removes categories from an item.
    *
    * **Important**: In Outlook on the web, you can't use the API to manage categories applied to a message in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param categories - The categories to be removed from the item.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If removing categories fails, the `asyncResult.error` property will contain an error code.
    */
  def removeAsync(categories: js.Array[String]): Unit = js.native
  def removeAsync(categories: js.Array[String], callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Removes categories from an item.
    *
    * **Important**: In Outlook on the web, you can't use the API to manage categories applied to a message in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param categories - The categories to be removed from the item.
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If removing categories fails, the `asyncResult.error` property will contain an error code.
    */
  def removeAsync(categories: js.Array[String], options: AsyncContextOptions): Unit = js.native
  def removeAsync(
    categories: js.Array[String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

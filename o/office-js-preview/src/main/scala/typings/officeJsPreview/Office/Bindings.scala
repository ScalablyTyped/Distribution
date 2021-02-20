package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the bindings the add-in has within the document.
  */
@js.native
trait Bindings extends StObject {
  
  /**
    * Creates a binding against a named object in the document.
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * For Excel, the itemName parameter can refer to a named range or a table.
    *
    * By default, adding a table in Excel assigns the name "Table1" for the first table you add, "Table2" for the second table you add, and so on.
    * To assign a meaningful name for a table in the Excel UI, use the Table Name property on the Table Tools | Design tab of the ribbon.
    *
    *     **Note**: In Excel, when specifying a table as a named item, you must fully qualify the name to include the worksheet name in the name of
    * the table in this format: "Sheet1!Table1"
    *
    * For Word, the itemName parameter refers to the Title property of a Rich Text content control. (You can't bind to content controls other
    * than the Rich Text content control).
    *
    * By default, a content control has no Title value assigned. To assign a meaningful name in the Word UI, after inserting a Rich Text content
    * control from the Controls group on the Developer tab of the ribbon, use the Properties command in the Controls group to display the Content
    * Control Properties dialog box. Then set the Title property of the content control to the name you want to reference from your code.
    *
    *     **Note**: In Word, if there are multiple Rich Text content controls with the same Title property value (name), and you try to bind to one
    * these content controls with this method (by specifying its name as the itemName parameter), the operation will fail.
    *
    * @param itemName Name of the bindable object in the document. For Example 'MyExpenses' table in Excel."
    * @param bindingType The {@link Office.BindingType} for the data. The method returns null if the selected object cannot be coerced into the specified type.
    * @param options Provides options for configuring the binding that is created.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the Binding object that represents the specified named item.
    */
  def addFromNamedItemAsync(itemName: String, bindingType: BindingType): Unit = js.native
  def addFromNamedItemAsync(
    itemName: String,
    bindingType: BindingType,
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  def addFromNamedItemAsync(
    itemName: String,
    bindingType: BindingType,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  def addFromNamedItemAsync(itemName: String, bindingType: BindingType, options: AddBindingFromNamedItemOptions): Unit = js.native
  def addFromNamedItemAsync(
    itemName: String,
    bindingType: BindingType,
    options: AddBindingFromNamedItemOptions,
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  
  /**
    * Create a binding by prompting the user to make a selection on the document.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#methods-that-arent-part-of-a-requirement-set | Not in a set}
    *
    * Adds a binding object of the specified type to the Bindings collection, which will be identified with the supplied id.
    * The method fails if the specified selection cannot be bound.
    *
    * @param bindingType Specifies the type of the binding object to create. Required.
    *                    Returns null if the selected object cannot be coerced into the specified type.
    * @param options Provides options for configuring the prompt and identifying the binding that is created.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the Binding object that represents the selection specified by the user.
    */
  def addFromPromptAsync(bindingType: BindingType): Unit = js.native
  def addFromPromptAsync(bindingType: BindingType, callback: js.Function1[/* result */ AsyncResult[Binding], Unit]): Unit = js.native
  def addFromPromptAsync(
    bindingType: BindingType,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  def addFromPromptAsync(bindingType: BindingType, options: AddBindingFromPromptOptions): Unit = js.native
  def addFromPromptAsync(
    bindingType: BindingType,
    options: AddBindingFromPromptOptions,
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  
  /**
    * Create a binding based on the user's current selection.
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * Adds the specified type of binding object to the Bindings collection, which will be identified with the supplied id.
    *
    * Note In Excel, if you call the addFromSelectionAsync method passing in the Binding.id of an existing binding, the Binding.type of that
    * binding is used, and its type cannot be changed by specifying a different value for the bindingType parameter.
    * If you need to use an existing id and change the bindingType, call the Bindings.releaseByIdAsync method first to release the binding, and
    * then call the addFromSelectionAsync method to reestablish the binding with a new type.
    *
    * @param bindingType Specifies the type of the binding object to create. Required.
    *                    Returns null if the selected object cannot be coerced into the specified type.
    * @param options Provides options for identifying the binding that is created.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the Binding object that represents the selection specified by the user.
    */
  def addFromSelectionAsync(bindingType: BindingType): Unit = js.native
  def addFromSelectionAsync(bindingType: BindingType, callback: js.Function1[/* result */ AsyncResult[Binding], Unit]): Unit = js.native
  def addFromSelectionAsync(
    bindingType: BindingType,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  def addFromSelectionAsync(bindingType: BindingType, options: AddBindingFromSelectionOptions): Unit = js.native
  def addFromSelectionAsync(
    bindingType: BindingType,
    options: AddBindingFromSelectionOptions,
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  
  /**
    * Gets an {@link Office.Document} object that represents the document associated with this set of bindings.
    */
  var document: Document = js.native
  
  /**
    * Gets all bindings that were previously created.
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array that contains each binding created for the referenced Bindings object.
    */
  def getAllAsync(): Unit = js.native
  def getAllAsync(callback: js.Function1[/* result */ AsyncResult[js.Array[Binding]], Unit]): Unit = js.native
  def getAllAsync(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[js.Array[Binding]], Unit]
  ): Unit = js.native
  def getAllAsync(options: AsyncContextOptions): Unit = js.native
  def getAllAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Binding]], Unit]
  ): Unit = js.native
  
  /**
    * Retrieves a binding based on its Name
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * Fails if the specified id does not exist.
    *
    * @param id Specifies the unique name of the binding object. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the Binding object specified by the id in the call.
    */
  def getByIdAsync(id: String): Unit = js.native
  def getByIdAsync(id: String, callback: js.Function1[/* result */ AsyncResult[Binding], Unit]): Unit = js.native
  def getByIdAsync(
    id: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  def getByIdAsync(id: String, options: AsyncContextOptions): Unit = js.native
  def getByIdAsync(
    id: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Binding], Unit]
  ): Unit = js.native
  
  /**
    * Removes the binding from the document
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * Fails if the specified id does not exist.
    *
    * @param id Specifies the unique name to be used to identify the binding object. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def releaseByIdAsync(id: String): Unit = js.native
  def releaseByIdAsync(id: String, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def releaseByIdAsync(
    id: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def releaseByIdAsync(id: String, options: AsyncContextOptions): Unit = js.native
  def releaseByIdAsync(
    id: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

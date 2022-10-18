package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Objects
/**
  * Represents a binding to a section of the document.
  *
  * The Binding object exposes the functionality possessed by all bindings regardless of type.
  *
  * The Binding object is never called directly. It is the abstract parent class of the objects that represent each type of binding:
  * {@link Office.MatrixBinding}, {@link Office.TableBinding}, or {@link Office.TextBinding}. All three of these objects inherit the getDataAsync
  * and setDataAsync methods from the Binding object that enable to you interact with the data in the binding. They also inherit the ID and type
  * properties for querying those property values. Additionally, the MatrixBinding and TableBinding objects expose additional methods for matrix-
  * and table-specific features, such as counting the number of rows and columns.
  *
  * @remarks
  *
  * **Applications**: Word, Excel (deprecated, use {@link https://learn.microsoft.com/javascript/api/excel/excel.binding?view=excel-js-preview | Excel.Binding} instead)
  *
  * **Requirement sets**:
  *
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
  *
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablebindings | TableBindings}
  *
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textbindings | TextBindings}
  */
@js.native
trait Binding extends StObject {
  
  /**
    * Adds an event handler to the object for the specified {@link Office.EventType}. Supported EventTypes are
    * `Office.EventType.BindingDataChanged` and `Office.EventType.BindingSelectionChanged`.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#bindingevents | BindingEvents}
    *
    * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
    *
    * @param eventType The event type. For bindings, it can be `Office.EventType.BindingDataChanged` or `Office.EventType.BindingSelectionChanged`.
    * @param handler The event handler function to add, whose only parameter is of type {@link Office.BindingDataChangedEventArgs} or {@link Office.BindingSelectionChangedEventArgs}.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addHandlerAsync(eventType: EventType, handler: Any): Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: Any, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: Any,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Get the Document object associated with the binding.
    */
  var document: Document = js.native
  
  /**
    * Returns the data contained within the binding.
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#htmlcoercion | HtmlCoercion} (when using `Office.CoercionType.Html`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixcoercion | MatrixCoercion} (when using `Office.CoercionType.Matrix`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#ooxmlcoercion | OoxmlCoercion} (when using `Office.CoercionType.Ooxml`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablecoercion | TableCoercion} (when using `Office.CoercionType.Table`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textcoercion | TextCoercion} (when using `Office.CoercionType.Text`)
    *
    * When called from a MatrixBinding or TableBinding, the getDataAsync method will return a subset of the bound values if the optional startRow,
    * startColumn, rowCount, and columnCount parameters are specified (and they specify a contiguous and valid range).
    *
    * @param options Provides options for how to get the data in a binding.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the values in the specified binding.
    *                  If the `coercionType` parameter is specified (and the call is successful), the data is returned in the format described in the CoercionType enumeration topic.
    */
  def getDataAsync[T](): Unit = js.native
  def getDataAsync[T](callback: js.Function1[/* result */ AsyncResult[T], Unit]): Unit = js.native
  def getDataAsync[T](options: Unit, callback: js.Function1[/* result */ AsyncResult[T], Unit]): Unit = js.native
  def getDataAsync[T](options: GetBindingDataOptions): Unit = js.native
  def getDataAsync[T](options: GetBindingDataOptions, callback: js.Function1[/* result */ AsyncResult[T], Unit]): Unit = js.native
  
  /**
    * A string that uniquely identifies this binding among the bindings in the same {@link Office.Document} object.
    */
  var id: String = js.native
  
  /**
    * Removes the specified handler from the binding for the specified event type.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#bindingevents | BindingEvents}
    *
    * @param eventType The event type. For bindings, it can be `Office.EventType.BindingDataChanged` or `Office.EventType.BindingSelectionChanged`.
    * @param options Provides options to determine which event handler or handlers are removed.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def removeHandlerAsync(eventType: EventType): Unit = js.native
  def removeHandlerAsync(eventType: EventType, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: RemoveHandlerOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  def setDataAsync(data: Any): Unit = js.native
  def setDataAsync(data: Any, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setDataAsync(data: Any, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setDataAsync(data: Any, options: SetBindingDataOptions): Unit = js.native
  def setDataAsync(
    data: Any,
    options: SetBindingDataOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Writes data to the bound section of the document represented by the specified binding object.
    *
    * @remarks
    *
    * **Requirement sets**:
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#htmlcoercion | HtmlCoercion} (when using `Office.CoercionType.Html`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixbindings | MatrixBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixcoercion | MatrixCoercion} (when using `Office.CoercionType.Matrix`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#ooxmlcoercion | OoxmlCoercion} (when using `Office.CoercionType.Ooxml`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablebindings | TableBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablecoercion | TableCoercion} (when using `Office.CoercionType.Table`)
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textbindings | TextBindings}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textcoercion | TextCoercion} (when using `Office.CoercionType.Text`)
    *
    * The value passed for data contains the data to be written in the binding. The kind of value passed determines what will be written as
    * described in the following table.
    *
    * <table>
    *   <tr>
    *     <th><code>data</code> value</th>
    *     <th>Data written</th>
    *   </tr>
    *   <tr>
    *     <td>A string</td>
    *     <td>Plain text or anything that can be coerced to a string will be written.</td>
    *   </tr>
    *   <tr>
    *     <td>An array of arrays ("matrix")</td>
    *     <td>Tabular data without headers will be written. For example, to write data to three rows in two columns, you can pass an array like this: <code>[["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]</code>. To write a single column of three rows, pass an array like this: <code>[["R1C1"], ["R2C1"], ["R3C1"]]</code>.</td>
    *   </tr>
    *    <tr>
    *     <td>A <code>TableData</code> object</td>
    *     <td>A table with headers will be written.</td>
    *   </tr>
    * </table>
    *
    * Additionally, these application-specific actions apply when writing data to a binding. For Word, the specified data is written to the
    * binding as follows.
    *
    * <table>
    *   <tr>
    *     <th><code>data</code> value</th>
    *     <th>Data written</th>
    *   </tr>
    *   <tr>
    *     <td>A string</td>
    *     <td>The specified text is written.</td>
    *   </tr>
    *   <tr>
    *     <td>An array of arrays ("matrix") or a <code>TableData</code> object</td>
    *     <td>A Word table is written.</td>
    *   </tr>
    *   <tr>
    *     <td>HTML</td>
    *     <td>The specified HTML is written. If any of the HTML you write is invalid, Word will not raise an error. Word will write as much of the HTML as it can and will omit any invalid data.</td>
    *   </tr>
    *   <tr>
    *     <td>Office Open XML ("Open XML")</td>
    *     <td>The specified the XML is written.</td>
    *   </tr>
    * </table>
    *
    * For Excel, the specified data is written to the binding as follows.
    *
    * <table>
    *   <tr>
    *     <th><code>data</code> value</th>
    *     <th>Data written</th>
    *   </tr>
    *   <tr>
    *     <td>A string</td>
    *     <td>The specified text is inserted as the value of the first bound cell. You can also specify a valid formula to add that formula to the bound cell. For example, setting data to <code>"=SUM(A1:A5)"</code> will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added formula (or any pre-existing formula) from the bound cell. If you call the Binding.getDataAsync method on the bound cell to read its data, the method can return only the data displayed in the cell (the formula's result).</td>
    *   </tr>
    *   <tr>
    *     <td>An array of arrays ("matrix"), and the shape exactly matches the shape of the binding specified</td>
    *     <td>The set of rows and columns are written.You can also specify an array of arrays that contain valid formulas to add them to the bound cells. For example, setting data to <code>[["=SUM(A1:A5)","=AVERAGE(A1:A5)"]]</code> will add those two formulas to a binding that contains two cells. Just as when setting a formula on a single bound cell, you can't read the added formulas (or any pre-existing formulas) from the binding with the <code>Binding.getDataAsync</code> method - it returns only the data displayed in the bound cells.</td>
    *   </tr>
    *   <tr>
    *     <td>A <code>TableData</code> object, and the shape of the table matches the bound table</td>
    *     <td>The specified set of rows and/or headers are written, if no other data in surrounding cells will be overwritten. **Note**: If you specify formulas in the <code>TableData</code> object you pass for the *data* parameter, you might not get the results you expect due to the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to write *data* that contains formulas to a bound table, try specifying the data as an array of arrays (instead of a <code>TableData</code> object), and specify the *coercionType* as Microsoft.Office.Matrix or "matrix".</td>
    *   </tr>
    * </table>
    *
    * For Excel on the web:
    *
    *  - The total number of cells in the value passed to the data parameter can't exceed 20,000 in a single call to this method.
    *
    *  - The number of formatting groups passed to the cellFormat parameter can't exceed 100.
    * A single formatting group consists of a set of formatting applied to a specified range of cells.
    *
    * In all other cases, an error is returned.
    *
    * The setDataAsync method will write data in a subset of a table or matrix binding if the optional startRow and startColumn parameters are
    * specified, and they specify a valid range.
    *
    * In the callback function passed to the setDataAsync method, you can use the properties of the AsyncResult object to return the following
    * information.
    *
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use</th>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.value</code></td>
    *     <td>Always returns <code>undefined</code> because there is no object or data to retrieve</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.status</code></td>
    *     <td>Determine the success or failure of the operation</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.error</code></td>
    *     <td>Access an Error object that provides error information if the operation failed</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.asyncContext</code></td>
    *     <td>Define an item of any type that is returned in the AsyncResult object without being altered</td>
    *   </tr>
    * </table>
    *
    * @param data The data to be set in the current selection. Possible data types by Office application:
    *
    *        string: Excel on the web and Windows, and Word on the web and Windows only
    *
    *        array of arrays: Excel and Word only
    *
    *        {@link Office.TableData}: Excel and Word only
    *
    *        HTML: Word on the web and Windows only
    *
    *        Office Open XML: Word only
    *
    * @param options Provides options for how to set the data in a binding.
    *
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setDataAsync(data: TableData): Unit = js.native
  def setDataAsync(data: TableData, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setDataAsync(data: TableData, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setDataAsync(data: TableData, options: SetBindingDataOptions): Unit = js.native
  def setDataAsync(
    data: TableData,
    options: SetBindingDataOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets the type of the binding.
    */
  var `type`: BindingType = js.native
}

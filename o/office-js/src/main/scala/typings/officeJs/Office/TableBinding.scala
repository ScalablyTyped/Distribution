package typings.officeJs.Office

import typings.officeJs.anon.Cells
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a binding in two dimensions of rows and columns, optionally with headers.
  *
  * @remarks
  *
  * The TableBinding object inherits the `id` property, `type` property, `getDataAsync` method, and `setDataAsync` method from the 
  * {@link Office.Binding} object.
  *
  * For Excel, note that after you establish a table binding, each new row a user adds to the table is automatically included in the binding and 
  * rowCount increases.
  */
@js.native
trait TableBinding
  extends StObject
     with Binding {
  
  def addColumnsAsync(tableData: js.Array[js.Array[js.Any]]): Unit = js.native
  def addColumnsAsync(
    tableData: js.Array[js.Array[js.Any]],
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addColumnsAsync(
    tableData: js.Array[js.Array[js.Any]],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addColumnsAsync(tableData: js.Array[js.Array[js.Any]], options: AsyncContextOptions): Unit = js.native
  def addColumnsAsync(
    tableData: js.Array[js.Array[js.Any]],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds the specified data to the table as additional columns.
    *
    * @remarks
    *
    * To add one or more columns specifying the values of the data and headers, pass a TableData object as the data parameter. To add one or more 
    * columns specifying only the data, pass an array of arrays ("matrix") as the data parameter.
    *
    * The success or failure of an addColumnsAsync operation is atomic. That is, the entire add columns operation must succeed, or it will be 
    * completely rolled back (and the AsyncResult.status property returned to the callback will report failure):
    *
    *  - Each row in the array you pass as the data argument must have the same number of rows as the table being updated. If not, the entire 
    * operation will fail.
    *
    *  - Each row and cell in the array must successfully add that row or cell to the table in the newly added column(s). If any row or cell 
    * fails to be set for any reason, the entire operation will fail.
    *
    *  - If you pass a TableData object as the data argument, the number of header rows must match that of the table being updated.
    *
    * Additional remark for Excel on the web: The total number of cells in the TableData object passed to the data parameter can't exceed 20,000 in 
    * a single call to this method.
    *
    * @param tableData An array of arrays ("matrix") or a TableData object that contains one or more columns of data to add to the table. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addColumnsAsync(tableData: TableData): Unit = js.native
  def addColumnsAsync(tableData: TableData, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addColumnsAsync(tableData: TableData, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addColumnsAsync(tableData: TableData, options: AsyncContextOptions): Unit = js.native
  def addColumnsAsync(
    tableData: TableData,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  def addRowsAsync(rows: js.Array[js.Array[js.Any]]): Unit = js.native
  def addRowsAsync(rows: js.Array[js.Array[js.Any]], callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addRowsAsync(
    rows: js.Array[js.Array[js.Any]],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addRowsAsync(rows: js.Array[js.Array[js.Any]], options: AsyncContextOptions): Unit = js.native
  def addRowsAsync(
    rows: js.Array[js.Array[js.Any]],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds the specified data to the table as additional rows.
    *
    * @remarks
    *
    * The success or failure of an addRowsAsync operation is atomic. That is, the entire add columns operation must succeed, or it will be 
    * completely rolled back (and the AsyncResult.status property returned to the callback will report failure):
    *
    *  - Each row in the array you pass as the data argument must have the same number of columns as the table being updated. If not, the entire 
    * operation will fail.
    *
    *  - Each column and cell in the array must successfully add that column or cell to the table in the newly added rows(s). If any column or 
    * cell fails to be set for any reason, the entire operation will fail.
    *
    *  - If you pass a TableData object as the data argument, the number of header rows must match that of the table being updated.
    *
    * Additional remark for Excel on the web: The total number of cells in the TableData object passed to the data parameter can't exceed 20,000 in 
    * a single call to this method.
    *
    * @param rows An array of arrays ("matrix") or a TableData object that contains one or more rows of data to add to the table. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addRowsAsync(rows: TableData): Unit = js.native
  def addRowsAsync(rows: TableData, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addRowsAsync(rows: TableData, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def addRowsAsync(rows: TableData, options: AsyncContextOptions): Unit = js.native
  def addRowsAsync(
    rows: TableData,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Clears formatting on the bound table.
    *
    * @remarks
    * 
    * See {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | Format tables in add-ins for Excel} for more information.
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def clearFormatsAsync(): Unit = js.native
  def clearFormatsAsync(callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def clearFormatsAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def clearFormatsAsync(options: AsyncContextOptions): Unit = js.native
  def clearFormatsAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Gets the number of columns in the TableBinding, as an integer value.
    */
  var columnCount: Double = js.native
  
  /**
    * Deletes all non-header rows and their values in the table, shifting appropriately for the host application.
    *
    * @remarks
    *
    * In Excel, if the table has no header row, this method will delete the table itself.
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def deleteAllDataValuesAsync(): Unit = js.native
  def deleteAllDataValuesAsync(callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def deleteAllDataValuesAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def deleteAllDataValuesAsync(options: AsyncContextOptions): Unit = js.native
  def deleteAllDataValuesAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Gets the formatting on specified items in the table.
    * 
    * @remarks
    * 
    * **Returned format structure**
    * 
    * Each JavaScript object in the return value array has this form: `{cells:{ cell_range }, format:{ format_definition }}`
    * 
    * The `cells:` property specifies the range you want format using one of the following values:
    * 
    * **Supported ranges in cells property**
    * 
    * <table>
    *   <tr>
    *     <th>cells range settings</th>
    *     <th>Description</th>
    *   </tr>
    *   <tr>
    *     <td>`{row: n}`</td>
    *     <td>Specifies the range that is the zero-based nth row of data in the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`{column: n}`</td>
    *     <td>Specifies the range that is the zero-based nth column of data in the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`{row: i, column: j}`</td>
    *     <td>Specifies the single cell that is the ith row and jth column of the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.All`</td>
    *     <td>Specifies the entire table, including column headers, data, and totals (if any).</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.Data`</td>
    *     <td>Specifies only the data in the table (no headers and totals).</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.Headers`</td>
    *     <td>Specifies only the header row.</td>
    *   </tr>
    * </table>
    * 
    * The `format:` property specifies values that correspond to a subset of the settings available in the Format Cells dialog box in Excel 
    * (Right-click \> Format Cells or Home \> Format \> Format Cells).
    * 
    * @param cellReference An object literal containing name-value pairs that specify the range of cells to get formatting from.
    * @param formats An array specifying the format properties to get.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array containing one or more JavaScript objects specifying the formatting of their corresponding cells. 
    */
  def getFormatsAsync(): Unit = js.native
  def getFormatsAsync(cellReference: js.Any): Unit = js.native
  def getFormatsAsync(cellReference: js.Any, formats: js.Array[js.Any]): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: js.Array[js.Any],
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: js.Array[js.Any],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(cellReference: js.Any, formats: js.Array[js.Any], options: AsyncContextOptions): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: js.Array[js.Any],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: Unit,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(cellReference: js.Any, formats: Unit, options: AsyncContextOptions): Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: Unit,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(cellReference: Unit, formats: js.Array[js.Any]): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: js.Array[js.Any],
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: js.Array[js.Any],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(cellReference: Unit, formats: js.Array[js.Any], options: AsyncContextOptions): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: js.Array[js.Any],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: Unit,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  def getFormatsAsync(cellReference: Unit, formats: Unit, options: AsyncContextOptions): Unit = js.native
  def getFormatsAsync(
    cellReference: Unit,
    formats: Unit,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[Cells]], Unit]
  ): Unit = js.native
  
  /**
    * True, if the table has headers; otherwise false.
    */
  var hasHeaders: Boolean = js.native
  
  /**
    * Gets the number of rows in the TableBinding, as an integer value.
    *
    * @remarks
    * 
    * When you insert an empty table by selecting a single row in Excel 2013 and Excel on the web (using Table on the Insert tab), both Office host 
    * applications create a single row of headers followed by a single blank row. However, if your add-in's script creates a binding for this 
    * newly inserted table (for example, by using the {@link Office.Bindings}.addFromSelectionAsync method), and then checks the value of the 
    * rowCount property, the value returned will differ depending whether the spreadsheet is open in Excel 2013 or Excel on the web.
    * 
    * - In Excel on the desktop, rowCount will return 0 (the blank row following the headers is not counted).
    *
    * - In Excel on the web, rowCount will return 1 (the blank row following the headers is counted).
    *
    * You can work around this difference in your script by checking if rowCount == 1, and if so, then checking if the row contains all empty 
    * strings.
    */
  var rowCount: Double = js.native
  
  /**
    * Sets formatting on specified items and data in the table.
    *
    * @remarks
    * 
    * **Specifying the cellFormat parameter**
    * 
    * Use the cellFormat parameter to set or change cell formatting values, such as width, height, font, background, alignment, and so on. 
    * The value you pass as the cellFormat parameter is an array that contains a list of one or more JavaScript objects that specify which cells 
    * to target (`cells:`) and the formats (`format:`) to apply to them.
    * 
    * Each JavaScript object in the cellFormat array has this form: `{cells:{ cell_range }, format:{ format_definition }}`
    * 
    * The `cells:` property specifies the range you want format using one of the following values:
    * 
    * **Supported ranges in cells property**
    * 
    * <table>
    *   <tr>
    *     <th>cells range settings</th>
    *     <th>Description</th>
    *   </tr>
    *   <tr>
    *     <td>`{row: n}`</td>
    *     <td>Specifies the range that is the zero-based nth row of data in the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`{column: n}`</td>
    *     <td>Specifies the range that is the zero-based nth column of data in the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`{row: i, column: j}`</td>
    *     <td>Specifies the single cell that is the ith row and jth column of the table.</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.All`</td>
    *     <td>Specifies the entire table, including column headers, data, and totals (if any).</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.Data`</td>
    *     <td>Specifies only the data in the table (no headers and totals).</td>
    *   </tr>
    *   <tr>
    *     <td>`Office.Table.Headers`</td>
    *     <td>Specifies only the header row.</td>
    *   </tr>
    * </table>
    * 
    * The `format:` property specifies values that correspond to a subset of the settings available in the Format Cells dialog box in Excel 
    * (Right-click \> Format Cells or Home \> Format \> Format Cells).
    * 
    * You specify the value of the `format:` property as a list of one or more property name - value pairs in a JavaScript object literal. The 
    * property name specifies the name of the formatting property to set, and value specifies the property value. 
    * You can specify multiple values for a given format, such as both a font's color and size. 
    * 
    * Here's three `format:` property value examples:
    * 
    * `//Set cells: font color to green and size to 15 points.`
    * 
    * `format: {fontColor : "green", fontSize : 15}`
    * 
    * `//Set cells: border to dotted blue.`
    * 
    * `format: {borderStyle: "dotted", borderColor: "blue"}`
    * 
    * `//Set cells: background to red and alignment to centered.`
    * 
    * `format: {backgroundColor: "red", alignHorizontal: "center"}`
    * 
    * 
    * You can specify number formats by specifying the number formatting "code" string in the `numberFormat:` property. 
    * The number format strings you can specify correspond to those you can set in Excel using the Custom category on the Number tab of the Format Cells dialog box. 
    * This example shows how to format a number as a percentage with two decimal places:
    * 
    * `format: {numberFormat:"0.00%"}`
    * 
    * For more detail, see how to {@link https://support.office.com/article/create-or-delete-a-custom-number-format-78f2a361-936b-4c03-8772-09fab54be7f4 | Create a custom number format}.
    * 
    * To set formatting on tables when writing data, use the tableOptions and cellFormat optional parameters of the 
    * `Document.setSelectedDataAsync` or `TableBinding.setDataAsync` methods.
    * 
    * Setting formatting with the optional parameters of the `Document.setSelectedDataAsync` and `TableBinding.setDataAsync` methods only works 
    * to set formatting when writing data the first time. 
    * To make formatting changes after writing data, use the following methods:
    * 
    *  - To update cell formatting, such as font color and style, use the `TableBinding.setFormatsAsync` method (this method).
    * 
    *  - To update table options, such as banded rows and filter buttons, use the `TableBinding.setTableOptions` method.
    * 
    *  - To clear formatting, use the `TableBinding.clearFormats` method.
    * 
    * For more details and examples, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | How to format tables in add-ins for Excel}.
    *
    * @param cellFormat An array that contains one or more JavaScript objects that specify which cells to target and the formatting to apply to them.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setFormatsAsync(cellFormat: js.Array[js.Any]): Unit = js.native
  def setFormatsAsync(cellFormat: js.Array[js.Any], callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setFormatsAsync(
    cellFormat: js.Array[js.Any],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setFormatsAsync(cellFormat: js.Array[js.Any], options: AsyncContextOptions): Unit = js.native
  def setFormatsAsync(
    cellFormat: js.Array[js.Any],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Updates table formatting options on the bound table.
    *
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#methods-that-arent-part-of-a-requirement-set | Not in a set}
    * 
    * In the callback function passed to the goToByIdAsync method, you can use the properties of the AsyncResult object to return the following information.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Always returns undefined because there is no data or object to retrieve when setting formats.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    *
    * @param tableOptions An object literal containing a list of property name-value pairs that define the table options to apply.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    * 
    */
  def setTableOptionsAsync(tableOptions: js.Any): Unit = js.native
  def setTableOptionsAsync(tableOptions: js.Any, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setTableOptionsAsync(tableOptions: js.Any, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setTableOptionsAsync(tableOptions: js.Any, options: AsyncContextOptions): Unit = js.native
  def setTableOptionsAsync(
    tableOptions: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

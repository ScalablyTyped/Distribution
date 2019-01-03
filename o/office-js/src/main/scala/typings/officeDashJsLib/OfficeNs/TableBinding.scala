package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a binding in two dimensions of rows and columns, optionally with headers.
  *
  * @remarks
  * <table><tr><td>Requirement Sets</td><td>TableBindings</td></tr></table>
  *
  * The TableBinding object inherits the `id` property, `type` property, `getDataAsync` method, and `setDataAsync` method from the 
  * {@link Office.Binding} object.
  *
  * For Excel, note that after you establish a table binding, each new row a user adds to the table is automatically included in the binding and 
  * rowCount increases.
  */
@js.native
trait TableBinding extends Binding {
  /**
    * Gets the number of columns in the TableBinding, as an integer value.
    *
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this property.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    */
  var columnCount: scala.Double = js.native
  /**
    * True, if the table has headers; otherwise false.
    *
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this property.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    */
  var hasHeaders: scala.Boolean = js.native
  /**
    * Gets the number of rows in the TableBinding, as an integer value.
    *
    * @remarks
    * When you insert an empty table by selecting a single row in Excel 2013 and Excel Online (using Table on the Insert tab), both Office host 
    * applications create a single row of headers followed by a single blank row. However, if your add-in's script creates a binding for this 
    * newly inserted table (for example, by using the {@link Office.Bindings}.addFromSelectionAsync method), and then checks the value of the 
    * rowCount property, the value returned will differ depending whether the spreadsheet is open in Excel 2013 or Excel Online.
    * 
    * - In Excel on the desktop, rowCount will return 0 (the blank row following the headers is not counted).
    *
    * - In Excel Online, rowCount will return 1 (the blank row following the headers is counted).
    *
    * You can work around this difference in your script by checking if rowCount == 1, and if so, then checking if the row contains all empty 
    * strings.
    *
    * In content add-ins for Access, for performance reasons the rowCount property always returns -1.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this property.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    */
  var rowCount: scala.Double = js.native
  def addColumnsAsync(tableData: js.Array[js.Array[_]]): scala.Unit = js.native
  def addColumnsAsync(
    tableData: js.Array[js.Array[_]],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addColumnsAsync(tableData: js.Array[js.Array[_]], options: AsyncContextOptions): scala.Unit = js.native
  def addColumnsAsync(
    tableData: js.Array[js.Array[_]],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
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
    * Additional remark for Excel Online: The total number of cells in the TableData object passed to the data parameter can't exceed 20,000 in 
    * a single call to this method.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param tableData An array of arrays ("matrix") or a TableData object that contains one or more columns of data to add to the table. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addColumnsAsync(tableData: TableData): scala.Unit = js.native
  def addColumnsAsync(tableData: TableData, callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def addColumnsAsync(tableData: TableData, options: AsyncContextOptions): scala.Unit = js.native
  def addColumnsAsync(
    tableData: TableData,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addRowsAsync(rows: js.Array[js.Array[_]]): scala.Unit = js.native
  def addRowsAsync(
    rows: js.Array[js.Array[_]],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addRowsAsync(rows: js.Array[js.Array[_]], options: AsyncContextOptions): scala.Unit = js.native
  def addRowsAsync(
    rows: js.Array[js.Array[_]],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
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
    * Additional remark for Excel Online: The total number of cells in the TableData object passed to the data parameter can't exceed 20,000 in 
    * a single call to this method.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param rows An array of arrays ("matrix") or a TableData object that contains one or more rows of data to add to the table. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addRowsAsync(rows: TableData): scala.Unit = js.native
  def addRowsAsync(rows: TableData, callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def addRowsAsync(rows: TableData, options: AsyncContextOptions): scala.Unit = js.native
  def addRowsAsync(
    rows: TableData,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Clears formatting on the bound table.
    *
    * @remarks
    * See {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | Format tables in add-ins for Excel} for more information.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def clearFormatsAsync(): scala.Unit = js.native
  def clearFormatsAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def clearFormatsAsync(options: AsyncContextOptions): scala.Unit = js.native
  def clearFormatsAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Deletes all non-header rows and their values in the table, shifting appropriately for the host application.
    *
    * @remarks
    *
    * In Excel, if the table has no header row, this method will delete the table itself.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def deleteAllDataValuesAsync(): scala.Unit = js.native
  def deleteAllDataValuesAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def deleteAllDataValuesAsync(options: AsyncContextOptions): scala.Unit = js.native
  def deleteAllDataValuesAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
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
  def getFormatsAsync(): scala.Unit = js.native
  def getFormatsAsync(cellReference: js.Any): scala.Unit = js.native
  def getFormatsAsync(cellReference: js.Any, formats: js.Array[_]): scala.Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: js.Array[_],
    callback: js.Function1[/* result */ AsyncResult[js.Array[officeDashJsLib.Anon_Cells]], scala.Unit]
  ): scala.Unit = js.native
  def getFormatsAsync(cellReference: js.Any, formats: js.Array[_], options: AsyncContextOptions): scala.Unit = js.native
  def getFormatsAsync(
    cellReference: js.Any,
    formats: js.Array[_],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[officeDashJsLib.Anon_Cells]], scala.Unit]
  ): scala.Unit = js.native
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
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param cellFormat An array that contains one or more JavaScript objects that specify which cells to target and the formatting to apply to them.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setFormatsAsync(cellFormat: js.Array[_]): scala.Unit = js.native
  def setFormatsAsync(cellFormat: js.Array[_], callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def setFormatsAsync(cellFormat: js.Array[_], options: AsyncContextOptions): scala.Unit = js.native
  def setFormatsAsync(
    cellFormat: js.Array[_],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Updates table formatting options on the bound table.
    *
    * @remarks
    * <table><tr><td>Hosts</td><td>Excel</td></tr>
    *
    * <tr><td>Requirement Sets</td><td>Not in a set</td></tr></table>
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
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param tableOptions An object literal containing a list of property name-value pairs that define the table options to apply.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    * 
    */
  def setTableOptionsAsync(tableOptions: js.Any): scala.Unit = js.native
  def setTableOptionsAsync(tableOptions: js.Any, callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def setTableOptionsAsync(tableOptions: js.Any, options: AsyncContextOptions): scala.Unit = js.native
  def setTableOptionsAsync(
    tableOptions: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}


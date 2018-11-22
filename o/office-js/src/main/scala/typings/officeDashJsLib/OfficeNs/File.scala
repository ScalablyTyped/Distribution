package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the document file associated with an Office Add-in.
     *
     * @remarks
     * Access the File object with the AsyncResult.value property in the callback function passed to the Document.getFileAsync method.
     * 
     * **Support details**
     * 
     * A capital Y in the following matrix indicates that this interface is supported in the corresponding Office host application. 
     * An empty cell indicates that the Office host application doesn't support this interface.
     * 
     * For more information about Office host application and server requirements, see 
     * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
     * 
     * *Supported hosts, by platform*
     *  <table>
     *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
     *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *  </table>
     */
@js.native
trait File extends js.Object {
  /**
           * Gets the document file size in bytes.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           */
  var size: scala.Double = js.native
  /**
           * Gets the number of slices into which the file is divided.
           */
  var sliceCount: scala.Double = js.native
  /**
           * Closes the document file.
           * 
           * @remarks
           * 
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           * 
           * No more than two documents are allowed to be in memory; otherwise the Document.getFileAsync operation will fail. Use the File.closeAsync 
           * method to close the file when you are finished working with it.
           * 
           * In the callback function passed to the closeAsync method, you can use the properties of the AsyncResult object to return the following 
           * information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Always returns undefined because there is no object or data to retrieve.</td>
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
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def closeAsync(): scala.Unit = js.native
  /**
           * Closes the document file.
           * 
           * @remarks
           * 
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           * 
           * No more than two documents are allowed to be in memory; otherwise the Document.getFileAsync operation will fail. Use the File.closeAsync 
           * method to close the file when you are finished working with it.
           * 
           * In the callback function passed to the closeAsync method, you can use the properties of the AsyncResult object to return the following 
           * information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Always returns undefined because there is no object or data to retrieve.</td>
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
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def closeAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  /**
           * Returns the specified slice.
           * 
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           * 
           * In the callback function passed to the getSliceAsync method, you can use the properties of the AsyncResult object to return the following 
           * information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Access the Slice object.</td>
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
           * @param sliceIndex Specifies the zero-based index of the slice to be retrieved. Required.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the {@link Office.Slice} object.
           */
  def getSliceAsync(sliceIndex: scala.Double): scala.Unit = js.native
  /**
           * Returns the specified slice.
           * 
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           * 
           * In the callback function passed to the getSliceAsync method, you can use the properties of the AsyncResult object to return the following 
           * information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Access the Slice object.</td>
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
           * @param sliceIndex Specifies the zero-based index of the slice to be retrieved. Required.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the {@link Office.Slice} object.
           */
  def getSliceAsync(sliceIndex: scala.Double, callback: js.Function1[/* result */ AsyncResult[Slice], scala.Unit]): scala.Unit = js.native
}


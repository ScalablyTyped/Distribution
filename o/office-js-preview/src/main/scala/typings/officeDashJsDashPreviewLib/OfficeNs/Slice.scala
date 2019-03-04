package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a slice of a document file.
  *
  * @remarks
  * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
  * 
  * The Slice object is accessed with the File.getSliceAsync method.
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
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
  *  </table>
  */
trait Slice extends js.Object {
  /**
    * Gets the raw data of the file slice in `Office.FileType.Text` ("text") or `Office.FileType.Compressed` ("compressed") format as specified 
    * by the fileType parameter of the call to the Document.getFileAsync method.
    *
    * @remarks
    * 
    * Files in the "compressed" format will return a byte array that can be transformed to a base64-encoded string if required.
    */
  var data: js.Any
  /**
    * Gets the zero-based index of the file slice.
    */
  var index: scala.Double
  /**
    * Gets the size of the slice in bytes.
    */
  var size: scala.Double
}

object Slice {
  @scala.inline
  def apply(data: js.Any, index: scala.Double, size: scala.Double): Slice = {
    val __obj = js.Dynamic.literal(data = data, index = index, size = size)
  
    __obj.asInstanceOf[Slice]
  }
}


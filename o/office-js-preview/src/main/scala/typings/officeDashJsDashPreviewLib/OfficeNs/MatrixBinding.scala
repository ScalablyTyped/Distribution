package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a binding in two dimensions of rows and columns.
     *
     * @remarks
     * <table><tr><td>Requirement Sets</td><td>MatrixBindings</td></tr></table>
     *
     * The MatrixBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the Binding object.
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
     *   <tr><th>                        </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
     *   <tr><td><strong> Excel </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *   <tr><td><strong> Word  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
     *  </table>
     */
@js.native
trait MatrixBinding extends Binding {
  /**
          * Gets the number of columns in the matrix data structure, as an integer value.
          *
          * @remarks
          * <table><tr><td>Hosts</td><td>Access, Excel, PowerPoint, Project, Word</td></tr>
          *
          * <tr><td>Requirement Sets</td><td>MatrixBindings</td></tr></table>
          */
  var columnCount: scala.Double = js.native
  /**
          * Gets the number of rows in the matrix data structure, as an integer value.
          *
          * @remarks
          * <table><tr><td>Hosts</td><td>Access, Excel, PowerPoint, Project, Word</td></tr>
          *
          * <tr><td>Requirement Sets</td><td>MatrixBindings</td></tr></table>
          */
  var rowCount: scala.Double = js.native
}


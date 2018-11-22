package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Index extends js.Object

/**
     * Specifies the relative PowerPoint slide.
     * 
     * @remarks
     * 
     * **Support details**
     * 
     * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
     * An empty cell indicates that the Office host application doesn't support this enumeration.
     * 
     * For more information about Office host application and server requirements, see 
     * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
     * 
     * *Supported hosts, by platform*
     *  <table>
     *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
     *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
     *  </table>
     */
@JSGlobal("Office.Index")
@js.native
object Index extends js.Object {
  /**
           * Represents the first PowerPoint slide
           */
  @js.native
  sealed trait First
    extends officeDashJsLib.OfficeNs.Index
  
  /**
           * Represents the last PowerPoint slide
           */
  @js.native
  sealed trait Last
    extends officeDashJsLib.OfficeNs.Index
  
  /**
           * Represents the next PowerPoint slide
           */
  @js.native
  sealed trait Next
    extends officeDashJsLib.OfficeNs.Index
  
  /**
           * Represents the previous PowerPoint slide
           */
  @js.native
  sealed trait Previous
    extends officeDashJsLib.OfficeNs.Index
  
  val First: First with java.lang.String = js.native
  val Last: Last with java.lang.String = js.native
  val Next: Next with java.lang.String = js.native
  val Previous: Previous with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.Index with java.lang.String] = js.native
}


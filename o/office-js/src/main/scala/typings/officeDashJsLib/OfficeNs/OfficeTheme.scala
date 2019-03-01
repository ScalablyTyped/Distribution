package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the properties for Office theme colors.
  *
  * Using Office theme colors lets you coordinate the color scheme of your add-in with the current Office theme selected by the user with File \> 
  * Office Account \> Office Theme UI, which is applied across all Office host applications. Using Office theme colors is appropriate for mail and 
  * task pane add-ins.
  *
  * @remarks
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that these properties are supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office for Windows desktop </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Y (in preview)             </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td></tr>
  *  </table>
  */
trait OfficeTheme extends js.Object {
  /**
    * Gets the Office theme body background color as a hexadecimal color triplet (e.g. "FFA500").
    */
  var bodyBackgroundColor: java.lang.String
  /**
    * Gets the Office theme body foreground color as a hexadecimal color triplet (e.g. "FFA500").
    */
  var bodyForegroundColor: java.lang.String
  /**
    * Gets the Office theme control background color as a hexadecimal color triplet (e.g. "FFA500").
    */
  var controlBackgroundColor: java.lang.String
  /**
    * Gets the Office theme body control color as a hexadecimal color triplet (e.g. "FFA500").
    */
  var controlForegroundColor: java.lang.String
}

object OfficeTheme {
  @scala.inline
  def apply(
    bodyBackgroundColor: java.lang.String,
    bodyForegroundColor: java.lang.String,
    controlBackgroundColor: java.lang.String,
    controlForegroundColor: java.lang.String
  ): OfficeTheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodyBackgroundColor")(bodyBackgroundColor)
    __obj.updateDynamic("bodyForegroundColor")(bodyForegroundColor)
    __obj.updateDynamic("controlBackgroundColor")(controlBackgroundColor)
    __obj.updateDynamic("controlForegroundColor")(controlForegroundColor)
    __obj.asInstanceOf[OfficeTheme]
  }
}


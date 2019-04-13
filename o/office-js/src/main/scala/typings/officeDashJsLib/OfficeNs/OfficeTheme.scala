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
  * **Hosts**: Excel, Outlook (in preview), PowerPoint, Word
  * 
  * `OfficeTheme` is only supported on Office for Windows desktop.
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
    * Gets the Office theme control foreground color as a hexadecimal color triplet (e.g. "FFA500").
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
    val __obj = js.Dynamic.literal(bodyBackgroundColor = bodyBackgroundColor, bodyForegroundColor = bodyForegroundColor, controlBackgroundColor = controlBackgroundColor, controlForegroundColor = controlForegroundColor)
  
    __obj.asInstanceOf[OfficeTheme]
  }
}


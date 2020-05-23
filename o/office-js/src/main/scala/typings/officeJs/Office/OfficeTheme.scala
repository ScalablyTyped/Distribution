package typings.officeJs.Office

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
  * **Hosts**: Excel, Outlook (in preview), PowerPoint, Word
  * 
  * `OfficeTheme` is only supported in Office on Windows.
  */
trait OfficeTheme extends js.Object {
  /**
    * Gets the Office theme body background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyBackgroundColor: String
  /**
    * Gets the Office theme body foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyForegroundColor: String
  /**
    * Gets the Office theme control background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlBackgroundColor: String
  /**
    * Gets the Office theme control foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlForegroundColor: String
}

object OfficeTheme {
  @scala.inline
  def apply(
    bodyBackgroundColor: String,
    bodyForegroundColor: String,
    controlBackgroundColor: String,
    controlForegroundColor: String
  ): OfficeTheme = {
    val __obj = js.Dynamic.literal(bodyBackgroundColor = bodyBackgroundColor.asInstanceOf[js.Any], bodyForegroundColor = bodyForegroundColor.asInstanceOf[js.Any], controlBackgroundColor = controlBackgroundColor.asInstanceOf[js.Any], controlForegroundColor = controlForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeTheme]
  }
}


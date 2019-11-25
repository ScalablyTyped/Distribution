package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'skydrivepicker'.
  */
trait ISkyDrivePickerProperies extends IUIProperties {
  /**
    * Defines the color pallette used for the file picker dialog box. Valid
    * values are "white", "gray", and "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.undefined
  /**
    * The type of SkyDrive file picker button to display. Specify "save" to
    * display the upload button. Specify "open" to display the download
    * button.
    */
  var mode: String
  /**
    * Specifies the function to call if the selected files cannot be
    * successfully uploaded or downloaded.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  /**
    * If the mode property is set to "save", specifies the function to call
    * after the user clicks either Save or Cancel in the file picker. If
    * the mode property is set to "open", specifies the function to call
    * after the user clicks either Open or Cancel in the file picker.
    */
  var onselected: js.UndefOr[js.Function] = js.undefined
  /**
    * Required if the mode property is set to "open". Specifies how many
    * files the user can select to download. Specify "single" for a single
    * file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.undefined
  /**
    * Defines the color pallette used for the file picker button. Valid
    * values are "white" and "blue".
    * @default "white"
    */
  var theme: js.UndefOr[String] = js.undefined
}

object ISkyDrivePickerProperies {
  @scala.inline
  def apply(
    element: String,
    mode: String,
    name: String,
    lightbox: String = null,
    onerror: js.Function = null,
    onselected: js.Function = null,
    select: String = null,
    state: String = null,
    theme: String = null
  ): ISkyDrivePickerProperies = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (lightbox != null) __obj.updateDynamic("lightbox")(lightbox.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (onselected != null) __obj.updateDynamic("onselected")(onselected.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkyDrivePickerProperies]
  }
}


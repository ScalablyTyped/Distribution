package typings.nwDotJs.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for nw.Window.get().print().
  */
trait PrintOption extends js.Object {
  /**
    * Whether to enable header and footer
    */
  var headerFooterEnabled: Boolean
  /**
    * Whether to use landscape or portrait
    */
  var landscape: Boolean
  /**
    * The paper size spec
    * example: 'mediaSize':{'name': 'CUSTOM', 'width_microns': 279400, 'height_microns': 215900, 'custom_display_name':'Letter', 'is_default': true}
    */
  var mediaSize: js.Any
  /**
    * The path of the output PDF when printing to PDF
    */
  var pdf_path: String
  /**
    * The device name of the printer
    */
  var printer: String
  /**
    * Whether to print CSS backgrounds
    */
  var shouldPrintBackgrounds: Boolean
}

object PrintOption {
  @scala.inline
  def apply(
    headerFooterEnabled: Boolean,
    landscape: Boolean,
    mediaSize: js.Any,
    pdf_path: String,
    printer: String,
    shouldPrintBackgrounds: Boolean
  ): PrintOption = {
    val __obj = js.Dynamic.literal(headerFooterEnabled = headerFooterEnabled.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], pdf_path = pdf_path.asInstanceOf[js.Any], printer = printer.asInstanceOf[js.Any], shouldPrintBackgrounds = shouldPrintBackgrounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrintOption]
  }
}


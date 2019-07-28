package typings.nwDotJs.NWJSUnderscoreHelpersNs

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
    val __obj = js.Dynamic.literal(headerFooterEnabled = headerFooterEnabled, landscape = landscape, mediaSize = mediaSize, pdf_path = pdf_path, printer = printer, shouldPrintBackgrounds = shouldPrintBackgrounds)
  
    __obj.asInstanceOf[PrintOption]
  }
}


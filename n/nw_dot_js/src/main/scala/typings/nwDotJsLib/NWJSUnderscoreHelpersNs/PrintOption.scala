package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var headerFooterEnabled: scala.Boolean
  /**
    * Whether to use landscape or portrait
    */
  var landscape: scala.Boolean
  /**
    * The paper size spec
    * example: 'mediaSize':{'name': 'CUSTOM', 'width_microns': 279400, 'height_microns': 215900, 'custom_display_name':'Letter', 'is_default': true}
    */
  var mediaSize: js.Any
  /**
    * The path of the output PDF when printing to PDF
    */
  var pdf_path: java.lang.String
  /**
    * The device name of the printer
    */
  var printer: java.lang.String
  /**
    * Whether to print CSS backgrounds
    */
  var shouldPrintBackgrounds: scala.Boolean
}


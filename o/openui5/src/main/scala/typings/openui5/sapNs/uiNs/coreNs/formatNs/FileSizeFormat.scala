package typings.openui5.sapNs.uiNs.coreNs.formatNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import typings.openui5.sapNs.uiNs.coreNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.format.FileSizeFormat")
@js.native
/**
  * Constructor for FileSizeFormat - must not be used: To get a FileSizeFormat instance, please use
  * getInstance.
  */
class FileSizeFormat () extends Object {
  def format(oValue: String): String = js.native
  /**
    * Format a filesize (in bytes) according to the given format options.
    * @param oValue the number (or hex string) to format
    * @returns the formatted output value
    */
  def format(oValue: Double): String = js.native
  /**
    * Get an instance of the FileSizeFormat, which can be used for formatting.If no locale is given, the
    * currently configured{@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale}
    * will be used.
    * @param oFormatOptions Object which defines the format options
    * @param oLocale Locale to get the formatter for
    * @returns instance of the FileSizeFormat
    */
  def getInstance(oFormatOptions: js.Any): FileSizeFormat = js.native
  def getInstance(oFormatOptions: js.Any, oLocale: Locale): FileSizeFormat = js.native
  /**
    * Parse a string which is formatted according to the given format options.
    * @param sValue the string containing a formatted filesize value
    * @returns the parsed value in bytes
    */
  def parse(sValue: String): Double = js.native
}


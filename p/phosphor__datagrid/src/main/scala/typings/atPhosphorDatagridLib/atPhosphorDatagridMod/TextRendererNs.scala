package typings
package atPhosphorDatagridLib.atPhosphorDatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "TextRenderer")
@js.native
object TextRendererNs extends js.Object {
  /**
    * Create a date format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new date format function.
    *
    * #### Notes
    * This formatter uses `Date.toDateString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def formatDate(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatDate(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatDateNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a scientific notation format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new scientific notation format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toExponential()`
    * to coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def formatExponential(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatExponential(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatExponentialNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a fixed decimal format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new fixed decimal format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toFixed()` to
    * coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def formatFixed(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatFixed(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatFixedNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a generic text format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new generic text format function.
    *
    * #### Notes
    * This formatter uses the builtin `String()` to coerce any value
    * to a string.
    */
  def formatGeneric(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatGeneric(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatGenericNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create an ISO datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new ISO datetime format function.
    *
    * #### Notes
    * This formatter uses `Date.toISOString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def formatISODateTime(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatISODateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatISODateTimeNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create an international datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new international datetime format function.
    *
    * #### Notes
    * This formatter uses the builtin `Intl.DateTimeFormat` object to
    * coerce values.
    *
    * This is the most flexible (but slowest) datetime formatter.
    */
  def formatIntlDateTime(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatIntlDateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatIntlDateTimeNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create an international number format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new international number format function.
    *
    * #### Notes
    * This formatter uses the builtin `Intl.NumberFormat` object to
    * coerce values.
    *
    * This is the most flexible (but slowest) number formatter.
    */
  def formatIntlNumber(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatIntlNumber(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatIntlNumberNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a significant figure format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new significant figure format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toPrecision()`
    * to coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def formatPrecision(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatPrecision(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatPrecisionNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a time format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new time format function.
    *
    * #### Notes
    * This formatter uses `Date.toTimeString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def formatTime(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatTimeNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Create a UTC datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new UTC datetime format function.
    *
    * #### Notes
    * This formatter uses `Date.toUTCString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def formatUTCDateTime(): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  def formatUTCDateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatUTCDateTimeNs.IOptions): atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.FormatFunc = js.native
  /**
    * Measure the height of a font.
    *
    * @param font - The CSS font string of interest.
    *
    * @returns The height of the font bounding box.
    *
    * #### Notes
    * This function uses a temporary DOM node to measure the text box
    * height for the specified font. The first call for a given font
    * will incur a DOM reflow, but the return value is cached, so any
    * subsequent call for the same font will return the cached value.
    */
  def measureFontHeight(font: java.lang.String): scala.Double = js.native
  /**
    * The namespace for the `formatDate` function statics.
    */
  @JSName("formatDate")
  @js.native
  object formatDateNs extends js.Object
  
  /**
    * The namespace for the `formatExponential` function statics.
    */
  @JSName("formatExponential")
  @js.native
  object formatExponentialNs extends js.Object
  
  /**
    * The namespace for the `formatFixed` function statics.
    */
  @JSName("formatFixed")
  @js.native
  object formatFixedNs extends js.Object
  
  /**
    * The namespace for the `formatGeneric` function statics.
    */
  @JSName("formatGeneric")
  @js.native
  object formatGenericNs extends js.Object
  
  /**
    * The namespace for the `formatISODateTime` function statics.
    */
  @JSName("formatISODateTime")
  @js.native
  object formatISODateTimeNs extends js.Object
  
  /**
    * The namespace for the `formatIntlDateTime` function statics.
    */
  @JSName("formatIntlDateTime")
  @js.native
  object formatIntlDateTimeNs extends js.Object
  
  /**
    * The namespace for the `formatIntlNumber` function statics.
    */
  @JSName("formatIntlNumber")
  @js.native
  object formatIntlNumberNs extends js.Object
  
  /**
    * The namespace for the `formatPrecision` function statics.
    */
  @JSName("formatPrecision")
  @js.native
  object formatPrecisionNs extends js.Object
  
  /**
    * The namespace for the `formatTime` function statics.
    */
  @JSName("formatTime")
  @js.native
  object formatTimeNs extends js.Object
  
  /**
    * The namespace for the `formatUTCDateTime` function statics.
    */
  @JSName("formatUTCDateTime")
  @js.native
  object formatUTCDateTimeNs extends js.Object
  
}


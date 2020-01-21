package typings.phosphorDatagrid.mod

import typings.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import typings.phosphorDatagrid.textrendererMod.TextRenderer.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
class TextRenderer ()
  extends typings.phosphorDatagrid.textrendererMod.TextRenderer {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/datagrid", "TextRenderer")
@js.native
object TextRenderer extends js.Object {
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
  def measureFontHeight(font: String): Double = js.native
  /**
    * The namespace for the `formatDate` function statics.
    */
  @js.native
  object formatDate extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatDate.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatExponential` function statics.
    */
  @js.native
  object formatExponential extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatFixed` function statics.
    */
  @js.native
  object formatFixed extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatGeneric` function statics.
    */
  @js.native
  object formatGeneric extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatISODateTime` function statics.
    */
  @js.native
  object formatISODateTime extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatIntlDateTime` function statics.
    */
  @js.native
  object formatIntlDateTime extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatIntlNumber` function statics.
    */
  @js.native
  object formatIntlNumber extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatPrecision` function statics.
    */
  @js.native
  object formatPrecision extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatTime` function statics.
    */
  @js.native
  object formatTime extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatTime.IOptions): FormatFunc = js.native
  }
  
  /**
    * The namespace for the `formatUTCDateTime` function statics.
    */
  @js.native
  object formatUTCDateTime extends js.Object {
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
    def apply(): FormatFunc = js.native
    def apply(options: typings.phosphorDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions): FormatFunc = js.native
  }
  
}


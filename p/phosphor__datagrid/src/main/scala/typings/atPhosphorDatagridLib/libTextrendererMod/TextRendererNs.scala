package typings
package atPhosphorDatagridLib.libTextrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer")
@js.native
object TextRendererNs extends js.Object {
  /**
    * A type alias for the supported horizontal alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.left
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.center
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.right
  */
  trait HorizontalAlignment extends js.Object
  
  /**
    * An options object for initializing a text renderer.
    */
  trait IOptions extends js.Object {
    /**
      * The background color for the cells.
      *
      * The default is `''`.
      */
    var backgroundColor: js.UndefOr[
        atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String]
      ] = js.undefined
    /**
      * The font for drawing the cell text.
      *
      * The default is `'12px sans-serif'`.
      */
    var font: js.UndefOr[
        atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String]
      ] = js.undefined
    /**
      * The format function for the renderer.
      *
      * The default is `TextRenderer.formatGeneric()`.
      */
    var format: js.UndefOr[FormatFunc] = js.undefined
    /**
      * The horizontal alignment for the cell text.
      *
      * The default is `'left'`.
      */
    var horizontalAlignment: js.UndefOr[
        atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[HorizontalAlignment]
      ] = js.undefined
    /**
      * The color for the drawing the cell text.
      *
      * The default `'#000000'`.
      */
    var textColor: js.UndefOr[
        atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String]
      ] = js.undefined
    /**
      * The vertical alignment for the cell text.
      *
      * The default is `'center'`.
      */
    var verticalAlignment: js.UndefOr[
        atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[VerticalAlignment]
      ] = js.undefined
  }
  
  /**
    * A type alias for the supported vertical alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.top
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.center
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.bottom
  */
  trait VerticalAlignment extends js.Object
  
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
  def formatDate(): FormatFunc = js.native
  def formatDate(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatDateNs.IOptions): FormatFunc = js.native
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
  def formatExponential(): FormatFunc = js.native
  def formatExponential(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatExponentialNs.IOptions): FormatFunc = js.native
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
  def formatFixed(): FormatFunc = js.native
  def formatFixed(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatFixedNs.IOptions): FormatFunc = js.native
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
  def formatGeneric(): FormatFunc = js.native
  def formatGeneric(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatGenericNs.IOptions): FormatFunc = js.native
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
  def formatISODateTime(): FormatFunc = js.native
  def formatISODateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatISODateTimeNs.IOptions): FormatFunc = js.native
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
  def formatIntlDateTime(): FormatFunc = js.native
  def formatIntlDateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatIntlDateTimeNs.IOptions): FormatFunc = js.native
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
  def formatIntlNumber(): FormatFunc = js.native
  def formatIntlNumber(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatIntlNumberNs.IOptions): FormatFunc = js.native
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
  def formatPrecision(): FormatFunc = js.native
  def formatPrecision(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatPrecisionNs.IOptions): FormatFunc = js.native
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
  def formatTime(): FormatFunc = js.native
  def formatTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatTimeNs.IOptions): FormatFunc = js.native
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
  def formatUTCDateTime(): FormatFunc = js.native
  def formatUTCDateTime(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.formatUTCDateTimeNs.IOptions): FormatFunc = js.native
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
  object formatDateNs extends js.Object {
    /**
      * The options for creating a date format function.
      */
    trait IOptions extends js.Object {
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatExponential` function statics.
    */
  @JSName("formatExponential")
  @js.native
  object formatExponentialNs extends js.Object {
    /**
      * The options for creating an exponential format function.
      */
    trait IOptions extends js.Object {
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[scala.Double] = js.undefined
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatFixed` function statics.
    */
  @JSName("formatFixed")
  @js.native
  object formatFixedNs extends js.Object {
    /**
      * The options for creating a fixed format function.
      */
    trait IOptions extends js.Object {
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[scala.Double] = js.undefined
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatGeneric` function statics.
    */
  @JSName("formatGeneric")
  @js.native
  object formatGenericNs extends js.Object {
    /**
      * The options for creating a generic format function.
      */
    trait IOptions extends js.Object {
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatISODateTime` function statics.
    */
  @JSName("formatISODateTime")
  @js.native
  object formatISODateTimeNs extends js.Object {
    /**
      * The options for creating an ISO datetime format function.
      */
    trait IOptions extends js.Object {
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatIntlDateTime` function statics.
    */
  @JSName("formatIntlDateTime")
  @js.native
  object formatIntlDateTimeNs extends js.Object {
    /**
      * The options for creating an intl datetime format function.
      */
    trait IOptions extends js.Object {
      /**
        * The locales to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
      /**
        * The options to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[stdLib.IntlNs.DateTimeFormatOptions] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatIntlNumber` function statics.
    */
  @JSName("formatIntlNumber")
  @js.native
  object formatIntlNumberNs extends js.Object {
    /**
      * The options for creating an intl number format function.
      */
    trait IOptions extends js.Object {
      /**
        * The locales to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
      /**
        * The options to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[stdLib.IntlNs.NumberFormatOptions] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatPrecision` function statics.
    */
  @JSName("formatPrecision")
  @js.native
  object formatPrecisionNs extends js.Object {
    /**
      * The options for creating a precision format function.
      */
    trait IOptions extends js.Object {
      /**
        * The number of significant figures to include in the value.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[scala.Double] = js.undefined
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatTime` function statics.
    */
  @JSName("formatTime")
  @js.native
  object formatTimeNs extends js.Object {
    /**
      * The options for creating a time format function.
      */
    trait IOptions extends js.Object {
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * The namespace for the `formatUTCDateTime` function statics.
    */
  @JSName("formatUTCDateTime")
  @js.native
  object formatUTCDateTimeNs extends js.Object {
    /**
      * The options for creating a UTC datetime format function.
      */
    trait IOptions extends js.Object {
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * A type alias for a format function.
    */
  type FormatFunc = atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigFunc[java.lang.String]
}


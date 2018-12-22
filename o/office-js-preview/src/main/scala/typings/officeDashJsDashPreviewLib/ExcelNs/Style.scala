package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * An object encapsulating a style's format and other properties.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.Style")
@js.native
class Style ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
           *
           * [Api set: ExcelApi 1.8]
           */
  var autoIndent: scala.Boolean = js.native
  /**
           *
           * A Border collection of four Border objects that represent the style of the four borders.
           *
           * [Api set: ExcelApi 1.7]
           */
  val borders: RangeBorderCollection = js.native
  /**
           *
           * Indicates if the style is a built-in style.
           *
           * [Api set: ExcelApi 1.7]
           */
  val builtIn: scala.Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Style: RequestContext = js.native
  /**
           *
           * The Fill of the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  val fill: RangeFill = js.native
  /**
           *
           * A Font object that represents the font of the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  val font: RangeFont = js.native
  /**
           *
           * Indicates if the formula will be hidden when the worksheet is protected.
           *
           * [Api set: ExcelApi 1.7]
           */
  var formulaHidden: scala.Boolean = js.native
  /**
           *
           * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var horizontalAlignment: HorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.General | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CenterAcrossSelection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = js.native
  /**
           *
           * Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includeAlignment: scala.Boolean = js.native
  /**
           *
           * Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includeBorder: scala.Boolean = js.native
  /**
           *
           * Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includeFont: scala.Boolean = js.native
  /**
           *
           * Indicates if the style includes the NumberFormat property.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includeNumber: scala.Boolean = js.native
  /**
           *
           * Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includePatterns: scala.Boolean = js.native
  /**
           *
           * Indicates if the style includes the FormulaHidden and Locked protection properties.
           *
           * [Api set: ExcelApi 1.7]
           */
  var includeProtection: scala.Boolean = js.native
  /**
           *
           * An integer from 0 to 250 that indicates the indent level for the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  var indentLevel: scala.Double = js.native
  /**
           *
           * Indicates if the object is locked when the worksheet is protected.
           *
           * [Api set: ExcelApi 1.7]
           */
  var locked: scala.Boolean = js.native
  /**
           *
           * The name of the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  val name: java.lang.String = js.native
  /**
           *
           * The format code of the number format for the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  var numberFormat: java.lang.String = js.native
  /**
           *
           * The localized format code of the number format for the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  var numberFormatLocal: java.lang.String = js.native
  /**
           *
           * The reading order for the style.
           *
           * [Api set: ExcelApi 1.7]
           */
  var readingOrder: ReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Context | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft = js.native
  /**
           *
           * Indicates if text automatically shrinks to fit in the available column width.
           *
           * [Api set: ExcelApi 1.7]
           */
  var shrinkToFit: scala.Boolean = js.native
  /**
           *
           * The text orientation for the style.
           *
           * [Api set: ExcelApi 1.8]
           */
  var textOrientation: scala.Double = js.native
  /**
           *
           * Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var verticalAlignment: VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = js.native
  /**
           *
           * Indicates if Microsoft Excel wraps the text in the object.
           *
           * [Api set: ExcelApi 1.7]
           */
  var wrapText: scala.Boolean = js.native
  /**
           *
           * Deletes this style.
           *
           * [Api set: ExcelApi 1.7]
           */
  def delete(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Style` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Style` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Style` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Style = js.native
  def load(option: java.lang.String): Style = js.native
  def load(option: js.Array[java.lang.String]): Style = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Style = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Style` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Style` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Style` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.StyleLoadOptions): Style = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Style): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.StyleUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Style): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.StyleUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Style): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.Style object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.StyleData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.StyleData = js.native
}


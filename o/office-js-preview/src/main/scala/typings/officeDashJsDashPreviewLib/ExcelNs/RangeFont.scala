package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeFont")
@js.native
class RangeFont ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: scala.Boolean = js.native
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFont: RequestContext = js.native
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: scala.Boolean = js.native
  /**
    *
    * Font name (e.g. "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Font size.
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: scala.Double = js.native
  /**
    *
    * Represents the strikethrough status of font. A null value indicates that the entire range doesn't have uniform Strikethrough setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: scala.Boolean = js.native
  /**
    *
    * Represents the Subscript status of font.
    Returns True if all the fonts of the range are Subscript.
    Returns False if all the fonts of the range are Superscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: scala.Boolean = js.native
  /**
    *
    * Represents the Superscript status of font.
    Returns True if all the fonts of the range are Superscript.
    Returns False if all the fonts of the range are Subscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: scala.Boolean = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Font, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire range doesn't have uniform font tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: scala.Double = js.native
  /**
    *
    * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeFont` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeFont` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFont` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFont = js.native
  def load(option: java.lang.String): RangeFont = js.native
  def load(option: js.Array[java.lang.String]): RangeFont = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): RangeFont = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFontLoadOptions): RangeFont = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeFont): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFontUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFontUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFont): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFontData = js.native
}


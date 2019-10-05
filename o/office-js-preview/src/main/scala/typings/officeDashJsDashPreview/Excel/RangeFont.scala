package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFontData
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFontLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFontUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DoubleAccountant
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Single
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SingleAccountant
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
class RangeFont () extends ClientObject {
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: Boolean = js.native
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFont: RequestContext = js.native
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: Boolean = js.native
  /**
    *
    * Font name (e.g. "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  /**
    *
    * Font size.
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: Double = js.native
  /**
    *
    * Represents the strikethrough status of font. A null value indicates that the entire range doesn't have uniform Strikethrough setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: Boolean = js.native
  /**
    *
    * Represents the Subscript status of font.
    Returns True if all the fonts of the range are Subscript.
    Returns False if all the fonts of the range are Superscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: Boolean = js.native
  /**
    *
    * Represents the Superscript status of font.
    Returns True if all the fonts of the range are Superscript.
    Returns False if all the fonts of the range are Subscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: Boolean = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Font, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire range doesn't have uniform font tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  /**
    *
    * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: RangeUnderlineStyle | None | Single | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double | SingleAccountant | DoubleAccountant = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFont = js.native
  def load(options: RangeFontLoadOptions): RangeFont = js.native
  def load(propertyNamesAndPaths: Anon_Expand): RangeFont = js.native
  def load(propertyNames: String): RangeFont = js.native
  def load(propertyNames: js.Array[String]): RangeFont = js.native
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
  def set(properties: RangeFontUpdateData): Unit = js.native
  def set(properties: RangeFontUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFont): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFontData = js.native
}


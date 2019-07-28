package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ConditionalRangeFontData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ConditionalRangeFontLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ConditionalRangeFontUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the font attributes (font style, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeFont")
@js.native
class ConditionalRangeFont () extends ClientObject {
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bold: Boolean = js.native
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeFont: RequestContext = js.native
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var italic: Boolean = js.native
  /**
    *
    * Represents the strikethrough status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var strikethrough: Boolean = js.native
  /**
    *
    * Type of underline applied to the font. See Excel.ConditionalRangeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var underline: ConditionalRangeFontUnderlineStyle | None | Single | Double = js.native
  /**
    *
    * Resets the font formats.
    *
    * [Api set: ExcelApi 1.6]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ConditionalRangeFont` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeFont` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeFont` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeFont = js.native
  def load(option: String): ConditionalRangeFont = js.native
  def load(option: js.Array[String]): ConditionalRangeFont = js.native
  def load(option: Anon_Expand): ConditionalRangeFont = js.native
  def load(option: ConditionalRangeFontLoadOptions): ConditionalRangeFont = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeFont): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ConditionalRangeFont): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeFontUpdateData): Unit = js.native
  def set(properties: ConditionalRangeFontUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeFontData = js.native
}


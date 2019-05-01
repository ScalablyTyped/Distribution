package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the text frame of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.TextFrame")
@js.native
class TextFrame ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: ShapeAutoSize | officeDashJsLib.officeDashJsLibStrings.AutoSizeNone | officeDashJsLib.officeDashJsLibStrings.AutoSizeTextToFitShape | officeDashJsLib.officeDashJsLibStrings.AutoSizeShapeToFitText | officeDashJsLib.officeDashJsLibStrings.AutoSizeMixed = js.native
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: scala.Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextFrame: RequestContext = js.native
  /**
    *
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  val hasText: scala.Boolean = js.native
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: ShapeTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.JustifyLow | officeDashJsLib.officeDashJsLibStrings.Distributed | officeDashJsLib.officeDashJsLibStrings.ThaiDistributed = js.native
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: ShapeTextHorizontalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Clip = js.native
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: scala.Double = js.native
  /**
    *
    * Represents the text orientation of the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: ShapeTextOrientation | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Vertical270 | officeDashJsLib.officeDashJsLibStrings.WordArtVertical | officeDashJsLib.officeDashJsLibStrings.EastAsianVertical | officeDashJsLib.officeDashJsLibStrings.MongolianVertical | officeDashJsLib.officeDashJsLibStrings.WordArtVerticalRTL = js.native
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: ShapeTextReadingOrder | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft = js.native
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: scala.Double = js.native
  /**
    *
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See Excel.TextRange for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  val textRange: TextRange = js.native
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: scala.Double = js.native
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: ShapeTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Middle | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justified | officeDashJsLib.officeDashJsLibStrings.Distributed = js.native
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: ShapeTextVerticalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Ellipsis | officeDashJsLib.officeDashJsLibStrings.Clip = js.native
  /**
    *
    * Deletes all the text in the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  def deleteText(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TextFrame` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TextFrame` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TextFrame` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextFrame = js.native
  def load(option: java.lang.String): TextFrame = js.native
  def load(option: js.Array[java.lang.String]): TextFrame = js.native
  def load(option: officeDashJsLib.Anon_Expand): TextFrame = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.TextFrameLoadOptions): TextFrame = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TextFrame): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.TextFrameUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.TextFrameUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextFrame): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextFrame object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextFrameData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.TextFrameData = js.native
}


package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the text frame for a shape object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TextFrame")
@js.native
class TextFrame ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets the auto sizing settings for the text frame. A text frame can be set to auto size the text to fit the text frame, or auto size the text frame to fit the text, or without auto sizing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var autoSize: ShapeAutoSize | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeNone | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeTextToFitShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeShapeToFitText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeMixed = js.native
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottomMargin: scala.Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextFrame: RequestContext = js.native
  /**
    *
    * Specifies whether the TextFrame contains text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val hasText: scala.Boolean = js.native
  /**
    *
    * Represents the horizontal alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalAlignment: ShapeTextHorizontalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JustifyLow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThaiDistributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorizontalAlignType_MaxEnumIDs = js.native
  /**
    *
    * Represents the horizontal overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalOverflow: ShapeTextHorzOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorzOverflowType_MaxEnumIDs = js.native
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftMargin: scala.Double = js.native
  /**
    *
    * Represents the text orientation of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: ShapeTextOrientationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical270 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EastAsianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MongolianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVerticalRTL | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextOrientationType_MaxEnumIDs = js.native
  /**
    *
    * Represents the reading order of the text frame, RTL or LTR.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readingOrder: ShapeTextReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LTR | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RTL = js.native
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightMargin: scala.Double = js.native
  /**
    *
    * Represents the text range in the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val textRange: TextRange = js.native
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var topMargin: scala.Double = js.native
  /**
    *
    * Represents the vertical alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalAlignment: ShapeTextVerticalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVerticalAlignType_MaxEnumIDs = js.native
  /**
    *
    * Represents the vertical overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalOverflow: ShapeTextVertOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ellipsis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVertOverflowType_MaxEnumIDs = js.native
  /**
    *
    * Deletes all the text in the textframe.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
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
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): TextFrame = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TextFrameLoadOptions): TextFrame = js.native
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
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TextFrameUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TextFrameUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextFrame): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextFrame object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextFrameData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TextFrameData = js.native
}


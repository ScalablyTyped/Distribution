package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.TextFrameData
import typings.officeDashJs.Excel.Interfaces.TextFrameLoadOptions
import typings.officeDashJs.Excel.Interfaces.TextFrameUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.AutoSizeMixed
import typings.officeDashJs.officeDashJsStrings.AutoSizeNone
import typings.officeDashJs.officeDashJsStrings.AutoSizeShapeToFitText
import typings.officeDashJs.officeDashJsStrings.AutoSizeTextToFitShape
import typings.officeDashJs.officeDashJsStrings.Bottom
import typings.officeDashJs.officeDashJsStrings.Center
import typings.officeDashJs.officeDashJsStrings.Clip
import typings.officeDashJs.officeDashJsStrings.Distributed
import typings.officeDashJs.officeDashJsStrings.EastAsianVertical
import typings.officeDashJs.officeDashJsStrings.Ellipsis
import typings.officeDashJs.officeDashJsStrings.Horizontal
import typings.officeDashJs.officeDashJsStrings.Justified
import typings.officeDashJs.officeDashJsStrings.Justify
import typings.officeDashJs.officeDashJsStrings.JustifyLow
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.LeftToRight
import typings.officeDashJs.officeDashJsStrings.Middle
import typings.officeDashJs.officeDashJsStrings.MongolianVertical
import typings.officeDashJs.officeDashJsStrings.Overflow
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.RightToLeft
import typings.officeDashJs.officeDashJsStrings.ThaiDistributed
import typings.officeDashJs.officeDashJsStrings.Top
import typings.officeDashJs.officeDashJsStrings.Vertical
import typings.officeDashJs.officeDashJsStrings.Vertical270
import typings.officeDashJs.officeDashJsStrings.WordArtVertical
import typings.officeDashJs.officeDashJsStrings.WordArtVerticalRTL
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
class TextFrame () extends ClientObject {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = js.native
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextFrame: RequestContext = js.native
  /**
    *
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  val hasText: Boolean = js.native
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = js.native
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: ShapeTextHorizontalOverflow | Overflow | Clip = js.native
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  /**
    *
    * Represents the text orientation of the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL = js.native
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: ShapeTextReadingOrder | LeftToRight | RightToLeft = js.native
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
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
  var topMargin: Double = js.native
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed = js.native
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip = js.native
  /**
    *
    * Deletes all the text in the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  def deleteText(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextFrame = js.native
  def load(options: TextFrameLoadOptions): TextFrame = js.native
  def load(propertyNamesAndPaths: Anon_Expand): TextFrame = js.native
  def load(propertyNames: String): TextFrame = js.native
  def load(propertyNames: js.Array[String]): TextFrame = js.native
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
  def set(properties: TextFrameUpdateData): Unit = js.native
  def set(properties: TextFrameUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextFrame): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextFrame object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextFrameData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextFrameData = js.native
}


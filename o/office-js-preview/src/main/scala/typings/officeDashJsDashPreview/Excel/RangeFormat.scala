package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFormatData
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFormatLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.RangeFormatUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CenterAcrossSelection
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Context
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Fill
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.General
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LeftToRight
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RightToLeft
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the range's font, fill, borders, alignment, and other properties.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeFormat")
@js.native
class RangeFormat () extends ClientObject {
  /**
    *
    * Indicates if text is automatically indented when text alignment is set to equal distribution.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: Boolean = js.native
  /**
    *
    * Collection of border objects that apply to the overall range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val borders: RangeBorderCollection = js.native
  /**
    *
    * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnWidth: Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFormat: RequestContext = js.native
  /**
    *
    * Returns the fill object defined on the overall range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: RangeFill = js.native
  /**
    *
    * Returns the font object defined on the overall range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val font: RangeFont = js.native
  /**
    *
    * Represents the horizontal alignment for the specified object. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var horizontalAlignment: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed = js.native
  /**
    *
    * An integer from 0 to 250 that indicates the indent level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: Double = js.native
  /**
    *
    * Returns the format protection object for a range. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val protection: FormatProtection = js.native
  /**
    *
    * The reading order for the range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: ReadingOrder | Context | LeftToRight | RightToLeft = js.native
  /**
    *
    * Gets or sets the height of all rows in the range. If the row heights are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHeight: Double = js.native
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: Boolean = js.native
  /**
    *
    * Gets or sets the text orientation of all the cells within the range.
    The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    If the orientation within a range are not uniform, then null will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: Double = js.native
  /**
    *
    * Determines if the row height of the Range object equals the standard height of the sheet.
    Returns True if the row height of the Range object equals the standard height of the sheet.
    Returns Null if the range contains more than one row and the rows aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardHeight: Boolean = js.native
  /**
    *
    * Indicates whether the column width of the Range object equals the standard width of the sheet.
    Returns True if the column width of the Range object equals the standard width of the sheet.
    Returns Null if the range contains more than one column and the columns aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardWidth: Boolean = js.native
  /**
    *
    * Represents the vertical alignment for the specified object. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var verticalAlignment: VerticalAlignment | Top | Center | Bottom | Justify | Distributed = js.native
  /**
    *
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
    *
    * [Api set: ExcelApi 1.1]
    */
  var wrapText: Boolean = js.native
  /**
    *
    * Adjusts the indentation of the range formatting. The indent value ranges from 0 to 250 and is measured in characters..
    *
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param amount The number of character spaces by which the current indent is adjusted. This value should be between -250 and 250.
    **Note**: If the amount would raise the indent level above 250, the indent level stays with 250.
    Similarly, if the amount would lower the indent level below 0, the indent level stays 0.
    */
  def adjustIndent(amount: Double): Unit = js.native
  /**
    *
    * Changes the width of the columns of the current range to achieve the best fit, based on the current data in the columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  def autofitColumns(): Unit = js.native
  /**
    *
    * Changes the height of the rows of the current range to achieve the best fit, based on the current data in the columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  def autofitRows(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFormat = js.native
  def load(options: RangeFormatLoadOptions): RangeFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): RangeFormat = js.native
  def load(propertyNames: String): RangeFormat = js.native
  def load(propertyNames: js.Array[String]): RangeFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeFormatUpdateData): Unit = js.native
  def set(properties: RangeFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFormat): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFormatData = js.native
}


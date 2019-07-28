package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeBorderData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeBorderLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeBorderUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DiagonalDown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DiagonalUp
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeBottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeLeft
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeRight
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeTop
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Hairline
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.InsideHorizontal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.InsideVertical
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Medium
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SlantDashDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Thick
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border of an object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeBorder")
@js.native
class RangeBorder () extends ClientObject {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeBorder: RequestContext = js.native
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val sideIndex: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: scala.Double = js.native
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: BorderWeight | Hairline | Thin | Medium | Thick = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeBorder` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeBorder` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeBorder` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeBorder = js.native
  def load(option: String): RangeBorder = js.native
  def load(option: js.Array[String]): RangeBorder = js.native
  def load(option: Anon_Expand): RangeBorder = js.native
  def load(option: RangeBorderLoadOptions): RangeBorder = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeBorderUpdateData): Unit = js.native
  def set(properties: RangeBorderUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeBorder): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeBorderData = js.native
}


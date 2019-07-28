package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeFillData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeFillLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeFillUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Checker
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CrissCross
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Down
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray16
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray25
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray50
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray75
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray8
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Horizontal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightDown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightHorizontal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightUp
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightVertical
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinearGradient
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RectangularGradient
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SemiGray75
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Solid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Up
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the background of a range object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeFill")
@js.native
class RangeFill () extends ClientObject {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFill: RequestContext = js.native
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = js.native
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: String = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: Double = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  /**
    *
    * Resets the range background.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeFill` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeFill` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFill` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFill = js.native
  def load(option: String): RangeFill = js.native
  def load(option: js.Array[String]): RangeFill = js.native
  def load(option: Anon_Expand): RangeFill = js.native
  def load(option: RangeFillLoadOptions): RangeFill = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeFill): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeFillUpdateData): Unit = js.native
  def set(properties: RangeFillUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFill): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFillData = js.native
}


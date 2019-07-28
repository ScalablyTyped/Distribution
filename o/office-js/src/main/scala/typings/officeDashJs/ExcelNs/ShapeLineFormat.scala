package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.ShapeLineFormatData
import typings.officeDashJs.ExcelNs.InterfacesNs.ShapeLineFormatLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.ShapeLineFormatUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.DashDot
import typings.officeDashJs.officeDashJsStrings.DashDotDot
import typings.officeDashJs.officeDashJsStrings.LongDash
import typings.officeDashJs.officeDashJsStrings.LongDashDot
import typings.officeDashJs.officeDashJsStrings.LongDashDotDot
import typings.officeDashJs.officeDashJsStrings.RoundDot
import typings.officeDashJs.officeDashJsStrings.Single
import typings.officeDashJs.officeDashJsStrings.Solid
import typings.officeDashJs.officeDashJsStrings.SquareDot
import typings.officeDashJs.officeDashJsStrings.SystemDash
import typings.officeDashJs.officeDashJsStrings.SystemDashDot
import typings.officeDashJs.officeDashJsStrings.SystemDot
import typings.officeDashJs.officeDashJsStrings.ThickBetweenThin
import typings.officeDashJs.officeDashJsStrings.ThickThin
import typings.officeDashJs.officeDashJsStrings.ThinThick
import typings.officeDashJs.officeDashJsStrings.ThinThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineFormat")
@js.native
class ShapeLineFormat () extends ClientObject {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeLineFormat: RequestContext = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin = js.native
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: Double = js.native
  /**
    *
    * Represents whether or not the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: Boolean = js.native
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ShapeLineFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ShapeLineFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeLineFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeLineFormat = js.native
  def load(option: String): ShapeLineFormat = js.native
  def load(option: js.Array[String]): ShapeLineFormat = js.native
  def load(option: Anon_Expand): ShapeLineFormat = js.native
  def load(option: ShapeLineFormatLoadOptions): ShapeLineFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ShapeLineFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeLineFormatUpdateData): Unit = js.native
  def set(properties: ShapeLineFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeLineFormat): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeLineFormatData = js.native
}


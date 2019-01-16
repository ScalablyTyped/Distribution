package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the line formatting for the shape object. For picture and geometric shape, line formatting represents the border of shape object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeLineFormat")
@js.native
class ShapeLineFormat ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeLineFormat: RequestContext = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when line is not visible or has mixed line dash style property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dashStyle: ShapeLineDashStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RoundDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SquareDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDashDot = js.native
  /**
    *
    * Represents the line style of the shape object. Returns null when line is not visible or has mixed line visible property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: ShapeLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickBetweenThin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThick | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThin = js.native
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has mixed line transparency property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: scala.Double = js.native
  /**
    *
    * Represents whether the line formatting of a shape element is visible. Returns null when the shape has mixed line visible property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Represents weight of the line, in points. Returns null when the line is not visible or has mixed line weight property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var weight: scala.Double = js.native
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
  def load(option: java.lang.String): ShapeLineFormat = js.native
  def load(option: js.Array[java.lang.String]): ShapeLineFormat = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ShapeLineFormat = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeLineFormatLoadOptions): ShapeLineFormat = js.native
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
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeLineFormatUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeLineFormatUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeLineFormat): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeLineFormatData = js.native
}

